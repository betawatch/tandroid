package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uq implements dq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kr d;

    public uq(kr krVar, TLObject tLObject, long j10, boolean z10) {
        this.d = krVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.ui.dq
    public final void a(TLRPC.User user) {
        kr.d0(this.d, user);
    }

    @Override // org.telegram.ui.dq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        kr krVar = this.d;
        dr drVar = krVar.l1;
        long j10 = this.b;
        if (drVar != null && i10 == 1) {
            drVar.b(j10);
        } else if (drVar != null) {
            drVar.c(j10, tLObject);
        }
        if (this.c) {
            krVar.removeSelfFromStack();
        }
    }
}
