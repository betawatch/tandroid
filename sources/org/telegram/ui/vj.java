package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class vj extends g.p {
    public final /* synthetic */ wn c;

    public vj(wn wnVar) {
        this.c = wnVar;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        wn wnVar = this.c;
        jm jmVar = wnVar.A0;
        int i12 = jmVar.J;
        return (i10 < i12 || i10 >= jmVar.K || (i11 = i10 - i12) < 0 || i11 >= jmVar.L().size() || (X8 = wnVar.X8((messageObject = (MessageObject) wnVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
