package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
