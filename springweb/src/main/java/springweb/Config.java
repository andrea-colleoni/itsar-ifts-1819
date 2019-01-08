package springweb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages= { "controller" })
public class Config implements WebMvcConfigurer {
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
        	.addResourceHandler("/resources/**")
        	.addResourceLocations("/resources/");
    }

}
