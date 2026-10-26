package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qq implements dq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ kr b;

    public qq(kr krVar, TLObject tLObject) {
        this.b = krVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.dq
    public final void a(TLRPC.User user) {
        kr.d0(this.b, user);
    }

    @Override // org.telegram.ui.dq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            kr.X(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
