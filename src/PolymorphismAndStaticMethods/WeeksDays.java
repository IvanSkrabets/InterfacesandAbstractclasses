package PolymorphismAndStaticMethods;

public enum WeeksDays {
    MONDAY("mod"),
    TUEDAY("tue"),
    WENSEDAY("wen"),
    THUSDAY("thu"),
    FRIDAY("fri"),
    SATURDAY("sat"),
    SUNDAY("sun");

    private String code;

    WeeksDays(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
