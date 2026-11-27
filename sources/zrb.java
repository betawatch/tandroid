// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zrb {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object p = new Object();
    public static final ft6 q;
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
    public ft6 b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public at6 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        ts6 ts6Var = new ts6();
        ts6Var.a = "androidx.media3.common.Timeline";
        ts6Var.b = Uri.EMPTY;
        q = ts6Var.a();
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

    public final void b(Object obj, ft6 ft6Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, at6 at6Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        if (ft6Var == null) {
            ft6Var = q;
        }
        this.b = ft6Var;
        this.c = obj2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z2;
        this.h = z3;
        this.i = at6Var;
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
        if (obj == null || !zrb.class.equals(obj.getClass())) {
            return false;
        }
        zrb zrbVar = (zrb) obj;
        return Objects.equals(this.a, zrbVar.a) && Objects.equals(this.b, zrbVar.b) && Objects.equals(this.c, zrbVar.c) && Objects.equals(this.i, zrbVar.i) && this.d == zrbVar.d && this.e == zrbVar.e && this.f == zrbVar.f && this.g == zrbVar.g && this.h == zrbVar.h && this.j == zrbVar.j && this.k == zrbVar.k && this.l == zrbVar.l && this.m == zrbVar.m && this.n == zrbVar.n && this.o == zrbVar.o;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.a.hashCode() + jn7.t3) * 31)) * 31;
        Object obj = this.c;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        at6 at6Var = this.i;
        int hashCode3 = (hashCode2 + (at6Var != null ? at6Var.hashCode() : 0)) * 31;
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
