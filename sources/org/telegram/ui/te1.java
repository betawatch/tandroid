package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class te1 implements y01 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ue1 b;

    public te1(ue1 ue1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ue1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.y01
    public final void O() {
        xe1 xe1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        xe1.U(xe1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new k71(14, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.y01
    public final void r(ek0 ek0Var) {
    }
}
