package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
