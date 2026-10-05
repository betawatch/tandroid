package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ww implements j70 {
    public final /* synthetic */ uy a;

    public ww(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.j70
    public final void a(k70 k70Var, long j3) {
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
