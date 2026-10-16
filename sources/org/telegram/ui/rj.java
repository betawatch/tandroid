package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class rj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ sj b;

    public rj(sj sjVar, boolean z10) {
        this.b = sjVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        fo foVar = this.b.b;
        if (z10) {
            TLRPC.User user = foVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                foVar.getMessagesStorage().getMessagesCount(foVar.T5, new qj(1, this, z11));
                return;
            }
        }
        foVar.va(foVar.d4, z10);
    }
}
