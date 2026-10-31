package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rb1 implements ty0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ sb1 b;

    public rb1(sb1 sb1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = sb1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.ty0
    public final void b0() {
        vb1 vb1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        vb1.Y(vb1Var, tL_forumTopic.id);
        org.telegram.messenger.i0.h3(new t11(14, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.ty0
    public final void w(ui0 ui0Var) {
    }
}
