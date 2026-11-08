package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.qi0 {
    public final /* synthetic */ q11 a;

    public /* synthetic */ uz0(q11 q11Var) {
        this.a = q11Var;
    }

    @Override // org.telegram.ui.Components.qi0
    public void e() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        q11 q11Var = this.a;
        int i10 = q11Var.V;
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
        q11Var.B(false, true, true);
    }
}
