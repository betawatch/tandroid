package v2;

import android.util.SparseArray;
import b2.w;
import c3.c0;
import c3.j0;
import c3.o;
import c3.q;
import c3.s;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class e implements q {
    public static final s v = new s();
    public final o a;
    public final int b;
    public final w c;
    public final SparseArray d = new SparseArray();
    public final d e = d.a;
    public boolean f;
    public n2.e h;
    public long n;
    public c0 r;
    public w[] s;

    public e(o oVar, int i10, w wVar) {
        this.a = oVar;
        this.b = i10;
        this.c = wVar;
    }

    @Override // c3.q
    public final void H() {
        SparseArray sparseArray = this.d;
        w[] wVarArr = new w[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            w wVar = ((c) sparseArray.valueAt(i10)).e;
            wVar.getClass();
            wVarArr[i10] = wVar;
        }
        this.s = wVarArr;
    }

    public final c3.j a() {
        c0 c0Var = this.r;
        if (c0Var instanceof c3.j) {
            return (c3.j) c0Var;
        }
        if (c0Var instanceof u3.d) {
            return ((u3.d) c0Var).a;
        }
        return null;
    }

    public final void b(n2.e eVar, long j10, long j11) {
        this.h = eVar;
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
            if (eVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j11;
                j0 r02 = eVar.r0(cVar.a);
                cVar.f = r02;
                w wVar = cVar.e;
                if (wVar != null) {
                    r02.b(wVar);
                }
            }
            i10++;
        }
    }

    @Override // c3.q
    public final void g0(c0 c0Var) {
        this.r = c0Var;
    }

    @Override // c3.q
    public final j0 j0(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            u6.p(this.s == null);
            cVar = new c(i10, i11, i11 == this.b ? this.c : null, this.e);
            n2.e eVar = this.h;
            long j10 = this.n;
            if (eVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j10;
                j0 r02 = eVar.r0(i11);
                cVar.f = r02;
                w wVar = cVar.e;
                if (wVar != null) {
                    r02.b(wVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }
}
