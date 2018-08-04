/*
 Copyright (C) SYSTAP, LLC DBA Blazegraph 2006-2016.  All rights reserved.

 Contact:
 SYSTAP, LLC DBA Blazegraph
 2501 Calvert ST NW #106
 Washington, DC 20008
 licenses@blazegraph.com

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; version 2 of the License.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.wikidata.freebase.rdf;

import com.bigdata.rdf.internal.InlineURIFactory;
import com.bigdata.rdf.internal.InlineURIHandler;
import com.bigdata.rdf.internal.impl.literal.AbstractLiteralIV;
import com.bigdata.rdf.internal.impl.literal.XSDIntegerIV;
import com.bigdata.rdf.model.BigdataLiteral;

import java.math.BigInteger;

/**
 * URI inlining for Freebase. URIs have been automatically extracted and verified.
 *
 * @author <a href="mailto:ms@metaphacts.com">Michael Schmidt</a>
 **/
public class FreebaseInlineUriFactory extends InlineURIFactory {

	//This should get handled by the MID handler
	private static final String URI3 = "http://wp/en/";
	private static final String URI4 = "http://en.wikipedia.org/wiki/index.html?curid=";
	private static final String URI18 = "http://de.wikipedia.org/wiki/index.html?curid=";
	private static final String URI19 = "http://it.wikipedia.org/wiki/index.html?curid=";
	private static final String URI20 = "http://es.wikipedia.org/wiki/index.html?curid=";
	private static final String URI21 = "http://rdf.freebase.com/ns/media_common.cataloged_instance.isbn";
	private static final String URI22 = "http://nl.wikipedia.org/wiki/index.html?curid=";
	private static final String URI23 = "http://pl.wikipedia.org/wiki/index.html?curid=";
	private static final String URI27 = "http://ru.wikipedia.org/wiki/index.html?curid=";
	private static final String URI28 = "http://pt.wikipedia.org/wiki/index.html?curid=";
	private static final String URI31 = "http://sv.wikipedia.org/wiki/index.html?curid=";
	private static final String URI35 = "http://zh.wikipedia.org/wiki/index.html?curid=";
	private static final String URI37 = "http://ja.wikipedia.org/wiki/index.html?curid=";
	private static final String URI39 = "http://vi.wikipedia.org/wiki/index.html?curid=";
	private static final String URI44 = "http://fa.wikipedia.org/wiki/index.html?curid=";
	private static final String URI48 = "http://uk.wikipedia.org/wiki/index.html?curid=";
	private static final String URI50 = "http://ca.wikipedia.org/wiki/index.html?curid=";
	private static final String URI57 = "http://no.wikipedia.org/wiki/index.html?curid=";
	private static final String URI58 = "http://madcat.library.wisc.edu/cgi-bin/Pwebrecon.cgi?BBID=";
	private static final String URI61 = "https://catalog.library.cornell.edu/cgi-bin/Pwebrecon.cgi?DB=local&BBID=";
	private static final String URI63 = "http://fi.wikipedia.org/wiki/index.html?curid=";
	private static final String URI66 = "http://cat.libraries.psu.edu/uhtbin/cgisirsi/0/0/0/5?searchdata1=%5EC";
	private static final String URI70 = "http://ar.wikipedia.org/wiki/index.html?curid=";
	private static final String URI74 = "http://pi.lib.uchicago.edu/1001/cat/bib/";
	private static final String URI79 = "http://hu.wikipedia.org/wiki/index.html?curid=";
	private static final String URI80 = "http://ro.wikipedia.org/wiki/index.html?curid=";
	private static final String URI81 = "http://ko.wikipedia.org/wiki/index.html?curid=";
	private static final String URI85 = "http://cs.wikipedia.org/wiki/index.html?curid=";
	private static final String URI86 = "http://sr.wikipedia.org/wiki/index.html?curid=";
	private static final String URI90 = "http://ms.wikipedia.org/wiki/index.html?curid=";
	private static final String URI92 = "http://nucat.library.northwestern.edu/cgi-bin/Pwebrecon.cgi?BBID=";
	private static final String URI97 = "http://geonames.usgs.gov/pls/gnispublic/f?p=gnispq:3:::NO::P3_FID:";

