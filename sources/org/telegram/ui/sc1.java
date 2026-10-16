package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
