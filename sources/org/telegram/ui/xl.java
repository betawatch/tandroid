package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.Components.n20 {
    public final /* synthetic */ bo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(bo boVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.b = boVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final void m() {
        bo boVar = this.b;
        boVar.Q7();
        UndoView undoView = boVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        boVar.getMessagesController().removeSuggestion(boVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.n20
    public final void n() {
        bo boVar = this.b;
        boVar.getMessagesController().convertToGigaGroup(boVar.getParentActivity(), boVar.e, boVar, new y0(this, 20));
    }
}
