package hello.login;

import hello.login.web.filter.LogFilter;
import hello.login.web.filter.LoginCheckFilter;
import hello.login.web.interceptor.LogInterceptor;
import hello.login.web.interceptor.LoginCheckInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor())
                .order(1)
                .addPathPatterns("/**")
                .excludePathPatterns("/css/**", "/*.ico", "/error");

        registry.addInterceptor(new LoginCheckInterceptor())
                .order(2)
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/members/add", "/login", "/logout", "/css/**", "/*.ico", "/error");
    }

    // @Bean
    public FilterRegistrationBean logFilter() {
        return createFilter(new LogFilter(), 1, new String[]{"/*"});
    }

    // @Bean
    public FilterRegistrationBean loginCheckFilter() {
        return createFilter(new LoginCheckFilter(), 2, new String[]{"/*"});
    }

    public FilterRegistrationBean createFilter(Filter filterImpl, int order, String[] urlPatterns){
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(filterImpl);
        filterRegistrationBean.setOrder(order);
        for (String pattern : urlPatterns) {
            filterRegistrationBean.addUrlPatterns(pattern);
        }
        return filterRegistrationBean;
    }
}
