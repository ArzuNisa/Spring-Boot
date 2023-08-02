package com.arzu.dependencyInjection2;

public class WordFileReader implements Reader{
    @Override
    public String readFile() {
        return "Word file";
    }
}
