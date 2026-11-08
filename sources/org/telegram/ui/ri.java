package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
