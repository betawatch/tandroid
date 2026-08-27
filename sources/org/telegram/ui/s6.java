package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public s6(long j10) {
        this.a = j10;
    }

    public final void a(ih.a aVar, int i10) {
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

    public final void b(ih.a aVar) {
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
