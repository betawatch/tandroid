package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zq implements hq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qr d;

    public zq(qr qrVar, TLObject tLObject, long j10, boolean z4) {
        this.d = qrVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z4;
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
        qr.c0(this.d, user);
    }

    @Override // org.telegram.ui.hq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        qr qrVar = this.d;
        jr jrVar = qrVar.j1;
        long j10 = this.b;
        if (jrVar != null && i10 == 1) {
            jrVar.b(j10);
        } else if (jrVar != null) {
            jrVar.c(j10, tLObject);
        }
        if (this.c) {
            qrVar.removeSelfFromStack();
        }
    }
}
