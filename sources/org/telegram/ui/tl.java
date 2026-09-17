package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class tl extends su0 {
    public final /* synthetic */ co a;

    public tl(co coVar) {
        this.a = coVar;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return co.A1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean K() {
        return true;
    }
}
