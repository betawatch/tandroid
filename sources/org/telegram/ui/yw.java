package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yw implements k70 {
    public final /* synthetic */ uy a;

    public yw(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.k70
    public final void a(l70 l70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        uy uyVar = this.a;
        oy oyVar = uyVar.C2;
        if (uyVar.B2) {
            uyVar.removeSelfFromStack();
        }
        oyVar.u(uyVar, arrayList, null, true, uyVar.J2, uyVar.K2, uyVar.L2, null);
    }
}
