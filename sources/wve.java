// default package

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class wve {
    public static long a;
    public static Method b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, kk7.K1);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return lxb.a();
        }
        try {
            Method method = b;
            if (method == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                b = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            sdb.b(cause);
            return false;
        }
    }
}
