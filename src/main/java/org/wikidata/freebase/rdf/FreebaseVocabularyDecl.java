package org.wikidata.freebase.rdf;

import com.bigdata.rdf.vocab.VocabularyDecl;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FreebaseVocabularyDecl implements VocabularyDecl {
	static private final List<URI> URIS = Arrays.asList(
			new URIImpl("http://rdf.freebase.com/ns/common.topic.alias"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.article"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.description"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.image"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.notable_for"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.notable_types"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.official_website"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.social_media_presence"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.subject_of"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.subjects"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.topical_webpage"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.topic_equivalent_webpage"),
			new URIImpl("http://rdf.freebase.com/ns/common.topic.webpage"),
			new URIImpl("http://rdf.freebase.com/ns/type.object.id"),
			new URIImpl("http://rdf.freebase.com/ns/type.object.key"),
			new URIImpl("http://rdf.freebase.com/ns/type.object.name"),
			new URIImpl("http://rdf.freebase.com/ns/type.object.permission"),
			new URIImpl("http://rdf.freebase.com/ns/type.object.type"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.authorities"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.delegated"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.enumeration"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.expected_type"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.master_property"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.requires_permission"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.reverse_property"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.schema"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.unique"),
			new URIImpl("http://rdf.freebase.com/ns/type.property.unit"),
			new URIImpl("http://rdf.freebase.com/ns/type.type.default_property"),
			new URIImpl("http://rdf.freebase.com/ns/type.type.domain"),
			new URIImpl("http://rdf.freebase.com/ns/type.type.expected_by"),
			new URIImpl("http://rdf.freebase.com/ns/type.type.extends"),
			new URIImpl("http://rdf.freebase.com/ns/type.type.instance"),
			new URIImpl("http://rdf.freebase.com/ns/type.type.properties")
	);

	public FreebaseVocabularyDecl() {
	}

	@Override
	public Iterator<URI> values() {
		return URIS.iterator();
	}
}
