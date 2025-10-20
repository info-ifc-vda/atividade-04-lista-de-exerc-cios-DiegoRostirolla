class QuadradoMagico {

    // Método estático que verifica se a matriz é um quadrado mágico
    public static boolean eQuadradoMagico(int[][] matriz) {
        // Verifica se é uma matriz quadrada
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            if (matriz[i].length != n) {
                return false; // não é quadrada
            }
        }

        // Verifica se há números repetidos
        java.util.HashSet<Integer> numeros = new java.util.HashSet<>();
        for (int[] linha : matriz) {
            for (int num : linha) {
                if (!numeros.add(num)) {
                    return false; // número repetido encontrado
                }
            }
        }

        // Calcula a soma da primeira linha (valor mágico)
        int somaMagica = 0;
        for (int j = 0; j < n; j++) {
            somaMagica += matriz[0][j];
        }

        // Verifica somas das linhas
        for (int i = 1; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaMagica) {
                return false;
            }
        }

        // Verifica somas das colunas
        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna != somaMagica) {
                return false;
            }
        }

        // Verifica diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        if (somaDiagonalPrincipal != somaMagica) {
            return false;
        }

        // Verifica diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalSecundaria += matriz[i][n - 1 - i];
        }
        if (somaDiagonalSecundaria != somaMagica) {
            return false;
        }

        // Se todas as verificações passaram
        return true;
    }
}