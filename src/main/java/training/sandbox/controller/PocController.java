/*
 * @(#PocController.java 09/15/2023
 * Copyright 2023 sandbox searches, Inc. All rights reserved.
 * SANDBOX Searches/CONFIDENTIAL
 * */

package training.sandbox.controller;


// Packages and classes to import of springframework 5.x
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



/**
 *
 *  <p>The class <p>training.sandbox.controller.controller.PocController is a mvc controller
 *     to test the app.
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @since 8
 *  @see RestController
 * */
@RestController
@RequestMapping(value = "test")
public class PocController {

    /**
     *
     *  <p>Method to test the get method
     * */
    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getAll() {

        return null;
    }
}