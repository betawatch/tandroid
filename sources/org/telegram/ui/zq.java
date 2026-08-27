package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zq implements dr {
    public final /* synthetic */ lr a;

    public zq(lr lrVar) {
        this.a = lrVar;
    }

    @Override // org.telegram.ui.dr
    public final void a(TLRPC.User user) {
        lr.c0(this.a, user);
    }

    @Override // org.telegram.ui.dr
    public final void b(long j10) {
        lr lrVar = this.a;
        ArrayList arrayList = lrVar.B;
        a0.h hVar = lrVar.G;
        TLRPC.User user = lrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new yq(0, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            er w02 = lrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = lrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = lrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new k9.a(18));
            lrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.dr
    public final void c(long j10, TLObject tLObject) {
        lr lrVar = this.a;
        ArrayList arrayList = lrVar.B;
        a0.h hVar = lrVar.G;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        er w02 = lrVar.w0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new k9.a(18));
        lrVar.A0(w02);
    }

    @Override // org.telegram.ui.dr
    public final /* synthetic */ void d(long j10) {
    }
}
