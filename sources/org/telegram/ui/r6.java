package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.a = j3;
    }

    public final void a(ei.b bVar, int i7) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i7, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i7, s6Var);
        }
        long j3 = bVar.c;
        s6Var.a += j3;
        this.c += j3;
        this.b++;
        s6Var.b.add(bVar);
    }

    public final void b(ei.b bVar) {
        s6 s6Var = (s6) this.d.get(bVar.d, null);
        if (s6Var != null && s6Var.b.remove(bVar)) {
            long j3 = s6Var.a;
            long j10 = bVar.c;
            s6Var.a = j3 - j10;
            this.c -= j10;
            this.b--;
        }
    }
}
