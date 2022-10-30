package onboarding.problem2;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DecryptionUtil {

	public static CipherText decrypt(CipherText password){
		List<Character> passwordList = password.getValue()
			.chars()
			.mapToObj(c -> (char) c)
			.collect(Collectors.toList());

		boolean workedFlag = false;

		for(int i = 0; i < passwordList.size() - 1; i++){
			if(passwordList.get(i) == passwordList.get(i + 1)){
				passwordList.remove(i);
				passwordList.remove(i);
				workedFlag = true;
			}
		}

		if(!workedFlag){
			return password;
		}

		password.changeValue(passwordList.stream()
			.map(Object::toString)
			.collect(Collectors.joining()));

		return decrypt(password);
	}


	private static List<Integer> findContinuousValueIndex(List<Character> characterList){
		Set<Integer> indexSet = new HashSet<>();

		for(int i = 0; i < characterList.size() - 1; i++){
			if(characterList.get(i) == characterList.get(i + 1)){
				indexSet.add(i);
				indexSet.add(i + 1);
			}
		}

		return new LinkedList<>(indexSet);
	}
}
