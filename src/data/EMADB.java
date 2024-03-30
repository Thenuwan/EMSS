/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import business.EMA;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EMADB {
   private ArrayList<EMA> emaList;
    
   public EMADB() {
       emaList=new ArrayList<>();
   }
   
   public boolean add(EMA b){
      return  emaList.add(b);
   }
   
   public boolean delete(int empolyee_ID){
       for(EMA bk:emaList){
           if(bk.getEmpolyee_ID()==empolyee_ID){
               return emaList.remove(bk);
           }
       }
       return false;
   }
   
   public EMA get(int empolyee_ID){
       for(EMA bk:emaList){
           if(bk.getEmpolyee_ID()==empolyee_ID){
               return bk;
           }
       }
       return null;
   }
   
   public boolean update(EMA b){
      if(delete(b.getEmpolyee_ID())){
         return emaList.add(b);
      }
      return false;
   }
   
   public ArrayList<EMA> getAll(){
       return emaList;
   }
    
}
