package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sl extends fu0 {
    public final /* synthetic */ zn a;

    public sl(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return zn.A1(this.a, messageObject, fileLocation, i10, z4, false);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean K() {
        return true;
    }
}
