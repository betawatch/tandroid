package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ri0 extends f2.v {
    public final /* synthetic */ ui0 c;

    public ri0(ui0 ui0Var) {
        this.c = ui0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        ui0 ui0Var = this.c;
        MessageObject messageObject = (MessageObject) ui0Var.K.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l10 = ui0Var.l(messageObject);
        return l10 != null ? l10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
