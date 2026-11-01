package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements tx, vs {
    public final /* synthetic */ cv a;

    public /* synthetic */ zu(cv cvVar) {
        this.a = cvVar;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean O(zx zxVar) {
        return false;
    }

    @Override // org.telegram.ui.vs
    public void c(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override // org.telegram.ui.tx
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).a;
        if (!org.telegram.messenger.o5.E(j10)) {
            return true;
        }
        cv cvVar = this.a;
        cvVar.q0(cvVar.getMessagesController().Z1(Long.valueOf(j10)));
        return true;
    }
}
