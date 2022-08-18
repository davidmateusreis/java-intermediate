package com.david.cursojava.aula65;

@interface InformacaoAula {
    
    String autor();

    int aulaNumero();

    String blog() default "https://github.com/davidmateusreis";

    String site() default "https://github.com/davidmateusreis";
}
