// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class s00 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final oz g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public s00(r00 r00Var) {
        this.a = r00Var.a;
        this.b = r00Var.b;
        this.c = r00Var.c;
        this.d = r00Var.d;
        this.e = r00Var.e;
        this.f = r00Var.f;
        this.g = r00Var.g;
        this.h = r00Var.h;
        this.i = r00Var.i;
        this.j = r00Var.j;
        this.k = r00Var.k;
    }

    public final r00 a() {
        r00 r00Var = new r00();
        r00Var.a = this.a;
        r00Var.b = this.b;
        r00Var.c = this.c;
        r00Var.d = this.d;
        r00Var.e = this.e;
        r00Var.f = this.f;
        r00Var.g = this.g;
        r00Var.h = this.h;
        r00Var.i = this.i;
        r00Var.j = this.j;
        r00Var.k = this.k;
        return r00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s00.class != obj.getClass()) {
            return false;
        }
        s00 s00Var = (s00) obj;
        return this.a == s00Var.a && this.b == s00Var.b && this.c == s00Var.c && this.d == s00Var.d && this.e == s00Var.e && this.f == s00Var.f && this.h == s00Var.h && this.i == s00Var.i && this.j == s00Var.j && this.k == s00Var.k && this.g.equals(s00Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
