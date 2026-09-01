package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qi0 extends f2.v {
    public final /* synthetic */ ti0 c;

    public qi0(ti0 ti0Var) {
        this.c = ti0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        ti0 ti0Var = this.c;
        MessageObject messageObject = (MessageObject) ti0Var.K.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l10 = ti0Var.l(messageObject);
        return l10 != null ? l10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
