package q4;

import android.util.SparseArray;
import j3.n0;
import n7.qa;
import org.telegram.ui.Components.jb;
import r3.s;
import r3.v;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d implements r3.m {
    public static final jb s = new jb();
    public final r3.k a;
    public final int b;
    public final n0 c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public qa f;
    public long h;
    public s n;
    public n0[] r;

    public d(r3.k kVar, int i10, n0 n0Var) {
        this.a = kVar;
        this.b = i10;
        this.c = n0Var;
    }

    public final void a(qa qaVar, long j10, long j11) {
        this.f = qaVar;
        this.h = j11;
        boolean z4 = this.e;
        r3.k kVar = this.a;
        if (!z4) {
            kVar.e(this);
            if (j10 != -9223372036854775807L) {
                kVar.d(0L, j10);
            }
            this.e = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.d(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i10);
            if (qaVar == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j11;
                v M0 = qaVar.M0(cVar.a);
                cVar.e = M0;
                n0 n0Var = cVar.d;
                if (n0Var != null) {
                    M0.b(n0Var);
                }
            }
            i10++;
        }
    }

    @Override // r3.m
    public final v d2(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            h5.a.i(this.r == null);
            cVar = new c(i10, i11, i11 == this.b ? this.c : null);
            qa qaVar = this.f;
            long j10 = this.h;
            if (qaVar == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j10;
                v M0 = qaVar.M0(i11);
                cVar.e = M0;
                n0 n0Var = cVar.d;
                if (n0Var != null) {
                    M0.b(n0Var);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override // r3.m
    public final void h2(s sVar) {
        this.n = sVar;
    }

    @Override // r3.m
    public final void j1() {
        SparseArray sparseArray = this.d;
        n0[] n0VarArr = new n0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            n0 n0Var = ((c) sparseArray.valueAt(i10)).d;
            h5.a.j(n0Var);
            n0VarArr[i10] = n0Var;
        }
        this.r = n0VarArr;
    }
}
