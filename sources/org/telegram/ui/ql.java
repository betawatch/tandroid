package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ql extends org.telegram.ui.Components.w20 {
    public final /* synthetic */ sn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(sn snVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.b = snVar;
    }

    @Override // org.telegram.ui.Components.w20
    public final void n() {
        sn snVar = this.b;
        snVar.T7();
        UndoView undoView = snVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        snVar.getMessagesController().removeSuggestion(snVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.w20
    public final void o() {
        sn snVar = this.b;
        snVar.getMessagesController().convertToGigaGroup(snVar.getParentActivity(), snVar.e, snVar, new b1(this, 19));
    }
}
