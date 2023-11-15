package christmas.constant.message;

import christmas.constant.Rule;

public enum ErrorMessage {
    IS_NOT_VALIDATE_DATE_MESSAGE("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요."),
    IS_NOT_VALIDATE_ORDER_MESSAGE("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요."),
    IS_NULL_MESSAGE("[ERROR] 입력값이 없습니다."),
    HAS_BLANK_MESSAGE("[ERROR] 입력값에 앞뒤를 제외한 공백이 존재합니다."),
    IS_NOT_DIGIT_MESSAGE("[ERROR] 입력값이 숫자가 아닙니다."),
    IS_NOT_IN_RIGHT_RANGE("[ERROR] 1~31의 숫자만 가능합니다."),
    IS_NOT_COMMA_SEPARATOR_MESSAGE("[ERROR] ','로 구분되어 있지 않습니다."),
    IS_NOT_DASH_SEPARATOR_MESSAGE("[ERROR] '-'로 구분되어 있지 않습니다."),
    IS_NOT_IN_MENU_LIST_MESSAGE("[ERROR] 입력한 메뉴 이름이 메뉴판에 없습니다."),
    HAS_DUPLICATE_MENU_MESSAGE("[ERROR] 입력한 메뉴 이름에 중복값이 존재합니다."),
    IS_ONLY_DRINK_MESSAGE("[ERROR] 음료만 주문하실 수 없습니다."),
    IS_NOT_OVER_ONE_MENU_MESSAGE("[ERROR]" + Rule.MINIMUM_MENU_NUMBER.getRule() + "개 이상의 메뉴를 주문하셔야 합니다."),
    IS_NOT_UNDER_TWENTY_MENUS_MESSAGE("[ERROR] 메뉴는 총 20개 이하로 주문 가능합니다.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}