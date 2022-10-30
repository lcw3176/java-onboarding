package onboarding;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import onboarding.problem6.Crew;
import onboarding.problem6.NicknameFilter;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<Crew> crewList = new LinkedList<>();

        for(List<String> i : forms){
            crewList.add(new Crew(i.get(0), i.get(1)));
        }

        NicknameFilter nicknameFilter = new NicknameFilter();
        List<Crew> survivorList = nicknameFilter.doFilter(new LinkedList<>(crewList));
        crewList.removeAll(survivorList);

        return null;
    }
}
