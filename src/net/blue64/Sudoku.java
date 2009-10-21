package net.blue64;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: levinst
 * Date: Oct 21, 2009
 * Time: 3:46:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sudoku extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
