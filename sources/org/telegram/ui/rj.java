package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class rj extends g.o {
    public final /* synthetic */ sn c;

    public rj(sn snVar) {
        this.c = snVar;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        sn snVar = this.c;
        em emVar = snVar.A0;
        int i12 = emVar.J;
        return (i10 < i12 || i10 >= emVar.K || (i11 = i10 - i12) < 0 || i11 >= emVar.L().size() || (c92 = snVar.c9((messageObject = (MessageObject) snVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : c92.getPosition(messageObject).spanSize;
    }
}
