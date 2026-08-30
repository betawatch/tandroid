package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb1 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd1 b;

    public /* synthetic */ tb1(cd1 cd1Var, int i10) {
        this.a = i10;
        this.b = cd1Var;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                cd1 cd1Var = this.b;
                cd1Var.S1 = (TL_stories.TL_premium_boostsStatus) obj;
                cd1Var.R1 = true;
                cd1Var.h1(true);
                cd1Var.Q1 = false;
                break;
            default:
                cd1.X(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
