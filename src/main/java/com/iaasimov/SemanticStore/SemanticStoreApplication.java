package com.iaasimov.SemanticStore;

import com.iaasimov.SemanticStore.repository.SemanticStoreDocument;
import com.iaasimov.SemanticStore.repository.SemanticStoreDocumentRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SemanticStoreApplication {

	@Bean
	public InitializingBean seedDataBase(SemanticStoreDocumentRepository repository){
//		List<SemanticStoreDocument> ll = new ArrayList<SemanticStoreDocument>();
//		ll.add(new SemanticStoreDocument("1234", "Saurav", "What is OCI",
//				"Its business on Cloud"));
//		ll.add(new SemanticStoreDocument("1235", "Saurav", "What is OCM",
//				"Its business on Cloud"));
//		ll.add(new SemanticStoreDocument("1236", "Saurav", "What is ExaCM",
//				"Its business on Cloud"));
//		ll.add(new SemanticStoreDocument("1237", "Saurav", "What is BDCS",
//				"Its business on Cloud"));
//		ll.add(new SemanticStoreDocument("1238", "Saurav", "What is Data Lake",
//				"Its business on Cloud"));
		return ()-> {
			repository.deleteAll();
			repository.save(new SemanticStoreDocument("1234", "Saurav", "What is Oracle Cloud",
					                                  "Its business on Cloud"));
			//repository.save(ll);

		};

	}
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SemanticStoreApplication.class, args);

		System.out.println("********** Print the Bean Store");
		for(String beanName :ctx.getBeanDefinitionNames())
		System.out.println(beanName);


	}
}

