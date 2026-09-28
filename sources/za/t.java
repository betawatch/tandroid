package za;

import android.util.Base64;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class t {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = s.c().getBytes(xd.a.a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        a = a4.a.q("firebase_session_", encodeToString, "_data");
        b = a4.a.q("firebase_session_", encodeToString, "_settings");
    }
}
