package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vq implements fq {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ mr f;

    public vq(mr mrVar, int i10, long j10, int i11, boolean z10, boolean[] zArr) {
        this.f = mrVar;
        this.a = i10;
        this.b = j10;
        this.c = i11;
        this.d = z10;
        this.e = zArr;
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
        mr.d0(this.f, user);
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        mr mrVar = this.f;
        ArrayList arrayList = mrVar.E;
        long j10 = this.b;
        int i11 = this.a;
        if (i11 != 0) {
            if (i11 == 1 && i10 == 0) {
                mrVar.w0(j10);
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i12);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) == j10) {
                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i10 == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights;
                    tL_channelParticipantAdmin.inviter_id = mrVar.getUserConfig().getClientUserId();
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
                    arrayList.set(i12, tL_channelParticipantAdmin);
                }
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i10 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = mrVar.r.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    mrVar.r.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
                mrVar.s0();
            }
            i12++;
        }
        if (i10 != 1 || this.d) {
            return;
        }
        this.e[0] = true;
    }
}
