// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tm2 {
    public static final tm2 h = new tm2(1, 2, 3, null, -1, -1);
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        String str = hac.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
    }

    public tm2(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String a(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? hg9.j(i2, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? hg9.j(i2, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? hg9.j(i2, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(tm2 tm2Var) {
        if (tm2Var == null) {
            return true;
        }
        int i2 = tm2Var.a;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = tm2Var.b;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = tm2Var.c;
        if ((i4 != -1 && i4 != 3) || tm2Var.d != null) {
            return false;
        }
        int i5 = tm2Var.f;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = tm2Var.e;
        return i6 == -1 || i6 == 8;
    }

    public static int f(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tm2.class == obj.getClass()) {
            tm2 tm2Var = (tm2) obj;
            if (this.a == tm2Var.a && this.b == tm2Var.b && this.c == tm2Var.c && Arrays.equals(this.d, tm2Var.d) && this.e == tm2Var.e && this.f == tm2Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        this.g = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        int i2 = this.e;
        sb.append(i2 != -1 ? aq1.n(i2, "bit Luma") : "NA");
        sb.append(", ");
        int i3 = this.f;
        return b10.j(sb, i3 != -1 ? aq1.n(i3, "bit Chroma") : "NA", ")");
    }
}
