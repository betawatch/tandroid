package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class u41 implements kp {
    public final /* synthetic */ TLRPC.TL_chatChannelParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean[] c;

    public u41(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.a = tL_chatChannelParticipant;
        this.b = z10;
        this.c = zArr;
    }

    @Override // org.telegram.ui.kp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.a;
        if (i7 == 0) {
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

    @Override // org.telegram.ui.kp
    public final void a(TLRPC.User user) {
    }
}
