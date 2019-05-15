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

    private WareService wareService = new WareService();

//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        WareBean wareBean = (WareBean) session.getAttribute("wareBean");
//        if (wareBean == null) {
//            wareBean = new WareBean();
//            session.setAttribute("wareBean", wareBean);
//        }
//        super.service(request, response);
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/createWare.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        WareDTO wareDTO = new WareDTO(request.getParameter("codeKey"),
                request.getParameter("name"), request.getParameter("description"),
                Integer.valueOf(request.getParameter("price")));

        boolean isSuccessfullyCreated = wareService.createWare(wareDTO);
        WareBean wareBean = (WareBean) session.getAttribute("wareBean");
        if (isSuccessfullyCreated) {
            wareBean = (WareBean) session.getAttribute("wareBean");
            wareBean.setSuccessfullyCreated(true);
        } else {
            wareBean.setSuccessfullyCreated(false);
        }

        response.sendRedirect(response.encodeRedirectURL(request.getRequestURI()));
    }

    @Override
    public String getServletInfo() {
        return "WebStore description";
    }
}
