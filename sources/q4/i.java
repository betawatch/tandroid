package q4;

import g5.p;
import g5.u0;
import j3.n0;
import j7.p7;
import n7.qa;
import o4.k0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends a {
    public final int B;
    public final long C;
    public final d D;
    public long E;
    public volatile boolean F;
    public boolean G;

    public i(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, d dVar) {
        super(mVar, pVar, n0Var, i10, obj, j10, j11, j12, j13, j14);
        this.B = i11;
        this.C = j15;
        this.D = dVar;
    }

    @Override // g5.j0
    public final void a() {
        if (this.E == 0) {
            qa qaVar = this.x;
            h5.a.j(qaVar);
            long j10 = this.C;
            for (k0 k0Var : (k0[]) qaVar.c) {
                if (k0Var.F != j10) {
                    k0Var.F = j10;
                    k0Var.z = true;
                }
            }
            d dVar = this.D;
            long j11 = this.v;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.C;
            long j13 = this.w;
            dVar.a(qaVar, j12, j13 != -9223372036854775807L ? j13 - this.C : -9223372036854775807L);
        }
        try {
            p b10 = this.b.b(this.E);
            u0 u0Var = this.r;
            r3.h hVar = new r3.h(u0Var, b10.e, u0Var.open(b10));
            while (!this.F) {
                try {
                    int h = this.D.a.h(hVar, d.s);
                    h5.a.i(h != 1);
                    if (!(h == 0)) {
                        break;
                    }
                } finally {
                    this.E = hVar.d - this.b.e;
                }
            }
            p7.a(this.r);
            this.G = !this.F;
        } catch (Throwable th2) {
            p7.a(this.r);
            throw th2;
        }
    }

    @Override // g5.j0
    public final void b() {
        this.F = true;
    }

    @Override // q4.k
    public final long c() {
        return this.s + this.B;
    }

    @Override // q4.k
    public final boolean d() {
        return this.G;
    }
}
