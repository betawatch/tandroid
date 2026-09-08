package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ya0 implements nq {
    public final /* synthetic */ uy a;
    public final /* synthetic */ int b;

    public ya0(uy uyVar, int i10) {
        this.a = uyVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.nq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        NotificationCenter.getInstance(this.b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override // org.telegram.ui.nq
    public final void a(TLRPC.User user) {
    }
}
