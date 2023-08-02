package com.arzu.dependencyInjection2;

import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelFileReader implements Reader{
    @Override
    public String readFile() {
        return "EXCEL file";
    }
}
