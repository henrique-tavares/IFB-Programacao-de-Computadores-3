package semana1.Ex07;

public @interface AnnotationEndereco {
    String logadouro();

    String numero() default "S/N";

    String bairro();

    String cidade();

    String estado();
}
