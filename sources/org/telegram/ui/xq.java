package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xq implements fq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pr d;

    public xq(pr prVar, TLObject tLObject, long j10, boolean z10) {
        this.d = prVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
        pr.g0(this.d, user);
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
        pr prVar = this.d;
        ir irVar = prVar.l1;
        long j10 = this.b;
        if (irVar != null && i10 == 1) {
            irVar.b(j10);
        } else if (irVar != null) {
            irVar.c(j10, tLObject);
        }
        if (this.c) {
            prVar.removeSelfFromStack();
        }
    }
}
