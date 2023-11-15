package christmas.validator;

import christmas.constant.message.ErrorMessage;
import christmas.util.StringUtil;

public class SplitValidator {
    StringUtil stringUtil = new StringUtil();

    public void validateSplitByComma(String input) {
        try {
            stringUtil.SplitByComma(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_COMMA_SEPARATOR_MESSAGE.getErrorMessage());
        }
    }

    public void validateSplitByDash(String input) {
        try {
            stringUtil.SplitByDash(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_DASH_SEPARATOR_MESSAGE.getErrorMessage());
        }
    }

}
