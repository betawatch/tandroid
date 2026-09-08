package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ql extends su0 {
    public final /* synthetic */ co a;

    public ql(co coVar) {
        this.a = coVar;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return co.A1(this.a, messageObject, fileLocation, i10, z10, false);
    }
}
