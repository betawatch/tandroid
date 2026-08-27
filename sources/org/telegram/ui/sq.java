package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sq implements aq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ lr d;

    public sq(lr lrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = lrVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.ui.aq
    public final void a(TLRPC.User user) {
        lr.c0(this.d, user);
    }

    @Override // org.telegram.ui.aq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        lr lrVar = this.d;
        dr drVar = lrVar.i1;
        long j10 = this.b;
        if (drVar != null && i10 == 1) {
            drVar.b(j10);
        } else if (drVar != null) {
            drVar.c(j10, tLObject);
        }
        if (this.c) {
            lrVar.removeSelfFromStack();
        }
    }
}
