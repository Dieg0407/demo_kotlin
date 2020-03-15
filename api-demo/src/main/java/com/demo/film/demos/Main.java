package com.demo.film.demos;

public class Main {
    public static void main(String[] args) {
         final var cliente = new ClienteJava();
         cliente.setNombres("Diego");
         cliente.setApellidos("Pastor");
         cliente.setDni("11111");
         cliente.setEdad(21);

         final var cliente1 = new ClienteJava(
                 "Ruben",
                 "Pastor",
                 "1111",
                 11
         );

         System.out.println(cliente);
        System.out.println(cliente1);
    }
}
