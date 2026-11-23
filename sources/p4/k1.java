package p4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k1 {
    public static final String b;
    public final h9.t0 a;

    static {
        new k1(new HashSet());
        String str = h2.l0.a;
        b = Integer.toString(0, 36);
    }

    public k1(HashSet hashSet) {
        this.a = h9.t0.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            return this.a.equals(((k1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
