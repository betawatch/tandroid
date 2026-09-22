package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
