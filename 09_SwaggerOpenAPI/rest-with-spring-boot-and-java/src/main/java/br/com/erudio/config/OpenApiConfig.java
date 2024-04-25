package br.com.erudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("RESTful API with Java 19 and SpringBoot 4")
						.version("v1")
						.description("API criada com intuito academico para praticar o uso de frameworks")
						.termsOfService("https://forum.videohelp.com/threads/410350-Where-to-find-license-URL")
						.license(
								new License()
								.name("Apache 2.0")
								.url("https://forum.videohelp.com/threads/410350-Where-to-find-license-URL")));
	}
	
}
