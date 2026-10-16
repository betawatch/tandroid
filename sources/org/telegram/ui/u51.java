package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u51 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ol0 {
    public final /* synthetic */ r71 a;

    public /* synthetic */ u51(r71 r71Var) {
        this.a = r71Var;
    }

    @Override // org.telegram.ui.Components.ol0
    public void c() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        r71 r71Var = this.a;
        int i11 = r71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        r71Var.B(false, true, true);
    }
}
