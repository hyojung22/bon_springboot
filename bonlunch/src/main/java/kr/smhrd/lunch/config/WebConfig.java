package kr.smhrd.lunch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
	
	// WebConfig 파일 
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/lunch/api/**").allowedOrigins("http://localhost:5173")
				registry.addMapping("/lunch/api/**").allowedOrigins("http://13.124.111.115:5173")
						.allowedMethods("GET", "POST", "PUT", "DELETE").allowCredentials(true);
			}
		};
	}

}
