package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class tl extends org.telegram.ui.Components.r20 {
    public final /* synthetic */ yn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(yn ynVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.b = ynVar;
    }

    @Override // org.telegram.ui.Components.r20
    public final void m() {
        yn ynVar = this.b;
        ynVar.Q7();
        UndoView undoView = ynVar.w3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        ynVar.getMessagesController().removeSuggestion(ynVar.R5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.r20
    public final void n() {
        yn ynVar = this.b;
        ynVar.getMessagesController().convertToGigaGroup(ynVar.getParentActivity(), ynVar.e, ynVar, new z0(this, 21));
    }
}
