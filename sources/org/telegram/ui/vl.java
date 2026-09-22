package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class vl extends org.telegram.ui.Components.n20 {
    public final /* synthetic */ zn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(zn znVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
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
