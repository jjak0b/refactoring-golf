package bustapaga.buca01;

public class BustaPaga {
    private final double stipendio;

    public BustaPaga(final double addValue) {
        this.stipendio = addValue;
    }

    public double getNetto() {
        final double primoScaglione = Math.max(Math.min(stipendio, 20000.0) - 5000, 0.0);
        final double secondoScaglione = Math.max(Math.min(stipendio, 40000) - 20000, 0.0);
        final double terzoScaglione = Math.max(stipendio - 40000, 0.0);
        return stipendio - (primoScaglione * 0.1 + secondoScaglione * 0.2 + terzoScaglione * 0.4);
    }
}
