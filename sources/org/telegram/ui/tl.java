package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class tl extends org.telegram.ui.Components.q20 {
    public final /* synthetic */ wn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(wn wnVar, Activity activity, org.telegram.ui.ActionBar.m2 m2Var) {
        super(activity, m2Var);
        this.b = wnVar;
    }

    @Override // org.telegram.ui.Components.q20
    public final void m() {
        wn wnVar = this.b;
        wnVar.Q7();
        UndoView undoView = wnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        wnVar.getMessagesController().removeSuggestion(wnVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.q20
    public final void n() {
        wn wnVar = this.b;
        wnVar.getMessagesController().convertToGigaGroup(wnVar.getParentActivity(), wnVar.e, wnVar, new z0(this, 19));
    }
}
