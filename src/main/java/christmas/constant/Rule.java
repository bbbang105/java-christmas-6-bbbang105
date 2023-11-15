package christmas.constant;

public enum Rule {
    EVENT_START_DAY(1),
    EVENT_END_DAY(31),
    D_DAY_EVENT_END_DAY(25),
    D_DAY_EVENT_START_AMOUNT(1_000),
    D_DAY_EVENT_PER_DAY_AMOUNT(100),
    WEEK_DISCOUNT_AMOUNT(2_023),
    SPECIAL_DISCOUNT_AMOUNT(1_000),
    TOTAL_PRICE_EXCEPT_DISCOUNT_AMOUNT(120_000),
    STAR_BADGE_AMOUNT(5_000),
    TREE_BADGE_AMOUNT(10_000),
    SANTA_BADGE_AMOUNT(20_000),
    EVENT_START_AMOUNT(10_000),
    MINIMUM_MENU_NUMBER(1),
    MAXIMUM_MENU_NUMBER(20);

    private final int rule;

    Rule(int rule) {
        this.rule = rule;
    }

    public int getRule() {
        return rule;
    }
}
