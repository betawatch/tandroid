package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
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
