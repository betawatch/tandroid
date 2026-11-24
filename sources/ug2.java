// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ug2 implements hj6, au9 {
    public final /* synthetic */ vg2 a;

    public /* synthetic */ ug2(vg2 vg2Var) {
        this.a = vg2Var;
    }

    @Override // au9
    public final boolean F1(int i) {
        return true;
    }

    @Override // au9
    public final vh6 G0() {
        return null;
    }

    @Override // hj6
    public final boolean a(ij6 ij6Var, boolean z) {
        int intValue = ((Integer) ij6Var.getTag()).intValue();
        vg2 vg2Var = this.a;
        TLObject E = vg2Var.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return vg2Var.E.i0((TLRPC.ChannelParticipant) E, !z, ij6Var);
    }

    @Override // au9
    public final vh6 e1() {
        return null;
    }

    @Override // au9
    public final void o(int i) {
        vg2 vg2Var = this.a;
        wg2 wg2Var = vg2Var.E;
        if (vg2Var.h.e()) {
            return;
        }
        int i2 = vg2Var.r;
        vg2Var.f();
        if (vg2Var.r > i2) {
            wg2Var.C0(i2);
        }
        if (vg2Var.s || vg2Var.r != 0 || i == 0) {
            return;
        }
        wg2Var.b.e(false, true);
    }

    @Override // au9
    public final void a2(ArrayList arrayList) {
    }
}
