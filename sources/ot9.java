// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ot9 {
    public static final ot9 b;
    public final yo5 a;

    static {
        oo8 oo8Var = new oo8((byte) 10);
        oo8Var.b = yo5.p(2, 1, 5);
        b = new ot9(oo8Var);
    }

    public ot9(oo8 oo8Var) {
        this.a = (yo5) oo8Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ot9) && this.a.equals(((ot9) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
