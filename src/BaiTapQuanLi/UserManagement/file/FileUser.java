package BaiTapQuanLi.UserManagement.file;

import BaiTapQuanLi.UserManagement.manage.ManageRole;
import BaiTapQuanLi.UserManagement.mode.Role;
import BaiTapQuanLi.UserManagement.mode.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileUser<readToFile> {
    public static List<User>readToFile ()throws IOException{
        ManageRole manageRole = new ManageRole();
        List<User>users = new ArrayList<>();
        File roleFile = new File("user.csv");
        roleFile.createNewFile();
        Scanner sc = new Scanner(roleFile);
        sc. nextLine();
        while (sc.hasNext()){
            String line = sc.nextLine();
            if (line.equals("")){
                break;
            }else {
                String arr [] = line.split(",");
                Role role = manageRole.findById(Integer.valueOf(arr[3]));
                User user = new User(Integer.valueOf(arr[1]),arr[2],arr[3],arr[4]);
                users.add(user);
            }
        }
        return users;
    }
    public static void writeToFile (List<User>list )throws FileNotFoundException{
        File roleFile = new File("user.csv");
        PrintWriter printWriter = new PrintWriter(roleFile);
        printWriter.print("id,username,password,role,status \n");
        for (int i = 0; i < list.size(); i++) {
            printWriter.print(list.get(i));

        }printWriter.close();
    }

    public static void main(String[] args) {

    }
}
