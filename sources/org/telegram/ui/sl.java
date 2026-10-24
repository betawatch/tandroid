package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class sl extends cu0 {
    public final /* synthetic */ sn a;

    public sl(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return sn.E1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean L() {
        return true;
    }
}
