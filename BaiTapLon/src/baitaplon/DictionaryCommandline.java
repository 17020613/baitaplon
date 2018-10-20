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
public class DictionaryCommandline extends DictionaryManagement {
    
    public void showAllWords(){
        System.out.println("No" + "\t| English" + "\t| Vietnamese\n");
        for(int i = 0; i < 20; i++){
            System.out.println((i+1) + "\t| " + word_target[i] + "\t|" + word_explain[i]);
        }
    }
    
    public void dictionaryBasic(){
        insertFromFile();
        showAllWords();
//        dictionaryLookup();
    }
    public void dictionaryAdvanced() {
        insertFromFile();
        showAllWords();
        dictionaryLookup();
    }
}
