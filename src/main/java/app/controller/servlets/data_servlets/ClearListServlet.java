package app.controller.servlets.data_servlets;

import app.model.ModelPlanes;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClearListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ModelPlanes.getPlanes().clear();
        response.sendRedirect("/");
    }
}
