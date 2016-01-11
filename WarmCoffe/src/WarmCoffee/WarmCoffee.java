/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

/**
 *
 * @author rafaeling,andrés ortiz
 */
public class WarmCoffee {
    public static void main(String[] args) {
        Users users=new Users();
        users.addUser("arthur","dontpanic"); //usuario de prueba
        Login loginWindow=new Login(users);
        loginWindow.setVisible(true);
    }

}
