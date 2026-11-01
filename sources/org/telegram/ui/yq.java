package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yq implements fq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ pr b;

    public yq(pr prVar, TLObject tLObject) {
        this.b = prVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
        pr.h0(this.b, user);
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.b0(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
