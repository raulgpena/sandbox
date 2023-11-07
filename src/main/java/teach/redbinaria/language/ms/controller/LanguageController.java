/*
 * @(#PersonController.java 04/24/2023
 * Copyright 2023 fyi searches, Inc. All rights reserved.
 * FYI Searches/CONFIDENTIAL
 * */

package teach.redbinaria.language.ms.controller;


// Packages and classes to import of springframework 6.x

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 *  <p>The class <p>online.thewayout.searches.person.controller.PersonController is a mvc controller
 *     to management the person read operations.
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @since 17
 *  @see RestController
 * */
@RequestMapping(value = "language")
@RestController
public class LanguageController {




    // Public instance method declarations.
    /**
     *
     *  <p>Method to search all persons
     * */
    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getAll() {

        return null;
    }
}