package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public t6(long j3) {
        this.a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        u6 u6Var = (u6) sparseArray.get(i10, null);
        if (u6Var == null) {
            u6Var = new u6();
            sparseArray.put(i10, u6Var);
        }
        long j3 = aVar.c;
        u6Var.a += j3;
        this.c += j3;
        this.b++;
        u6Var.b.add(aVar);
    }

    public final void b(zh.a aVar) {
        u6 u6Var = (u6) this.d.get(aVar.d, null);
        if (u6Var != null && u6Var.b.remove(aVar)) {
            long j3 = u6Var.a;
            long j10 = aVar.c;
            u6Var.a = j3 - j10;
            this.c -= j10;
            this.b--;
        }
    }
}
