/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.seba.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author luiss
 */
public class LoginUsuario {
    @NotBlank
    private String nombreusuario;
    @NotBlank
    private String password;
    
    //Getter and Setter

    public String getNombreUsuario() {
        return nombreusuario;
    }

    public void setNombreUsuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
