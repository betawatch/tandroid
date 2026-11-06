package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class up implements hp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ oq b;

    public up(oq oqVar, TLObject tLObject) {
        this.b = oqVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.hp
    public final void a(TLRPC.User user) {
        oq.h0(this.b, user);
    }

    @Override // org.telegram.ui.hp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            oq.b0(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
