package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class wj extends g.p {
    public final /* synthetic */ yn c;

    public wj(yn ynVar) {
        this.c = ynVar;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages Y8;
        yn ynVar = this.c;
        jm jmVar = ynVar.y0;
        int i12 = jmVar.J;
        return (i10 < i12 || i10 >= jmVar.K || (i11 = i10 - i12) < 0 || i11 >= jmVar.L().size() || (Y8 = ynVar.Y8((messageObject = (MessageObject) ynVar.y0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : Y8.getPosition(messageObject).spanSize;
    }
}
