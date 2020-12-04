package fr.univlorraine.Additioneur.service;

import org.springframework.stereotype.Service;

@Service
public class AdderService {

    private float num;

    public float baseNum(float base) {
        this.num = base;
        return this.num;
    }

    public float currentBase() {
        return num;
    }

    public float add(float adder) {
        return num + adder;
    }

    public float sub(float adder) {
        return num - adder;
    }

    public float time(float adder) {
        return num * adder;
    }

    public float div(float adder) {
        return num / adder;
    }

    public float accumulate(float adder) {
        return num += adder;
    }

}
