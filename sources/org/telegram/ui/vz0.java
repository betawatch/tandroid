package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz0 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.gj0 {
    public final /* synthetic */ q11 a;

    public /* synthetic */ vz0(q11 q11Var) {
        this.a = q11Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public void f() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        q11 q11Var = this.a;
        int i10 = q11Var.W;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
        ArrayList[] arrayListArr = d02.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        d02.E0[0] = 0;
        d02.getMessagesStorage().a.c(new org.telegram.messenger.eg(d02, 9));
        ArrayList arrayList2 = arrayListArr[0];
        q11Var.B(false, true, true);
    }
}
