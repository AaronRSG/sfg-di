package guru.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.controllers.SetterInjectedController;
import guru.springframework.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

        SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

    
}
