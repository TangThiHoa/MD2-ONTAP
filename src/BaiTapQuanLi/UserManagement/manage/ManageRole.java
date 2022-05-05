package BaiTapQuanLi.UserManagement.manage;

import BaiTapQuanLi.UserManagement.file.FileRole;
import BaiTapQuanLi.UserManagement.mode.Role;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageRole {
    private List<Role>roleList = new ArrayList<>();                         //tạo list role


    public ManageRole(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
    public ManageRole () throws IOException {                            // hàm tạo đọc FileRole
        FileRole.readFromFile(); ;
    }

    public void add (Role role){
        roleList.add(role);                                     // Add : thêm role vào rolelist trả về Role mới
    }

    public int findIndexById (int id ){                        //  tìm kiếm id trả về chỉ số index
        for (int i = 0; i < roleList.size(); i++) {
            if (roleList.get(i).getId() == id) {
                return i;
            }

        }return -1 ;
    }


    public Role findById (int id ){                             //tìm kiếm theo id , trả về ide
        return roleList.get(findIndexById(id ));
    }

    public void edit (int id , Role role ){                     // set : sửa theo chỉ số index và trả về chỉ số và role mới
        roleList.set(findIndexById(id), role);

    }

    public void delete(int id ){                               // remove : xóa theo chỉ số index
        roleList.remove(findIndexById(id));

    }

    public void showAll (){                                      //hiển thị tất cả
        for (int i = 0; i < roleList.size(); i++) {
            System.out.println(roleList.get(i));
        }

    }

    public static void main(String[] args) {
        Role role = new Role(1,"tth","mô ke tả");
        Role role1 = new Role(8,"tkth","mô na tả");
        Role role11 = new Role(4,"thth","mô tả");
        System.out.println(role);
        System.out.println(role1);
        System.out.println(role11);

    }
}
