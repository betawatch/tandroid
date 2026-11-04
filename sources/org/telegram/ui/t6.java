package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public t6(long j10) {
        this.a = j10;
    }

    public final void a(di.b bVar, int i3) {
        SparseArray sparseArray = this.d;
        u6 u6Var = (u6) sparseArray.get(i3, null);
        if (u6Var == null) {
            u6Var = new u6();
            sparseArray.put(i3, u6Var);
        }
        long j10 = bVar.c;
        u6Var.a += j10;
        this.c += j10;
        this.b++;
        u6Var.b.add(bVar);
    }

    public final void b(di.b bVar) {
        u6 u6Var = (u6) this.d.get(bVar.d, null);
        if (u6Var != null && u6Var.b.remove(bVar)) {
            long j10 = u6Var.a;
            long j11 = bVar.c;
            u6Var.a = j10 - j11;
            this.c -= j11;
            this.b--;
        }
    }
}
