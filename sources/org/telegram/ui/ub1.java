package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub1 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed1 b;

    public /* synthetic */ ub1(ed1 ed1Var, int i10) {
        this.a = i10;
        this.b = ed1Var;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ed1 ed1Var = this.b;
                ed1Var.S1 = (TL_stories.TL_premium_boostsStatus) obj;
                ed1Var.R1 = true;
                ed1Var.h1(true);
                ed1Var.Q1 = false;
                break;
            default:
                ed1.X(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
