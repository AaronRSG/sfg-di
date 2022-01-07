package guru.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.services.GreetingServiceImpl;

// Least Preferred Method of dependency injection
class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }
    
    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }    
}
