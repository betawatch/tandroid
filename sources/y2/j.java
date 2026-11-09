package y2;

import a8.ia;
import c8.p0;
import e2.s0;
import e2.u;
import f3.j0;
import h2.x;
import j2.c0;
import sg.i0;
import x2.b1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class j extends a {
    public final int E;
    public final long F;
    public final e G;
    public long H;
    public volatile boolean I;
    public boolean J;

    public j(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, long j3, long j10, long j11, long j12, long j13, int i10, long j14, e eVar) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, j11, j12, j13);
        this.E = i10;
        this.F = j14;
        this.G = eVar;
    }

    @Override // b3.l
    public final void a() {
        i0 i0Var = this.y;
        i0Var.getClass();
        if (this.H == 0) {
            long j3 = this.F;
            for (b1 b1Var : (b1[]) i0Var.c) {
                if (b1Var.H != j3) {
                    b1Var.H = j3;
                    b1Var.B = true;
                }
            }
            e eVar = this.G;
            long j10 = this.w;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.F;
            long j12 = this.x;
            eVar.b(i0Var, j11, j12 != -9223372036854775807L ? j12 - this.F : -9223372036854775807L);
        }
        try {
            j2.m b10 = this.b.b(this.H);
            c0 c0Var = this.r;
            f3.l lVar = new f3.l(c0Var, b10.e, c0Var.open(b10));
            while (!this.I) {
                try {
                    int f10 = this.G.a.f(lVar, e.w);
                    ia.p(f10 != 1);
                    if (!(f10 == 0)) {
                        break;
                    }
                } finally {
                    this.H = lVar.d - this.b.e;
                }
            }
            u uVar = this.d;
            String str = uVar.r;
            int i7 = uVar.R;
            int i10 = uVar.S;
            if (s0.k(str) && ((i7 > 1 || i10 > 1) && i7 != -1 && i10 != -1)) {
                j0 f11 = i0Var.f(4);
                int i11 = i7 * i10;
                long j13 = (this.n - this.h) / i11;
                for (int i12 = 1; i12 < i11; i12++) {
                    f11.b(0, new x());
                    f11.c(i12 * j13, 0, 0, 0, null);
                }
            }
            p0.a(this.r);
            this.J = !this.I;
        } catch (Throwable th2) {
            p0.a(this.r);
            throw th2;
        }
    }

    @Override // y2.l
    public final long b() {
        return this.s + this.E;
    }

    @Override // y2.l
    public final boolean c() {
        return this.J;
    }

    @Override // b3.l
    public final void q0() {
        this.I = true;
    }
}
