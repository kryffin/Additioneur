package fr.univlorraine.Additioneur.service;

import org.springframework.stereotype.Service;

@Service
public class AdderService {

    private int num;

    public void baseNum(int base) {
        this.num = base;
    }

    public int currentBase() {
        return num;
    }

    public int add(int adder) {
        return num + adder;
    }

    public int sub(int adder) {
        return num - adder;
    }

    public int time(int adder) {
        return num * adder;
    }

    public float div(int adder) {
        return num / (float) adder;
    }

    public int accumulate(int adder) {
        return num += adder;
    }

}
