package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class yj extends g.p {
    public final /* synthetic */ co c;

    public yj(co coVar) {
        this.c = coVar;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        co coVar = this.c;
        om omVar = coVar.A0;
        int i12 = omVar.J;
        return (i10 < i12 || i10 >= omVar.K || (i11 = i10 - i12) < 0 || i11 >= omVar.L().size() || (X8 = coVar.X8((messageObject = (MessageObject) coVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
