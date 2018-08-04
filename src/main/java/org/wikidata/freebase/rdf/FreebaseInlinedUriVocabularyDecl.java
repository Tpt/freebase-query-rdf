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

import com.bigdata.rdf.util.VocabBuilder;
import com.bigdata.rdf.vocab.VocabularyDecl;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * Vocabulary class defining freebase properties that occur at least in 500 triples.
 * Generated using the {@link VocabBuilder}.
 *
 * @author <a href="mailto:ms@metaphacts.com">Michael Schmidt</a>
 */
public class FreebaseInlinedUriVocabularyDecl implements VocabularyDecl {

	static private final URI[] uris = new URI[]{
			new URIImpl("http://rdf.freebase.com/ns/m.0"), // Freebase MID
			new URIImpl("http://rdf.freebase.com/ns/g.1"), // Freebase GUID
			new URIImpl("http://wp/en/"),
			new URIImpl("http://en.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://fr.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://de.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://it.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://es.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://rdf.freebase.com/ns/media_common.cataloged_instance.isbn"),
			new URIImpl("http://nl.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://pl.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://ru.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://pt.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://sv.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://zh.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://ja.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://vi.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://fa.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://uk.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://ca.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://no.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://madcat.library.wisc.edu/cgi-bin/Pwebrecon.cgi?BBID="),
			new URIImpl("https://catalog.library.cornell.edu/cgi-bin/Pwebrecon.cgi?DB=local&BBID="),
			new URIImpl("http://fi.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://cat.libraries.psu.edu/uhtbin/cgisirsi/0/0/0/5?searchdata1=%5EC"),
			new URIImpl("http://ar.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://pi.lib.uchicago.edu/1001/cat/bib/"),
			new URIImpl("http://hu.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://ro.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://ko.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://cs.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://sr.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://ms.wikipedia.org/wiki/index.html?curid="),
			new URIImpl("http://nucat.library.northwestern.edu/cgi-bin/Pwebrecon.cgi?BBID="),
			new URIImpl("http://geonames.usgs.gov/pls/gnispublic/f?p=gnispq:3:::NO::P3_FID:")

	};


	public FreebaseInlinedUriVocabularyDecl() {
	}

	public Iterator<URI> values() {
		return Collections.unmodifiableList(Arrays.asList(uris)).iterator();
	}
}