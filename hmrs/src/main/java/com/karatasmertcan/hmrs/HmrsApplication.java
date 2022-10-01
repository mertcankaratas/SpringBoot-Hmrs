package com.karatasmertcan.hmrs;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HmrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmrsApplication.class, args);
		
		
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				  "cloud_name", "dpuelmect",
				  "api_key", "523938518643259",
				  "api_secret", "6lYZlXFSpFF2sEu167nMmF_CMdU"));
	}
	
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.karatasmertcan.hmrs"))                                
	          .build();                                           
	    }

	 @Bean
	 public ModelMapper modelMapper() {
		 return new ModelMapper();
	 }
}
