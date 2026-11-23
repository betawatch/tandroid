package p4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o1 {
    public static final String b;
    public static final String c;
    public final p1 a;

    static {
        e2.m0.a("media3.session");
        String str = h2.l0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public o1(int i7, String str, d1 d1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new p1(i7, str, d1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            return this.a.equals(((o1) obj).a);
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
