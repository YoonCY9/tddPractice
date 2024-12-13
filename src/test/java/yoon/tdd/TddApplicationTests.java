package yoon.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TddApplicationTests {

	public List<Integer> toIntegers(List<String> strings) {

		List<Integer> integers = new ArrayList<>();
		for (String s : strings) {
			integers.add(Integer.parseInt(s));
		}
		return integers;
	}

	@Test
	@DisplayName("문자열 리스트를 정수 리스트로 변환")
	void toIntegersTest() {
		List<String> strings = List.of("1", "2", "3");
		List<Integer> integers = List.of(1,2,3);

		List<Integer> result = toIntegers(strings);

		assertThat(result).isEqualTo(integers);
	}

}
