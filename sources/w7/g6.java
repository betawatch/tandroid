package w7;

import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class g6 {
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
