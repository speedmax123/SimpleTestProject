package com.speedmax.api;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Speed Max on 4/9/2017.
 */
@WebServlet(name = "NotificationServlet", urlPatterns = "/api/notify")
public class NotificationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.addHeader("Content-Type", "application/json");
      response.getWriter().write("{\"message\": \"notify!\"}");
    }
}
