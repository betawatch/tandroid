// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class rq6 {
    public static final rq6 i = new rq6(new qq6());
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

    public rq6(qq6 qq6Var) {
        this.a = g8c.i0(qq6Var.a);
        this.c = g8c.i0(qq6Var.b);
        this.b = qq6Var.a;
        this.d = qq6Var.b;
        this.e = qq6Var.c;
        this.f = qq6Var.d;
        this.g = qq6Var.e;
        this.h = qq6Var.f;
    }

    public final qq6 a() {
        qq6 qq6Var = new qq6();
        qq6Var.a = this.b;
        qq6Var.b = this.d;
        qq6Var.c = this.e;
        qq6Var.d = this.f;
        qq6Var.e = this.g;
        qq6Var.f = this.h;
        return qq6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq6)) {
            return false;
        }
        rq6 rq6Var = (rq6) obj;
        return this.b == rq6Var.b && this.d == rq6Var.d && this.e == rq6Var.e && this.f == rq6Var.f && this.g == rq6Var.g && this.h == rq6Var.h;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
