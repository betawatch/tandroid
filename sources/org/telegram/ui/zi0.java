package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class zi0 extends g.p {
    public final /* synthetic */ cj0 c;

    public zi0(cj0 cj0Var) {
        this.c = cj0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        cj0 cj0Var = this.c;
        MessageObject messageObject = (MessageObject) cj0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = cj0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
