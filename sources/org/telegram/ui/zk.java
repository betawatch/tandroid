package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zk extends org.telegram.ui.Components.o10 {
    public final /* synthetic */ bn n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(bn bnVar, Activity activity, org.telegram.ui.ActionBar.h2 h2Var) {
        super(activity, h2Var);
        this.n1 = bnVar;
    }

    @Override // org.telegram.ui.Components.o10
    public final void J0() {
        bn bnVar = this.n1;
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        bnVar.getMessagesController().s4(bnVar.l6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.o10
    public final void K0() {
        bn bnVar = this.n1;
        bnVar.getMessagesController().S(bnVar.getParentActivity(), bnVar.e, bnVar, new w0(this, 21));
    }
}
