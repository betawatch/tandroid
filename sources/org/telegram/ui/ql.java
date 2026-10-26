package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ql extends org.telegram.ui.Components.y20 {
    public final /* synthetic */ un b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(un unVar, Activity activity, org.telegram.ui.ActionBar.r2 r2Var) {
        super(activity, r2Var);
        this.b = unVar;
    }

    @Override // org.telegram.ui.Components.y20
    public final void m() {
        un unVar = this.b;
        unVar.X7();
        UndoView undoView = unVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        unVar.getMessagesController().removeSuggestion(unVar.f6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.y20
    public final void n() {
        un unVar = this.b;
        unVar.getMessagesController().convertToGigaGroup(unVar.getParentActivity(), unVar.e, unVar, new y0(this, 21));
    }
}
