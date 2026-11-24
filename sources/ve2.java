// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ve2 implements wc2 {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ kf2 b;

    public ve2(kf2 kf2Var, TLObject tLObject) {
        this.b = kf2Var;
        this.a = tLObject;
    }

    @Override // wc2
    public final void a(TLRPC.User user) {
        this.b.v0(user);
    }

    @Override // wc2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            this.b.D0(channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
