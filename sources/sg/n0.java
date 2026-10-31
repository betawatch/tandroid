package sg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n0 extends m0 {
    public final /* synthetic */ p0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, m0 m0Var, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(m0Var, p0Var.l, p0Var.w, reactionCount, z10, p0Var.y);
        this.g0 = p0Var;
    }

    @Override // sg.m0
    public final float j() {
        return this.g0.a;
    }

    @Override // sg.m0
    public final ImageReceiver k() {
        return (ImageReceiver) this.g0.E.get(this.r);
    }

    @Override // sg.m0
    public final boolean l() {
        return this.g0.x.P3();
    }

    @Override // sg.m0
    public final boolean m() {
        p0 p0Var = this.g0;
        int f12 = p0Var.x.f1();
        long d12 = p0Var.x.d1();
        k0 k0Var = k0.B;
        if (k0Var == null) {
            return false;
        }
        int i10 = k0Var.a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j10 = k0Var.o;
        return ((j10 != 0 && d12 == j10) || f12 == k0Var.n) && k0Var.p.equals(this.r);
    }

    @Override // sg.m0
    public final void n() {
        this.g0.E.remove(this.r);
    }
}
