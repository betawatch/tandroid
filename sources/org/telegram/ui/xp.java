package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class xp implements hp {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ oq f;

    public xp(oq oqVar, int i7, long j3, int i10, boolean z9, boolean[] zArr) {
        this.f = oqVar;
        this.a = i7;
        this.b = j3;
        this.c = i10;
        this.d = z9;
        this.e = zArr;
    }

    @Override // org.telegram.ui.hp
    public final void a(TLRPC.User user) {
        oq.h0(this.f, user);
    }

    @Override // org.telegram.ui.hp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        oq oqVar = this.f;
        ArrayList arrayList = oqVar.E;
        long j3 = this.b;
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 == 1 && i7 == 0) {
                oqVar.A0(j3);
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
                if (org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject).peer) == j3) {
                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i7 == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights;
                    tL_channelParticipantAdmin.inviter_id = oqVar.getUserConfig().e();
                    if (j3 > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipantAdmin.peer = tL_peerUser;
                        tL_peerUser.user_id = j3;
                    } else {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        tL_channelParticipantAdmin.peer = tL_peerChannel;
                        tL_peerChannel.channel_id = -j3;
                    }
                    tL_channelParticipantAdmin.date = this.c;
                    tL_channelParticipantAdmin.flags |= 4;
                    tL_channelParticipantAdmin.rank = str;
                    arrayList.set(i11, tL_channelParticipantAdmin);
                }
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i7 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = oqVar.r.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    oqVar.r.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
                oqVar.w0();
            }
            i11++;
        }
        if (i7 != 1 || this.d) {
            return;
        }
        this.e[0] = true;
    }
}
