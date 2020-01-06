package app.controller.servlets;

import app.controller.utils.PlaneUtils;
import app.model.Model;
import app.model.entities.Plane;
import com.sun.org.apache.xpath.internal.operations.Mod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearchCityServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String city = request.getParameter("city");
        List<Plane> planes = Model.getPlanes();
        List<Plane> found = PlaneUtils.searchCity(planes, city);
        request.setAttribute("planes", found);
        request.getRequestDispatcher("view/list.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/searchCity.jsp").forward(request, response);
    }
}
