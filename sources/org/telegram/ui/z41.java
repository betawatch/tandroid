package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z41 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ w61 a;

    public /* synthetic */ z41(w61 w61Var) {
        this.a = w61Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public void d() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        w61 w61Var = this.a;
        int i11 = w61Var.S;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        w61Var.B(false, true, true);
    }
}
