package com.etips.controllers;

import com.etips.models.Item;
import com.etips.services.ItemService;
import com.etips.services.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final QueryService queryService;

    @Autowired
    public ItemController(QueryService queryService) {
        this.queryService = queryService;
    }

    @RequestMapping(value = "/classify-item", method = RequestMethod.GET, produces = "application/json")
    public String getQuestions() {
        queryService.getResult();
        return null;
    }
}
