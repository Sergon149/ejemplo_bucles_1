public class Main {

    public static void main(String[] args) {
        functionUsoDelFor(10);
        functionUsoDelWhile(10);
        functionUsoDelDoWhile(10);
    }

    public static void functionUsoDelFor(int variable){
        System.out.println("---functionUsoDelFor---\nVoy a imprimir por pantalla todos los numeros de 0 a " + variable);
        for (int i = 0; i <= variable; i++){
            System.out.println(i);
        }
    }

    public static void functionUsoDelWhile(int variable){
        System.out.println("---functionUsoDelWhile---\nVoy a imprimir por pantalla todos los numeros de 0 a " + variable);
        int i = 0;
        while (i <= variable){
            System.out.println(i);
            i++;
        }
    }

    public static void functionUsoDelDoWhile(int variable){
        System.out.println("---functionUsoDelDoWhile---\nVoy a imprimir por pantalla todos los numeros de 0 a " + variable);
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= variable);
    }

}

