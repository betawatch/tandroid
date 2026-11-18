package p4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
