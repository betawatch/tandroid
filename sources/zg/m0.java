package zg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m0 extends l0 {
    public final /* synthetic */ o0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, l0 l0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(l0Var, o0Var.n, o0Var.z, reactionCount, z10, z11, o0Var.B);
        this.h0 = o0Var;
    }

    @Override // zg.l0
    public final float k() {
        return this.h0.a;
    }

    @Override // zg.l0
    public final ImageReceiver l() {
        return (ImageReceiver) this.h0.H.get(this.s);
    }

    @Override // zg.l0
    public final boolean m() {
        return this.h0.A.isOutOwner();
    }

    @Override // zg.l0
    public final boolean n() {
        o0 o0Var = this.h0;
        int id2 = o0Var.A.getId();
        long groupId = o0Var.A.getGroupId();
        j0 j0Var = j0.B;
        if (j0Var == null) {
            return false;
        }
        int i10 = j0Var.a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j3 = j0Var.o;
        return ((j3 != 0 && groupId == j3) || id2 == j0Var.n) && j0Var.p.equals(this.s);
    }

    @Override // zg.l0
    public final void o() {
        this.h0.H.remove(this.s);
    }
}
