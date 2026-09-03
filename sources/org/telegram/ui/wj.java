package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wj extends f2.v {
    public final /* synthetic */ zn c;

    public wj(zn znVar) {
        this.c = znVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        zn znVar = this.c;
        lm lmVar = znVar.x0;
        int i12 = lmVar.G;
        return (i10 < i12 || i10 >= lmVar.H || (i11 = i10 - i12) < 0 || i11 >= lmVar.L().size() || (X8 = znVar.X8((messageObject = (MessageObject) znVar.x0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
