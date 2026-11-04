package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uk extends org.telegram.ui.Components.a10 {
    public final /* synthetic */ wm k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(wm wmVar, Activity activity, org.telegram.ui.ActionBar.d2 d2Var) {
        super(activity, d2Var);
        this.k1 = wmVar;
    }

    @Override // org.telegram.ui.Components.a10
    public final void I0() {
        wm wmVar = this.k1;
        wmVar.f8();
        UndoView undoView = wmVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        wmVar.getMessagesController().k4(wmVar.k6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.a10
    public final void J0() {
        wm wmVar = this.k1;
        wmVar.getMessagesController().S(wmVar.getParentActivity(), wmVar.e, wmVar, new x0(this, 21));
    }
}
