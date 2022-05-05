package BaiTapQuanLi.UserManagement.manage;

import BaiTapQuanLi.UserManagement.mode.User;

import java.util.ArrayList;
import java.util.List;

public class ManageUser {
    private List<User> userList = new ArrayList<>();

    public ManageUser() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void add(User user) {
        userList.add(user);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) ;
            return i;
        }
        return -1;
    }

    public User findById(int id) {
        return userList.get(findIndexById(id));
    }

    public void edit(int id, User user) {
        userList.set(findIndexById(id), user);
    }

    public void delete(int id) {
        userList.remove(findIndexById(id));
    }

    public void showAll() {


    }
}
