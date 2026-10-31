package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sl extends yr0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ un c;

    public sl(un unVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = unVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.messenger.kc j(int i10) {
        return new org.telegram.messenger.kc(this.a, null, 0);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        this.c.t((org.telegram.messenger.ef) this.b.get(0), x20Var, z10, i11, 0, z11, 0L);
    }
}
