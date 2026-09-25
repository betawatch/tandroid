package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
