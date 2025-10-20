public class MainQuadrado {
    public static void main(String[] args) {
        // Exemplo de matriz que É um quadrado mágico
        int[][] matriz1 = {
                { 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 }
        };

        // Exemplo de matriz que NÃO é um quadrado mágico
        int[][] matriz2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Matriz 1 é quadrado mágico? " + QuadradoMagico.eQuadradoMagico(matriz1));
        System.out.println("Matriz 2 é quadrado mágico? " + QuadradoMagico.eQuadradoMagico(matriz2));
    }
}
