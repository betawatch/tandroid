package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yj extends g.p {
    public final /* synthetic */ zn c;

    public yj(zn znVar) {
        this.c = znVar;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        zn znVar = this.c;
        lm lmVar = znVar.A0;
        int i12 = lmVar.J;
        return (i10 < i12 || i10 >= lmVar.K || (i11 = i10 - i12) < 0 || i11 >= lmVar.L().size() || (X8 = znVar.X8((messageObject = (MessageObject) znVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
