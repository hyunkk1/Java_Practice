package 프로퍼티;

import 인터페이스.Main;
import java.io.IOException;
import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

// Properties? 키와 값을 String 타입으로 제한 ( 설정 정보등을 파일에 쓰기 위해서)
public class PropertiesEx {
    public static void main(String[] args) throws IOException{
        Properties properties = new Properties();
        String path = PropertiesEx.class.getResource("./database.properties").getPath();
        // 현재 파일의 경로를 지정
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }

}
