package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class yx implements org.telegram.ui.Components.d5 {
    public final /* synthetic */ uy a;

    public yx(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.Components.d5
    public final void K(int i10, int i11, boolean z10) {
        uy uyVar = this.a;
        ArrayList arrayList = uyVar.I2;
        uyVar.K2 = i10;
        uyVar.L2 = i11;
        if (uyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        uyVar.C2.u(uyVar, arrayList2, uyVar.B1.getFieldText(), false, z10, i10, i11, null);
    }
}
