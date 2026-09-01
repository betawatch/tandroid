package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ql extends au0 {
    public final /* synthetic */ xn a;

    public ql(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return xn.A1(this.a, messageObject, fileLocation, i10, z4, false);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean K() {
        return true;
    }
}
