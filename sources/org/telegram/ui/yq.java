package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class yq implements cr {
    public final /* synthetic */ jr a;

    public yq(jr jrVar) {
        this.a = jrVar;
    }

    @Override // org.telegram.ui.cr
    public final void a(TLRPC.User user) {
        jr.c0(this.a, user);
    }

    @Override // org.telegram.ui.cr
    public final void b(long j10) {
        jr jrVar = this.a;
        ArrayList arrayList = jrVar.F;
        a0.h hVar = jrVar.K;
        TLRPC.User user = jrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new gh(21, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            dr w02 = jrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.id;
            tL_channelParticipantAdmin.date = jrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = jrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.id);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(11));
            jrVar.A0(w02);
        }
    }

    @Override // org.telegram.ui.cr
    public final void c(long j10, TLObject tLObject) {
        jr jrVar = this.a;
        ArrayList arrayList = jrVar.F;
        a0.h hVar = jrVar.K;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        dr w02 = jrVar.w0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(11));
        jrVar.A0(w02);
    }

    @Override // org.telegram.ui.cr
    public final /* synthetic */ void d(long j10) {
    }
}
