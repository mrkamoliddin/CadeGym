package payme.makingPayments;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DirectionMatcher implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/roadToAssets/**").addResourceLocations("classpath:/assets/");
        registry.addResourceHandler("/roadToUsersTable/**").addResourceLocations("classpath:/assets/usersTable/");
        registry.addResourceHandler("/roadToLoginPage/**").addResourceLocations("classpath:/assets/loginPage/");
    }
}
