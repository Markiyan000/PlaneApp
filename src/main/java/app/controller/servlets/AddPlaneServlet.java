package app.controller.servlets;

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

public class AddPlaneServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Plane plane = PlaneUtils.createPlane(request);
        List<Plane> planes = Model.getPlanes();
        PlaneUtils.addPlane(planes, plane);
        request.setAttribute("planes", planes);
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/add.jsp");
        requestDispatcher.forward(request, response);
    }

}
