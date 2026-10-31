package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tl extends yr0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ un c;

    public tl(un unVar, ArrayList arrayList, boolean[] zArr) {
        this.c = unVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.messenger.kc j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.wb(i11, arrayList, z10, z11);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        return i10;
    }
}
