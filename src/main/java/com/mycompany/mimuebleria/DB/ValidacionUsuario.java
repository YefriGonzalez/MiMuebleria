 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mimuebleria.DB;

import com.mycompany.miMuebleria.MiMuebleriaException;
import com.mycompany.miMuebleria.Usuario;
import java.sql.PreparedStatement;

/**
 *
 * @author yefri
 */
public class ValidacionUsuario {
    public int validacion(Usuario usuario) throws MiMuebleriaException{
        boolean estado =false;
        try {
            PreparedStatement preparedStatement;
            preparedStatement = (PreparedStatement) DBMiMuebleria.conexion().prepareStatement("");
        } catch (Exception e) {
        }
        
        
        return 1;
        
    }
}
