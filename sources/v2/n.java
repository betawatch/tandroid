package v2;

import b2.x;
import c3.k0;
import g2.c0;
import org.telegram.tgnet.ConnectionsManager;
import u2.c1;
import v7.l7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n extends a {
    public final int E;
    public final x F;
    public long G;
    public boolean H;

    public n(g2.h hVar, g2.n nVar, x xVar, int i10, Object obj, long j10, long j11, long j12, int i11, x xVar2) {
        super(hVar, nVar, xVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.E = i11;
        this.F = xVar2;
    }

    @Override // y2.i
    public final void b() {
        c0 c0Var = this.r;
        u9.b bVar = this.y;
        bVar.getClass();
        for (c1 c1Var : (c1[]) bVar.c) {
            if (c1Var.H != 0) {
                c1Var.H = 0L;
                c1Var.B = true;
            }
        }
        k0 c10 = bVar.c(this.E);
        c10.b(this.F);
        try {
            long open = c0Var.open(this.b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = c10.a(lVar, ConnectionsManager.DEFAULT_DATACENTER_ID, true)) {
                this.G += i10;
            }
            c10.c(this.h, 1, (int) this.G, 0, null);
            l7.a(c0Var);
            this.H = true;
        } catch (Throwable th2) {
            l7.a(c0Var);
            throw th2;
        }
    }

    @Override // v2.l
    public final boolean c() {
        return this.H;
    }

    @Override // y2.i
    public final void R1() {
    }
}
