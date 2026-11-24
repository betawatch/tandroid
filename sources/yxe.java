// default package

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class yxe {
    public static long a;
    public static Method b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, nm7.K1);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return nzb.a();
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
            rjb.m(cause);
            return false;
        }
    }
}
