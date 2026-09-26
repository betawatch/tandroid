package za;

import android.util.Base64;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
