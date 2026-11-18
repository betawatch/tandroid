package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xk extends oq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ bn c;

    public xk(bn bnVar, ArrayList arrayList, boolean[] zArr) {
        this.c = bnVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.hc j(int i7) {
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Kb(i10, arrayList, z10, z11);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        return this.b[i7];
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.e20 e20Var) {
        return i7;
    }
}
