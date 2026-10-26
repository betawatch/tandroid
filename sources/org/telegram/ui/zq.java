package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zq implements dr {
    public final /* synthetic */ kr a;

    public zq(kr krVar) {
        this.a = krVar;
    }

    @Override // org.telegram.ui.dr
    public final void a(TLRPC.User user) {
        kr.d0(this.a, user);
    }

    @Override // org.telegram.ui.dr
    public final void b(long j10) {
        kr krVar = this.a;
        ArrayList arrayList = krVar.E;
        a0.h hVar = krVar.J;
        TLRPC.User user = krVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new ip(2, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            er x02 = krVar.x0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = krVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = krVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(11));
            krVar.B0(x02);
        }
    }

    @Override // org.telegram.ui.dr
    public final void c(long j10, TLObject tLObject) {
        kr krVar = this.a;
        ArrayList arrayList = krVar.E;
        a0.h hVar = krVar.J;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        er x02 = krVar.x0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(11));
        krVar.B0(x02);
    }

    @Override // org.telegram.ui.dr
    public final /* synthetic */ void d(long j10) {
    }
}
