// default package

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class q5a {
    public static final q5a b = new q5a(new HashSet());
    public static final String c;
    public final ym5 a;

    static {
        String str = g8c.a;
        c = "0";
    }

    public q5a(HashSet hashSet) {
        this.a = ym5.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q5a) {
            return this.a.equals(((q5a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
