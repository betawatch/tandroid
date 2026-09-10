package yg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o0 extends n0 {
    public final /* synthetic */ q0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, n0 n0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(n0Var, q0Var.n, q0Var.z, reactionCount, z10, z11, q0Var.B);
        this.h0 = q0Var;
    }

    @Override // yg.n0
    public final float k() {
        return this.h0.a;
    }

    @Override // yg.n0
    public final ImageReceiver l() {
        return (ImageReceiver) this.h0.H.get(this.s);
    }

    @Override // yg.n0
    public final boolean m() {
        return this.h0.A.isOutOwner();
    }

    @Override // yg.n0
    public final boolean n() {
        q0 q0Var = this.h0;
        int id2 = q0Var.A.getId();
        long groupId = q0Var.A.getGroupId();
        l0 l0Var = l0.B;
        if (l0Var == null) {
            return false;
        }
        int i10 = l0Var.a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j3 = l0Var.o;
        return ((j3 != 0 && groupId == j3) || id2 == l0Var.n) && l0Var.p.equals(this.s);
    }

    @Override // yg.n0
    public final void o() {
        this.h0.H.remove(this.s);
    }
}
