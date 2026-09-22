package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yi0 extends g.p {
    public final /* synthetic */ bj0 c;

    public yi0(bj0 bj0Var) {
        this.c = bj0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        bj0 bj0Var = this.c;
        MessageObject messageObject = (MessageObject) bj0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = bj0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
