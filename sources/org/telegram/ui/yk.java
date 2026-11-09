package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yk extends pq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ cn c;

    public yk(cn cnVar, ArrayList arrayList, boolean[] zArr) {
        this.c = cnVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final org.telegram.messenger.jc j(int i7) {
        return null;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Jb(i10, arrayList, z9, z10);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean x(int i7) {
        return this.b[i7];
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
