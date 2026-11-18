package y2;

import a8.la;
import android.util.SparseArray;
import e2.u;
import f3.b0;
import f3.i0;
import f3.o;
import f3.q;
import f3.s;
import sg.h0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class e implements q {
    public static final s w = new s();
    public final o a;
    public final int b;
    public final u c;
    public final SparseArray d = new SparseArray();
    public final d e = d.a;
    public boolean f;
    public h0 h;
    public long n;
    public b0 r;
    public u[] s;

    public e(o oVar, int i7, u uVar) {
        this.a = oVar;
        this.b = i7;
        this.c = uVar;
    }

    public final f3.j a() {
        b0 b0Var = this.r;
        if (b0Var instanceof f3.j) {
            return (f3.j) b0Var;
        }
        if (b0Var instanceof x3.d) {
            return ((x3.d) b0Var).a;
        }
        return null;
    }

    public final void b(h0 h0Var, long j3, long j10) {
        this.h = h0Var;
        this.n = j10;
        boolean z10 = this.f;
        o oVar = this.a;
        if (!z10) {
            oVar.c(this);
            if (j3 != -9223372036854775807L) {
                oVar.d(0L, j3);
            }
            this.f = true;
            return;
        }
        if (j3 == -9223372036854775807L) {
            j3 = 0;
        }
        oVar.d(0L, j3);
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i7 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i7);
            if (h0Var == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j10;
                i0 f10 = h0Var.f(cVar.a);
                cVar.f = f10;
                u uVar = cVar.e;
                if (uVar != null) {
                    f10.g(uVar);
                }
            }
            i7++;
        }
    }

    @Override // f3.q
    public final void d1() {
        SparseArray sparseArray = this.d;
        u[] uVarArr = new u[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            u uVar = ((c) sparseArray.valueAt(i7)).e;
            uVar.getClass();
            uVarArr[i7] = uVar;
        }
        this.s = uVarArr;
    }

    @Override // f3.q
    public final i0 d2(int i7, int i10) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            la.p(this.s == null);
            cVar = new c(i7, i10, i10 == this.b ? this.c : null, this.e);
            h0 h0Var = this.h;
            long j3 = this.n;
            if (h0Var == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j3;
                i0 f10 = h0Var.f(i10);
                cVar.f = f10;
                u uVar = cVar.e;
                if (uVar != null) {
                    f10.g(uVar);
                }
            }
            sparseArray.put(i7, cVar);
        }
        return cVar;
    }

    @Override // f3.q
    public final void j(b0 b0Var) {
        this.r = b0Var;
    }
}
