package bustapaga.buca03;

public class BustaPaga {
    private final double imponibile;
    private final CalcolatoreDiTasse calcolatoreDiTasse = new CalcolatoreDiTasse(this);

    public BustaPaga(final double imponibile) {
        this.imponibile = imponibile;
    }

    public double getNetto() {
        return imponibile - calcolatoreDiTasse.tasseCalcolate();
    }

    public double tasseCalcolate() {
        return calcolatoreDiTasse.tasseCalcolate();
    }

    public double getImponibile() {
        return imponibile;
    }
}