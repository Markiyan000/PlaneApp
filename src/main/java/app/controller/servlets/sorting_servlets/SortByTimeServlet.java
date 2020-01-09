package app.controller.servlets.sorting_servlets;

import app.controller.utils.PlaneUtils;
import app.model.Model;
import app.model.entities.Plane;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SortByTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Plane> planes = Model.getPlanes();
        List<Plane> sorted = PlaneUtils.sortByTime(planes);
        request.setAttribute("planes", sorted);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/data_pages/list.jsp");
        requestDispatcher.forward(request, response);
    }
}
