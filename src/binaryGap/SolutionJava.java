package binaryGap;

public class SolutionJava {

	/**
	 * 문제 : https://codility.com/c/run/training8FKHPA -U9P
	 *  - 양의 정수를 입력받아서 2진표현법으로 변환시 표시되는 0의 최대 자릿수 구하기
	 *  - 예) 10진수 1041 -> 2진수 -> 10000010001 -> 답은 5
	 *  - TODO : bit연산을 이용해 최적화 
	 *  
	 * @author 엄승하
	 */
	public static class Solution {

		public int solution(int n) {

			int maxLength = 0;
			int currentLength = 0;

			while (n > 0) {
				if (n % 2 == 1) { //10진수를 2진수로 변환하는 방법은, 10진수를 2로 나눈 나머지(1또는 0)의 연속숫자이다.
					currentLength = 0;
				} else {
					currentLength = currentLength + 1;
				}

				if (currentLength > maxLength) {
					maxLength = currentLength;
				}

				n = n / 2;
			}

			return maxLength;
		}

	}

	public static void main(String[] args) {

		int target = 1041;
		int result = new Solution().solution(target);

		System.out.println("Test " + target + " result is " + result);
	}

}
