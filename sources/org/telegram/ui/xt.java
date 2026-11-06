package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt implements qw, vr {
    public final /* synthetic */ au a;

    public /* synthetic */ xt(au auVar) {
        this.a = auVar;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        return false;
    }

    @Override // org.telegram.ui.vr
    public void b(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
        if (!org.telegram.messenger.m5.E(j3)) {
            return true;
        }
        au auVar = this.a;
        auVar.q0(auVar.getMessagesController().a2(Long.valueOf(j3)));
        return true;
    }
}
