/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author aluno
 */
public class exe06 {

    public static void main(String[] args) {
        try {
            String senha = "123456";
            System.out.println(senha);
            System.out.println(criptografar(senha));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String criptografar(String senha) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(senha.getBytes(),0,senha.length());
        String resultado  = new BigInteger(1, md.digest()).toString(16);
        return resultado;

    }

}
