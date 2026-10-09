package v2;

import android.util.SparseArray;
import c3.b0;
import c3.h0;
import c3.o;
import c3.q;
import c3.s;
import org.telegram.ui.ActionBar.b5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d implements q {
    public static final s s = new s();
    public final o a;
    public final int b;
    public final b2.s c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public b5 f;
    public long h;
    public b0 n;
    public b2.s[] r;

    public d(o oVar, int i10, b2.s sVar) {
        this.a = oVar;
        this.b = i10;
        this.c = sVar;
    }

    public final void a(b5 b5Var, long j3, long j10) {
        this.f = b5Var;
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
            if (b5Var == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j10;
                h0 w10 = b5Var.w(cVar.a);
                cVar.e = w10;
                b2.s sVar = cVar.d;
                if (sVar != null) {
                    w10.b(sVar);
                }
            }
            i10++;
        }
    }

    @Override // c3.q
    public final void d2(b0 b0Var) {
        this.n = b0Var;
    }

    @Override // c3.q
    public final h0 f2(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            e2.d.g(this.r == null);
            cVar = new c(i10, i11, i11 == this.b ? this.c : null);
            b5 b5Var = this.f;
            long j3 = this.h;
            if (b5Var == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j3;
                h0 w10 = b5Var.w(i11);
                cVar.e = w10;
                b2.s sVar = cVar.d;
                if (sVar != null) {
                    w10.b(sVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override // c3.q
    public final void k1() {
        SparseArray sparseArray = this.d;
        b2.s[] sVarArr = new b2.s[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            b2.s sVar = ((c) sparseArray.valueAt(i10)).d;
            e2.d.h(sVar);
            sVarArr[i10] = sVar;
        }
        this.r = sVarArr;
    }
}
