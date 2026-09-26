package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class r6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.c;
        s6Var.a += j3;
        this.c += j3;
        this.b++;
        s6Var.b.add(aVar);
    }

    public final void b(zh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.b.remove(aVar)) {
            long j3 = s6Var.a;
            long j10 = aVar.c;
            s6Var.a = j3 - j10;
            this.c -= j10;
            this.b--;
        }
    }
}
