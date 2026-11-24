// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qi2 {
    public final sd0 a;
    public final yzb b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long[] n;
    public int[] o;

    public qi2(int i, sd0 sd0Var, yzb yzbVar, boolean z) {
        int i2 = sd0Var.d;
        this.a = sd0Var;
        this.f = z;
        int a = sd0Var.a();
        boolean z2 = true;
        if (a != 1 && a != 2) {
            z2 = false;
        }
        jte.f(z2);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (a == 2 ? 1667497984 : 1651965952) | i3;
        long j = sd0Var.b * 1000000;
        long j2 = sd0Var.c;
        String str = hac.a;
        this.e = hac.b0(i2, j, j2, RoundingMode.DOWN);
        this.b = yzbVar;
        this.d = a == 2 ? i3 | 1650720768 : -1;
        this.m = -1L;
        this.n = new long[512];
        this.o = new int[512];
        this.g = i2;
    }

    public final kx9 a(int i) {
        return new kx9((this.e / this.g) * this.o[i], this.n[i]);
    }

    public final hx9 b(long j) {
        if (this.l == 0) {
            kx9 kx9Var = new kx9(0L, this.m);
            return new hx9(kx9Var, kx9Var);
        }
        int i = (int) (j / (this.e / this.g));
        int e = hac.e(this.o, i, true, true);
        if (this.o[e] == i) {
            kx9 a = a(e);
            return new hx9(a, a);
        }
        kx9 a2 = a(e);
        int i2 = e + 1;
        return i2 < this.n.length ? new hx9(a2, a(i2)) : new hx9(a2, a2);
    }
}
