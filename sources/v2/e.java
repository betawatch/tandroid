package v2;

import android.util.SparseArray;
import b2.w;
import c3.e0;
import c3.l0;
import c3.q;
import c3.s;
import c3.u;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e implements s {
    public static final u v = new u();
    public final q a;
    public final int b;
    public final w c;
    public final SparseArray d = new SparseArray();
    public final d e = d.a;
    public boolean f;
    public n2.e h;
    public long n;
    public e0 r;
    public w[] s;

    public e(q qVar, int i10, w wVar) {
        this.a = qVar;
        this.b = i10;
        this.c = wVar;
    }

    @Override // c3.s
    public final void C() {
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
        e0 e0Var = this.r;
        if (e0Var instanceof c3.j) {
            return (c3.j) e0Var;
        }
        if (e0Var instanceof u3.d) {
            return ((u3.d) e0Var).a;
        }
        return null;
    }

    public final void b(n2.e eVar, long j10, long j11) {
        this.h = eVar;
        this.n = j11;
        boolean z10 = this.f;
        q qVar = this.a;
        if (!z10) {
            qVar.c(this);
            if (j10 != -9223372036854775807L) {
                qVar.d(0L, j10);
            }
            this.f = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        qVar.d(0L, j10);
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
                l0 V = eVar.V(cVar.a);
                cVar.f = V;
                w wVar = cVar.e;
                if (wVar != null) {
                    V.b(wVar);
                }
            }
            i10++;
        }
    }

    @Override // c3.s
    public final void g0(e0 e0Var) {
        this.r = e0Var;
    }

    @Override // c3.s
    public final l0 j0(int i10, int i11) {
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
                l0 V = eVar.V(i11);
                cVar.f = V;
                w wVar = cVar.e;
                if (wVar != null) {
                    V.b(wVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }
}
