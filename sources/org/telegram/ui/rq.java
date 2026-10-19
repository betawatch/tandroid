package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class rq implements yp {
    public final /* synthetic */ TLObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ hr d;

    public rq(hr hrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = hrVar;
        this.a = tLObject;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
        hr.c0(this.d, user);
    }

    @Override // org.telegram.ui.yp
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        hr hrVar = this.d;
        ar arVar = hrVar.m1;
        long j10 = this.b;
        if (arVar != null && i10 == 1) {
            arVar.b(j10);
        } else if (arVar != null) {
            arVar.c(j10, tLObject);
        }
        if (this.c) {
            hrVar.removeSelfFromStack();
        }
    }
}
