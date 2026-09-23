package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class x4 extends a5 {
    @Override // org.telegram.ui.a5
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.c).id, this.d, false);
    }

    @Override // org.telegram.ui.a5
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
