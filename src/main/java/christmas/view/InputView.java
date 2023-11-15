package christmas.view;

import camp.nextstep.edu.missionutils.Console;
import christmas.constant.message.InfoMessage;
import christmas.constant.message.InputMessage;

public class InputView {

    public void printWelcomeComment() {
        System.out.println(InfoMessage.WECOME_EVENT_PLANNER_MESSAGE.getInfoMessage());
    }

    public String inputUserDate() {
        System.out.println(InputMessage.INPUT_VISIT_DATE_MESSAGE);
        return Console.readLine();
    }
}
