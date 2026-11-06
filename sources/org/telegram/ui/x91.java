package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x91 implements fx0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ y91 b;

    public x91(y91 y91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = y91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.fx0
    public final void c0() {
        ba1 ba1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        ba1.Z(ba1Var, tL_forumTopic.id);
        org.telegram.messenger.g0.i3(new by0(21, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.fx0
    public final void t(oh0 oh0Var) {
    }
}
