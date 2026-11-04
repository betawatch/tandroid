package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x4 extends a5 {
    @Override // org.telegram.ui.a5
    public final void a() {
        org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).V2(this.d, ((TLRPC.Chat) this.c).id, false);
    }

    @Override // org.telegram.ui.a5
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.id == ((TLRPC.Chat) this.c).id && (z10 = this.g)) {
            if (z10) {
                this.g = false;
                this.b.n(this.a, this.e);
            }
            this.f.accept(chatFull);
        }
    }
}
