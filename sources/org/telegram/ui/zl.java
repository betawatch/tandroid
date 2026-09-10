package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zl extends org.telegram.ui.Components.w20 {
    public final /* synthetic */ eo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(eo eoVar, Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        super(activity, p2Var);
        this.b = eoVar;
    }

    @Override // org.telegram.ui.Components.w20
    public final void m() {
        eo eoVar = this.b;
        eoVar.Q7();
        UndoView undoView = eoVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        eoVar.getMessagesController().removeSuggestion(eoVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.w20
    public final void n() {
        eo eoVar = this.b;
        eoVar.getMessagesController().convertToGigaGroup(eoVar.getParentActivity(), eoVar.e, eoVar, new a1(this, 19));
    }
}
