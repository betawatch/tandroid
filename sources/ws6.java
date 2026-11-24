// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ws6 {
    public static final ws6 f = new ws6(new vs6());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        String str = hac.a;
        g = "0";
        h = "1";
        i = "2";
        j = "3";
        k = "4";
    }

    public ws6(vs6 vs6Var) {
        long j2 = vs6Var.a;
        long j3 = vs6Var.b;
        long j4 = vs6Var.c;
        float f2 = vs6Var.d;
        float f3 = vs6Var.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public final vs6 a() {
        vs6 vs6Var = new vs6();
        vs6Var.a = this.a;
        vs6Var.b = this.b;
        vs6Var.c = this.c;
        vs6Var.d = this.d;
        vs6Var.e = this.e;
        return vs6Var;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ws6 ws6Var = f;
        long j2 = ws6Var.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = ws6Var.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = ws6Var.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = ws6Var.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = ws6Var.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws6)) {
            return false;
        }
        ws6 ws6Var = (ws6) obj;
        return this.a == ws6Var.a && this.b == ws6Var.b && this.c == ws6Var.c && this.d == ws6Var.d && this.e == ws6Var.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        float f2 = this.d;
        int floatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
