package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class yf1 implements m11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ zf1 b;

    public yf1(zf1 zf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = zf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.m11
    public final void c0() {
        cg1 cg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        cg1.U(cg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new n81(14, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.m11
    public final void v(nk0 nk0Var) {
    }
}
