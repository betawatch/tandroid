package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc1 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae1 b;

    public /* synthetic */ sc1(ae1 ae1Var, int i10) {
        this.a = i10;
        this.b = ae1Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ae1 ae1Var = this.b;
                ae1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                ae1Var.U1 = true;
                ae1Var.h1(true);
                ae1Var.T1 = false;
                break;
            default:
                ae1.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
