package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	/**
	 * RestTemplate è una classe fornita da Spring Framework che semplifica
	 * l'interazione con i servizi RESTful attraverso richieste HTTP.
	 * È progettata per semplificare il consumo di API RESTful e fornisce metodi
	 * convenienti per inviare richieste HTTP e gestire le risposte.
	 * Nel codice sotto, il metodo restTemplate è un metodo di configurazione che
	 * viene annotato con @Bean.
	 * Ciò indica a Spring di creare un bean di tipo RestTemplate all'interno del
	 * contesto dell'applicazione.
	 * Il RestTemplate viene costruito utilizzando un RestTemplateBuilder, che è
	 * un'interfaccia di supporto
	 * per creare un'istanza di RestTemplate con una configurazione predefinita.
	 * Quando il RestTemplate viene utilizzato nell'applicazione, fornisce metodi
	 * come getForObject(), postForObject(), exchange(), ecc.,
	 * che consentono di inviare richieste HTTP a un'API RESTful e ottenere le
	 * risposte
	 * 
	 * @param restTemplateBuilder RestTemplateBuilder che permette la creazione di
	 *                            un RestTemplate di default
	 * @return Una configurazione predefinita di restTemplate
	 */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}

	/**
	 * CommandLineRunner è un'interfaccia fornita da Spring Boot che definisce un
	 * singolo metodo run() da implementare.
	 * Viene utilizzata per eseguire codice specifico quando l'applicazione Spring
	 * Boot viene avviata come un'applicazione da riga di comando.
	 * Nel codice sotto, il metodo run() viene definito come un bean utilizzando
	 * l'annotazione @Bean.
	 * Quando l'applicazione viene avviata, Spring eseguirà automaticamente il
	 * codice all'interno del metodo run().
	 * Il parametro restTemplate viene iniettato automaticamente dal contesto
	 * dell'applicazione perché è dichiarato
	 * come un parametro del metodo run().
	 * Quindi, all'interno del metodo run(), viene utilizzato restTemplate per
	 * eseguire una richiesta GET all'URL specificato
	 * e ottenere un oggetto Quote come risposta.
	 * La classe CommandLineRunner è utile quando hai bisogno di eseguire del codice
	 * specifico all'avvio dell'applicazione Spring Boot,
	 * ad esempio per inizializzare dati, eseguire operazioni di configurazione o
	 * avviare un processo in background.
	 * Puoi definire più bean CommandLineRunner se hai bisogno di eseguire diverse
	 * azioni all'avvio dell'applicazione.
	 * Inoltre, puoi anche utilizzare l'interfaccia ApplicationRunner,
	 * che funziona in modo simile a CommandLineRunner, ma accetta argomenti della
	 * riga di comando come una lista di stringhe
	 * invece di un array di stringhe. Puoi scegliere l'interfaccia che meglio si
	 * adatta alle tue esigenze specifiche.
	 * 
	 * @param restTemplate
	 * @return
	 */
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		// Stiamo implementando il metodo run(String...args) dell'interfaccia
		// CommandLineRunner attraverso una lambda expression
		return args -> {
			Quote quote = restTemplate.getForObject(
					"http://localhost:8080/api/random",
					Quote.class);
			if (quote != null)
				log.info(quote.toString());
		};
	}

}
