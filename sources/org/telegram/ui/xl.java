package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
