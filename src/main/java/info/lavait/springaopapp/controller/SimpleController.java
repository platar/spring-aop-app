package info.lavait.springaopapp.controller;

import info.lavait.springaopapp.service.SimpleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SimpleController {

    private final SimpleService simpleService;

    @GetMapping("/something")
    public String getSomething() {
        log.info("Controller: getSomething");
        return simpleService.getSomethingFromService();
    }

    @PostMapping("/somethingElse")
    public String getSomethingElse() {
        log.info("Controller: getSomethingElse");
        return simpleService.getSomethingElseFromService();
    }

}