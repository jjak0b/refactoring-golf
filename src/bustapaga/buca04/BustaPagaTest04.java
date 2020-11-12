package bustapaga.buca04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BustaPagaTest04 {
    @Test
    public void tasseZeroSeImponibileInferioreAlPrimoScaglione() {
        assertNettoDatoLordo(5000, 5000);
    }

    public void assertNettoDatoLordo(int i, int i2) {
        BustaPaga bustaPaga = new BustaPaga(i, new CalcolatoreTasse());
        assertEquals(i2, bustaPaga.getNetto(), 1e-6);
    }

    @Test
    public void tasseDelPrimoScaglioneEsclusoZonaEsentasse() {
        assertNettoDatoLordo(10000, 9500);

        assertNettoDatoLordo(20000, 18500);
    }

    @Test
    public void tasseDelSecondoScaglioneComeSommaDelleTasseDelPrimoScaglioneEDelSecondoScaglione() {
        assertNettoDatoLordo(25000, 22500);

        assertNettoDatoLordo(40000, 34500);
    }

    @Test
    public void tasseDelTerzoScaglioneComeSommaDelleTasseDiTuttiGliScaglioni() {
        assertNettoDatoLordo(50000, 40500);

        assertNettoDatoLordo(60000, 46500);
    }
}