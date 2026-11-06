package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class s6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public s6(long j3) {
        this.a = j3;
    }

    public final void a(ci.b bVar, int i7) {
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

    public final void b(ci.b bVar) {
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
