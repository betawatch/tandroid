// default package

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u8a {
    public static final String b;
    public static final String c;
    public final v8a a;

    static {
        ct6.a("media3.session");
        String str = hac.a;
        b = "0";
        c = "1";
    }

    public u8a(int i, String str, oz6 oz6Var, Bundle bundle, MediaSession.Token token) {
        this.a = new v8a(i, str, oz6Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u8a) {
            return this.a.equals(((u8a) obj).a);
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
