package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class si implements org.telegram.messenger.lr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ti b;

    public si(ti tiVar, boolean z10) {
        this.b = tiVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.lr
    public final void d(boolean z10) {
        bn bnVar = this.b.b;
        if (z10) {
            TLRPC.User user = bnVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                org.telegram.messenger.tr messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.zq(messagesStorage, bnVar.l6, new ri(1, this, z11), 0));
                return;
            }
        }
        bnVar.Ta(bnVar.s4, z10);
    }
}
