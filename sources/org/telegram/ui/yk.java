package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yk extends org.telegram.ui.Components.h10 {
    public final /* synthetic */ an n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(an anVar, Activity activity, org.telegram.ui.ActionBar.e2 e2Var) {
        super(activity, e2Var);
        this.n1 = anVar;
    }

    @Override // org.telegram.ui.Components.h10
    public final void I0() {
        an anVar = this.n1;
        anVar.h8();
        UndoView undoView = anVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        anVar.getMessagesController().k4(anVar.k6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.h10
    public final void J0() {
        an anVar = this.n1;
        anVar.getMessagesController().S(anVar.getParentActivity(), anVar.e, anVar, new w0(this, 21));
    }
}
