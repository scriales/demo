package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
        System.out.println( "Hello World!" );
        System.out.println("Converting object to json...");
        Persona persona = new Persona();
        persona.setNombre("Pedro Perez");
        persona.setEdad(new Integer(34));
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(persona));
    
    }
}
