package w7;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class q8 {
    public static String a(String str) {
        if (BuildConfig.BETA_URL.equals(str) || "".equals(str)) {
            return null;
        }
        return str;
    }
}
