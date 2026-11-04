package x2;

import android.util.SparseArray;
import b8.zb;
import d2.v;
import e3.b0;
import e3.i0;
import e3.o;
import e3.q;
import e3.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements q {
    public static final s w = new s();
    public final o a;
    public final int b;
    public final v c;
    public final SparseArray d = new SparseArray();
    public final d e = d.a;
    public boolean f;
    public ua.b h;
    public long n;
    public b0 r;
    public v[] s;

    public e(o oVar, int i3, v vVar) {
        this.a = oVar;
        this.b = i3;
        this.c = vVar;
    }

    @Override // e3.q
    public final void L() {
        SparseArray sparseArray = this.d;
        v[] vVarArr = new v[sparseArray.size()];
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            v vVar = ((c) sparseArray.valueAt(i3)).e;
            vVar.getClass();
            vVarArr[i3] = vVar;
        }
        this.s = vVarArr;
    }

    public final e3.j a() {
        b0 b0Var = this.r;
        if (b0Var instanceof e3.j) {
            return (e3.j) b0Var;
        }
        if (b0Var instanceof w3.d) {
            return ((w3.d) b0Var).a;
        }
        return null;
    }

    public final void b(ua.b bVar, long j10, long j11) {
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
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i3 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i3);
            if (bVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j11;
                i0 c2 = bVar.c(cVar.a);
                cVar.f = c2;
                v vVar = cVar.e;
                if (vVar != null) {
                    c2.g(vVar);
                }
            }
            i3++;
        }
    }

    @Override // e3.q
    public final void f(b0 b0Var) {
        this.r = b0Var;
    }

    @Override // e3.q
    public final i0 i0(int i3, int i10) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i3);
        if (cVar == null) {
            zb.p(this.s == null);
            cVar = new c(i3, i10, i10 == this.b ? this.c : null, this.e);
            ua.b bVar = this.h;
            long j10 = this.n;
            if (bVar == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j10;
                i0 c2 = bVar.c(i10);
                cVar.f = c2;
                v vVar = cVar.e;
                if (vVar != null) {
                    c2.g(vVar);
                }
            }
            sparseArray.put(i3, cVar);
        }
        return cVar;
    }
}
