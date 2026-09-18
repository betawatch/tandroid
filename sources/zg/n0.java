package zg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class n0 extends m0 {
    public final /* synthetic */ p0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, m0 m0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(m0Var, p0Var.n, p0Var.z, reactionCount, z10, z11, p0Var.B);
        this.h0 = p0Var;
    }

    @Override // zg.m0
    public final float k() {
        return this.h0.a;
    }

    @Override // zg.m0
    public final ImageReceiver l() {
        return (ImageReceiver) this.h0.H.get(this.s);
    }

    @Override // zg.m0
    public final boolean m() {
        return this.h0.A.isOutOwner();
    }

    @Override // zg.m0
    public final boolean n() {
        p0 p0Var = this.h0;
        int id2 = p0Var.A.getId();
        long groupId = p0Var.A.getGroupId();
        k0 k0Var = k0.B;
        if (k0Var == null) {
            return false;
        }
        int i10 = k0Var.a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j3 = k0Var.o;
        return ((j3 != 0 && groupId == j3) || id2 == k0Var.n) && k0Var.p.equals(this.s);
    }

    @Override // zg.m0
    public final void o() {
        this.h0.H.remove(this.s);
    }
}
