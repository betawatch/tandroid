package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vj extends g.o {
    public final /* synthetic */ wn c;

    public vj(wn wnVar) {
        this.c = wnVar;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages k92;
        wn wnVar = this.c;
        hm hmVar = wnVar.A0;
        int i12 = hmVar.J;
        return (i10 < i12 || i10 >= hmVar.K || (i11 = i10 - i12) < 0 || i11 >= hmVar.L().size() || (k92 = wnVar.k9((messageObject = (MessageObject) wnVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : k92.getPosition(messageObject).spanSize;
    }
}
