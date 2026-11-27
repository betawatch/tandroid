// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yf2 implements kj6, rv9 {
    public final /* synthetic */ ag2 a;

    public /* synthetic */ yf2(ag2 ag2Var) {
        this.a = ag2Var;
    }

    @Override // rv9
    public final boolean C1(int i) {
        return true;
    }

    @Override // rv9
    public final zh6 D0() {
        return null;
    }

    @Override // rv9
    public final zh6 Z0() {
        return null;
    }

    @Override // kj6
    public final boolean a(lj6 lj6Var, boolean z) {
        int intValue = ((Integer) lj6Var.getTag()).intValue();
        ag2 ag2Var = this.a;
        TLObject E = ag2Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return ag2Var.E.h0((TLRPC.ChannelParticipant) E, !z, lj6Var);
    }

    @Override // rv9
    public final void p(int i) {
        ag2 ag2Var = this.a;
        bg2 bg2Var = ag2Var.E;
        if (ag2Var.h.e()) {
            return;
        }
        int i2 = ag2Var.r;
        ag2Var.f();
        if (ag2Var.r > i2) {
            bg2Var.C0(i2);
        }
        if (ag2Var.s || ag2Var.r != 0 || i == 0) {
            return;
        }
        bg2Var.b.e(false, true);
    }

    @Override // rv9
    public final void X1(ArrayList arrayList) {
    }
}
