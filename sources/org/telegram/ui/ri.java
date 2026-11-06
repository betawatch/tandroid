package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ri implements org.telegram.messenger.qr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ si b;

    public ri(si siVar, boolean z9) {
        this.b = siVar;
        this.a = z9;
    }

    @Override // org.telegram.messenger.qr
    public final void k(boolean z9) {
        an anVar = this.b.b;
        if (z9) {
            TLRPC.User user = anVar.f;
            boolean z10 = this.a;
            if (user != null || z10) {
                org.telegram.messenger.yr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.er(messagesStorage, anVar.j6, new qi(1, this, z10), 0));
                return;
            }
        }
        anVar.Qa(anVar.r4, z9);
    }
}
