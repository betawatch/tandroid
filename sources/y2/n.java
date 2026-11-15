package y2;

import c8.q0;
import e2.u;
import f3.i0;
import j2.b0;
import org.telegram.tgnet.ConnectionsManager;
import sg.h0;
import x2.a1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class n extends a {
    public final int F;
    public final u G;
    public long H;
    public boolean I;

    public n(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, long j3, long j10, long j11, int i10, u uVar2) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.F = i10;
        this.G = uVar2;
    }

    @Override // b3.l
    public final void a() {
        b0 b0Var = this.r;
        h0 h0Var = this.y;
        h0Var.getClass();
        for (a1 a1Var : (a1[]) h0Var.c) {
            if (a1Var.H != 0) {
                a1Var.H = 0L;
                a1Var.B = true;
            }
        }
        i0 f10 = h0Var.f(this.F);
        f10.g(this.G);
        try {
            long open = b0Var.open(this.b.b(this.H));
            if (open != -1) {
                open += this.H;
            }
            f3.l lVar = new f3.l(this.r, this.H, open);
            for (int i7 = 0; i7 != -1; i7 = f10.e(lVar, ConnectionsManager.DEFAULT_DATACENTER_ID, true)) {
                this.H += i7;
            }
            f10.c(this.h, 1, (int) this.H, 0, null);
            q0.a(b0Var);
            this.I = true;
        } catch (Throwable th2) {
            q0.a(b0Var);
            throw th2;
        }
    }

    @Override // y2.l
    public final boolean c() {
        return this.I;
    }

    @Override // b3.l
    public final void D() {
    }
}
