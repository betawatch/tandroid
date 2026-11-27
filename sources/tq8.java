// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tq8 implements md2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.ChatParticipant b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ ProfileActivity e;

    public tq8(ProfileActivity profileActivity, int i, TLRPC.ChatParticipant chatParticipant, boolean z, boolean[] zArr) {
        this.e = profileActivity;
        this.a = i;
        this.b = chatParticipant;
        this.c = z;
        this.d = zArr;
    }

    @Override // md2
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.e;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.F2.megagroup ? 10 : 9);
    }

    @Override // md2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatFull chatFull;
        boolean z;
        TLRPC.ChannelParticipant tL_channelParticipant;
        int i2 = 0;
        TLRPC.ChatParticipant chatParticipant = this.b;
        ProfileActivity profileActivity = this.e;
        int i3 = this.a;
        if (i3 == 0) {
            if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                if (i == 1) {
                    tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                    tL_channelParticipant.flags |= 4;
                } else {
                    tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                }
                tL_channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                channelParticipant.peer.user_id = chatParticipant.user_id;
                channelParticipant.date = chatParticipant.date;
                channelParticipant.banned_rights = tL_chatBannedRights;
                channelParticipant.admin_rights = tL_chatAdminRights;
                channelParticipant.rank = str;
            } else if (chatParticipant != null) {
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int indexOf = profileActivity.v2.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    profileActivity.v2.participants.participants.set(indexOf, tL_chatParticipantAdmin);
                }
            }
            if (i != 1 || this.c) {
                return;
            }
            this.d[0] = true;
            return;
        }
        if (i3 == 1 && i == 0 && profileActivity.F2.megagroup && (chatFull = profileActivity.v2) != null && chatFull.participants != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= profileActivity.v2.participants.participants.size()) {
                    z = false;
                    break;
                } else {
                    if (r47.B1(((TLRPC.TL_chatChannelParticipant) profileActivity.v2.participants.participants.get(i4)).channelParticipant.peer) == chatParticipant.user_id) {
                        TLRPC.ChatFull chatFull2 = profileActivity.v2;
                        chatFull2.participants_count--;
                        chatFull2.participants.participants.remove(i4);
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            TLRPC.ChatFull chatFull3 = profileActivity.v2;
            if (chatFull3 != null && chatFull3.participants != null) {
                while (true) {
                    if (i2 >= profileActivity.v2.participants.participants.size()) {
                        break;
                    }
                    if (profileActivity.v2.participants.participants.get(i2).user_id == chatParticipant.user_id) {
                        profileActivity.v2.participants.participants.remove(i2);
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                profileActivity.c4(true);
                profileActivity.f4();
                profileActivity.d.f();
            }
        }
    }
}
