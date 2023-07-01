package com.example.restservice;

/**
 *  I record sono una nuova caratteristica introdotta in Java 14 per semplificare la creazione di 
 *  classi semplici che rappresentano dati immutabili.
 *  Il record ha due campi: "id" di tipo "long" e "content" di tipo "String". 
 *  Questi campi vengono dichiarati come parametri del costruttore implicito del record. 
 *  Il record genera automaticamente i metodi getter per i campi e un metodo equals(), hashCode() e toString() generati automaticamente.
 *  Quindi, una volta dichiarato il record, puoi creare un'istanza di "Greeting" 
 *  utilizzando il costruttore implicito e accedere ai suoi campi tramite i relativi metodi getter
 * 
 *  Inoltre, i record in Java offrono alcune funzionalità aggiuntive come il supporto per la scomposizione (destructuring), 
 *  che consente di assegnare i valori dei campi del record a variabili separate in un'unica istruzione, ad esempio:
 * 
 *  Greeting greeting = new Greeting(1, "Hello");  
 *  var (id, content) = greeting; // Scomposizione dei campi del record 
 *  System.out.println(id); // Stampa: 1    
 *  System.out.println(content); // Stampa: Hello
 */
public record Greeting(long id, String content) {}

