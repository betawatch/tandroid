package y2;

import a8.ia;
import android.util.SparseArray;
import e2.u;
import f3.c0;
import f3.j0;
import f3.o;
import f3.q;
import f3.s;
import sg.i0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e implements q {
    public static final s w = new s();
    public final o a;
    public final int b;
    public final u c;
    public final SparseArray d = new SparseArray();
    public final d e = d.a;
    public boolean f;
    public i0 h;
    public long n;
    public c0 r;
    public u[] s;

    public e(o oVar, int i7, u uVar) {
        this.a = oVar;
        this.b = i7;
        this.c = uVar;
    }

    @Override // f3.q
    public final j0 O1(int i7, int i10) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            ia.p(this.s == null);
            cVar = new c(i7, i10, i10 == this.b ? this.c : null, this.e);
            i0 i0Var = this.h;
            long j3 = this.n;
            if (i0Var == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j3;
                j0 f10 = i0Var.f(i10);
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
    public final void U0() {
        SparseArray sparseArray = this.d;
        u[] uVarArr = new u[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            u uVar = ((c) sparseArray.valueAt(i7)).e;
            uVar.getClass();
            uVarArr[i7] = uVar;
        }
        this.s = uVarArr;
    }

    public final f3.j a() {
        c0 c0Var = this.r;
        if (c0Var instanceof f3.j) {
            return (f3.j) c0Var;
        }
        if (c0Var instanceof x3.d) {
            return ((x3.d) c0Var).a;
        }
        return null;
    }

    public final void b(i0 i0Var, long j3, long j10) {
        this.h = i0Var;
        this.n = j10;
        boolean z9 = this.f;
        o oVar = this.a;
        if (!z9) {
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
            if (i0Var == null) {
                cVar.f = cVar.c;
            } else {
                cVar.g = j10;
                j0 f10 = i0Var.f(cVar.a);
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
    public final void f(c0 c0Var) {
        this.r = c0Var;
    }
}
