// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class p46 implements w4a {
    public final w4a a;
    public final w4a b;

    public p46(w4a w4aVar, w4a w4aVar2) {
        w4aVar.getClass();
        w4aVar2.getClass();
        this.a = w4aVar;
        this.b = w4aVar2;
    }

    @Override // w4a
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // w4a
    public final boolean c() {
        return false;
    }

    @Override // w4a
    public final int d(String str) {
        str.getClass();
        Integer b = m9b.b(str);
        if (b != null) {
            return b.intValue();
        }
        w26.j(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // w4a
    public final vte e() {
        return v9b.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p46)) {
            return false;
        }
        p46 p46Var = (p46) obj;
        return rp5.a(this.a, p46Var.a) && rp5.a(this.b, p46Var.b);
    }

    @Override // w4a
    public final int f() {
        return 2;
    }

    @Override // w4a
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // w4a
    public final List getAnnotations() {
        return c24.a;
    }

    @Override // w4a
    public final List h(int i) {
        if (i >= 0) {
            return c24.a;
        }
        v0b.a(tb4.n(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // w4a
    public final w4a i(int i) {
        if (i < 0) {
            v0b.a(tb4.n(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        sc8.j("Unreached");
        return null;
    }

    @Override // w4a
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
