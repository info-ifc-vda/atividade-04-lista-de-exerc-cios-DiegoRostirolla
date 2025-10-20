public class MainConversao {
    public static void main(String[] args) {
        System.out.println("Conversões de Unidades de Volume:\n");

        // Testes de conversão
        System.out.println("1 litro em cm³ = " + ConversaoDeUnidadesDeVolume.litrosParaCentimetrosCubicos(1) + " cm³");
        System.out.println("1 metro³ em litros = " + ConversaoDeUnidadesDeVolume.metrosCubicosParaLitros(1) + " L");
        System.out.println("1 metro³ em pés³ = " + ConversaoDeUnidadesDeVolume.metrosCubicosParaPesCubicos(1) + " ft³");
        System.out.println("1 galão americano em polegadas³ = "
                + ConversaoDeUnidadesDeVolume.galaoAmericanoParaPolegadasCubicas(1) + " in³");
        System.out.println(
                "1 galão americano em litros = " + ConversaoDeUnidadesDeVolume.galaoAmericanoParaLitros(1) + " L");
    }
}