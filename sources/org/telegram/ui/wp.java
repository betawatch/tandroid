package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wp implements fp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nq d;

    public wp(nq nqVar, TLObject tLObject, long j10, boolean z10) {
        this.d = nqVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.ui.fp
    public final void a(TLRPC.User user) {
        nq.h0(this.d, user);
    }

    @Override // org.telegram.ui.fp
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        nq nqVar = this.d;
        fq fqVar = nqVar.m1;
        long j10 = this.b;
        if (fqVar != null && i3 == 1) {
            fqVar.b(j10);
        } else if (fqVar != null) {
            fqVar.c(j10, tLObject);
        }
        if (this.c) {
            nqVar.removeSelfFromStack();
        }
    }
}
