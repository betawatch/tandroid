package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sk extends eq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ wm c;

    public sk(wm wmVar, ArrayList arrayList, boolean[] zArr) {
        this.c = wmVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.messenger.cc j(int i3) {
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Gb(i10, arrayList, z10, z11);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean x(int i3) {
        return this.b[i3];
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        return i3;
    }
}
