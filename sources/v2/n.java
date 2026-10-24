package v2;

import b2.w;
import c3.l0;
import g2.b0;
import org.telegram.tgnet.ConnectionsManager;
import u2.e1;
import v7.k7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n extends a {
    public final int E;
    public final w F;
    public long G;
    public boolean H;

    public n(g2.h hVar, g2.m mVar, w wVar, int i10, Object obj, long j10, long j11, long j12, int i11, w wVar2) {
        super(hVar, mVar, wVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.E = i11;
        this.F = wVar2;
    }

    @Override // y2.i
    public final void a() {
        b0 b0Var = this.r;
        n2.e eVar = this.x;
        eVar.getClass();
        for (e1 e1Var : (e1[]) eVar.c) {
            if (e1Var.H != 0) {
                e1Var.H = 0L;
                e1Var.B = true;
            }
        }
        l0 V = eVar.V(this.E);
        V.b(this.F);
        try {
            long open = b0Var.open(this.b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = V.a(lVar, ConnectionsManager.DEFAULT_DATACENTER_ID, true)) {
                this.G += i10;
            }
            V.c(this.h, 1, (int) this.G, 0, null);
            k7.a(b0Var);
            this.H = true;
        } catch (Throwable th2) {
            k7.a(b0Var);
            throw th2;
        }
    }

    @Override // v2.l
    public final boolean c() {
        return this.H;
    }

    @Override // y2.i
    public final void O() {
    }
}
