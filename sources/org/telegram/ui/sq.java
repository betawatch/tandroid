package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sq implements yp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ jr b;

    public sq(jr jrVar, TLObject tLObject) {
        this.b = jrVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
        jr.b0(this.b, user);
    }

    @Override // org.telegram.ui.yp
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.V(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
