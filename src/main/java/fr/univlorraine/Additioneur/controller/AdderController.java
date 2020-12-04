package fr.univlorraine.Additioneur.controller;

import fr.univlorraine.Additioneur.service.AdderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/adder", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdderController {

    private AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }

    @GetMapping("/current")
    public float currentNum() {
        return adderService.currentBase();
    }

    @PostMapping("/current")
    public float setCurrentNum(@RequestBody() float num) {
        return adderService.baseNum(num);
    }

    @GetMapping("/add")
    public float add(@RequestParam(name = "num") float num) {
        return adderService.add(num);
    }

    @GetMapping("/sub")
    public float sub(@RequestParam(name = "num") float num) {
        return adderService.sub(num);
    }

    @GetMapping("/time")
    public float time(@RequestParam(name = "num") float num) {
        return adderService.time(num);
    }

    @GetMapping("/div")
    public float div(@RequestParam(name = "num") float num) {
        return adderService.div(num);
    }

}