	// graph position instance prefixes
	public FreebaseInlineUriFactory() {
		super();

		//Handle the MIDS and GUIDs
		addHandler(new InlineFreebaseGUIDMIDURIHandler("http://rdf.freebase.com/ns/g.1"));
		addHandler(new InlineFreebaseGUIDMIDURIHandler("http://rdf.freebase.com/ns/m.0"));

		//Should be handled by the GUIDMID Handler
		//addHandler(new URI1InlineURIHandler());
		addHandler(new URI3InlineURIHandler());
		addHandler(new URI4InlineURIHandler());
		addHandler(new URI14InlineURIHandler());
		addHandler(new URI18InlineURIHandler());
		addHandler(new URI19InlineURIHandler());
		addHandler(new URI20InlineURIHandler());
		addHandler(new URI21InlineURIHandler());
		addHandler(new URI22InlineURIHandler());
		addHandler(new URI23InlineURIHandler());
		addHandler(new URI27InlineURIHandler());
		addHandler(new URI28InlineURIHandler());
		addHandler(new URI31InlineURIHandler());
		addHandler(new URI35InlineURIHandler());
		addHandler(new URI37InlineURIHandler());
		addHandler(new URI39InlineURIHandler());
		addHandler(new URI44InlineURIHandler());
		addHandler(new URI48InlineURIHandler());
		addHandler(new URI50InlineURIHandler());
		addHandler(new URI57InlineURIHandler());
		addHandler(new URI58InlineURIHandler());
		addHandler(new URI61InlineURIHandler());
		addHandler(new URI63InlineURIHandler());
		addHandler(new URI66InlineURIHandler());
		addHandler(new URI70InlineURIHandler());
		addHandler(new URI74InlineURIHandler());
		addHandler(new URI79InlineURIHandler());
		addHandler(new URI80InlineURIHandler());
		addHandler(new URI81InlineURIHandler());
		addHandler(new URI85InlineURIHandler());
		addHandler(new URI86InlineURIHandler());
		addHandler(new URI90InlineURIHandler());
		addHandler(new URI92InlineURIHandler());
		addHandler(new URI97InlineURIHandler());

	}

	public static class URI3InlineURIHandler extends FreebaseInlineURIHandler {

		URI3InlineURIHandler() {
			super(URI3);
		}

	}

	public static class URI4InlineURIHandler extends FreebaseInlineURIHandler {

		URI4InlineURIHandler() {
			super(URI4);
		}

	}

	public static class URI14InlineURIHandler extends FreebaseInlineURIHandler {

		URI14InlineURIHandler() {
			super(URI4);
		}

	}

	public static class URI18InlineURIHandler extends FreebaseInlineURIHandler {

		URI18InlineURIHandler() {
			super(URI18);
		}

	}

	public static class URI19InlineURIHandler extends FreebaseInlineURIHandler {

		URI19InlineURIHandler() {
			super(URI19);
		}

	}

	public static class URI20InlineURIHandler extends FreebaseInlineURIHandler {

		URI20InlineURIHandler() {
			super(URI20);
		}

	}

	public static class URI21InlineURIHandler extends FreebaseInlineURIHandler {

		URI21InlineURIHandler() {
			super(URI21);
		}

	}

	public static class URI22InlineURIHandler extends FreebaseInlineURIHandler {

		URI22InlineURIHandler() {
			super(URI22);
		}

	}

	public static class URI23InlineURIHandler extends FreebaseInlineURIHandler {

		URI23InlineURIHandler() {
			super(URI23);
		}

	}

	public static class URI27InlineURIHandler extends FreebaseInlineURIHandler {

		URI27InlineURIHandler() {
			super(URI27);
		}

	}

	public static class URI28InlineURIHandler extends FreebaseInlineURIHandler {

		URI28InlineURIHandler() {
			super(URI28);
		}

	}

	public static class URI31InlineURIHandler extends FreebaseInlineURIHandler {

		URI31InlineURIHandler() {
			super(URI31);
		}

	}

	public static class URI35InlineURIHandler extends FreebaseInlineURIHandler {

