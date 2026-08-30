package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uj extends f2.v {
    public final /* synthetic */ xn c;

    public uj(xn xnVar) {
        this.c = xnVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        xn xnVar = this.c;
        jm jmVar = xnVar.x0;
        int i12 = jmVar.G;
        return (i10 < i12 || i10 >= jmVar.H || (i11 = i10 - i12) < 0 || i11 >= jmVar.L().size() || (X8 = xnVar.X8((messageObject = (MessageObject) xnVar.x0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
