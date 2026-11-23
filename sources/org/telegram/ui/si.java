package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class si implements org.telegram.messenger.mr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ti b;

    public si(ti tiVar, boolean z10) {
        this.b = tiVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.mr
    public final void d(boolean z10) {
        bn bnVar = this.b.b;
        if (z10) {
            TLRPC.User user = bnVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                org.telegram.messenger.ur messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.ar(messagesStorage, bnVar.l6, new ri(1, this, z11), 0));
                return;
            }
        }
        bnVar.Ta(bnVar.s4, z10);
    }
}
