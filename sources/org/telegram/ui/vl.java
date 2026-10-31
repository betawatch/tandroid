package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vl extends org.telegram.ui.Components.t10 {
    public final /* synthetic */ un j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(un unVar, Activity activity, org.telegram.ui.ActionBar.k2 k2Var) {
        super(activity, k2Var);
        this.j1 = unVar;
    }

    @Override // org.telegram.ui.Components.t10
    public final void I0() {
        un unVar = this.j1;
        unVar.Y7();
        UndoView undoView = unVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        unVar.getMessagesController().h4(unVar.j6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.t10
    public final void J0() {
        un unVar = this.j1;
        unVar.getMessagesController().S(unVar.getParentActivity(), unVar.e, unVar, new y0(this, 21));
    }
}
