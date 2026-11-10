package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ti implements org.telegram.messenger.qr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ui b;

    public ti(ui uiVar, boolean z9) {
        this.b = uiVar;
        this.a = z9;
    }

    @Override // org.telegram.messenger.qr
    public final void k(boolean z9) {
        cn cnVar = this.b.b;
        if (z9) {
            TLRPC.User user = cnVar.f;
            boolean z10 = this.a;
            if (user != null || z10) {
                org.telegram.messenger.yr messagesStorage = cnVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.er(messagesStorage, cnVar.j6, new si(1, this, z10), 0));
                return;
            }
        }
        cnVar.Sa(cnVar.r4, z9);
    }
}
