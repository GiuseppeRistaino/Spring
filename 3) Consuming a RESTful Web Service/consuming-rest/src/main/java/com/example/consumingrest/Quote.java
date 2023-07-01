package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @JsonIgnoreProperties viene utilizzata in Jackson, la libreria di serializzazione e deserializzazione JSON di default in Spring Framework, 
 * per indicare le proprietà di una classe che devono essere ignorate durante la serializzazione o deserializzazione di un oggetto JSON.
 * Quando viene applicata a una classe o a un campo, @JsonIgnoreProperties specifica le proprietà JSON che devono essere ignorate, 
 * cioè non devono essere incluse nel JSON risultante durante la serializzazione o non devono essere considerate durante la deserializzazione.
 * 
 * l'annotazione @JsonIgnoreProperties(ignoreUnknown = true) viene applicata alla classe Quote. 
 * Il parametro ignoreUnknown specifica che le proprietà JSON sconosciute non devono generare errori durante la deserializzazione. 
 * Se durante la deserializzazione viene trovata una proprietà JSON che non corrisponde a un campo nella classe Quote, 
 * verrà semplicemente ignorata senza causare un'eccezione.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, Value value) {
    
}
