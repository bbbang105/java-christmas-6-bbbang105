package christmas.constant.message;

import christmas.constant.Sign;

public enum OutputMessage {
    NAME_AND_NUMBER_MESSAGE("%s %d개"),
    PRICE_MESSAGE("%d원"),
    DISCOUNT_MESSAGE(Sign.DASH_OR_MINUS.getSign() + "%d원"),
    D_DAY_DISCOUNT_MESSAGE("크리스마스 디데이 할인: " + OutputMessage.DISCOUNT_MESSAGE.getOutputmessage()),
    WEEK_DAY_DISCOUNT_MESSAGE("평일 할인: " + OutputMessage.DISCOUNT_MESSAGE.getOutputmessage()),
    SPECIAL_DISCOUNT_MESSAGE("특별 할인: " + OutputMessage.DISCOUNT_MESSAGE.getOutputmessage()),
    GIFT_MENU_MESSAGE("증정 이벤트: " + OutputMessage.DISCOUNT_MESSAGE.getOutputmessage()),
    BADGE_MESSAGE("%s");

    private final String outputmessage;

    OutputMessage(String outputMessage) {
        this.outputmessage = outputMessage;
    }

    public String getOutputmessage() {
        return outputmessage;
    }
}
