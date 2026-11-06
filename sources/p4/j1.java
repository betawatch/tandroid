package p4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class j1 {
    public static final String b;
    public final h9.t0 a;

    static {
        new j1(new HashSet());
        String str = h2.m0.a;
        b = Integer.toString(0, 36);
    }

    public j1(HashSet hashSet) {
        this.a = h9.t0.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j1) {
            return this.a.equals(((j1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
