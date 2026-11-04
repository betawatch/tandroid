package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vt implements nw, tr {
    public final /* synthetic */ yt a;

    public /* synthetic */ vt(yt ytVar) {
        this.a = ytVar;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        return false;
    }

    @Override // org.telegram.ui.tr
    public void c(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).a;
        if (!org.telegram.messenger.m5.E(j10)) {
            return true;
        }
        yt ytVar = this.a;
        ytVar.q0(ytVar.getMessagesController().a2(Long.valueOf(j10)));
        return true;
    }
}
