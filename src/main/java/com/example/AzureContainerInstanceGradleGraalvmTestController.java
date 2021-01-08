package com.example;

import io.micronaut.http.annotation.*;

@Controller("/azureContainerInstanceGradleGraalvmTest")
public class AzureContainerInstanceGradleGraalvmTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}