package com.example.schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @EnableScheduling viene utilizzata in Spring Framework per abilitare la pianificazione delle attività (scheduling) all'interno di 
 * un'applicazione. Quando viene applicata a una classe di configurazione o a una classe di avvio dell'applicazione, abilita 
 * la funzionalità di scheduling di Spring.
 * La funzionalità di scheduling di Spring consente di eseguire attività in modo automatico e periodico all'interno dell'applicazione. 
 * Queste attività possono essere configurate per eseguire operazioni in background, come l'elaborazione di dati, l'invio di notifiche, 
 * l'aggiornamento di cache, l'aggiornamento di dati periodici da una fonte esterna e così via.
 */
@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication.class, args);
	}

}
