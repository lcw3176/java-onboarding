package onboarding;

import java.util.List;

import onboarding.problem1.GameInfo;
import onboarding.problem1.PageInfo;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if(pobi == null || crong == null){
            return GameInfo.INVALID.getInfo();
        }

        if(pobi.size() < PageInfo.MIN_PAGES.getInfo() || crong.size() < PageInfo.MIN_PAGES.getInfo()){
            return GameInfo.INVALID.getInfo();
        }



        return GameInfo.DRAW.getInfo();
    }
}
