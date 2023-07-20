package com.example.example_web_scopes.endpoint;

import com.example.example_web_scopes.examples.request.HelloMessageGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RequestScopeController {
    @Resource(name = "requestScopedBean")
    HelloMessageGenerator requestScopedBean;

    @GetMapping("/scopes/request")
    public String getRequestScopeMessage() {
        return requestScopedBean.toString();
    }
}
