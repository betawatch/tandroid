// default package

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class s6a {
    public static final String b;
    public static final String c;
    public final t6a a;

    static {
        cr6.a("media3.session");
        String str = g8c.a;
        b = "0";
        c = "1";
    }

    public s6a(int i, String str, ox6 ox6Var, Bundle bundle, MediaSession.Token token) {
        this.a = new t6a(i, str, ox6Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s6a) {
            return this.a.equals(((s6a) obj).a);
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
