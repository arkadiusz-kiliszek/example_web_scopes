package com.example.example_web_scopes.examples.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class HelloMessageGenerator {

    private String message;
}
