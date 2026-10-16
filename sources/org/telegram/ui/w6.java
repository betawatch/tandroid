package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class w6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public w6(long j10) {
        this.a = j10;
    }

    public final void a(ai.b bVar, int i10) {
        SparseArray sparseArray = this.d;
        x6 x6Var = (x6) sparseArray.get(i10, null);
        if (x6Var == null) {
            x6Var = new x6();
            sparseArray.put(i10, x6Var);
        }
        long j10 = bVar.c;
        x6Var.a += j10;
        this.c += j10;
        this.b++;
        x6Var.b.add(bVar);
    }

    public final void b(ai.b bVar) {
        x6 x6Var = (x6) this.d.get(bVar.d, null);
        if (x6Var != null && x6Var.b.remove(bVar)) {
            long j10 = x6Var.a;
            long j11 = bVar.c;
            x6Var.a = j10 - j11;
            this.c -= j11;
            this.b--;
        }
    }
}
