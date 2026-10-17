package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class v6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public v6(long j10) {
        this.a = j10;
    }

    public final void a(bi.b bVar, int i10) {
        SparseArray sparseArray = this.d;
        w6 w6Var = (w6) sparseArray.get(i10, null);
        if (w6Var == null) {
            w6Var = new w6();
            sparseArray.put(i10, w6Var);
        }
        long j10 = bVar.c;
        w6Var.a += j10;
        this.c += j10;
        this.b++;
        w6Var.b.add(bVar);
    }

    public final void b(bi.b bVar) {
        w6 w6Var = (w6) this.d.get(bVar.d, null);
        if (w6Var != null && w6Var.b.remove(bVar)) {
            long j10 = w6Var.a;
            long j11 = bVar.c;
            w6Var.a = j10 - j11;
            this.c -= j11;
            this.b--;
        }
    }
}
