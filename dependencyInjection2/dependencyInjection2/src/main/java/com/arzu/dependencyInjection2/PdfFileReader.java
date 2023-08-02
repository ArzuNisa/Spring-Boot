package com.arzu.dependencyInjection2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PDF")
@Primary
public class PdfFileReader implements Reader {
    @Override
    public String readFile() {
        return "PDF file";
    }
}
