// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v49 extends u49 {
    public final /* synthetic */ x49 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v49(x49 x49Var, u49 u49Var, TLRPC.ReactionCount reactionCount, boolean z) {
        super(u49Var, x49Var.l, x49Var.w, reactionCount, z, x49Var.y);
        this.g0 = x49Var;
    }

    @Override // u49
    public final float j() {
        return this.g0.a;
    }

    @Override // u49
    public final ImageReceiver k() {
        return (ImageReceiver) this.g0.E.get(this.r);
    }

    @Override // u49
    public final boolean l() {
        return this.g0.x.O3();
    }

    @Override // u49
    public final boolean m() {
        x49 x49Var = this.g0;
        int e1 = x49Var.x.e1();
        long c1 = x49Var.x.c1();
        s49 s49Var = s49.B;
        if (s49Var == null) {
            return false;
        }
        int i = s49Var.a;
        if (i != 2 && i != 0) {
            return false;
        }
        long j = s49Var.o;
        return ((j != 0 && c1 == j) || e1 == s49Var.n) && s49Var.p.equals(this.r);
    }

    @Override // u49
    public final void n() {
        this.g0.E.remove(this.r);
    }
}
