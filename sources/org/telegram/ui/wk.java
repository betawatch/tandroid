package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wk extends nq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ an c;

    public wk(an anVar, ArrayList arrayList, boolean[] zArr) {
        this.c = anVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.messenger.jc j(int i7) {
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Gb(i10, arrayList, z9, z10);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        return this.b[i7];
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
