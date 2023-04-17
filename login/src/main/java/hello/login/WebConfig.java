package hello.login;

import hello.login.web.filter.LogFilter;
import hello.login.web.filter.LoginCheckFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean logFilter() {
        return createFilter(new LogFilter(), 1, new String[]{"/*"});
    }

    @Bean
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
