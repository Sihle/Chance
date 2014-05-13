public class Chance {
    private final int occurrence;
    private final int totalNumberOfOccurrences;
    public Chance(int occurrence, int totalNumberOfOccurrences) {
        this.occurrence = occurrence;
        this.totalNumberOfOccurrences = totalNumberOfOccurrences;
    }
//    public int percentage() {
//        return occurrence/totalNumberOfOccurrences);
//    }
    @Override
    public boolean equals(Object obj) {
        Chance chanceObj = (Chance) obj;
        return (double)chanceObj.occurrence / chanceObj.totalNumberOfOccurrences == (double)this.occurrence / this.totalNumberOfOccurrences;
    }

    @Override
    public String toString() {
        return "Chance("+occurrence
                +"," +totalNumberOfOccurrences+")";
    }

    public Chance and(Chance chance) {
        return new Chance(occurrence * chance.occurrence, totalNumberOfOccurrences * chance.totalNumberOfOccurrences);
    }

    public Chance not() {
        return new Chance(totalNumberOfOccurrences - occurrence, totalNumberOfOccurrences);
    }

    public Chance or(Chance chance) {
        if (occurrence == (totalNumberOfOccurrences - occurrence)) {
            return new Chance(occurrence, totalNumberOfOccurrences);
        }else {
            return chance;
        }
    }
}
