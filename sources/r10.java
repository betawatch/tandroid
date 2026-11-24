// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r10 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final o00 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public r10(q10 q10Var) {
        this.a = q10Var.a;
        this.b = q10Var.b;
        this.c = q10Var.c;
        this.d = q10Var.d;
        this.e = q10Var.e;
        this.f = q10Var.f;
        this.g = q10Var.g;
        this.h = q10Var.h;
        this.i = q10Var.i;
        this.j = q10Var.j;
        this.k = q10Var.k;
    }

    public final q10 a() {
        q10 q10Var = new q10();
        q10Var.a = this.a;
        q10Var.b = this.b;
        q10Var.c = this.c;
        q10Var.d = this.d;
        q10Var.e = this.e;
        q10Var.f = this.f;
        q10Var.g = this.g;
        q10Var.h = this.h;
        q10Var.i = this.i;
        q10Var.j = this.j;
        q10Var.k = this.k;
        return q10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r10.class != obj.getClass()) {
            return false;
        }
        r10 r10Var = (r10) obj;
        return this.a == r10Var.a && this.b == r10Var.b && this.c == r10Var.c && this.d == r10Var.d && this.e == r10Var.e && this.f == r10Var.f && this.h == r10Var.h && this.i == r10Var.i && this.j == r10Var.j && this.k == r10Var.k && this.g.equals(r10Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
