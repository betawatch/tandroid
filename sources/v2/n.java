package v2;

import a8.hc;
import b2.x;
import c3.j0;
import g2.b0;
import org.telegram.tgnet.ConnectionsManager;
import u2.c1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n extends a {
    public final int E;
    public final x F;
    public long G;
    public boolean H;

    public n(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, long j10, long j11, long j12, int i11, x xVar2) {
        super(hVar, mVar, xVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.E = i11;
        this.F = xVar2;
    }

    @Override // y2.i
    public final void b() {
        b0 b0Var = this.r;
        m4.c cVar = this.x;
        cVar.getClass();
        for (c1 c1Var : (c1[]) cVar.c) {
            if (c1Var.H != 0) {
                c1Var.H = 0L;
                c1Var.B = true;
            }
        }
        j0 B0 = cVar.B0(this.E);
        B0.b(this.F);
        try {
            long open = b0Var.open(this.b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = B0.a(lVar, ConnectionsManager.DEFAULT_DATACENTER_ID, true)) {
                this.G += i10;
            }
            B0.c(this.h, 1, (int) this.G, 0, null);
            hc.a(b0Var);
            this.H = true;
        } catch (Throwable th2) {
            hc.a(b0Var);
            throw th2;
        }
    }

    @Override // v2.l
    public final boolean c() {
        return this.H;
    }

    @Override // y2.i
    public final void f0() {
    }
}
