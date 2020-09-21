package edu.ithaca.dragon.maze;

import edu.ithaca.dragon.maze.mazerunner.HumanChoiceMazeRunner;
import edu.ithaca.dragon.maze.mazerunner.ManualMazeRunner;
import edu.ithaca.dragon.maze.mazerunner.MazeRunnerAPI;

public class MazeMain {

    public static void main(String args[]) {
        int gridColumns = 31;
        int gridRows = 31;
        MazeRunnerAPI runner = new ManualMazeRunner();
        // MazeRunnerAPI runner = new HumanChoiceMazeRunner();
        new Maze(runner, 1, "YOUR_BRIDGES_USER_ID", "YOUR_BRIDGES_API_KEY", gridColumns, gridRows);
      }
    
}
