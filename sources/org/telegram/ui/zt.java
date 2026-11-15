package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt implements sw, yr {
    public final /* synthetic */ cu a;

    public /* synthetic */ zt(cu cuVar) {
        this.a = cuVar;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    @Override // org.telegram.ui.yr
    public void b(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).a;
        if (!org.telegram.messenger.m5.E(j3)) {
            return true;
        }
        cu cuVar = this.a;
        cuVar.q0(cuVar.getMessagesController().a2(Long.valueOf(j3)));
        return true;
    }
}
