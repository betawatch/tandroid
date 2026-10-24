package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
