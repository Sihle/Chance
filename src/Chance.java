public class Chance {
    private final int occurrence;
    private final int totalNumberOfOccurrences;
    public Chance(int occurrence, int totalNumberOfOccurrences) {
        this.occurrence = occurrence;
        this.totalNumberOfOccurrences = totalNumberOfOccurrences;
    }
    @Override
    public boolean equals(Object obj) {
        Chance chanceObj = (Chance) obj;
        return (chanceObj.occurrence == this.occurrence && chanceObj.totalNumberOfOccurrences == this.totalNumberOfOccurrences);
    }

}
