package org.app;


import java.util.*;


public class Algoz{
    public static void main(String[] args){
        // A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].Two brackets are considered to be a matched pair if the
        // an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types
        // of matched pairs of brackets: [], {}, and ().A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For
        // example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced
        // opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].By this logic, we say a sequence of brackets
        // is balanced if the following conditions are met:
        // It contains no unmatched brackets.
        //The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
        // Given  strings of brackets, determine whether each sequence of brackets is balanced.
        // If a string is balanced, return YES. Otherwise, return NO.
        // Function Description:
        // Complete the function isBalanced in the editor below.
        //isBalanced has the following parameter(s):
        //string s: a string of brackets
        //Returns
        //string: either YES or NO
        //Input Format
        //The first line contains a single integer , the number of strings.
        //Each of the next  lines contains a single string , a sequence of brackets.
        //Constraints
        //All characters in the sequences ∈ { {, }, (, ), [, ] }.

        //Output Format
        //For each string, return YES or NO.
        //Sample Input
        //STDIN           Function
        //-----           --------
        //3               n = 3
        //{[()]}          first s = '{[()]}'
        //{[(])}          second s = '{[(])}'
        //{{[[(())]]}}    third s ='{{[[(())]]}}'


        String brackets = "{[()]}";
        List<String> sorted = new ArrayList<>();
        int size = brackets.length();
        for(int i=0; i<size; i++){
            sorted.add(String.valueOf(brackets.charAt(i)));
        }
        if(size%2 !=0){
            System.out.println("FALSE");
        }
        int halfsize = size/2;
        System.out.println(halfsize);
        List <String> firstHalf = sorted.subList(0, halfsize);
        List<String> secondHalf = sorted.subList(halfsize, size);
        System.out.println(firstHalf);
        Collections.reverse(secondHalf);
        //System.out.println(secondHalf);
        for(int i=0; i<secondHalf.size(); i++){
            String braces = secondHalf.get(i);
            if(braces.equals("(")){
                secondHalf.set(i, ")");
            }else if(braces.equals(")")){
                secondHalf.set(i,"(");
            }else if(braces.equals("[")){
                secondHalf.set(i,"]");
            }else if(braces.equals("]")){
                secondHalf.set(i,"[");
            }else if(braces.equals("{")){
                secondHalf.set(i,"}");
            }else if(braces.equals("}")){
                secondHalf.set(i,"{");
            }
        }
        System.out.print(secondHalf);

        System.out.println(" ");
        if(firstHalf.equals(secondHalf)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}





