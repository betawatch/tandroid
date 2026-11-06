package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v4 extends y4 {
    @Override // org.telegram.ui.y4
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).V2(this.d, ((TLRPC.Chat) this.c).id, false);
    }

    @Override // org.telegram.ui.y4
    public final void b(Object... objArr) {
        boolean z9;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.id == ((TLRPC.Chat) this.c).id && (z9 = this.g)) {
            if (z9) {
                this.g = false;
                this.b.n(this.a, this.e);
            }
            this.f.accept(chatFull);
        }
    }
}
