package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w91 implements ex0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ x91 b;

    public w91(x91 x91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = x91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.ex0
    public final void b0() {
        aa1 aa1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        aa1.Z(aa1Var, tL_forumTopic.id);
        org.telegram.messenger.g0.i3(new fy0(18, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.ex0
    public final void d(qh0 qh0Var) {
    }
}
