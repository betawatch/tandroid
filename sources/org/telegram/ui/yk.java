package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yk extends org.telegram.ui.Components.e10 {
    public final /* synthetic */ an j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(an anVar, Activity activity, org.telegram.ui.ActionBar.f2 f2Var) {
        super(activity, f2Var);
        this.j1 = anVar;
    }

    @Override // org.telegram.ui.Components.e10
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

    @Override // org.telegram.ui.Components.e10
    public final void J0() {
        an anVar = this.j1;
        anVar.getMessagesController().S(anVar.getParentActivity(), anVar.e, anVar, new w0(this, 21));
    }
}
