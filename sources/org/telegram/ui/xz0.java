package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz0 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.gj0 {
    public final /* synthetic */ s11 a;

    public /* synthetic */ xz0(s11 s11Var) {
        this.a = s11Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        s11 s11Var = this.a;
        int i10 = s11Var.W;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i10);
        ArrayList[] arrayListArr = d02.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        d02.E0[0] = 0;
        d02.getMessagesStorage().a.c(new org.telegram.messenger.fg(d02, 9));
        ArrayList arrayList2 = arrayListArr[0];
        s11Var.B(false, true, true);
    }

    @Override // org.telegram.ui.Components.gj0
    public void i() {
        this.a.m();
    }
}
