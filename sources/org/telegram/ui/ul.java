package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ul extends org.telegram.ui.Components.p20 {
    public final /* synthetic */ xn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(xn xnVar, Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        super(activity, p2Var);
        this.b = xnVar;
    }

    @Override // org.telegram.ui.Components.p20
    public final void m() {
        xn xnVar = this.b;
        xnVar.Q7();
        UndoView undoView = xnVar.v3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        xnVar.getMessagesController().removeSuggestion(xnVar.Q5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.p20
    public final void n() {
        xn xnVar = this.b;
        xnVar.getMessagesController().convertToGigaGroup(xnVar.getParentActivity(), xnVar.e, xnVar, new a1(this, 19));
    }
}
