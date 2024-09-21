package gt.edu.miumg.FabricaZapatos;

public class Cliente {
    public static void main(String[] args) {
        // Fábrica de zapatos para hombre
        FabricaZapato fabricaHombre = new FabricaZapatoHombre();
        Zapato zapatoDeportivoHombre = fabricaHombre.crearZapatoDeportivo();
        Zapato zapatoFormalHombre = fabricaHombre.crearZapatoFormal();

        zapatoDeportivoHombre.mostrarDetalles();
        zapatoFormalHombre.mostrarDetalles();

        // Fábrica de zapatos para mujer
        FabricaZapato fabricaMujer = new FabricaZapatoMujer();
        Zapato zapatoDeportivoMujer = fabricaMujer.crearZapatoDeportivo();
        Zapato zapatoFormalMujer = fabricaMujer.crearZapatoFormal();

        zapatoDeportivoMujer.mostrarDetalles();
        zapatoFormalMujer.mostrarDetalles();

        // Fábrica de zapatos para niño
        FabricaZapato fabricaNino = new FabricaZapatoNino();
        Zapato zapatoDeportivoNino = fabricaNino.crearZapatoDeportivo();
        Zapato zapatoFormalNino = fabricaNino.crearZapatoFormal();

        zapatoDeportivoNino.mostrarDetalles();
        zapatoFormalNino.mostrarDetalles();
    }
}
