// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pza implements he2 {
    public final /* synthetic */ TLRPC.TL_chatChannelParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean[] c;

    public pza(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z, boolean[] zArr) {
        this.a = tL_chatChannelParticipant;
        this.b = z;
        this.c = zArr;
    }

    @Override // he2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.a;
        if (i == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
        } else {
            TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
            channelParticipant2.admin_rights = tL_chatAdminRights;
            channelParticipant2.rank = str;
            if (this.b) {
                this.c[0] = true;
            }
        }
    }

    @Override // he2
    public final void a(TLRPC.User user) {
    }
}
