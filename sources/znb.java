// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class znb {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object p = new Object();
    public static final br6 q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object a = p;
    public br6 b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public wq6 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        pq6 pq6Var = new pq6();
        pq6Var.a = "androidx.media3.common.Timeline";
        pq6Var.b = Uri.EMPTY;
        q = pq6Var.a();
        r = "1";
        s = "2";
        t = "3";
        u = "4";
        v = "5";
        w = "6";
        x = "7";
        y = "8";
        z = "9";
        A = "a";
        B = "b";
        C = "c";
        D = "d";
        E = "e";
    }

    public final boolean a() {
        return this.i != null;
    }

    public final void b(Object obj, br6 br6Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, wq6 wq6Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        if (br6Var == null) {
            br6Var = q;
        }
        this.b = br6Var;
        this.c = obj2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z2;
        this.h = z3;
        this.i = wq6Var;
        this.k = j4;
        this.l = j5;
        this.m = i;
        this.n = i2;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !znb.class.equals(obj.getClass())) {
            return false;
        }
        znb znbVar = (znb) obj;
        return Objects.equals(this.a, znbVar.a) && Objects.equals(this.b, znbVar.b) && Objects.equals(this.c, znbVar.c) && Objects.equals(this.i, znbVar.i) && this.d == znbVar.d && this.e == znbVar.e && this.f == znbVar.f && this.g == znbVar.g && this.h == znbVar.h && this.j == znbVar.j && this.k == znbVar.k && this.l == znbVar.l && this.m == znbVar.m && this.n == znbVar.n && this.o == znbVar.o;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.a.hashCode() + kk7.t3) * 31)) * 31;
        Object obj = this.c;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        wq6 wq6Var = this.i;
        int hashCode3 = (hashCode2 + (wq6Var != null ? wq6Var.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
