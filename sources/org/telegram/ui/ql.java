package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ql extends mu0 {
    public final /* synthetic */ xn a;

    public ql(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return xn.A1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean K() {
        return true;
    }
}
