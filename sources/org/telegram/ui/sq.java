package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sq implements fq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ mr b;

    public sq(mr mrVar, TLObject tLObject) {
        this.b = mrVar;
        this.a = tLObject;
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
        mr.d0(this.b, user);
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            mr.X(this.b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
