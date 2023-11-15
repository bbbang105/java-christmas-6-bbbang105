package christmas.validator;

import christmas.constant.message.ErrorMessage;

import java.util.Map;

public class DupicateValidator {

    public void validateDuplication (String inputMenu, Map<String, Integer> menus) {
        if (menus.containsKey(inputMenu)) {
            throw new IllegalArgumentException(ErrorMessage.HAS_DUPLICATE_MENU_MESSAGE.getErrorMessage());
        }
    }
}
