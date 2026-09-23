package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ul extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ xn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(xn xnVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.b = xnVar;
    }

    @Override // org.telegram.ui.Components.o20
    public final void m() {
        xn xnVar = this.b;
        xnVar.Q7();
        UndoView undoView = xnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        xnVar.getMessagesController().removeSuggestion(xnVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.o20
    public final void n() {
        xn xnVar = this.b;
        xnVar.getMessagesController().convertToGigaGroup(xnVar.getParentActivity(), xnVar.e, xnVar, new z0(this, 19));
    }
}
