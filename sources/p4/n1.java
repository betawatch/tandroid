package p4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class n1 {
    public static final String b;
    public static final String c;
    public final o1 a;

    static {
        e2.m0.a("media3.session");
        String str = h2.m0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public n1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new o1(i7, str, c1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n1) {
            return this.a.equals(((n1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
