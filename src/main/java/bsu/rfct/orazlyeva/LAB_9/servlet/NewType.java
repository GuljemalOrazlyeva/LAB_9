package bsu.rfct.orazlyeva.LAB_9.servlet;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class NewType extends SimpleTagSupport {

    private User type;

    public void setUser(User type) {
        this.type = type;
    }

    public void doTag() throws JspException, IOException {
        String errorMessage = null;
        UserList userList = (UserList) getJspContext().getAttribute("users", PageContext.APPLICATION_SCOPE);

        if (type.getType()==null || type.getType().equals("")) {
            errorMessage = "Select ad type";

        } else {
            if (type.getName()==null || type.getName().equals("")) {
                errorMessage = "Username cannot be empty!";
            }
        }

        if (errorMessage==null) {
            try {
                userList.addUser(type);
                UserListHelper.saveUserList(userList);
            } catch (UserExistsException e) {}
        }

        getJspContext().setAttribute("errorMessage", errorMessage,PageContext.SESSION_SCOPE);
    }
}
