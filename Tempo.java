class Tempo {
    // Atributos privados
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor 1: padrão (00:00:00)
    public Tempo() {
        this(0, 0, 0);
    }

    // Construtor 2: hora, minuto, segundo
    public Tempo(int hora, int minuto, int segundo) {
        if (valoresValidos(hora, minuto, segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = this.minuto = this.segundo = 0;
        }
    }

    // Construtor 3: hora apenas
    public Tempo(int hora) {
        this(hora, 0, 0);
    }

    // Construtor 4: cópia de outro objeto Tempo
    public Tempo(Tempo outro) {
        this(outro.hora, outro.minuto, outro.segundo);
    }

    // Método auxiliar para validar valores
    private boolean valoresValidos(int h, int m, int s) {
        return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    // Métodos para alterar hora, minuto e segundo
    public boolean setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    // Método toString() → retorna formato HH:MM:SS
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // Método para converter tempo total em segundos
    public long paraSegundos() {
        return (hora * 3600L) + (minuto * 60L) + segundo;
    }

    // Método para calcular diferença entre dois objetos Tempo
    public long diferencaEmSegundos(Tempo outro) {
        return Math.abs(this.paraSegundos() - outro.paraSegundos());
    }
}
