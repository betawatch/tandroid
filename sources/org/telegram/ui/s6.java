package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public s6(long j10) {
        this.a = j10;
    }

    public final void a(sh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i10, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i10, t6Var);
        }
        long j10 = aVar.c;
        t6Var.a += j10;
        this.c += j10;
        this.b++;
        t6Var.b.add(aVar);
    }

    public final void b(sh.a aVar) {
        t6 t6Var = (t6) this.d.get(aVar.d, null);
        if (t6Var != null && t6Var.b.remove(aVar)) {
            long j10 = t6Var.a;
            long j11 = aVar.c;
            t6Var.a = j10 - j11;
            this.c -= j11;
            this.b--;
        }
    }
}
