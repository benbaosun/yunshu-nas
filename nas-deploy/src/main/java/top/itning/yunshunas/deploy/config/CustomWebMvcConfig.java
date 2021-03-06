package top.itning.yunshunas.deploy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/**
 * @author itning
 * @date 2020/9/5 20:00
 */
@Configuration
public class CustomWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        String[] allMethod = Arrays.stream(HttpMethod.values()).map(Enum::name).toArray(String[]::new);
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowCredentials(true)
                .allowedMethods(allMethod)
                .maxAge(86400);
    }
}