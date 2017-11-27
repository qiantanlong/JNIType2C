package hongzhen.com.jnitypeturn;

import android.util.Log;

/**
 * Created by hongzhen on 2017/11/25.
 */

public class JNITypeTurnUtils {

    static {
        System.loadLibrary("Test");
    }

    public static native void getTest(TestBean testBean);

}
