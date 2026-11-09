package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zp implements jp {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ qq f;

    public zp(qq qqVar, int i7, long j3, int i10, boolean z9, boolean[] zArr) {
        this.f = qqVar;
        this.a = i7;
        this.b = j3;
        this.c = i10;
        this.d = z9;
        this.e = zArr;
    }

    @Override // org.telegram.ui.jp
    public final void a(TLRPC.User user) {
        qq.h0(this.f, user);
    }

    @Override // org.telegram.ui.jp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        qq qqVar = this.f;
        ArrayList arrayList = qqVar.E;
        long j3 = this.b;
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 == 1 && i7 == 0) {
                qqVar.A0(j3);
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
                if (org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject).peer) == j3) {
                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i7 == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights;
                    tL_channelParticipantAdmin.inviter_id = qqVar.getUserConfig().e();
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
                int indexOf = qqVar.r.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    qqVar.r.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
                qqVar.w0();
            }
            i11++;
        }
        if (i7 != 1 || this.d) {
            return;
        }
        this.e[0] = true;
    }
}
