package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zj extends g.p {
    public final /* synthetic */ bo c;

    public zj(bo boVar) {
        this.c = boVar;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        bo boVar = this.c;
        nm nmVar = boVar.A0;
        int i12 = nmVar.J;
        return (i10 < i12 || i10 >= nmVar.K || (i11 = i10 - i12) < 0 || i11 >= nmVar.L().size() || (X8 = boVar.X8((messageObject = (MessageObject) boVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
