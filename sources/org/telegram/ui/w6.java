package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public w6(long j10) {
        this.a = j10;
    }

    public final void a(ci.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        x6 x6Var = (x6) sparseArray.get(i10, null);
        if (x6Var == null) {
            x6Var = new x6();
            sparseArray.put(i10, x6Var);
        }
        long j10 = aVar.c;
        x6Var.a += j10;
        this.c += j10;
        this.b++;
        x6Var.b.add(aVar);
    }

    public final void b(ci.a aVar) {
        x6 x6Var = (x6) this.d.get(aVar.d, null);
        if (x6Var != null && x6Var.b.remove(aVar)) {
            long j10 = x6Var.a;
            long j11 = aVar.c;
            x6Var.a = j10 - j11;
            this.c -= j11;
            this.b--;
        }
    }
}
