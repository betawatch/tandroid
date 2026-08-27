package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xq implements dr {
    public final /* synthetic */ lr a;

    public xq(lr lrVar) {
        this.a = lrVar;
    }

    @Override // org.telegram.ui.dr
    public final void c(long j10, TLObject tLObject) {
        lr lrVar = this.a;
        if (lrVar.G.f(j10) == null) {
            er w02 = lrVar.w0();
            lrVar.B.add(tLObject);
            lrVar.G.k(tLObject, j10);
            lrVar.z0(lrVar.B);
            lrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.dr
    public final void d(long j10) {
        lr lrVar = this.a;
        if (lrVar.G.f(j10) == null) {
            er w02 = lrVar.w0();
            TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
            if (j10 > 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantBanned.peer = tL_peerUser;
                tL_peerUser.user_id = j10;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_channelParticipantBanned.peer = tL_peerChannel;
                tL_peerChannel.channel_id = -j10;
            }
            tL_channelParticipantBanned.date = lrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = lrVar.getAccountInstance().getUserConfig().clientUserId;
            lrVar.s.kicked_count++;
            lrVar.B.add(tL_channelParticipantBanned);
            lrVar.G.k(tL_channelParticipantBanned, j10);
            lrVar.z0(lrVar.B);
            lrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.dr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.dr
    public final /* synthetic */ void b(long j10) {
    }
}
