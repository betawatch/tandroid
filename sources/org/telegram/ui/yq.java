package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yq implements dr {
    public final /* synthetic */ kr a;

    public yq(kr krVar) {
        this.a = krVar;
    }

    @Override // org.telegram.ui.dr
    public final void c(long j10, TLObject tLObject) {
        kr krVar = this.a;
        if (krVar.J.f(j10) == null) {
            er x02 = krVar.x0();
            krVar.E.add(tLObject);
            krVar.J.k(tLObject, j10);
            krVar.A0(krVar.E);
            krVar.B0(x02);
        }
    }

    @Override // org.telegram.ui.dr
    public final void d(long j10) {
        kr krVar = this.a;
        if (krVar.J.f(j10) == null) {
            er x02 = krVar.x0();
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
            tL_channelParticipantBanned.date = krVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = krVar.getAccountInstance().getUserConfig().clientUserId;
            krVar.r.kicked_count++;
            krVar.E.add(tL_channelParticipantBanned);
            krVar.J.k(tL_channelParticipantBanned, j10);
            krVar.A0(krVar.E);
            krVar.B0(x02);
        }
    }

    @Override // org.telegram.ui.dr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.dr
    public final /* synthetic */ void b(long j10) {
    }
}
