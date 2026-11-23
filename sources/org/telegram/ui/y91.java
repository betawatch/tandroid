package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y91 implements gx0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ z91 b;

    public y91(z91 z91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = z91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.gx0
    public final void Q() {
        ca1 ca1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        ca1.Z(ca1Var, tL_forumTopic.id);
        org.telegram.messenger.g0.h3(new iy0(19, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.gx0
    public final void n(sh0 sh0Var) {
    }
}
