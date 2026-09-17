package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
