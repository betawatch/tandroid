package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ti1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ vi1 a;

    public ti1(vi1 vi1Var) {
        this.a = vi1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        vi1 vi1Var = this.a;
        MessageObject messageObject = vi1Var.n;
        if (i10 == -1) {
            vi1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                vi1.V(vi1Var.d, messageObject, vi1Var.getParentActivity(), vi1Var.r, vi1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            vi1Var.showDialog(org.telegram.ui.Components.lq0.N0(vi1Var.getParentActivity(), messageObject, null, false, vi1Var.h));
        }
    }
}
