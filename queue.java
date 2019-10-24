/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class queue {
    int x[]=new int[5];
    
    public void push(int a){
        if (x[0]==0){
            x[0]=a;
            System.out.println("Antrian Pertamaa :"+ x[0]);
        }
        else if (x[1]==0){
            x[1]=a;
            System.out.println("Antrian Kedua :"+x[1]);
        }
        else if (x[2]==0){
            x[2]=a;
            System.out.println("Antrian Kedua :"+x[2]);
    }
        else if (x[3]==0){
            x[3]=a;
            System.out.println("Antrian Ketiga :"+x[3]);
    }
        else if (x[4]==0){
            x[4]=a;
            System.out.println("Antrian Keempat :"+x[4]);
    } else {
            System.out.println("Antrian Penuh");
        }    
        
                
            }
    public void pop(){
        if (x[0]!=0){
            System.out.println("POP :"+ x[0]);
            x[0]=0;
        }
        else if (x[1]!=0){
            System.out.println("POP :"+ x[1]);
            x[1]=0;
        }
        else if (x[2]!=0){
            System.out.println("POP :"+ x[2]);
            x[2]=0;
        }
        else if (x[3]!=0){
            System.out.println("POP :"+ x[3]);
            x[3]=0;
        }
        else if (x[4]!=0){
            System.out.println("POP :"+ x[4]);
            x[4]=0;
        }
        else {
            System.out.println("Antrian Kosong");
        }
        
    }
    public void hilang(){
        x[0]=0;
        x[1]=0;
        x[2]=0;
        System.out.println("Antrian Selesai");
    }
    public void print(){
        for (int i = 0; i < x.length; i++) {
            if(x[i]!=0){
                System.out.println(x[i]+"");
            }
            
        }
    }
    public static void main(String[] args) {
        queue a=new queue();
        a.push(5);
        a.push(7);
        a.push(3);
        a.push(9);
        a.print();
        a.pop();
        a.print();
        a.hilang();
    }
        }
        
   

