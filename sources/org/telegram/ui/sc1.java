package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce1 b;

    public /* synthetic */ sc1(ce1 ce1Var, int i10) {
        this.a = i10;
        this.b = ce1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ce1 ce1Var = this.b;
                ce1Var.getClass();
                ce1Var.n1 = ((Float) obj).floatValue();
                ce1Var.x0.invalidate();
                ce1Var.V0();
                break;
            case 1:
                ce1 ce1Var2 = this.b;
                ce1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                ce1Var2.U1 = true;
                ce1Var2.h1(true);
                ce1Var2.T1 = false;
                break;
            default:
                ce1.U(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
