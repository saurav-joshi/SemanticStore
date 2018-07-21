package com.iaasimov.SemanticStore.controller;

import com.iaasimov.SemanticStore.repository.SemanticStoreDocument;
import com.iaasimov.SemanticStore.repository.SemanticStoreDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SemantiStoreRestController {
    @Autowired
    SemanticStoreDocumentRepository repo;

    @RequestMapping(value ="/test", method = RequestMethod.GET)
    public String test(SemanticStoreDocument doc)
    {
        return "A.I. is the new oil to power industries -- Prof Andrew Ng";
    }

    @RequestMapping(value ="/addDoc", method = RequestMethod.POST)
    public String AddDocument(@RequestBody SemanticStoreDocument doc)
    {
        repo.save(doc);
        return "Success";

    }

    @RequestMapping(value ="/bulkUpload", method = RequestMethod.POST)
    public void BulkUpload(@RequestBody List<SemanticStoreDocument> doc)
    {
        repo.save(doc);
        //return "Success";

    }

    @RequestMapping(value ="/delete", method = RequestMethod.DELETE)
    public String Delete()
    {
        repo.deleteAll();
        return "Success";

    }

}
