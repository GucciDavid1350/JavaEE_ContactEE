package ca.bytetube.web.servlet;

import ca.bytetube.domain.User;
import ca.bytetube.service.UserService;
import ca.bytetube.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteSelctedServlet {
    UserService service = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String [] ids = request.getParameterValues("id");
        service.delUser(ids);
        response.sendRedirect(request.getContextPath()+"/UserLIstServlet");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
