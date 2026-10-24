package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
