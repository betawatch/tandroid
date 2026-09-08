package za;

import android.util.Base64;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class r {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        a = a4.a.p("firebase_session_", encodeToString, "_data");
        b = a4.a.p("firebase_session_", encodeToString, "_settings");
    }
}
