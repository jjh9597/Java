package ex12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter				//setter생성
@Getter				//getter생성
@ToString
@Data
@AllArgsConstructor	//모든 변수 받아주는 생성자
@NoArgsConstructor	//디폴트생성자
public class LombokTest {

	int a;
	int b;
	int c;
	int d;
	
	public static void main(String[] args) {
	}

}
