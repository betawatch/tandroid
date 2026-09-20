package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ul extends org.telegram.ui.Components.n20 {
    public final /* synthetic */ zn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(zn znVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.b = znVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final void m() {
        zn znVar = this.b;
        znVar.Q7();
        UndoView undoView = znVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        znVar.getMessagesController().removeSuggestion(znVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.n20
    public final void n() {
        zn znVar = this.b;
        znVar.getMessagesController().convertToGigaGroup(znVar.getParentActivity(), znVar.e, znVar, new y0(this, 20));
    }
}
