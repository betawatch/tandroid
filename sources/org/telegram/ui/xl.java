package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.Components.n20 {
    public final /* synthetic */ bo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(bo boVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
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
        boVar.getMessagesController().convertToGigaGroup(boVar.getParentActivity(), boVar.e, boVar, new y0(this, 19));
    }
}
