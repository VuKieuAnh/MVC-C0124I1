package org.example.demo.controller;

import org.example.demo.HelloServlet;
import org.example.demo.model.Customer;
import org.example.demo.service.CustomerService;
import org.example.demo.service.ICustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "customercontroller", urlPatterns = "/customer")
public class CustomerController extends HttpServlet {
    private final ICustomerService customerService = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ( action != null && action.equals("create")){
            showFormCreate(req, resp);
        }
        else {
            showAllCustomer(req, resp);
        }
    }

    private void showFormCreate(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher formcreate = req.getRequestDispatcher("customer/create.jsp");
        try {
            formcreate.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showAllCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //        lay du lieu tu model
        List<Customer> listC = customerService.findAll();
//        lay ra view
        RequestDispatcher list = req.getRequestDispatcher("customer/list.jsp");
//        render data
        req.setAttribute("dskh", listC);
        list.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action){
            case "create":
                createNewCustomer(req, resp);
                break;
            default:
                showAllCustomer(req, resp);
        }
    }

    private void createNewCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //                lay du lieu
        String name = req.getParameter("name");
        String dob = req.getParameter("dob");
        String address = req.getParameter("address");
        Customer c = new Customer(name, dob, address);
//                goi service
        customerService.createCustomer(c);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("customer/create.jsp");
        req.setAttribute("mess", "tao moi thanh cong");
        requestDispatcher.forward(req, resp);
    }
}
