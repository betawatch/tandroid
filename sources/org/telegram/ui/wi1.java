package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wi1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ yi1 a;

    public wi1(yi1 yi1Var) {
        this.a = yi1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        yi1 yi1Var = this.a;
        MessageObject messageObject = yi1Var.n;
        if (i10 == -1) {
            yi1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                yi1.V(yi1Var.d, messageObject, yi1Var.getParentActivity(), yi1Var.r, yi1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            yi1Var.showDialog(org.telegram.ui.Components.mq0.N0(yi1Var.getParentActivity(), messageObject, null, false, yi1Var.h));
        }
    }
}
