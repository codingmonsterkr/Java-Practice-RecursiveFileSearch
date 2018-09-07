/**
 * 코드를 제출하기 전에 꼭!!! 위의 패키지 임포트 명령어를 제거해주세요!
 **/

import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final String ROOT_PATH = ".";
	public static final String TARGET_EXTENSION = ".txt";
	
	public static void main(String[] args) throws Exception {
		List<File> allFiles;
		
		allFiles = FileFinder.getFilesByExtension(ROOT_PATH, TARGET_EXTENSION);
		
		for (File file : allFiles) {
			System.out.println(file.getAbsolutePath());
		}
	}
	
	
}

class FileFinder {
	
	/**
	 * @brief   'rootPath' 폴더 내에 존재하는 파일들을 확장자로 검색해주는 메소드
	 * @TODO    현재는 정확히 해당 폴더 내에서만 탐색을 하지만, 하위 모든 서브 디렉토리들도 탐색할 수 있도록 구현하시오.
	 *
	 * @param rootPath  탐색할 폴더의 경로
	 * @param extension 찾을 파일들의 확장자
	 * @return          해당 탐색 조건에 맞는 파일들
	 */
	public static List<File> getFilesByExtension(final String rootPath, final String extension) {
		ArrayList<File> foundFiles = new ArrayList<>();
		
		// 해당 폴더 내부에 존재하는 파일들을 모두 탐색합니다.
		File rootFolder = new File(rootPath);
		
		for (File file : rootFolder.listFiles()) {
			if (file.isFile() && checkExtension(file.getName(), extension)) {
				foundFiles.add(file);
			}
		}
		
		return foundFiles;
	}
	
	public static boolean checkExtension(String fileName, String extension) {
		String lowerCaseFileName = fileName.toLowerCase();
		String lowerCaseExtension = extension.toLowerCase();
		if (lowerCaseFileName.endsWith(lowerCaseExtension)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @breif 재귀적인 설계를 위한 메소드 뼈대 코드
	 *
	 * @param file          탐색 대상 파일
	 * @param extension     확장자 이름
	 * @param list          검색된 파일들을 저장할 list
	 */
	public static void recursiveSearch(final File file, final String extension, final List<File> list) {

	}
	
}
