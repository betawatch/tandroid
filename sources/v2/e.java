package v2;

import android.util.SparseArray;
import b2.x;
import c3.b0;
import c3.i0;
import c3.o;
import c3.q;
import c3.s;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class e implements q {
    public static final s v = new s();
    public final o a;
    public final int b;
    public final x c;
    public final SparseArray d = new SparseArray();
    public final d e = d.a;
    public boolean f;
    public n3.b h;
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

    @Override // c3.q
    public final i0 W(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            u6.p(this.s == null);
            cVar = new c(i10, i11, i11 == this.b ? this.c : null, this.e);
            n3.b bVar = this.h;
            long j10 = this.n;
            if (bVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j10;
                i0 j02 = bVar.j0(i11);
                cVar.f = j02;
                x xVar = cVar.e;
                if (xVar != null) {
                    j02.b(xVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
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

    public final void b(n3.b bVar, long j10, long j11) {
        this.h = bVar;
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
            c cVar = (c) sparseArray.valueAt(i10);
            if (bVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j11;
                i0 j02 = bVar.j0(cVar.a);
                cVar.f = j02;
                x xVar = cVar.e;
                if (xVar != null) {
                    j02.b(xVar);
                }
            }
            i10++;
        }
    }
}
