package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xq implements cr {
    public final /* synthetic */ jr a;

    public xq(jr jrVar) {
        this.a = jrVar;
    }

    @Override // org.telegram.ui.cr
    public final void c(long j10, TLObject tLObject) {
        jr jrVar = this.a;
        if (jrVar.G.f(j10) == null) {
            dr w02 = jrVar.w0();
            jrVar.B.add(tLObject);
            jrVar.G.k(tLObject, j10);
            jrVar.z0(jrVar.B);
            jrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.cr
    public final void d(long j10) {
        jr jrVar = this.a;
        if (jrVar.G.f(j10) == null) {
            dr w02 = jrVar.w0();
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
            tL_channelParticipantBanned.date = jrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = jrVar.getAccountInstance().getUserConfig().clientUserId;
            jrVar.s.kicked_count++;
            jrVar.B.add(tL_channelParticipantBanned);
            jrVar.G.k(tL_channelParticipantBanned, j10);
            jrVar.z0(jrVar.B);
            jrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.cr
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.cr
    public final /* synthetic */ void b(long j10) {
    }
}
