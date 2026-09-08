package v2;

import b2.s;
import c3.h0;
import g2.b0;
import org.telegram.tgnet.ConnectionsManager;
import u2.a1;
import v7.m7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m extends a {
    public final int E;
    public final s F;
    public long G;
    public boolean H;

    public m(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, long j3, long j10, long j11, int i11, s sVar2) {
        super(hVar, mVar, sVar, i10, obj, j3, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.E = i11;
        this.F = sVar2;
    }

    @Override // y2.j
    public final void a() {
        b0 b0Var = this.r;
        o0.a aVar = this.x;
        e2.d.h(aVar);
        for (a1 a1Var : (a1[]) aVar.c) {
            if (a1Var.F != 0) {
                a1Var.F = 0L;
                a1Var.z = true;
            }
        }
        h0 U = aVar.U(this.E);
        U.b(this.F);
        try {
            long open = b0Var.open(this.b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = U.a(lVar, ConnectionsManager.DEFAULT_DATACENTER_ID, true)) {
                this.G += i10;
            }
            U.c(this.h, 1, (int) this.G, 0, null);
            m7.a(b0Var);
            this.H = true;
        } catch (Throwable th2) {
            m7.a(b0Var);
            throw th2;
        }
    }

    @Override // v2.k
    public final boolean c() {
        return this.H;
    }

    @Override // y2.j
    public final void W() {
    }
}
