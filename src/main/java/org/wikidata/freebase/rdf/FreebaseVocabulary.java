package org.wikidata.freebase.rdf;

import com.bigdata.rdf.vocab.core.BigdataCoreVocabulary_v20160317;

public class FreebaseVocabulary extends BigdataCoreVocabulary_v20160317 {

	public FreebaseVocabulary() {
		super();

	}

	public FreebaseVocabulary(final String namespace) {
		super(namespace);
	}

	@Override
	protected void addValues() {
		addDecl(new FreebaseVocabularyDecl());
		super.addValues();
	}
}
