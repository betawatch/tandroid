package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ti0 extends g.p {
    public final /* synthetic */ wi0 c;

    public ti0(wi0 wi0Var) {
        this.c = wi0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        wi0 wi0Var = this.c;
        MessageObject messageObject = (MessageObject) wi0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = wi0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
