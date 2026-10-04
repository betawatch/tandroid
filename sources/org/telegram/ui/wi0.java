package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class wi0 extends g.p {
    public final /* synthetic */ zi0 c;

    public wi0(zi0 zi0Var) {
        this.c = zi0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        zi0 zi0Var = this.c;
        MessageObject messageObject = (MessageObject) zi0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = zi0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
