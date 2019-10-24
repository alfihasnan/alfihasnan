/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Strenx {
    String data[];
    int top;
    
    public Strenx(int jumlah){
        data=new String[jumlah];
        top=-1;
    }
    public void push (String nilai){
        if (top<data.length-1){
            data[++top]=nilai;
        }
    }
    public String pop(){
        if (top>0){
            top--;
            String temp= data[top];
            data[top]=null;
            return temp;
            
        }return pop();
    } public void print(){
        for(int i=data.length-1; i>=0;i--){
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args) {
        Strenx x=new Strenx(5);
        
        System.out.println("Buku Yang Tersedia");
        x.push("Tangkuban Perahu");
        x.push("Malin Kundang");
        x.push("Ensiklopedia Laut");
        x.push("Kamus Bahasa Inggris");
        x.push("Resep Memasak");
        x.print();
        System.out.println("");
        System.out.println("");
        
        
        System.out.println(x.pop()+" Akan Diambil");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Sisa Buku Yang ada :");
        
        x.print();
        
        
    }
}
