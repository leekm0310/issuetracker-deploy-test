//package kr.codesquad.issuetracker.config;
//
//import kr.codesquad.issuetracker.jwt.JwtInterceptor;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@RequiredArgsConstructor
//public class WebConfig implements WebMvcConfigurer {
//
//    private final JwtInterceptor jwtInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(jwtInterceptor)
//                .addPathPatterns("/**");
//    }
//}
