package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ yj1 a;

    public wj1(yj1 yj1Var) {
        this.a = yj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        yj1 yj1Var = this.a;
        MessageObject messageObject = yj1Var.n;
        if (i10 == -1) {
            yj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                yj1.V(yj1Var.d, messageObject, yj1Var.getParentActivity(), yj1Var.r, yj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            yj1Var.showDialog(org.telegram.ui.Components.jr0.O0(yj1Var.getParentActivity(), messageObject, null, false, yj1Var.h));
        }
    }
}
