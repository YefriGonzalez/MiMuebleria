/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mimuebleria.servlet;

import com.mycompany.miMuebleria.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yefri
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuario-servlet"})
public class UsuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String tipo=request.getParameter("tipo");
        Usuario usuario = new Usuario(username,password,Integer.valueOf(tipo));
        //try {
//            if (loginDao.validate(loginBean)) {
//                //HttpSession session = request.getSession();
//                // session.setAttribute("username",username);
//                response.sendRedirect("loginsuccess.jsp");
//            } else {
//                HttpSession session = request.getSession();
//                //session.setAttribute("user", username);
//                //response.sendRedirect("login.jsp");
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
