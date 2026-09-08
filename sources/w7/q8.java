package w7;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class q8 {
    public static String a(String str) {
        if (BuildConfig.BETA_URL.equals(str) || "".equals(str)) {
            return null;
        }
        return str;
    }
}
