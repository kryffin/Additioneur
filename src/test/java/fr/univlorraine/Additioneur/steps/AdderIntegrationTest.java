package fr.univlorraine.Additioneur.steps;

import fr.univlorraine.Additioneur.controller.AdderController;
import fr.univlorraine.Additioneur.service.AdderService;
import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.annotations.BeforeStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

@SpringBootTest
@ContextConfiguration(classes = { AdderController.class, AdderService.class })
public class AdderIntegrationTest extends SerenityStories {

    @Autowired
    private AdderService adderService;

    @BeforeStory
    public void init() {
        RestAssuredMockMvc.standaloneSetup(new AdderController(adderService));
    }

}
