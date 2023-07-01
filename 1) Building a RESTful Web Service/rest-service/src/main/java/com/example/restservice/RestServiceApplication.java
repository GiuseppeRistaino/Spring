package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @SpringBootApplication è un'annotazione di convenienza che combina tre annotazioni: 
 * @Configuration, @EnableAutoConfiguration e @ComponentScan.
 * @Configuration: Contrassegna la classe come una classe di configurazione per il 
 * contesto dell'applicazione. Indica che la classe può contenere bean definiti dal programmatore utilizzando l'annotazione @Bean.
 * @EnableAutoConfiguration: Indica a Spring Boot di iniziare ad aggiungere automaticamente i 
 * bean in base alle impostazioni del percorso di classe, ad altri bean presenti nel classpath e alle 
 * varie impostazioni delle proprietà dell'applicazione. Ad esempio, se nel classpath è presente spring-webmvc, 
 * questa annotazione contrassegna l'applicazione come un'applicazione Web e attiva i comportamenti chiave, come 
 * la configurazione di un file DispatcherServlet.
 * @ComponentScan: Indica a Spring di eseguire la scansione dei componenti all'interno del pacchetto 
 * specificato (di solito il pacchetto di base dell'applicazione) per individuare automaticamente i componenti, 
 * le configurazioni e i servizi. In questo modo, Spring può individuare i controller, i componenti personalizzati e 
 * altre classi annotati con @Component o le loro varianti come @RestController, @Service, @Repository, ecc.
 * Complessivamente, l'annotazione 
 * @SpringBootApplication semplifica notevolmente la configurazione iniziale di un'applicazione 
 * Spring Boot, combinando le tre annotazioni in un'unica dichiarazione. 
 * Questo riduce la quantità di codice necessario per configurare correttamente l'applicazione e avviare il contesto di Spring
 */
@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
