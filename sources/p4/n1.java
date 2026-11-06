package p4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
