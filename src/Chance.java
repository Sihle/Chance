public class Chance {
    private final int occurrence;
    private final int totalNumberOfOccurrences;
    public Chance(int occurrence, int totalNumberOfOccurrences) {
        this.occurrence = occurrence;
        this.totalNumberOfOccurrences = totalNumberOfOccurrences;
    }
//    public int probability() {
//        return occurrence/totalNumberOfOccurrences);
//    }

    @Override
    public String toString() {
        return "Chance("+occurrence
                +"," +totalNumberOfOccurrences+")";
    }

    public Chance and(Chance chance) {
        return new Chance(this.occurrence * chance.occurrence, this.totalNumberOfOccurrences * chance.totalNumberOfOccurrences);
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
