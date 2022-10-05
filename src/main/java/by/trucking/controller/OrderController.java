package by.trucking.controller;

import by.trucking.model.Client;
import by.trucking.model.Order;
import by.trucking.repository.OrderRepositoryDBImpl;
import by.trucking.service.ClientServiceImpl;
import by.trucking.service.OrderService;
import by.trucking.service.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet("/getorders")
public class OrderController extends HttpServlet {

    private final OrderService os = new OrderServiceImpl(
            new OrderRepositoryDBImpl(), new ClientServiceImpl());



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Order> orders = os.getOrders();

        response.setHeader("Content-Type", "text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        try {
            for (int i = 0; i < orders.size(); i++) {
                writer.println(orders.get(i));
//                writer.println(orders.get(i).getId());
//                writer.println(orders.get(i).getCargo());
//                writer.println(orders.get(i).getWeight());
//                writer.println(orders.get(i).getDeparture());
//                writer.println(orders.get(i).getDestination());
//
//                writer.println(orders.get(i).getClient().getTitle());
//
//                writer.println(orders.get(i).getStatus());

                writer.write("</br>");
            }

        } finally {
            writer.close();
        }
        writer.flush();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("result", result);
//        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }
}

