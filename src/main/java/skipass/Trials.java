package skipass;

public enum Trials {
    TEN("10"), TWENTY("20"), FIFTY("50"), HUNDRED("100");

    private String trials;

    Trials(String trials){this.trials = trials;}

    @Override
    public String toString() {
        return trials;
    }
}
