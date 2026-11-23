package p4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class l1 {
    public static final String b;
    public final h9.t0 a;

    static {
        new l1(new HashSet());
        String str = h2.l0.a;
        b = Integer.toString(0, 36);
    }

    public l1(HashSet hashSet) {
        this.a = h9.t0.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l1) {
            return this.a.equals(((l1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
