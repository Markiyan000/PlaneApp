package app.controller.servlets.data_servlets;

import app.model.ModelPlanes;
import app.model.entities.Plane;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListPlanesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Plane> planes = ModelPlanes.getPlanes();
        request.setAttribute("planes", planes);
        request.getRequestDispatcher("view/data_pages/list.jsp").forward(request, response);
    }
}
