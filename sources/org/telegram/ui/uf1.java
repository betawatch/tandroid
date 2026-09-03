package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class uf1 implements j11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ vf1 b;

    public uf1(vf1 vf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = vf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.j11
    public final void d0() {
        yf1 yf1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        yf1.U(yf1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new h21(24, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.j11
    public final void u(lk0 lk0Var) {
    }
}
