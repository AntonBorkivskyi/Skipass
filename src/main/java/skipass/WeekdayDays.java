package skipass;

public enum WeekdayDays {
    ONE("1"), TWO("2"), FIVE("5");

    private String days;

    WeekdayDays(String days){this.days = days;}

    @Override
    public String toString() {
        return days;
    }
}
