package onboarding;

import java.util.List;

import onboarding.problem5.AccountRequest;
import onboarding.problem5.AccountResponse;
import onboarding.problem5.IPolicy;
import onboarding.problem5.PolicyFactory;
import onboarding.problem5.RequestType;

public class Problem5 {
    public static List<Integer> solution(int money) {
        IPolicy policy = PolicyFactory.Lightweight.getPolicy();
        AccountRequest request = new AccountRequest(money, RequestType.WITHDRAW);
        AccountResponse response = policy.withdraw(request);

        return response.getResultList();
    }
}
