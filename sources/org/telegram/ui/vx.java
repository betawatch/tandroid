package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vx implements org.telegram.ui.Components.y4 {
    public final /* synthetic */ oy a;

    public vx(oy oyVar) {
        this.a = oyVar;
    }

    @Override // org.telegram.ui.Components.y4
    public final void J(int i10, int i11, boolean z4) {
        oy oyVar = this.a;
        ArrayList arrayList = oyVar.F2;
        oyVar.H2 = i10;
        oyVar.I2 = i11;
        if (oyVar.z2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        oyVar.z2.w(oyVar, arrayList2, oyVar.y1.getFieldText(), false, z4, i10, i11, null);
    }
}
