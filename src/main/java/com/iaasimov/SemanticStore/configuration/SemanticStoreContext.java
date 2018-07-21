package com.iaasimov.SemanticStore.configuration;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SemanticStoreContext {

    @Bean
    public HttpSolrClient solrClient(@Value("${solr.host}") String solrHost) {

        return new HttpSolrClient(solrHost);

    }
}
