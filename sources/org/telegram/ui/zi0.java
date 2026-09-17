package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
