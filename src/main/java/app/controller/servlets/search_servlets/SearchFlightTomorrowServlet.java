package app.controller.servlets.search_servlets;

import app.controller.utils.DateUtils;
import app.controller.utils.PlaneUtils;
import app.model.Model;
import app.model.entities.Plane;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearchFlightTomorrowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tomorrow = DateUtils.getTomorrow();
        List<Plane> planes = Model.getPlanes();
        List<Plane> found = PlaneUtils.searchFlightByDay(planes, tomorrow);
        request.setAttribute("planes", found);
        request.getRequestDispatcher("view/data_pages/list.jsp").forward(request, response);
    }
}
