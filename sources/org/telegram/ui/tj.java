package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class tj extends g.o {
    public final /* synthetic */ sn c;

    public tj(sn snVar) {
        this.c = snVar;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        sn snVar = this.c;
        fm fmVar = snVar.A0;
        int i12 = fmVar.J;
        return (i10 < i12 || i10 >= fmVar.K || (i11 = i10 - i12) < 0 || i11 >= fmVar.L().size() || (c92 = snVar.c9((messageObject = (MessageObject) snVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : c92.getPosition(messageObject).spanSize;
    }
}
