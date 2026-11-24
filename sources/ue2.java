// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ue2 implements wc2 {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kf2 d;

    public ue2(kf2 kf2Var, TLObject tLObject, long j, boolean z) {
        this.d = kf2Var;
        this.a = tLObject;
        this.b = j;
        this.c = z;
    }

    @Override // wc2
    public final void a(TLRPC.User user) {
        this.d.v0(user);
    }

    @Override // wc2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        kf2 kf2Var = this.d;
        df2 df2Var = kf2Var.m1;
        if (df2Var != null) {
            long j = this.b;
            if (i == 1) {
                df2Var.b(j);
            } else {
                df2Var.c(j, tLObject);
            }
        }
        if (this.c) {
            kf2Var.removeSelfFromStack();
        }
    }
}
