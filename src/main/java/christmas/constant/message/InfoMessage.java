package christmas.constant.message;

public enum InfoMessage {
    NONE_MESSAGE("없음"),
    WECOME_EVENT_PLANNER_MESSAGE("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다."),
    EVENT_BENEFIT_MESSAGE("12월 %s일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!"),
    ORDER_MENU_MESSAGE("<주문 메뉴>"),
    TOTAL_PRICE_MESSAGE("<할인 전 총주문 금액>"),
    GIFT_MENU_MESSAGE("<증정 메뉴>"),
    BENEFIT_DETAILS_MESSAGE("<혜택 내역>"),
    TOTAL_BENEFIT_AMOUNT_MESSAGE("<총혜택 금액>"),
    EXPECTED_PAYMENT_AMOUNT_MESSAGE("<할인 후 예상 결제 금액>"),
    EVENT_BADGE_MESSAGE("<12월 이벤트 배지>");


    private final String infoMessage;

    InfoMessage(String infoMessage) {
        this.infoMessage = infoMessage;
    }

    public String getInfoMessage() {
        return infoMessage;
    }

}
