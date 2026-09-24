package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class si0 extends g.p {
    public final /* synthetic */ vi0 c;

    public si0(vi0 vi0Var) {
        this.c = vi0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        vi0 vi0Var = this.c;
        MessageObject messageObject = (MessageObject) vi0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = vi0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
