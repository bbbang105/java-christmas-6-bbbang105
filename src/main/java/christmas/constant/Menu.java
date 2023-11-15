package christmas.constant;

public enum Menu {
    // 애피타이저
    YANGSONG_SOUP("양송이수프", 6_000, Category.애피타이저),
    TAPAS("타파스", 5_500, Category.애피타이저),
    CAESAR_SALAD("시저샐러드", 8_000, Category.애피타이저),

    // 메인
    T_BONE_STEAK("티본스테이크", 55_000, Category.메인),
    BBQ_RIB("바비큐립", 54_000, Category.메인),
    SEAFOOD_PASTA("해산물파스타", 35_000, Category.메인),
    CHRISTMAS_PASTA("크리스마스파스타", 25_000, Category.메인),

    // 디저트
    CHOCO_CAKE("초코케이크", 15_000, Category.디저트),
    ICE_CREAM("아이스크림", 5_000, Category.디저트),

    // 음료
    ZERO_COLA("제로콜라", 3_000, Category.음료),
    RED_WINE("레드와인", 60_000, Category.음료),
    CHAMPAGNE("샴페인", 25_000, Category.음료);

    private final String name;
    private final int price;
    private final Category category;

    Menu(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public enum Category {
        애피타이저,
        메인,
        디저트,
        음료
    }
}
