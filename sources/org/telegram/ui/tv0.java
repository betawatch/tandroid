package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tv0 implements jp {
    public final /* synthetic */ zw a;
    public final /* synthetic */ uv0 b;

    public tv0(uv0 uv0Var, zw zwVar) {
        this.b = uv0Var;
        this.a = zwVar;
    }

    @Override // org.telegram.ui.jp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.M1 = true;
        this.a.removeSelfFromStack();
        org.telegram.messenger.qs notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.qs.t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override // org.telegram.ui.jp
    public final void a(TLRPC.User user) {
    }
}
