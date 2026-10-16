package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ xj1 a;

    public vj1(xj1 xj1Var) {
        this.a = xj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        xj1 xj1Var = this.a;
        MessageObject messageObject = xj1Var.n;
        if (i10 == -1) {
            xj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                xj1.V(xj1Var.d, messageObject, xj1Var.getParentActivity(), xj1Var.r, xj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            xj1Var.showDialog(org.telegram.ui.Components.ir0.O0(xj1Var.getParentActivity(), messageObject, null, false, xj1Var.h));
        }
    }
}
