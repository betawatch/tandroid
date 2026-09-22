package za;

import android.util.Base64;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class r {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        a = a4.a.q("firebase_session_", encodeToString, "_data");
        b = a4.a.q("firebase_session_", encodeToString, "_settings");
    }
}
