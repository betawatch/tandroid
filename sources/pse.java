// default package

import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class pse {
    public static void a(Object obj, String str, String str2) {
        String c = c(str);
        if (Log.isLoggable(c, 3)) {
            Log.d(c, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String c = c(str);
        if (Log.isLoggable(c, 6)) {
            Log.e(c, str2, exc);
        }
    }

    public static String c(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }
}
