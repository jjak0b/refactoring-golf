package bustapaga.buca03;

public class CalcolatoreDiTasse {
    private final BustaPaga bustaPaga;

    public CalcolatoreDiTasse(BustaPaga bustaPaga) {
        this.bustaPaga = bustaPaga;
    }

    public double tasseCalcolate() {
        final double primoScaglione = Math.max(Math.min(bustaPaga.getImponibile(), 20000.0) - 5000, 0.0);
        final double secondoScaglione = Math.max(Math.min(bustaPaga.getImponibile(), 40000) - 20000, 0.0);
        final double terzoScaglione = Math.max(bustaPaga.getImponibile() - 40000, 0.0);
        return primoScaglione * 0.1 + secondoScaglione * 0.2 + terzoScaglione * 0.4;
    }
}