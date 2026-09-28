package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class uw implements f70 {
    public final /* synthetic */ qy a;

    public uw(qy qyVar) {
        this.a = qyVar;
    }

    @Override // org.telegram.ui.f70
    public final void a(g70 g70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        qy qyVar = this.a;
        ky kyVar = qyVar.C2;
        if (qyVar.B2) {
            qyVar.removeSelfFromStack();
        }
        kyVar.u(qyVar, arrayList, null, true, qyVar.J2, qyVar.K2, qyVar.L2, null);
    }
}
