package gt.edu.miumg.FabricaZapatos;

public class FabricaZapatoMujer implements FabricaZapato{
    @Override
    public Zapato crearZapatoDeportivo() {
        return  new ZapatoDeportivoMujer();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return  new ZapatoFormalMujer();
    }
}
