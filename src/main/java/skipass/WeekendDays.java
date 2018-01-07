package skipass;

public enum WeekendDays {
    ONE("1"), TWO("2");

    private String days;

    WeekendDays(String days){this.days = days;}

    @Override
    public String toString() {
        return days;
    }
}
