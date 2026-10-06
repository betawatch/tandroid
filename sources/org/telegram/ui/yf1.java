package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class yf1 implements o11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ zf1 b;

    public yf1(zf1 zf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = zf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.o11
    public final void d0() {
        cg1 cg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        cg1.S(cg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new e91(11, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.o11
    public final void v(rk0 rk0Var) {
    }
}
