package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yq implements gq {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pr d;

    public yq(pr prVar, TLObject tLObject, long j10, boolean z4) {
        this.d = prVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z4;
    }

    @Override // org.telegram.ui.gq
    public final void a(TLRPC.User user) {
        pr.c0(this.d, user);
    }

    @Override // org.telegram.ui.gq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        pr prVar = this.d;
        ir irVar = prVar.j1;
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
