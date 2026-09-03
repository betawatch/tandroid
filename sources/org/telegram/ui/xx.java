package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xx implements org.telegram.ui.Components.y4 {
    public final /* synthetic */ qy a;

    public xx(qy qyVar) {
        this.a = qyVar;
    }

    @Override // org.telegram.ui.Components.y4
    public final void J(int i10, int i11, boolean z4) {
        qy qyVar = this.a;
        ArrayList arrayList = qyVar.F2;
        qyVar.H2 = i10;
        qyVar.I2 = i11;
        if (qyVar.z2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        qyVar.z2.w(qyVar, arrayList2, qyVar.y1.getFieldText(), false, z4, i10, i11, null);
    }
}
