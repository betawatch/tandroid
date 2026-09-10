package v2;

import b2.s;
import c3.h0;
import g2.b0;
import n7.a1;
import org.telegram.tgnet.ConnectionsManager;
import u2.c1;
import v7.n7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    @Override // y2.k
    public final void a() {
        b0 b0Var = this.r;
        a1 a1Var = this.x;
        e2.d.h(a1Var);
        for (c1 c1Var : (c1[]) a1Var.c) {
            if (c1Var.F != 0) {
                c1Var.F = 0L;
                c1Var.z = true;
            }
        }
        h0 t02 = a1Var.t0(this.E);
        t02.b(this.F);
        try {
            long open = b0Var.open(this.b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = t02.a(lVar, ConnectionsManager.DEFAULT_DATACENTER_ID, true)) {
                this.G += i10;
            }
            t02.c(this.h, 1, (int) this.G, 0, null);
            n7.a(b0Var);
            this.H = true;
        } catch (Throwable th2) {
            n7.a(b0Var);
            throw th2;
        }
    }

    @Override // v2.k
    public final boolean c() {
        return this.H;
    }

    @Override // y2.k
    public final void k() {
    }
}
