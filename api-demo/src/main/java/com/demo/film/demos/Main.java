package com.demo.film.demos;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class Main {

    public static void main(String[] args) throws Exception {
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


        final ClienteJava clienteNulo1 = null;
        final var clienteNulo2 = new ClienteJava();
        clienteNulo2.setTelefono("123456789");

        String valor1 = null;
        String valor2 = null;
        String valor3 = null;

        if (clienteNulo1 == null) {
            valor1 = null;
            valor2 = "1";
        }
        else {
            valor1 = cliente1.getTelefono();
            valor2 = clienteNulo1.getTelefono() == null ? "1" : clienteNulo1.getTelefono();
        }
        if (clienteNulo2 != null)
            valor3 = clienteNulo2.getTelefono();

        System.out.println("Cliente Nulo 1 sin valor por defecto: " + valor1);
        System.out.println("Cliente Nulo 1 con valor por defecto: " + valor2);
        System.out.println("Cliente Nulo 2 con valor: " + valor3);



        String json = "{\"user\":\"diego\"}";
        Optional<User> user1 = TopLevelFunctionsKt.parseJson(json, User.class);
        User user2 = new User("alejandro");

        System.out.println("\n\nUsuario mappeado: " + user1.toString());
        System.out.println("Json value: " + TopLevelFunctionsKt.objToJson(user2));
    }
}
