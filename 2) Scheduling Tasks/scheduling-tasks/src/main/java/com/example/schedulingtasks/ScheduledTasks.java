package com.example.schedulingtasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Component viene utilizzata per indicare che una classe è un componente che deve essere rilevato e gestito dal contesto dell'applicazione. 
 * È l'annotazione di base per tutti i componenti di Spring e può essere utilizzata per definire 
 * bean che verranno gestiti dall'inversione di controllo (IoC) di Spring.
 * Quando una classe è annotata con 
 * @Component, Spring rileva automaticamente tale classe e la registra come un bean all'interno del contesto dell'applicazione. 
 * Questo significa che Spring si occuperà della creazione, dell'inizializzazione e della gestione del ciclo di vita del bean. 
 * Il bean può quindi essere iniettato e utilizzato in altre parti dell'applicazione.
 */
@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * @Scheduled(cron = "0 0 8 * * ?") // Esegue il metodo alle 8:00 di ogni giorno
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
    
}
