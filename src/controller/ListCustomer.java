package controller;

import model.database.DBCustomer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/list_customer")
public class ListCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        DBCustomer dbCustomer = new DBCustomer();
        ResultSet resultSet = dbCustomer.getListCustomer();
        request.setAttribute("resultSet", resultSet);
        request.getRequestDispatcher("list_customer.jsp").forward(request, response);


    }
}
