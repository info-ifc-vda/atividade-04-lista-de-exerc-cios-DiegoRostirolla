class ConversaoDeUnidadesDeVolume {

    // 1 litro = 1000 cm³
    public static double litrosParaCentimetrosCubicos(double litros) {
        return litros * 1000.0;
    }

    // 1 metro³ = 1000 litros
    public static double metrosCubicosParaLitros(double metrosCubicos) {
        return metrosCubicos * 1000.0;
    }

    // 1 metro³ = 35.32 pés³
    public static double metrosCubicosParaPesCubicos(double metrosCubicos) {
        return metrosCubicos * 35.32;
    }

    // 1 galão americano = 231 polegadas³
    public static double galaoAmericanoParaPolegadasCubicas(double galoes) {
        return galoes * 231.0;
    }

    // 1 galão americano = 3.785 litros
    public static double galaoAmericanoParaLitros(double galoes) {
        return galoes * 3.785;
    }
}