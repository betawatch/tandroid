package v2;

import android.util.SparseArray;
import c3.b0;
import c3.h0;
import c3.o;
import c3.q;
import c3.s;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d implements q {
    public static final s s = new s();
    public final o a;
    public final int b;
    public final b2.s c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public o0.a f;
    public long h;
    public b0 n;
    public b2.s[] r;

    public d(o oVar, int i10, b2.s sVar) {
        this.a = oVar;
        this.b = i10;
        this.c = sVar;
    }

    @Override // c3.q
    public final void P1(b0 b0Var) {
        this.n = b0Var;
    }

    @Override // c3.q
    public final h0 R1(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            e2.d.g(this.r == null);
            cVar = new c(i10, i11, i11 == this.b ? this.c : null);
            o0.a aVar = this.f;
            long j3 = this.h;
            if (aVar == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j3;
                h0 U = aVar.U(i11);
                cVar.e = U;
                b2.s sVar = cVar.d;
                if (sVar != null) {
                    U.b(sVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override // c3.q
    public final void Z0() {
        SparseArray sparseArray = this.d;
        b2.s[] sVarArr = new b2.s[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            b2.s sVar = ((c) sparseArray.valueAt(i10)).d;
            e2.d.h(sVar);
            sVarArr[i10] = sVar;
        }
        this.r = sVarArr;
    }

    public final void a(o0.a aVar, long j3, long j10) {
        this.f = aVar;
        this.h = j10;
        boolean z10 = this.e;
        o oVar = this.a;
        if (!z10) {
            oVar.g(this);
            if (j3 != -9223372036854775807L) {
                oVar.h(0L, j3);
            }
            this.e = true;
            return;
        }
        if (j3 == -9223372036854775807L) {
            j3 = 0;
        }
        oVar.h(0L, j3);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i10);
            if (aVar == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j10;
                h0 U = aVar.U(cVar.a);
                cVar.e = U;
                b2.s sVar = cVar.d;
                if (sVar != null) {
                    U.b(sVar);
                }
            }
            i10++;
        }
    }
}
