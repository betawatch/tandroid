// default package

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s7a {
    public static final s7a b = new s7a(new HashSet());
    public static final String c;
    public final yo5 a;

    static {
        String str = hac.a;
        c = "0";
    }

    public s7a(HashSet hashSet) {
        this.a = yo5.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s7a) {
            return this.a.equals(((s7a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
