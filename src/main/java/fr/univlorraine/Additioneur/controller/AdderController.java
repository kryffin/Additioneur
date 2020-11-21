package fr.univlorraine.Additioneur.controller;

import fr.univlorraine.Additioneur.service.AdderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/adder", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class AdderController {

    private AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }

    @GetMapping("/current")
    public int currentNum() {
        return adderService.currentBase();
    }

    @GetMapping("/add")
    public int add(@RequestParam(name = "num") int num) {
        return adderService.add(num);
    }

    @GetMapping("/sub")
    public int sub(@RequestParam(name = "num") int num) {
        return adderService.sub(num);
    }

    @GetMapping("/time")
    public int time(@RequestParam(name = "num") int num) {
        return adderService.time(num);
    }

    @GetMapping("/div")
    public float div(@RequestParam(name = "num") int num) {
        return adderService.div(num);
    }

}
