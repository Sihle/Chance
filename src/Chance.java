public class Chance {
    private final int number;
    private final int nChances;
    public Chance(int number, int nChances) {
        this.number = number;
        this.nChances = nChances;
    }

    public int probability() {
        return number * nChances;
    }

    @Override
    public boolean equals(Object obj) {
        Chance chanceObj = (Chance) obj;
        return (chanceObj.number == this.number && chanceObj.nChances == this.nChances);
    }

}
