package com.example.example_web_scopes.config;

import com.example.example_web_scopes.examples.request.HelloMessageGenerator;
import com.example.example_web_scopes.examples.session.CurrentUser;
import com.example.example_web_scopes.examples.session.ItemService;
import com.example.example_web_scopes.examples.session.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class ExamplesConfig {

    @Bean
    @RequestScope
    public HelloMessageGenerator requestScopedBean() {
        return new HelloMessageGenerator();
    }


    @Bean
    public UserService userSessionScopedBean(CurrentUser currentUser) {
        return new UserService(currentUser);
    }

    @Bean
    public ItemService itemSessionScopedBean(CurrentUser currentUser) {
        return new ItemService(currentUser);
    }
}
