package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class y91 implements fx0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ z91 b;

    public y91(z91 z91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = z91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.fx0
    public final void c0() {
        ca1 ca1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        ca1.Z(ca1Var, tL_forumTopic.id);
        org.telegram.messenger.g0.i3(new by0(21, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.fx0
    public final void t(oh0 oh0Var) {
    }
}
