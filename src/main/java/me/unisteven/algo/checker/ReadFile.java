package me.unisteven.algo.checker;

import me.unisteven.algo.lists.HANStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ReadFile {

    Map<Character, Character> corrospondingSymbols;
    HANStack stack;

    public ReadFile() {
        this.corrospondingSymbols = new HashMap<>();
        this.stack = new HANStack();
        this.corrospondingSymbols.put('{', '}');
        this.corrospondingSymbols.put('(', ')');
        this.corrospondingSymbols.put('[', ']');
    }

    public boolean checkFile(String input) {
        char[] chars = input.toCharArray();
        for(char c : chars){
            if(isOpeningSymbol(c)){
                // push on stack
                this.stack.push(c);
            }else{
                // is stack empty ? error
                System.out.println(this.stack.size());
                if(this.stack.size() < 1){
                    System.out.println("error missing statements");
                    return false;
                }else {
                    //pop stack is popped not a closing symbol? error
                    char pop = (char) this.stack.pop();
                    if(!isOpeningSymbol(pop)){
                        System.out.println("Error missing closing statement.");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isOpeningSymbol(char symbol){
        for(char opening : corrospondingSymbols.keySet()){
            if(opening == symbol){
                return true;
            }
        }
        return false;
    }
}
