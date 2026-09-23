package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vj extends g.p {
    public final /* synthetic */ xn c;

    public vj(xn xnVar) {
        this.c = xnVar;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        xn xnVar = this.c;
        km kmVar = xnVar.A0;
        int i12 = kmVar.J;
        return (i10 < i12 || i10 >= kmVar.K || (i11 = i10 - i12) < 0 || i11 >= kmVar.L().size() || (X8 = xnVar.X8((messageObject = (MessageObject) xnVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
