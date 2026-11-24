// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xnb {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;

    static {
        String str = g8c.a;
        g = "0";
        h = "1";
        i = "2";
        j = "3";
        k = "4";
        l = "5";
        m = "6";
    }

    public xnb() {
        da daVar = da.c;
    }

    public final long a(int i2, int i3) {
        ba a = da.c.a(i2);
        if (a.a != -1) {
            return a.e[i3];
        }
        return -9223372036854775807L;
    }

    public final int b(long j2) {
        ba a;
        int i2;
        da daVar = da.c;
        long j3 = this.d;
        int i3 = daVar.a;
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i4 = 0;
            while (i4 < i3) {
                daVar.a(i4).getClass();
                daVar.a(i4).getClass();
                if (0 > j2 && ((i2 = (a = daVar.a(i4)).a) == -1 || a.a(-1) < i2)) {
                    break;
                }
                i4++;
            }
            if (i4 < i3) {
                if (j3 != -9223372036854775807L) {
                    daVar.a(i4).getClass();
                    if (0 <= j3) {
                    }
                }
                return i4;
            }
        }
        return -1;
    }

    public final int c(long j2) {
        int i2;
        da daVar = da.c;
        int i3 = daVar.a;
        int i4 = i3 - 1;
        if (i4 == i3 - 1) {
            daVar.a(i4).getClass();
        }
        while (i4 >= 0 && j2 != Long.MIN_VALUE) {
            daVar.a(i4).getClass();
            if (j2 >= 0) {
                break;
            }
            i4--;
        }
        if (i4 >= 0) {
            ba a = daVar.a(i4);
            int i5 = a.a;
            if (i5 != -1) {
                while (i2 < i5) {
                    int i6 = a.d[i2];
                    i2 = (i6 == 0 || i6 == 1) ? 0 : i2 + 1;
                }
            }
            return i4;
        }
        return -1;
    }

    public final long d(int i2) {
        da.c.a(i2).getClass();
        return 0L;
    }

    public final int e(int i2) {
        return da.c.a(i2).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !xnb.class.equals(obj.getClass())) {
            return false;
        }
        xnb xnbVar = (xnb) obj;
        if (!Objects.equals(this.a, xnbVar.a) || !Objects.equals(this.b, xnbVar.b) || this.c != xnbVar.c || this.d != xnbVar.d || this.e != xnbVar.e || this.f != xnbVar.f) {
            return false;
        }
        da daVar = da.c;
        return daVar.equals(daVar);
    }

    public final boolean f(int i2) {
        da daVar = da.c;
        int i3 = daVar.a;
        if (i2 != i3 - 1 || i2 != i3 - 1) {
            return false;
        }
        daVar.a(i2).getClass();
        return false;
    }

    public final boolean g(int i2) {
        da.c.a(i2).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i2, long j2, long j3, boolean z) {
        da daVar = da.c;
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (kk7.t3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j2 = this.d;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return da.c.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
