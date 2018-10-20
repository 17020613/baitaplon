/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon;

/**
 *
 * @author lochoi
 */
import java.io.File;
import java.util.Scanner;
public class DictionaryManagement extends Dictionary{
    
    private static final Scanner sc = new Scanner(System.in);
    
    public void insertFromCommandline(){
//        System.out.println("Nhap vao so tu: ");
//        numWord = Integer.parseInt(sc.nextLine());
//        Word nw = new Word();
//        for (int i= 0; i < numWord; i++){
//            System.out.println("Nhap vao tu moi: ");
//            nw.word_target = sc.nextLine();
//            System.out.println("Nhap vao nghia:");
//            nw.word_explain = sc.nextLine();
//            word_target[i] = nw.word_target;
//            word_explain[i] = nw.word_explain;
//        }
        
    }
    
    public void insertFromFile(){
        File file = new File("C:\\Users\\locho\\OneDrive\\Desktop\\BaiTapLon\\src\\baitaplon\\test.txt");
        try(Scanner scan = new Scanner(file)) {
            int i = 0;
            while(scan.hasNext()){
                word_target[i] = scan.next();
                word_explain[i] = scan.nextLine();
                i++;
            }
            numWord = i;
        } catch (Exception e) {
        }
    }
    
    public void dictionaryLookup(){
        String keyWord;
        System.out.println("Nhap tu can tra: ");
        keyWord = sc.next().toLowerCase();
        for(int i = 0; i < 5; i++){
            if(word_target[i].equals(keyWord)){
                System.out.println("Nghia: " + word_explain[i]);
                break;
            }
        }
    }
    public static void main(String[] args){
        DictionaryCommandline run = new DictionaryCommandline();
       // run.dictionaryBasic();
        run.dictionaryAdvanced();
    }
}
