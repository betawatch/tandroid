package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qq implements yp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jr d;

    public qq(jr jrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = jrVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
        jr.b0(this.d, user);
    }

    @Override // org.telegram.ui.yp
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        jr jrVar = this.d;
        br brVar = jrVar.i1;
        long j10 = this.b;
        if (brVar != null && i9 == 1) {
            brVar.b(j10);
        } else if (brVar != null) {
            brVar.c(j10, tLObject);
        }
        if (this.c) {
            jrVar.removeSelfFromStack();
        }
    }
}
