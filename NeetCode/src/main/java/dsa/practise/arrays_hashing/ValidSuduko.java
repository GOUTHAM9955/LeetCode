package dsa.practise.arrays_hashing;

import java.util.*;

public class ValidSuduko {
    public boolean isValidSudoku(char[][] board){
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i =0; i<9; i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i=0; i<9;i++){
            for(int j=0; j<9; j++){
                char numb = board[i][j];
                if(numb == '.') continue;
                if(!rows[i].add(numb)) return false;
                if(!columns[j].add(numb)) return false;
                int boxIndex = (i/3)*3+(j/3);
                if (!boxes[boxIndex].add(numb)) return false;
            }
        }
        return true;
    }
}
