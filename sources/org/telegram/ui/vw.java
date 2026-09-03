package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vw implements f70 {
    public final /* synthetic */ qy a;

    public vw(qy qyVar) {
        this.a = qyVar;
    }

    @Override // org.telegram.ui.f70
    public final void a(g70 g70Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        qy qyVar = this.a;
        ky kyVar = qyVar.z2;
        if (qyVar.y2) {
            qyVar.removeSelfFromStack();
        }
        kyVar.w(qyVar, arrayList, null, true, qyVar.G2, qyVar.H2, qyVar.I2, null);
    }
}
