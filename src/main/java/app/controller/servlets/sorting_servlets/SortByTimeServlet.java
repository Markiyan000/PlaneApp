package app.controller.servlets.sorting_servlets;

import app.controller.utils.PlaneUtils;
import app.model.ModelPlanes;
import app.model.entities.Plane;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SortByTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Plane> planes = ModelPlanes.getPlanes();
        List<Plane> sorted = PlaneUtils.sortByTime(planes);
        request.setAttribute("planes", sorted);
        request.getRequestDispatcher("view/data_pages/list.jsp").forward(request, response);
    }
}
