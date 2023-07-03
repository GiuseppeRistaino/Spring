Le dipendenze spring-boot-starter-thymeleaf e spring-boot-starter-web sono starter di Spring Boot che forniscono funzionalità specifiche per lo sviluppo di applicazioni web e l'utilizzo del motore di template Thymeleaf.

spring-boot-starter-web: Questa dipendenza include tutte le librerie e le configurazioni necessarie per sviluppare applicazioni web con Spring Boot. Include il framework Spring MVC per la gestione delle richieste HTTP, la gestione delle risposte, la gestione dei percorsi (routing) e altre funzionalità legate allo sviluppo di applicazioni web. Inoltre, fornisce un server web integrato che ti consente di eseguire l'applicazione senza la necessità di configurare un server web esterno.

spring-boot-starter-thymeleaf: Questa dipendenza fornisce il supporto per l'utilizzo del motore di template Thymeleaf nelle applicazioni Spring Boot. Thymeleaf è un motore di template potente e flessibile che consente di creare facilmente pagine HTML dinamiche. Con questa dipendenza, puoi utilizzare le funzionalità di Thymeleaf per la generazione dinamica di pagine HTML, l'inserimento di valori dinamici, la gestione delle iterazioni, il binding dei dati e molte altre funzionalità avanzate offerte da Thymeleaf.

Queste dipendenze semplificano lo sviluppo di applicazioni web con Spring Boot, fornendo tutte le librerie e le configurazioni necessarie per avviare e configurare un'applicazione web, nonché per utilizzare il motore di template Thymeleaf per generare pagine HTML dinamiche.

---------------------------------------------------- PERCORSO ASSOLUTO E RELATIVO
La differenza tra un percorso assoluto e un percorso relativo riguarda il modo in cui viene specificata la posizione di un file o di una directory rispetto al sistema di riferimento.

Percorso assoluto: Un percorso assoluto specifica la posizione completa di un file o di una directory rispetto al root del sistema di file. Un percorso assoluto inizia sempre con una specifica del root, come ad esempio "C:" su Windows o "/" su Linux. Questo tipo di percorso fornisce una descrizione completa e univoca del percorso di un file o di una directory indipendentemente dalla posizione corrente del programma.
Esempi di percorsi assoluti:

Windows: "C:\Users\username\Documents\file.txt"

Linux: "/home/username/Documents/file.txt"

Percorso relativo: Un percorso relativo specifica la posizione di un file o di una directory in relazione alla posizione corrente del programma o del file di riferimento. In altre parole, un percorso relativo dipende dal contesto in cui viene utilizzato e può essere interpretato solo rispetto a una posizione di base.

Esempi di percorsi relativi:

"Documents/file.txt"
"../images/image.jpg"

---------------------------------------------------- DIMENSIONE FILE

Quando si configurano gli upload di file, è spesso utile impostare dei limiti sulla dimensione dei file. Immagina di dover gestire un upload di un file di 5 GB! Con Spring Boot, possiamo regolare l'elemento MultipartConfigElement configurato automaticamente con alcune impostazioni di proprietà.

Aggiungi le seguenti proprietà alle tue impostazioni di proprietà esistenti (in src/main/resources/application.properties):

spring.servlet.multipart.max-file-size=128KB
spring.servlet.multipart.max-request-size=128KB
Le impostazioni multipart sono limitate come segue:

spring.servlet.multipart.max-file-size è impostato su 128KB, il che significa che la dimensione totale del file non può superare i 128KB.

spring.servlet.multipart.max-request-size è impostato su 128KB, il che significa che la dimensione totale della richiesta per un multipart/form-data non può superare i 128KB.