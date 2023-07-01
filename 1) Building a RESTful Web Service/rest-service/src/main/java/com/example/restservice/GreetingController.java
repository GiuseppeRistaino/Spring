package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController è una annotazione specifica di Spring utilizzata per dichiarare una classe come controller REST. 
 * Indica che la classe è responsabile per la gestione delle richieste HTTP in un'applicazione Spring e 
 * fornisce funzionalità per creare API RESTful.
 * Quando viene applicata a una classe, l'annotazione 
 * @RestController combina l'annotazione @Controller (che indica che la classe è un controller Spring) e 
 * l'annotazione @ResponseBody (che indica che i risultati dei metodi devono essere serializzati in formato 
 * JSON o XML e restituiti come corpo della risposta HTTP). 
 * Quindi, @RestController semplifica la creazione di controller che restituiscono direttamente i dati serializzati come risposte HTTP.
 */
@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!"; 
    private final AtomicLong counter = new AtomicLong();

    /**
     * @GetMapping("/greeting") è un'annotazione di Spring che associa un metodo di un controller a una specifica richiesta HTTP GET 
     * con il percorso specificato "/greeting".
     * Quando un client HTTP effettua una richiesta GET a /greeting, 
     * Spring invoca il metodo annotato con @GetMapping("/greeting") nel controller corrispondente.
     * Sinonimo: @RequestMapping(method=GET)
     * 
     * L'oggetto Greeting deve essere convertito in JSON. 
     * Grazie al supporto del convertitore di messaggi HTTP di Spring, 
     * non è necessario eseguire questa conversione manualmente. 
     * Poiché Jackson 2 si trova sul classpath, Spring MappingJackson2HttpMessageConverterviene scelto automaticamente 
     * per convertire l'istanza di Greeting in JSON.
     * 
     * @param name il nome di chi si vuole salutare
     * @return Un oggetto Greeting con id, name
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

}