// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sa6 {
    public final long a;
    public final float b;
    public final long c;

    public sa6(ra6 ra6Var) {
        this.a = ra6Var.a;
        this.b = ra6Var.b;
        this.c = ra6Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa6)) {
            return false;
        }
        sa6 sa6Var = (sa6) obj;
        return this.a == sa6Var.a && this.b == sa6Var.b && this.c == sa6Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
