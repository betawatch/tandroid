package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.Components.n20 {
    public final /* synthetic */ co b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(co coVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.b = coVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final void m() {
        co coVar = this.b;
        coVar.Q7();
        UndoView undoView = coVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        coVar.getMessagesController().removeSuggestion(coVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.n20
    public final void n() {
        co coVar = this.b;
        coVar.getMessagesController().convertToGigaGroup(coVar.getParentActivity(), coVar.e, coVar, new z0(this, 19));
    }
}
