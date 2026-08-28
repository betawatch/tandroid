package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public r6(long j10) {
        this.a = j10;
    }

    public final void a(hh.a aVar, int i9) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i9, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i9, s6Var);
        }
        long j10 = aVar.c;
        s6Var.a += j10;
        this.c += j10;
        this.b++;
        s6Var.b.add(aVar);
    }

    public final void b(hh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.b.remove(aVar)) {
            long j10 = s6Var.a;
            long j11 = aVar.c;
            s6Var.a = j10 - j11;
            this.c -= j11;
            this.b--;
        }
    }
}
