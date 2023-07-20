package com.example.example_web_scopes.endpoint;

import com.example.example_web_scopes.examples.session.ItemService;
import com.example.example_web_scopes.examples.session.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SessionScopeController {

    private final UserService userService;
    private final ItemService itemService;

    @GetMapping("/scopes/session")
    public void getSessionScopeMessage() {
        userService.processUser();
        itemService.publicItems();
    }
}
