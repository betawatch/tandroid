package v2;

import a8.yb;
import android.util.SparseArray;
import b2.x;
import c3.b0;
import c3.j0;
import c3.o;
import c3.q;
import c3.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e implements q {
    public static final s v = new s();
    public final o a;
    public final int b;
    public final x c;
    public final SparseArray d = new SparseArray();
    public final d e = d.a;
    public boolean f;
    public m4.c h;
    public long n;
    public b0 r;
    public x[] s;

    public e(o oVar, int i10, x xVar) {
        this.a = oVar;
        this.b = i10;
        this.c = xVar;
    }

    @Override // c3.q
    public final void D1(b0 b0Var) {
        this.r = b0Var;
    }

    @Override // c3.q
    public final j0 F1(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            yb.p(this.s == null);
            cVar = new c(i10, i11, i11 == this.b ? this.c : null, this.e);
            m4.c cVar2 = this.h;
            long j10 = this.n;
            if (cVar2 == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j10;
                j0 B0 = cVar2.B0(i11);
                cVar.f = B0;
                x xVar = cVar.e;
                if (xVar != null) {
                    B0.b(xVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override // c3.q
    public final void Q0() {
        SparseArray sparseArray = this.d;
        x[] xVarArr = new x[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            x xVar = ((c) sparseArray.valueAt(i10)).e;
            xVar.getClass();
            xVarArr[i10] = xVar;
        }
        this.s = xVarArr;
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

    public final void b(m4.c cVar, long j10, long j11) {
        this.h = cVar;
        this.n = j11;
        boolean z10 = this.f;
        o oVar = this.a;
        if (!z10) {
            oVar.c(this);
            if (j10 != -9223372036854775807L) {
                oVar.d(0L, j10);
            }
            this.f = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        oVar.d(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar2 = (c) sparseArray.valueAt(i10);
            if (cVar == null) {
                cVar2.f = cVar2.c;
            } else {
                cVar2.g = j11;
                j0 B0 = cVar.B0(cVar2.a);
                cVar2.f = B0;
                x xVar = cVar2.e;
                if (xVar != null) {
                    B0.b(xVar);
                }
            }
            i10++;
        }
    }
}
