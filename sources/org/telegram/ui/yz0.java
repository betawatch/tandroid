package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.qi0 {
    public final /* synthetic */ t11 a;

    public /* synthetic */ yz0(t11 t11Var) {
        this.a = t11Var;
    }

    @Override // org.telegram.ui.Components.qi0
    public void e() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        t11 t11Var = this.a;
        int i10 = t11Var.V;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
        ArrayList[] arrayListArr = b02.E0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.D0[0] = 0;
        b02.getMessagesStorage().a.c(new org.telegram.messenger.fg(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        t11Var.B(false, true, true);
    }
}
