package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z41 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.xk0 {
    public final /* synthetic */ x61 a;

    public /* synthetic */ z41(x61 x61Var) {
        this.a = x61Var;
    }

    @Override // org.telegram.ui.Components.xk0
    public void e() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        x61 x61Var = this.a;
        int i11 = x61Var.S;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        x61Var.B(false, true, true);
    }
}
