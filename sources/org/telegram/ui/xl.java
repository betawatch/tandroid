package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
