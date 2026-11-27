// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xrb {
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
        String str = gcc.a;
        g = "0";
        h = "1";
        i = "2";
        j = "3";
        k = "4";
        l = "5";
        m = "6";
    }

    public xrb() {
        ea eaVar = ea.c;
    }

    public final long a(int i2, int i3) {
        ca a = ea.c.a(i2);
        if (a.a != -1) {
            return a.e[i3];
        }
        return -9223372036854775807L;
    }

    public final int b(long j2) {
        ca a;
        int i2;
        ea eaVar = ea.c;
        long j3 = this.d;
        int i3 = eaVar.a;
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i4 = 0;
            while (i4 < i3) {
                eaVar.a(i4).getClass();
                eaVar.a(i4).getClass();
                if (0 > j2 && ((i2 = (a = eaVar.a(i4)).a) == -1 || a.a(-1) < i2)) {
                    break;
                }
                i4++;
            }
            if (i4 < i3) {
                if (j3 != -9223372036854775807L) {
                    eaVar.a(i4).getClass();
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
        ea eaVar = ea.c;
        int i3 = eaVar.a;
        int i4 = i3 - 1;
        if (i4 == i3 - 1) {
            eaVar.a(i4).getClass();
        }
        while (i4 >= 0 && j2 != Long.MIN_VALUE) {
            eaVar.a(i4).getClass();
            if (j2 >= 0) {
                break;
            }
            i4--;
        }
        if (i4 >= 0) {
            ca a = eaVar.a(i4);
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
        ea.c.a(i2).getClass();
        return 0L;
    }

    public final int e(int i2) {
        return ea.c.a(i2).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !xrb.class.equals(obj.getClass())) {
            return false;
        }
        xrb xrbVar = (xrb) obj;
        if (!Objects.equals(this.a, xrbVar.a) || !Objects.equals(this.b, xrbVar.b) || this.c != xrbVar.c || this.d != xrbVar.d || this.e != xrbVar.e || this.f != xrbVar.f) {
            return false;
        }
        ea eaVar = ea.c;
        return eaVar.equals(eaVar);
    }

    public final boolean f(int i2) {
        ea eaVar = ea.c;
        int i3 = eaVar.a;
        if (i2 != i3 - 1 || i2 != i3 - 1) {
            return false;
        }
        eaVar.a(i2).getClass();
        return false;
    }

    public final boolean g(int i2) {
        ea.c.a(i2).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i2, long j2, long j3, boolean z) {
        ea eaVar = ea.c;
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (jn7.t3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j2 = this.d;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return ea.c.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
