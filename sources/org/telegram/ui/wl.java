package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wl extends org.telegram.ui.Components.p20 {
    public final /* synthetic */ zn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(zn znVar, Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        super(activity, p2Var);
        this.b = znVar;
    }

    @Override // org.telegram.ui.Components.p20
    public final void m() {
        zn znVar = this.b;
        znVar.Q7();
        UndoView undoView = znVar.v3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        znVar.getMessagesController().removeSuggestion(znVar.Q5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.p20
    public final void n() {
        zn znVar = this.b;
        znVar.getMessagesController().convertToGigaGroup(znVar.getParentActivity(), znVar.e, znVar, new c1(this, 19));
    }
}
