package zg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class l0 extends k0 {
    public final /* synthetic */ n0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, k0 k0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(k0Var, n0Var.n, n0Var.z, reactionCount, z10, z11, n0Var.B);
        this.h0 = n0Var;
    }

    @Override // zg.k0
    public final float k() {
        return this.h0.a;
    }

    @Override // zg.k0
    public final ImageReceiver l() {
        return (ImageReceiver) this.h0.H.get(this.s);
    }

    @Override // zg.k0
    public final boolean m() {
        return this.h0.A.isOutOwner();
    }

    @Override // zg.k0
    public final boolean n() {
        n0 n0Var = this.h0;
        int id2 = n0Var.A.getId();
        long groupId = n0Var.A.getGroupId();
        i0 i0Var = i0.B;
        if (i0Var == null) {
            return false;
        }
        int i10 = i0Var.a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j3 = i0Var.o;
        return ((j3 != 0 && groupId == j3) || id2 == i0Var.n) && i0Var.p.equals(this.s);
    }

    @Override // zg.k0
    public final void o() {
        this.h0.H.remove(this.s);
    }
}
