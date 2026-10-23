package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class rj extends g.o {
    public final /* synthetic */ qn c;

    public rj(qn qnVar) {
        this.c = qnVar;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        qn qnVar = this.c;
        dm dmVar = qnVar.A0;
        int i12 = dmVar.J;
        return (i10 < i12 || i10 >= dmVar.K || (i11 = i10 - i12) < 0 || i11 >= dmVar.L().size() || (c92 = qnVar.c9((messageObject = (MessageObject) qnVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : c92.getPosition(messageObject).spanSize;
    }
}
