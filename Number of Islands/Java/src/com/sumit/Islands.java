package com.sumit;

import java.util.*;
import java.lang.*;
import java.io.*;

class Islands
{
    //No of rows and columns
    static int row, col;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int result = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(grid, visited, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        //System.out.print("VISITED: " + visited[i][j] );
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == '0') {
            return;
        }
        visited[i][j] = true;
        dfs(grid, visited, i - 1, j);
        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i, j - 1);
        dfs(grid, visited, i, j + 1);
    }
    // Driver method
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        row = scan.nextInt();
        col = scan.nextInt();
        char arr[][] = new char[row][col];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = scan.next().trim().charAt(0);;
            }
        }

        System.out.print("Length: " + arr[0].length);

        Islands I = new Islands();
        System.out.println("Number of islands is: "+ I.numIslands(arr));
    }
}