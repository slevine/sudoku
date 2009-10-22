package net.blue64;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by IntelliJ IDEA.
 * User: levinst
 * Date: Oct 22, 2009
 * Time: 4:53:13 PM
 */
public class Game extends Activity {
    public static final String TAG = "Sudoku";

    public static final String KEY_DIFFICULTY = "net.blue64.difficulty";
    public static final int DIFFICULTY_EASY = 0;
    public static final int DIFFICULTY_MEDIUM = 1;
    public static final int DIFFICULTY_HARD = 2;

    private int puzzle[] = new int[9 * 9];

    private PuzzleView puzzleView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");

        int diff = getIntent().getIntExtra(KEY_DIFFICULTY, DIFFICULTY_EASY);
        puzzle = getPuzzle(diff);
    }
}
