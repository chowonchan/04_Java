package practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PractictByteService {
	
	public void test1() {
		
//		File file = new File("\\io_test1\\byte\\생성.txt");
//		System.out.println(file.getPath());
//		
//		System.out.println("\\io_test1\\byte\\생성.txt");
//		
//		if( !file.exists() ) {
//			try {
//				if( file.createNewFile() ) {
//					System.out.println( file.getName() + " 파일이 생성 되었습니다");
//				}
//				
//			} catch (Exception e) {
//				System.out.println("---- 파일 생성중 예외 발생 ----");
//				e.printStackTrace();
//				
//			}
//		}
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("/io_test1/byte/버터.txt");
			bos = new BufferedOutputStream(fos);
			
			String content = """
Su su su Supernova
Nova
Can’t stop hyperstellar
원초 그걸 찾아
Bring the light of a dying star
불러낸 내 우주를 봐 봐
Supernova
""";
			
			bos.write(content.getBytes());
			System.out.println("[출력완료]");
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) bos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}

}
