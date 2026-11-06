package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class yp implements hp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ oq d;

    public yp(oq oqVar, TLObject tLObject, long j3, boolean z9) {
        this.d = oqVar;
        this.a = tLObject;
        this.b = j3;
        this.c = z9;
    }

    @Override // org.telegram.ui.hp
    public final void a(TLRPC.User user) {
        oq.h0(this.d, user);
    }

    @Override // org.telegram.ui.hp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        oq oqVar = this.d;
        hq hqVar = oqVar.l1;
        long j3 = this.b;
        if (hqVar != null && i7 == 1) {
            hqVar.b(j3);
        } else if (hqVar != null) {
            hqVar.c(j3, tLObject);
        }
        if (this.c) {
            oqVar.removeSelfFromStack();
        }
    }
}
