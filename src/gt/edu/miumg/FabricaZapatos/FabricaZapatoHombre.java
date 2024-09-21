package gt.edu.miumg.FabricaZapatos;

public class FabricaZapatoHombre implements FabricaZapato{
    @Override
    public Zapato crearZapatoDeportivo() {
        return  new ZapatoDeportivoHombre();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return  new ZapatoFormalHombre();
    }
}
