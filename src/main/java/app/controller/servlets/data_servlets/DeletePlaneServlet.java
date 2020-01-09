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

public class DeletePlaneServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long ID = Long.parseLong(request.getParameter("id"));
        List<Plane> planes = ModelPlanes.getPlanes();
        Plane found = PlaneUtils.searchPlane(planes, ID);
        planes.remove(found);
        request.setAttribute("id", ID);
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/data_pages/delete.jsp").forward(request, response);
    }
}
