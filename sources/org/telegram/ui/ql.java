package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ql extends tu0 {
    public final /* synthetic */ bo a;

    public ql(bo boVar) {
        this.a = boVar;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return bo.A1(this.a, messageObject, fileLocation, i10, z10, false);
    }
}
