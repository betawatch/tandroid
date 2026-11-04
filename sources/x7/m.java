package x7;

import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(Object obj, String str, String str2) {
        String c2 = c(str);
        if (Log.isLoggable(c2, 3)) {
            Log.d(c2, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String c2 = c(str);
        if (Log.isLoggable(c2, 6)) {
            Log.e(c2, str2, exc);
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
