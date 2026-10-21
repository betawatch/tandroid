package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class vq implements ar {
    public final /* synthetic */ hr a;

    public vq(hr hrVar) {
        this.a = hrVar;
    }

    @Override // org.telegram.ui.ar
    public final void c(long j10, TLObject tLObject) {
        hr hrVar = this.a;
        if (hrVar.K.f(j10) == null) {
            br w02 = hrVar.w0();
            hrVar.F.add(tLObject);
            hrVar.K.k(tLObject, j10);
            hrVar.z0(hrVar.F);
            hrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.ar
    public final void d(long j10) {
        hr hrVar = this.a;
        if (hrVar.K.f(j10) == null) {
            br w02 = hrVar.w0();
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
            tL_channelParticipantBanned.date = hrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = hrVar.getAccountInstance().getUserConfig().clientUserId;
            hrVar.s.kicked_count++;
            hrVar.F.add(tL_channelParticipantBanned);
            hrVar.K.k(tL_channelParticipantBanned, j10);
            hrVar.z0(hrVar.F);
            hrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.ar
    public final /* synthetic */ void a(TLRPC.User user) {
    }

    @Override // org.telegram.ui.ar
    public final /* synthetic */ void b(long j10) {
    }
}
