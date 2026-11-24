// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class r00 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final nz g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public r00(q00 q00Var) {
        this.a = q00Var.a;
        this.b = q00Var.b;
        this.c = q00Var.c;
        this.d = q00Var.d;
        this.e = q00Var.e;
        this.f = q00Var.f;
        this.g = q00Var.g;
        this.h = q00Var.h;
        this.i = q00Var.i;
        this.j = q00Var.j;
        this.k = q00Var.k;
    }

    public final q00 a() {
        q00 q00Var = new q00();
        q00Var.a = this.a;
        q00Var.b = this.b;
        q00Var.c = this.c;
        q00Var.d = this.d;
        q00Var.e = this.e;
        q00Var.f = this.f;
        q00Var.g = this.g;
        q00Var.h = this.h;
        q00Var.i = this.i;
        q00Var.j = this.j;
        q00Var.k = this.k;
        return q00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r00.class != obj.getClass()) {
            return false;
        }
        r00 r00Var = (r00) obj;
        return this.a == r00Var.a && this.b == r00Var.b && this.c == r00Var.c && this.d == r00Var.d && this.e == r00Var.e && this.f == r00Var.f && this.h == r00Var.h && this.i == r00Var.i && this.j == r00Var.j && this.k == r00Var.k && this.g.equals(r00Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
