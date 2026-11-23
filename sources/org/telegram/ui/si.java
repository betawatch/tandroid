package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
