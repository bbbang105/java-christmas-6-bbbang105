package christmas.constant;

public enum Sign {
    DASH_OR_MINUS("-"),
    LINE_BREAKER("\n"),
    COMMA(",");

    private final String sign;

    Sign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}

