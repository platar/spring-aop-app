package info.lavait.springaopapp.service;

import info.lavait.springaopapp.repository.SimpleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SimpleService {

    private final SimpleRepository simpleRepository;

    public String getSomethingFromService() {
        log.info("Service: getSomethingFromService");
        return getSomethingString();
    }

    private String getSomethingString() {
        log.info("Service: getSomethingString");
        return "something";
    }

    public String getSomethingElseFromService() {
        log.info("Service: getSomethingElseFromService");
        return simpleRepository.getSomethingElseFromRepository();
    }
}
