package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vl extends iu0 {
    public final /* synthetic */ wn a;

    public vl(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.H1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean L() {
        return true;
    }
}
