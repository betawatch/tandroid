package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wx implements org.telegram.ui.Components.y4 {
    public final /* synthetic */ py a;

    public wx(py pyVar) {
        this.a = pyVar;
    }

    @Override // org.telegram.ui.Components.y4
    public final void I(int i10, int i11, boolean z4) {
        py pyVar = this.a;
        ArrayList arrayList = pyVar.F2;
        pyVar.H2 = i10;
        pyVar.I2 = i11;
        if (pyVar.z2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        pyVar.z2.v(pyVar, arrayList2, pyVar.y1.getFieldText(), false, z4, i10, i11, null);
    }
}
