public class Main {
    public static void main(String[] args) {
        // Testando a classe Tempo

        Tempo t1 = new Tempo(); // 00:00:00
        Tempo t2 = new Tempo(7, 30, 0); // 07:30:00
        Tempo t3 = new Tempo(25, 0, 0); // inválido → 00:00:00
        Tempo t4 = new Tempo(t2); // cópia de t2

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 (inválido) = " + t3);
        System.out.println("t4 (cópia de t2) = " + t4);

        // Alterando valores
        t1.setHora(10);
        t1.setMinuto(45);
        t1.setSegundo(30);
        System.out.println("t1 alterado = " + t1);

        // ⏱ Convertendo em segundos
        System.out.println("t2 em segundos = " + t2.paraSegundos());

        // Diferença entre tempos
        long diferenca = t2.diferencaEmSegundos(t1);
        System.out.println("Diferença entre t2 e t1 = " + diferenca + " segundos");
    }
}
