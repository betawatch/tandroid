// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xu2 extends og0 {
    public final int F;
    public final long G;
    public final f31 H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public xu2(o63 o63Var, u63 u63Var, fm4 fm4Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, f31 f31Var) {
        super(o63Var, u63Var, fm4Var, i, obj, j, j2, j3, j4, j5);
        this.F = i2;
        this.G = j6;
        this.H = f31Var;
    }

    @Override // k86
    public final void a() {
        tg2 tg2Var = this.y;
        tg2Var.getClass();
        if (this.I == 0) {
            long j = this.G;
            for (gp9 gp9Var : (gp9[]) tg2Var.c) {
                if (gp9Var.I != j) {
                    gp9Var.I = j;
                    gp9Var.C = true;
                }
            }
            f31 f31Var = this.H;
            long j2 = this.w;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.G;
            long j4 = this.x;
            f31Var.b(tg2Var, j3, j4 != -9223372036854775807L ? j4 - this.G : -9223372036854775807L);
        }
        try {
            u63 b = this.b.b(this.I);
            zxa zxaVar = this.r;
            ja3 ja3Var = new ja3(zxaVar, b.e, zxaVar.open(b));
            while (!this.J) {
                try {
                    int b2 = this.H.a.b(ja3Var, f31.s);
                    gre.p(b2 != 1);
                    if (!(b2 == 0)) {
                        break;
                    }
                } finally {
                    this.I = ja3Var.d - this.b.e;
                }
            }
            fm4 fm4Var = this.d;
            String str = fm4Var.s;
            int i = fm4Var.V;
            int i2 = fm4Var.W;
            if (ud7.k(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                wxb b0 = tg2Var.b0(4);
                int i3 = i * i2;
                long j5 = (this.n - this.h) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    b0.e(0, new xu7());
                    b0.a(i4 * j5, 0, 0, 0, null);
                }
            }
            vbe.a(this.r);
            this.K = !this.J;
        } catch (Throwable th) {
            vbe.a(this.r);
            throw th;
        }
    }

    @Override // ak6
    public final long b() {
        return this.s + this.F;
    }

    @Override // ak6
    public final boolean c() {
        return this.K;
    }

    @Override // k86
    public final void d() {
        this.J = true;
    }
}
