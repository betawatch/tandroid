package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ze1 implements r01 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ af1 b;

    public ze1(af1 af1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = af1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.r01
    public final void E() {
        df1 df1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        df1.T(df1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new n21(20, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.r01
    public final void g(ek0 ek0Var) {
    }
}
