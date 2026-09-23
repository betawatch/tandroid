package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yx implements org.telegram.ui.Components.d5 {
    public final /* synthetic */ ry a;

    public yx(ry ryVar) {
        this.a = ryVar;
    }

    @Override // org.telegram.ui.Components.d5
    public final void J(int i10, int i11, boolean z10) {
        ry ryVar = this.a;
        ArrayList arrayList = ryVar.I2;
        ryVar.K2 = i10;
        ryVar.L2 = i11;
        if (ryVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        ryVar.C2.u(ryVar, arrayList2, ryVar.B1.getFieldText(), false, z10, i10, i11, null);
    }
}
