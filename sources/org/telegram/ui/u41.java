package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u41 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.zk0 {
    public final /* synthetic */ r61 a;

    public /* synthetic */ u41(r61 r61Var) {
        this.a = r61Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public void d() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        r61 r61Var = this.a;
        int i11 = r61Var.S;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        r61Var.B(false, true, true);
    }
}
