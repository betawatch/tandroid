package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class rl extends zt0 {
    public final /* synthetic */ qn a;

    public rl(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return qn.E1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean L() {
        return true;
    }
}
