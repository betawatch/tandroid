package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class xj extends g.p {
    public final /* synthetic */ zn c;

    public xj(zn znVar) {
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
