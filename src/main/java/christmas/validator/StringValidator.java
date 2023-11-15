package christmas.validator;

import christmas.constant.message.ErrorMessage;
import christmas.util.StringUtil;

public class StringValidator {
    private final StringUtil stringUtil = new StringUtil();

    public void validateNotNull(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.IS_NULL_MESSAGE.getErrorMessage());
        }
    }

    public void validateNotContainBlank(String input) {
        if (!stringUtil.RemoveBlankInString(input).equals(input)) {
            throw new IllegalArgumentException(ErrorMessage.HAS_BLANK_MESSAGE.getErrorMessage());
        }
    }
}
