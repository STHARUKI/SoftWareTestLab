package cn.edu.tju.labtriproblem;

public class TriProblem {
	
	//返回1代表真，返回0代表假
	public int testGivenNumber(int givenNumber) {
		if(givenNumber < 0 || givenNumber > 83) {
			return 0;
		} else if(givenNumber >= 50){
			givenNumber = givenNumber - 50;
			if(testGivenNumber(givenNumber) == 1) {
				return 1;
			} else {
				return 0;
			}
		} else if(givenNumber >= 20) {
			givenNumber = givenNumber - 20;
			if(testGivenNumber(givenNumber) == 1) {
				return 1;
			} else {
				return 0;
			}
		} else if(givenNumber >= 5) {
			givenNumber = givenNumber - 5;
			if(testGivenNumber(givenNumber) == 1) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if(givenNumber <= 3) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
