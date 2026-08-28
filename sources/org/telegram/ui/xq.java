package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xq implements br {
    public final /* synthetic */ jr a;

    public xq(jr jrVar) {
        this.a = jrVar;
    }

    @Override // org.telegram.ui.br
    public final void a(TLRPC.User user) {
        jr.b0(this.a, user);
    }

    @Override // org.telegram.ui.br
    public final void b(long j10) {
        jr jrVar = this.a;
        ArrayList arrayList = jrVar.B;
        a0.h hVar = jrVar.G;
        TLRPC.User user = jrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new wq(0, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            cr v02 = jrVar.v0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = jrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = jrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new j9.a(20));
            jrVar.z0(v02);
        }
    }

    @Override // org.telegram.ui.br
    public final void c(long j10, TLObject tLObject) {
        jr jrVar = this.a;
        ArrayList arrayList = jrVar.B;
        a0.h hVar = jrVar.G;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        cr v02 = jrVar.v0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new j9.a(20));
        jrVar.z0(v02);
    }

    @Override // org.telegram.ui.br
    public final /* synthetic */ void d(long j10) {
    }
}
