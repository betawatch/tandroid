package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt implements sw, xr {
    public final /* synthetic */ cu a;

    public /* synthetic */ zt(cu cuVar) {
        this.a = cuVar;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean N(yw ywVar) {
        return false;
    }

    @Override // org.telegram.ui.xr
    public void b(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
        if (!org.telegram.messenger.m5.E(j3)) {
            return true;
        }
        cu cuVar = this.a;
        cuVar.q0(cuVar.getMessagesController().a2(Long.valueOf(j3)));
        return true;
    }
}
