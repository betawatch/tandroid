package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zq implements fq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ pr b;

    public zq(pr prVar, TLObject tLObject) {
        this.b = prVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
        pr.g0(this.b, user);
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.a0(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
