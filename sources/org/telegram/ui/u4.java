package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u4 extends x4 {
    @Override // org.telegram.ui.x4
    public final void a() {
        org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).T2(this.d, ((TLRPC.Chat) this.c).id, false);
    }

    @Override // org.telegram.ui.x4
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
