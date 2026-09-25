package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sa0 implements hq {
    public final /* synthetic */ qy a;
    public final /* synthetic */ int b;

    public sa0(qy qyVar, int i10) {
        this.a = qyVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.hq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        NotificationCenter.getInstance(this.b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
    }
}
