package v2;

import android.util.SparseArray;
import b2.x;
import c3.b0;
import c3.i0;
import c3.o;
import c3.q;
import c3.s;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e implements q {
    public static final s v = new s();
    public final o a;
    public final int b;
    public final x c;
    public final SparseArray d = new SparseArray();
    public final d e = d.a;
    public boolean f;
    public n6.o h;
    public long n;
    public b0 r;
    public x[] s;

    public e(o oVar, int i10, x xVar) {
        this.a = oVar;
        this.b = i10;
        this.c = xVar;
    }

    @Override // c3.q
    public final void D() {
        SparseArray sparseArray = this.d;
        x[] xVarArr = new x[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            x xVar = ((c) sparseArray.valueAt(i10)).e;
            xVar.getClass();
            xVarArr[i10] = xVar;
        }
        this.s = xVarArr;
    }

    @Override // c3.q
    public final void K(b0 b0Var) {
        this.r = b0Var;
    }

    public final c3.j a() {
        b0 b0Var = this.r;
        if (b0Var instanceof c3.j) {
            return (c3.j) b0Var;
        }
        if (b0Var instanceof u3.d) {
            return ((u3.d) b0Var).a;
        }
        return null;
    }

    @Override // c3.q
    public final i0 a0(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            u6.p(this.s == null);
            cVar = new c(i10, i11, i11 == this.b ? this.c : null, this.e);
            n6.o oVar = this.h;
            long j10 = this.n;
            if (oVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j10;
                i0 g02 = oVar.g0(i11);
                cVar.f = g02;
                x xVar = cVar.e;
                if (xVar != null) {
                    g02.b(xVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    public final void b(n6.o oVar, long j10, long j11) {
        this.h = oVar;
        this.n = j11;
        boolean z10 = this.f;
        o oVar2 = this.a;
        if (!z10) {
            oVar2.c(this);
            if (j10 != -9223372036854775807L) {
                oVar2.d(0L, j10);
            }
            this.f = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        oVar2.d(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i10);
            if (oVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j11;
                i0 g02 = oVar.g0(cVar.a);
                cVar.f = g02;
                x xVar = cVar.e;
                if (xVar != null) {
                    g02.b(xVar);
                }
            }
            i10++;
        }
    }
}
