package app.controller.servlets.data_servlets;

import app.controller.utils.PlaneUtils;
import app.model.ModelPlanes;
import app.model.entities.Plane;
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
        List<Plane> planes = ModelPlanes.getPlanes();
        planes.add(plane);
        request.setAttribute("planes", planes);
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/data_pages/add.jsp").forward(request, response);
    }
}
