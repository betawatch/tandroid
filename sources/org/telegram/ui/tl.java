package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tl extends xr0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ un c;

    public tl(un unVar, ArrayList arrayList, boolean[] zArr) {
        this.c = unVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.messenger.lc j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Bb(i11, arrayList, z10, z11);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        return i10;
    }
}
