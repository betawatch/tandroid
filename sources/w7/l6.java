package w7;

import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class l6 {
    public static void a(Object obj, String str, String str2) {
        String c10 = c(str);
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String c10 = c(str);
        if (Log.isLoggable(c10, 6)) {
            Log.e(c10, str2, exc);
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
