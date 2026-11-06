package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
