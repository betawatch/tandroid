package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s41 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ q61 a;

    public /* synthetic */ s41(q61 q61Var) {
        this.a = q61Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public void d() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        q61 q61Var = this.a;
        int i11 = q61Var.S;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        q61Var.B(false, true, true);
    }
}
