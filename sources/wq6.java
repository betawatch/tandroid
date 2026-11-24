// default package

import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wq6 {
    public static final wq6 f = new wq6(new vq6());
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
        String str = g8c.a;
        g = "0";
        h = "1";
        i = "2";
        j = "3";
        k = "4";
    }

    public wq6(vq6 vq6Var) {
        long j2 = vq6Var.a;
        long j3 = vq6Var.b;
        long j4 = vq6Var.c;
        float f2 = vq6Var.d;
        float f3 = vq6Var.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public final vq6 a() {
        vq6 vq6Var = new vq6();
        vq6Var.a = this.a;
        vq6Var.b = this.b;
        vq6Var.c = this.c;
        vq6Var.d = this.d;
        vq6Var.e = this.e;
        return vq6Var;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        wq6 wq6Var = f;
        long j2 = wq6Var.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = wq6Var.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = wq6Var.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = wq6Var.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = wq6Var.e;
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
        if (!(obj instanceof wq6)) {
            return false;
        }
        wq6 wq6Var = (wq6) obj;
        return this.a == wq6Var.a && this.b == wq6Var.b && this.c == wq6Var.c && this.d == wq6Var.d && this.e == wq6Var.e;
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
