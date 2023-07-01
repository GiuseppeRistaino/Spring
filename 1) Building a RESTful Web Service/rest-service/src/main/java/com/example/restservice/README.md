Puoi eseguire l'applicazione dalla riga di comando con Gradle o Maven. Puoi anche creare un singolo file JAR eseguibile che contenga tutte le dipendenze, le classi e le risorse necessarie ed eseguirlo. La creazione di un jar eseguibile semplifica la distribuzione, la versione e la distribuzione del servizio come applicazione durante tutto il ciclo di vita dello sviluppo, in ambienti diversi e così via.

Se usi Gradle, puoi eseguire l'applicazione usando ./gradlew bootRun. In alternativa, puoi creare il file JAR utilizzando ./gradlew builde quindi eseguire il file JAR, come segue:

java -jar build/libs/gs-rest-service-0.1.0.jar

Se usi Maven, puoi eseguire l'applicazione usando ./mvnw spring-boot:run. In alternativa, puoi creare il file JAR con ./mvnw clean package e quindi eseguire il file JAR, come segue:

java -jar target/gs-rest-service-0.1.0.jar