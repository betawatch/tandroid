package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yj extends g.p {
    public final /* synthetic */ bo c;

    public yj(bo boVar) {
        this.c = boVar;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        bo boVar = this.c;
        nm nmVar = boVar.A0;
        int i12 = nmVar.J;
        return (i10 < i12 || i10 >= nmVar.K || (i11 = i10 - i12) < 0 || i11 >= nmVar.L().size() || (X8 = boVar.X8((messageObject = (MessageObject) boVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
