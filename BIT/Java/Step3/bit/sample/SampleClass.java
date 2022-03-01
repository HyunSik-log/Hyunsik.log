//자신의 패키지 명
package bit.sample;

//다른 패키지에 있는 식별자 사용
import bit.*;       //무조건 bit 패키지 내부에 있는 것 사용.
//import bit.Sample;

public class SampleClass {

	public static void main(String[] args) {
		bit.Sample s1 = new bit.Sample();

		Samle1 s2 = new Samle1();
		// s2.number = 10; //error
	}
}
