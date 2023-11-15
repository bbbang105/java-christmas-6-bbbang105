package christmas.validator;

import christmas.constant.Date;
import christmas.constant.Rule;
import christmas.constant.message.ErrorMessage;

public class NumberValidator {

    public void validateDigit(String inputDate) {
        try {
            Integer.parseInt(inputDate);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_DIGIT_MESSAGE.getErrorMessage());
        }
    }

    public void validateRightNumberRange(String inputDate) {
        int number = Integer.parseInt(inputDate);
        if (number > Rule.EVENT_END_DAY.getRule() || number < Rule.EVENT_START_DAY.getRule()) {
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_IN_RIGHT_RANGE.getErrorMessage());
        }
    }
}
