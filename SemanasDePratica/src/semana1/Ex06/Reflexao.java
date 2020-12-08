package semana1.Ex06;

public class Reflexao {
    public static void listAttributes(Class<?> c) {
        System.out.println("\nLista de atributos exceto os herdados:");
        for (var field : c.getDeclaredFields()) {
            System.out.println(field.getName());
        }

        System.out.println("\nLista de atributos exceto os privados:");
        for (var field : c.getFields()) {
            System.out.println(field.getName());
        }
    }

    public static void listMethods(Class<?> c) {
        System.out.println("\nLista de métodos exceto os herdados:");
        for (var field : c.getDeclaredMethods()) {
            System.out.println(field.getName());
        }

        System.out.println("\nLista de métodos exceto os privados:");
        for (var field : c.getMethods()) {
            System.out.println(field.getName());
        }
    }
}
