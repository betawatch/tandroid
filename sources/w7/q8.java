package w7;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public abstract class q8 {
    public static String a(String str) {
        if (BuildConfig.BETA_URL.equals(str) || "".equals(str)) {
            return null;
        }
        return str;
    }
}
