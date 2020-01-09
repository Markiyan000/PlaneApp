package app.controller.servlets.data_servlets;

import app.controller.utils.PlaneUtils;
import app.model.ModelPlanes;
import app.model.entities.Plane;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ReadFileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Plane> planes = ModelPlanes.getPlanes();
        PlaneUtils.readFromFile(planes);
        response.sendRedirect("/");
    }
}
