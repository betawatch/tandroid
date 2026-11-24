// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w54 implements jr9 {
    public final go4 a;
    public long[] c;
    public boolean d;
    public x54 e;
    public boolean f;
    public int h;
    public final hi2 b = new hi2((byte) 27);
    public long n = -9223372036854775807L;

    public w54(x54 x54Var, go4 go4Var, boolean z) {
        this.a = go4Var;
        this.e = x54Var;
        this.c = x54Var.b;
        b(x54Var, z);
    }

    @Override // jr9
    public final int a() {
        return 0;
    }

    public final void b(x54 x54Var, boolean z) {
        int i = this.h;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = x54Var;
        long[] jArr = x54Var.b;
        this.c = jArr;
        long j3 = this.n;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.h = hac.b(jArr, j2, false);
            }
        } else {
            int b = hac.b(jArr, j3, true);
            this.h = b;
            if (this.d && b == this.c.length) {
                j = j3;
            }
            this.n = j;
        }
    }

    @Override // jr9
    public final boolean i() {
        return true;
    }

    @Override // jr9
    public final int m(long j) {
        int max = Math.max(this.h, hac.b(this.c, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    @Override // jr9
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        int i2 = this.h;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            la3Var.setFlags(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            mj4Var.c = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.h = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] u = this.b.u(this.e.a[i2]);
            la3Var.c(u.length);
            la3Var.c.put(u);
        }
        la3Var.e = this.c[i2];
        la3Var.setFlags(1);
        return -4;
    }

    @Override // jr9
    public final void d() {
    }
}
