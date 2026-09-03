package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uf1 implements k11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ vf1 b;

    public uf1(vf1 vf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = vf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.k11
    public final void b0() {
        yf1 yf1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        yf1.U(yf1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new b11(25, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.k11
    public final void v(lk0 lk0Var) {
    }
}
