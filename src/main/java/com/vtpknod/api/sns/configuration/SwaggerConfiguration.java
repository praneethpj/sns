package com.vtpknod.api.sns.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class SwaggerConfiguration {



    private void apiInfo() {
        return new ApiInfoBuilder().title("KNOD Web Application REST API")
                .description("KNOD User REST  API reference for developers")
                .termsOfServiceUrl("http://oensys.com")
                .license("KNOD License")
                .licenseUrl("dev@oensys.com").version("1.0").build();
    }
}
