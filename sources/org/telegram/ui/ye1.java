package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ye1 implements s01 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ze1 b;

    public ye1(ze1 ze1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ze1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.s01
    public final void G() {
        cf1 cf1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        cf1.U(cf1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new m21(20, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.s01
    public final void l(fk0 fk0Var) {
    }
}
