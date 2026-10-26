package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tl extends gu0 {
    public final /* synthetic */ un a;

    public tl(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.G1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean L() {
        return true;
    }
}
