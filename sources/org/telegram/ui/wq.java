package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wq implements fq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mr d;

    public wq(mr mrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = mrVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
        mr.d0(this.d, user);
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        mr mrVar = this.d;
        fr frVar = mrVar.l1;
        long j10 = this.b;
        if (frVar != null && i10 == 1) {
            frVar.b(j10);
        } else if (frVar != null) {
            frVar.c(j10, tLObject);
        }
        if (this.c) {
            mrVar.removeSelfFromStack();
        }
    }
}
