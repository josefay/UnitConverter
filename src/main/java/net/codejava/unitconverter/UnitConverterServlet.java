/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.unitconverter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author faye
 */
@WebServlet(name = "UnitConverterServlet", urlPatterns = {"/convert"})
public class UnitConverterServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            float miles = Float.parseFloat(request.getParameter("miles"));
            float km = miles * 1.6f;
            
            request.setAttribute("miles", miles);
            request.setAttribute("km", km);
            
            String resultPage = "result.jsp";
            RequestDispatcher dispatcher = request.getRequestDispatcher(resultPage);
            dispatcher.forward(request, response);
    }

}
