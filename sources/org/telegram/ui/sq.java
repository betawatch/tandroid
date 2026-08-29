package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sq implements aq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jr d;

    public sq(jr jrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = jrVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.ui.aq
    public final void a(TLRPC.User user) {
        jr.c0(this.d, user);
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
        jr jrVar = this.d;
        cr crVar = jrVar.i1;
        long j10 = this.b;
        if (crVar != null && i10 == 1) {
            crVar.b(j10);
        } else if (crVar != null) {
            crVar.c(j10, tLObject);
        }
        if (this.c) {
            jrVar.removeSelfFromStack();
        }
    }
}
