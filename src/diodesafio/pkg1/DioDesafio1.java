/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diodesafio.pkg1;

import java.util.Scanner;


/**
 *
 * @author Roberto
 */
public class DioDesafio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Informe o nome do herói");
        Scanner entrada= new Scanner(System.in);
        String nome= entrada.nextLine();
        System.out.println("Informe quanta experiencia o herói adiquiriu");
        int exp=entrada.nextInt();
        String elo;
        if (exp<1000) {
             elo= "Ferro";
        }else if(exp<2000){
             elo= "Bronze";
        }else if (exp<5000) {
             elo= "Prata";
        }else if (exp<7000) {
             elo= "Ouro";
        }else if (exp<8000) {
             elo= "Platina";
        }else if (exp<9000) {
             elo= "Ascendente";
        }else if (exp<10000) {
             elo= "Imortal";
        }else{
             elo= "Radiante";
        }
        System.out.println("O Herói de nome "+nome+" está no nível de "+elo);
    }
    
}
