package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vp implements fp {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ nq f;

    public vp(nq nqVar, int i3, long j10, int i10, boolean z10, boolean[] zArr) {
        this.f = nqVar;
        this.a = i3;
        this.b = j10;
        this.c = i10;
        this.d = z10;
        this.e = zArr;
    }

    @Override // org.telegram.ui.fp
    public final void a(TLRPC.User user) {
        nq.h0(this.f, user);
    }

    @Override // org.telegram.ui.fp
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        nq nqVar = this.f;
        ArrayList arrayList = nqVar.F;
        long j10 = this.b;
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 == 1 && i3 == 0) {
                nqVar.A0(j10);
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                if (org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) tLObject).peer) == j10) {
                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i3 == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights;
                    tL_channelParticipantAdmin.inviter_id = nqVar.getUserConfig().e();
                    if (j10 > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipantAdmin.peer = tL_peerUser;
                        tL_peerUser.user_id = j10;
                    } else {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        tL_channelParticipantAdmin.peer = tL_peerChannel;
                        tL_peerChannel.channel_id = -j10;
                    }
                    tL_channelParticipantAdmin.date = this.c;
                    tL_channelParticipantAdmin.flags |= 4;
                    tL_channelParticipantAdmin.rank = str;
                    arrayList.set(i11, tL_channelParticipantAdmin);
                }
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i3 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = nqVar.r.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    nqVar.r.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
                nqVar.w0();
            }
            i11++;
        }
        if (i3 != 1 || this.d) {
            return;
        }
        this.e[0] = true;
    }
}
