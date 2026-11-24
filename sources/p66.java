// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p66 implements y6a {
    public final y6a a;
    public final y6a b;

    public p66(y6a y6aVar, y6a y6aVar2) {
        y6aVar.getClass();
        y6aVar2.getClass();
        this.a = y6aVar;
        this.b = y6aVar2;
    }

    @Override // y6a
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // y6a
    public final boolean c() {
        return false;
    }

    @Override // y6a
    public final int d(String str) {
        str.getClass();
        Integer b = obb.b(str);
        if (b != null) {
            return b.intValue();
        }
        u36.j(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // y6a
    public final yve e() {
        return xbb.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p66)) {
            return false;
        }
        p66 p66Var = (p66) obj;
        return rr5.a(this.a, p66Var.a) && rr5.a(this.b, p66Var.b);
    }

    @Override // y6a
    public final int f() {
        return 2;
    }

    @Override // y6a
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // y6a
    public final List getAnnotations() {
        return n34.a;
    }

    @Override // y6a
    public final List h(int i) {
        if (i >= 0) {
            return n34.a;
        }
        c1b.a(td4.o(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // y6a
    public final y6a i(int i) {
        if (i < 0) {
            c1b.a(td4.o(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        dq9.m("Unreached");
        return null;
    }

    @Override // y6a
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
