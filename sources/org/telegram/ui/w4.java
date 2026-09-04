package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class w4 extends z4 {
    @Override // org.telegram.ui.z4
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.c).id, this.d, false);
    }

    @Override // org.telegram.ui.z4
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.id == ((TLRPC.Chat) this.c).id && (z10 = this.g)) {
            if (z10) {
                this.g = false;
                this.b.removeObserver(this.a, this.e);
            }
            this.f.accept(chatFull);
        }
    }
}
