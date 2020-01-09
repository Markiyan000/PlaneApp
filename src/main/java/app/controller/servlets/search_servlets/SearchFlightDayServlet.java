package app.controller.servlets.search_servlets;

import app.controller.utils.PlaneUtils;
import app.model.ModelPlanes;
import app.model.entities.Plane;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearchFlightDayServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String day = request.getParameter("day");
        List<Plane> planes = ModelPlanes.getPlanes();
        List<Plane> found = PlaneUtils.searchFlightByDay(planes, day);
        request.setAttribute("planes", found);
        request.getRequestDispatcher("view/data_pages/list.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/search_pages/searchDay.jsp").forward(request, response);
    }
}
