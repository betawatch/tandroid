package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xp implements kp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ rq b;

    public xp(rq rqVar, TLObject tLObject) {
        this.b = rqVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.kp
    public final void a(TLRPC.User user) {
        rq.h0(this.b, user);
    }

    @Override // org.telegram.ui.kp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rq.b0(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
