package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.ej0 {
    public final /* synthetic */ r11 a;

    public /* synthetic */ wz0(r11 r11Var) {
        this.a = r11Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        r11 r11Var = this.a;
        int i10 = r11Var.W;
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
        r11Var.B(false, true, true);
    }

    @Override // org.telegram.ui.Components.ej0
    public void i() {
        this.a.m();
    }
}