		URI35InlineURIHandler() {
			super(URI35);
		}

	}

	public static class URI37InlineURIHandler extends FreebaseInlineURIHandler {

		URI37InlineURIHandler() {
			super(URI37);
		}

	}

	public static class URI39InlineURIHandler extends FreebaseInlineURIHandler {

		URI39InlineURIHandler() {
			super(URI39);
		}

	}

	public static class URI44InlineURIHandler extends FreebaseInlineURIHandler {

		URI44InlineURIHandler() {
			super(URI44);
		}

	}

	public static class URI48InlineURIHandler extends FreebaseInlineURIHandler {

		URI48InlineURIHandler() {
			super(URI48);
		}

	}

	public static class URI50InlineURIHandler extends FreebaseInlineURIHandler {

		URI50InlineURIHandler() {
			super(URI50);
		}

	}

	public static class URI57InlineURIHandler extends FreebaseInlineURIHandler {

		URI57InlineURIHandler() {
			super(URI57);
		}

	}

	public static class URI58InlineURIHandler extends FreebaseInlineURIHandler {

		URI58InlineURIHandler() {
			super(URI58);
		}

	}

	public static class URI61InlineURIHandler extends FreebaseInlineURIHandler {

		URI61InlineURIHandler() {
			super(URI61);
		}

	}

	public static class URI63InlineURIHandler extends FreebaseInlineURIHandler {

		URI63InlineURIHandler() {
			super(URI63);
		}

	}

	public static class URI66InlineURIHandler extends FreebaseInlineURIHandler {

		URI66InlineURIHandler() {
			super(URI66);
		}

	}

	public static class URI70InlineURIHandler extends FreebaseInlineURIHandler {

		URI70InlineURIHandler() {
			super(URI70);
		}

	}

	public static class URI74InlineURIHandler extends FreebaseInlineURIHandler {

		URI74InlineURIHandler() {
			super(URI74);
		}

	}

	public static class URI79InlineURIHandler extends FreebaseInlineURIHandler {

		URI79InlineURIHandler() {
			super(URI79);
		}

	}

	public static class URI80InlineURIHandler extends FreebaseInlineURIHandler {

		URI80InlineURIHandler() {
			super(URI80);
		}

	}

	public static class URI81InlineURIHandler extends FreebaseInlineURIHandler {

		URI81InlineURIHandler() {
			super(URI81);
		}

	}

	public static class URI85InlineURIHandler extends FreebaseInlineURIHandler {

		URI85InlineURIHandler() {
			super(URI85);
		}

	}

	public static class URI86InlineURIHandler extends FreebaseInlineURIHandler {

		URI86InlineURIHandler() {
			super(URI86);
		}

	}

	public static class URI90InlineURIHandler extends FreebaseInlineURIHandler {

		URI90InlineURIHandler() {
			super(URI90);
		}

	}

	public static class URI92InlineURIHandler extends FreebaseInlineURIHandler {

		URI92InlineURIHandler() {
			super(URI92);
		}

	}

	public static class URI97InlineURIHandler extends FreebaseInlineURIHandler {

		URI97InlineURIHandler() {
			super(URI97);
		}

	}


	/**
	 * Common base class for URI handlers.
	 *
	 * @author msc
	 */
	public abstract static class FreebaseInlineURIHandler extends InlineURIHandler {

		FreebaseInlineURIHandler(String namespace) {
			super(namespace);
		}

		@SuppressWarnings("rawtypes")
		@Override
		protected AbstractLiteralIV createInlineIV(String localName) {
			// pad leading digit to avoid removal of trailing zeros
			final BigInteger localNameAsInteger;

			try {
				localNameAsInteger = new BigInteger("1" + localName);
			} catch (NumberFormatException e) {
				//if (log.isDebugEnabled()) {
				//		log.debug("Invalid integer", e);
				//}
				return null;
			}

			return new XSDIntegerIV(localNameAsInteger);
		}

		@Override
		public String getLocalNameFromDelegate(
				AbstractLiteralIV<BigdataLiteral, ?> delegate) {
			// unpad leading digit
			return delegate.getInlineValue().toString().substring(1);
		}

	}

}
