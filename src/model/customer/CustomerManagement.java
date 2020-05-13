//package model.customer;
//
//import model.database.DBCustomer;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//public class CustomerManagement {
//    ArrayList<Customer> listCustomer = new ArrayList<>();
//    public CustomerManagement(){
//
//    }
//    public ArrayList<Customer> getListCustomer() throws SQLException {
//        DBCustomer dbCustomer = new DBCustomer();
//        ResultSet resultSet = dbCustomer.getListCustomer();
//        while (resultSet.next()){
//            int id = resultSet.getInt(1);
//            String name = resultSet.getString(2);
//            String password = resultSet.getString(3);
//            String phone = resultSet.getString(4);
//            Customer customer = new Customer(id, name, password, phone);
//            listCustomer.add(customer);
//        }
//        return listCustomer;
//    }
//
//    public void showListCustomer(){
//
//    }
//}
