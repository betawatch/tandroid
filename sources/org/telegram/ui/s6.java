package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public s6(long j3) {
        this.a = j3;
    }

    public final void a(ai.b bVar, int i10) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i10, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i10, t6Var);
        }
        long j3 = bVar.c;
        t6Var.a += j3;
        this.c += j3;
        this.b++;
        t6Var.b.add(bVar);
    }

    public final void b(ai.b bVar) {
        t6 t6Var = (t6) this.d.get(bVar.d, null);
        if (t6Var != null && t6Var.b.remove(bVar)) {
            long j3 = t6Var.a;
            long j10 = bVar.c;
            t6Var.a = j3 - j10;
            this.c -= j10;
            this.b--;
        }
    }
}
