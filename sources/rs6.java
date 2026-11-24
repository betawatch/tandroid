// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class rs6 {
    public static final rs6 i = new rs6(new qs6());
    public static final String j = "0";
    public static final String k = "1";
    public static final String l = "2";
    public static final String m = "3";
    public static final String n = "4";
    public static final String o = "5";
    public static final String p = "6";
    public static final String q = "7";
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public rs6(qs6 qs6Var) {
        this.a = hac.i0(qs6Var.a);
        this.c = hac.i0(qs6Var.b);
        this.b = qs6Var.a;
        this.d = qs6Var.b;
        this.e = qs6Var.c;
        this.f = qs6Var.d;
        this.g = qs6Var.e;
        this.h = qs6Var.f;
    }

    public final qs6 a() {
        qs6 qs6Var = new qs6();
        qs6Var.a = this.b;
        qs6Var.b = this.d;
        qs6Var.c = this.e;
        qs6Var.d = this.f;
        qs6Var.e = this.g;
        qs6Var.f = this.h;
        return qs6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs6)) {
            return false;
        }
        rs6 rs6Var = (rs6) obj;
        return this.b == rs6Var.b && this.d == rs6Var.d && this.e == rs6Var.e && this.f == rs6Var.f && this.g == rs6Var.g && this.h == rs6Var.h;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
