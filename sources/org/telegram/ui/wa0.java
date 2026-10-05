package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class wa0 implements jq {
    public final /* synthetic */ uy a;
    public final /* synthetic */ int b;

    public wa0(uy uyVar, int i10) {
        this.a = uyVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.jq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        NotificationCenter.getInstance(this.b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override // org.telegram.ui.jq
    public final void a(TLRPC.User user) {
    }
}
