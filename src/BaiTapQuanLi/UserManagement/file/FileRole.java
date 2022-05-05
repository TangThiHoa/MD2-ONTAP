package BaiTapQuanLi.UserManagement.file;

import BaiTapQuanLi.UserManagement.mode.Role;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRole<wrireToFile> {
  public static List<Role> readFromFile () throws IOException {                //tạo list đọc file
    List<Role> roles = new ArrayList<>();
    File roleFile = new File("role.csv");
    roleFile.createNewFile();
    Scanner sc = new Scanner(roleFile);                                       //Đọc file vừa mới tạo
    sc.nextLine();
    while (sc.hasNext()){                                                    //quét nếu có dòng tiếp theo thì ..
      String line = sc.nextLine();
      if (line.equals("")){                                                  //nếu rỗng break
        break;
      }else {
        String arr []= line.split(",");                                //split : cắt chuỗi theo dấu đc truyền vào arr
        roles.add(new Role(Integer.valueOf(arr[0]),arr[1],arr[2]));
      }
    }
    return roles;

  }

  public static void wrireToFile (List<Role>list) throws IOException {
    File roleFile = new File("role.csv");
    roleFile.createNewFile();
    PrintWriter printWriter = new PrintWriter(roleFile);
    printWriter.print("id,name,description");
    for (int i = 0; i < list.size(); i++) {
      printWriter.print(list.get(i));

    }printWriter.close();
  }
}
