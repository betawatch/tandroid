package p4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class p1 {
    public static final String b;
    public static final String c;
    public final q1 a;

    static {
        e2.m0.a("media3.session");
        String str = h2.l0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public p1(int i7, String str, e1 e1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new q1(i7, str, e1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            return this.a.equals(((p1) obj).a);
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
