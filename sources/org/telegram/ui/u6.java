package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public u6(long j10) {
        this.a = j10;
    }

    public final void a(nh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        v6 v6Var = (v6) sparseArray.get(i10, null);
        if (v6Var == null) {
            v6Var = new v6();
            sparseArray.put(i10, v6Var);
        }
        long j10 = aVar.c;
        v6Var.a += j10;
        this.c += j10;
        this.b++;
        v6Var.b.add(aVar);
    }

    public final void b(nh.a aVar) {
        v6 v6Var = (v6) this.d.get(aVar.d, null);
        if (v6Var != null && v6Var.b.remove(aVar)) {
            long j10 = v6Var.a;
            long j11 = aVar.c;
            v6Var.a = j10 - j11;
            this.c -= j11;
            this.b--;
        }
    }
}
