package com.example.demo;

import com.example.demo.conversions.ClientConverter;
import com.example.demo.conversions.FournisseurConverter;
import com.example.demo.imetier.IClientMetier;
import com.example.demo.imetier.IFournisseurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ServletComponentScan
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}
	

	
	@Configuration
	static class ConfigFormatter extends WebMvcConfigurerAdapter {
		@Autowired private IClientMetier mc;
		@Autowired private IFournisseurMetier mf;
	    @Override
	    public void addFormatters(FormatterRegistry registry) { 
	    	registry.addConverter(new ClientConverter(mc));
	    	registry.addConverter(new FournisseurConverter(mf));
	    }
	     

	    /*@Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**")
	            .addResourceLocations("/resources/**");
	    }*/
	}

}
