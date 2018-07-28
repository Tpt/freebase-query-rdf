package org.wikidata.freebase.rdf;

import com.bigdata.rdf.sail.webapp.ConfigParams;
import com.bigdata.rdf.sail.webapp.NanoSparqlServer;
import com.bigdata.util.httpd.Config;
import org.eclipse.jetty.server.Server;

import java.util.LinkedHashMap;
import java.util.Map;


public class Main extends NanoSparqlServer {
	public static void main(String[] args) throws Exception {
		boolean readOnly = false;
		for(String arg : args) {
			if( "-readOnly".equals(arg)) {
				readOnly = true;
			}
		}
		String jettyXml = System.getProperty(
				NanoSparqlServer.SystemProperties.JETTY_XML,
				"jetty.xml"
		);
		String propertyFile = System.getProperty(
				NanoSparqlServer.SystemProperties.BIGDATA_PROPERTY_FILE,
				"RWStore.properties"
		);
		String portStr = System.getProperty(
				NanoSparqlServer.SystemProperties.JETTY_PORT,
				Integer.toString(Config.BLAZEGRAPH_HTTP_PORT)
		);
		int port = Integer.parseInt(portStr);


		final Map<String, String> initParams = new LinkedHashMap<>();

		initParams.put(ConfigParams.PROPERTY_FILE, propertyFile);
		if(readOnly) {
			initParams.put(ConfigParams.READ_ONLY, "true");
		}

		System.setProperty("jetty.home", Main.class.getResource("/war").toExternalForm());

		final Server server = Main.newInstance(port, jettyXml, null, initParams);

		server.start();
		awaitServerStart(server);

		System.out.println("\n\nWelcome to the Blazegraph(tm) Database.\n");
		System.out.println("Go to http://" + getHost() + ":" + port + "/" + Config.BLAZEGRAPH_PATH + "/ to get started.");

		server.join();
	}
}
