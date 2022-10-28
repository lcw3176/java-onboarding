package onboarding;

import onboarding.problem3.IMiniGame;
import onboarding.problem3.ThreeSixNineGame;
import onboarding.problem3.ThreeSixNine;

public class Problem3 {
    public static int solution(int number) {
        IMiniGame<ThreeSixNine> game = new ThreeSixNineGame();
        ThreeSixNine result = game.run(ThreeSixNine.builder()
                        .startClapCount(0)
                        .executedClapCount(0)
                        .endClapCount(number)
                        .build());

        return result.getExecutedClapCount();
    }
}
