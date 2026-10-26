package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sj extends g.o {
    public final /* synthetic */ un c;

    public sj(un unVar) {
        this.c = unVar;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages h92;
        un unVar = this.c;
        fm fmVar = unVar.A0;
        int i12 = fmVar.J;
        return (i10 < i12 || i10 >= fmVar.K || (i11 = i10 - i12) < 0 || i11 >= fmVar.L().size() || (h92 = unVar.h9((messageObject = (MessageObject) unVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : h92.getPosition(messageObject).spanSize;
    }
}
