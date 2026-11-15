package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ri implements org.telegram.messenger.nr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ si b;

    public ri(si siVar, boolean z10) {
        this.b = siVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.nr
    public final void j(boolean z10) {
        an anVar = this.b.b;
        if (z10) {
            TLRPC.User user = anVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                org.telegram.messenger.vr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.br(messagesStorage, anVar.k6, new qi(1, this, z11), 0));
                return;
            }
        }
        anVar.Ta(anVar.s4, z10);
    }
}
