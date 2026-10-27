package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sl extends org.telegram.ui.Components.y20 {
    public final /* synthetic */ wn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(wn wnVar, Activity activity, org.telegram.ui.ActionBar.r2 r2Var) {
        super(activity, r2Var);
        this.b = wnVar;
    }

    @Override // org.telegram.ui.Components.y20
    public final void m() {
        wn wnVar = this.b;
        wnVar.Z7();
        UndoView undoView = wnVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        wnVar.getMessagesController().removeSuggestion(wnVar.j6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.y20
    public final void n() {
        wn wnVar = this.b;
        wnVar.getMessagesController().convertToGigaGroup(wnVar.getParentActivity(), wnVar.e, wnVar, new y0(this, 21));
    }
}
