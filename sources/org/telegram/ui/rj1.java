package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rj1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ tj1 a;

    public rj1(tj1 tj1Var) {
        this.a = tj1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        tj1 tj1Var = this.a;
        MessageObject messageObject = tj1Var.n;
        if (i10 == -1) {
            tj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                tj1.V(tj1Var.d, messageObject, tj1Var.getParentActivity(), tj1Var.r, tj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            tj1Var.showDialog(org.telegram.ui.Components.sq0.N0(tj1Var.getParentActivity(), messageObject, null, false, tj1Var.h));
        }
    }
}
