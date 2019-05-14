package com.braininghub.webstore.servlets;

import com.braininghub.webstore.beans.WareBean;
import com.braininghub.webstore.dtos.WareDTO;
import com.braininghub.webstore.services.WareService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by kopig on 2019. 05. 14..
 */
public class WebStoreServlet extends HttpServlet {

    WareService wareService = new WareService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/createWare.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        WareDTO wareDTO = new WareDTO(request.getParameter("codeKey"),
                request.getParameter("name"), request.getParameter("description"),
                Integer.valueOf(request.getParameter("price")));

        wareService.createWare(wareDTO);

        response.sendRedirect(response.encodeRedirectURL(request.getRequestURI()));
    }

    @Override
    public String getServletInfo() {
        return "WebStore description";
    }
}
