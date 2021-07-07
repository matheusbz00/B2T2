package br.univille.estd.stacks.reverse;

import java.util.Comparator;

public class CompareNumber implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
            int result = 0;
            if(a == null && b == null){
                return 0;
            }
            if(a == null){
                return -1;
            }
            if(b == null){
                return 1;
            }
            if(a > b) {
                result = 1;
            }
            if(a < b) {
                result = -1;
            }
            if(a == b) {
                result = 0;
            }
            return result;
        }
}
