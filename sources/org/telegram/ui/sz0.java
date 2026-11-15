package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz0 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.vi0 {
    public final /* synthetic */ n11 a;

    public /* synthetic */ sz0(n11 n11Var) {
        this.a = n11Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        n11 n11Var = this.a;
        int i10 = n11Var.W;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i10);
        ArrayList[] arrayListArr = b02.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.E0[0] = 0;
        b02.getMessagesStorage().a.c(new org.telegram.messenger.eg(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        n11Var.B(false, true, true);
    }

    @Override // org.telegram.ui.Components.vi0
    public void i() {
        this.a.m();
    }
}
