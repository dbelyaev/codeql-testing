package com.example.demo.web;

import com.equinor.liquids.units.exception.MissingParameterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Moritz Halbritter
 */
@RestController
class MyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);

    @GetMapping("/")
    String index() {
        LOGGER.info("index()");
        return "Hello World!";
    }

    @GetMapping("/throw")
    String throwException() {
        LOGGER.info("throwException()");
        throw new MissingParameterException("This is a test exception to demonstrate error handling in the controller.");

    }
}
