package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public s6(long j3) {
        this.a = j3;
    }

    public final void a(ei.b bVar, int i7) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i7, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i7, t6Var);
        }
        long j3 = bVar.c;
        t6Var.a += j3;
        this.c += j3;
        this.b++;
        t6Var.b.add(bVar);
    }

    public final void b(ei.b bVar) {
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
