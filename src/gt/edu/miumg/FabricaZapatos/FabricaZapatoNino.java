package gt.edu.miumg.FabricaZapatos;

public class FabricaZapatoNino implements FabricaZapato {
    @Override
    public Zapato crearZapatoDeportivo() {
        return  new ZapatoDeportivoNino();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return  new ZapatoFormalNino();
    }
}
