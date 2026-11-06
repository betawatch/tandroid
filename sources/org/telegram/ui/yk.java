package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class yk extends org.telegram.ui.Components.d10 {
    public final /* synthetic */ an j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(an anVar, Activity activity, org.telegram.ui.ActionBar.f2 f2Var) {
        super(activity, f2Var);
        this.j1 = anVar;
    }

    @Override // org.telegram.ui.Components.d10
    public final void I0() {
        an anVar = this.j1;
        anVar.f8();
        UndoView undoView = anVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        anVar.getMessagesController().k4(anVar.j6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.d10
    public final void J0() {
        an anVar = this.j1;
        anVar.getMessagesController().S(anVar.getParentActivity(), anVar.e, anVar, new w0(this, 21));
    }
}
