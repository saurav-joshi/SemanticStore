package com.iaasimov.SemanticStore.repository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemanticStoreDocumentRepository extends SolrCrudRepository<SemanticStoreDocument, String> {

}

