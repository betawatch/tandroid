// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rv2 extends pg0 {
    public final int F;
    public final long G;
    public final o31 H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public rv2(h73 h73Var, n73 n73Var, ko4 ko4Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, o31 o31Var) {
        super(h73Var, n73Var, ko4Var, i, obj, j, j2, j3, j4, j5);
        this.F = i2;
        this.G = j6;
        this.H = o31Var;
    }

    @Override // oa6
    public final void a() {
        lh2 lh2Var = this.y;
        lh2Var.getClass();
        if (this.I == 0) {
            long j = this.G;
            for (ys9 ys9Var : (ys9[]) lh2Var.c) {
                if (ys9Var.I != j) {
                    ys9Var.I = j;
                    ys9Var.C = true;
                }
            }
            o31 o31Var = this.H;
            long j2 = this.w;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.G;
            long j4 = this.x;
            o31Var.b(lh2Var, j3, j4 != -9223372036854775807L ? j4 - this.G : -9223372036854775807L);
        }
        try {
            n73 b = this.b.b(this.I);
            b2b b2bVar = this.r;
            cb3 cb3Var = new cb3(b2bVar, b.e, b2bVar.open(b));
            while (!this.J) {
                try {
                    int b2 = this.H.a.b(cb3Var, o31.s);
                    yve.p(b2 != 1);
                    if (!(b2 == 0)) {
                        break;
                    }
                } finally {
                    this.I = cb3Var.d - this.b.e;
                }
            }
            ko4 ko4Var = this.d;
            String str = ko4Var.s;
            int i = ko4Var.V;
            int i2 = ko4Var.W;
            if (dg7.k(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                x1c V = lh2Var.V(4);
                int i3 = i * i2;
                long j5 = (this.n - this.h) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    V.e(0, new ey7());
                    V.a(i4 * j5, 0, 0, 0, null);
                }
            }
            lge.a(this.r);
            this.K = !this.J;
        } catch (Throwable th) {
            lge.a(this.r);
            throw th;
        }
    }

    @Override // fm6
    public final long b() {
        return this.s + this.F;
    }

    @Override // oa6
    public final void c() {
        this.J = true;
    }

    @Override // fm6
    public final boolean d() {
        return this.K;
    }
}
