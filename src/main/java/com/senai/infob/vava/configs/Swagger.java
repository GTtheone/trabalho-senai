package com.senai.infob.vava.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Vava",
        version = "1.0",
        description = "Samuel, João Gabriel, Gustavo Enrique, Lucas Oliveira"
    )
)
public class Swagger {

}