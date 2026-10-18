package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ve1 implements a11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ we1 b;

    public ve1(we1 we1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = we1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.a11
    public final void O() {
        ze1 ze1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        ze1.U(ze1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new m71(14, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.a11
    public final void r(gk0 gk0Var) {
    }
}
