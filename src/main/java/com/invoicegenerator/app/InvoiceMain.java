package com.invoicegenerator.app;

public class InvoiceMain {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.

        Invoice in = new Invoice();
        Foe foe = new Foe();

        foe.seller();
        foe.customer();

        System.out.println();

        in.records();

    }

}

