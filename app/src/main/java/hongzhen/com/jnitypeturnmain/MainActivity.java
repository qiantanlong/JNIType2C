package hongzhen.com.jnitypeturnmain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import hongzhen.com.jnitypeturn.JNITypeTurnUtils;
import hongzhen.com.jnitypeturn.TestBean;

public class MainActivity extends AppCompatActivity {
    String tag = "Java";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestBean testBean = new TestBean();
        boolean booleans[] = {true, true};
        byte bytes[] = {3, 2};
        char chars[] = {'a', 'b'};
        short shorts[] = {6, 7};
        int ints[] = {12, 34};
        long longs[] = {17, 87};
        float floas[] = {0.1f, 0.5f};
        double doubles[] = {0.7, 1.5};
        testBean.setBoolen(true);
        testBean.setIsByte((byte) 5);
        testBean.setIsChar('c');
        testBean.setIsShort((short) 5);
        testBean.setIsInt(88);
        testBean.setIsLong(89657945);
        testBean.setIsFloat(0.95648f);
        testBean.setIsDouble(2.988988787);
        testBean.setIsBoolens(booleans);
        testBean.setIsBytes(bytes);
        testBean.setIsChars(chars);
        testBean.setIsShorts(shorts);
        testBean.setIsInts(ints);
        testBean.setIsLongs(longs);
        testBean.setIsFloats(floas);
        testBean.setIsDoubles(doubles);
        testBean.setIsString("李刚");
        Log.i(tag, testBean.isBoolen()+"前");
        JNITypeTurnUtils.getTest(testBean);

        Log.i(tag, testBean.isBoolen()+"后");
        Log.i(tag, testBean.getIsByte()+"后");
        Log.i(tag, testBean.getIsString()+"后");
        Log.i(tag, testBean.getIsBytes().length+"后");
        Log.i(tag, testBean.getIsBytes()[0]+"后");
        Log.i(tag, testBean.getIsBytes()[1]+"后");
        Log.i(tag, testBean.getIsBytes()[2]+"后");
        Log.i(tag, testBean.getIsBytes()[3]+"后");
        Log.i(tag, testBean.getIsBytes()[4]+"后");

        Log.i(tag, testBean.getIsInts().length+"后");
        Log.i(tag, testBean.getIsInts()[0]+"后");
        Log.i(tag, testBean.getIsInts()[1]+"后");
        Log.i(tag, testBean.getIsInts()[2]+"后");
        Log.i(tag, testBean.getIsInts()[3]+"后");
        Log.i(tag, testBean.getIsInts()[4]+"后");



    }
}
