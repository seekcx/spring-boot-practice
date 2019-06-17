package cx.seek.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        ApiInfo api = new ApiInfoBuilder()
                .title("Seek Api Document")
                .description("Api 文档")
                .termsOfServiceUrl("https://github.com/seekcx/spring-boot-practice")
                .version("1.0")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(api)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cx.seek.practice"))
                .paths(PathSelectors.any())
                .build();
    }
}
