package t4;

import b7.y0;
import h5.d0;
import j3.n0;
import java.util.ArrayList;
import java.util.Iterator;
import k7.y7;
import kh.a2;
import o4.l0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n implements l0 {
    public final int a;
    public final r b;
    public int c = -1;

    public n(r rVar, int i10) {
        this.b = rVar;
        this.a = i10;
    }

    @Override // o4.l0
    public final void a() {
        int i10 = this.c;
        r rVar = this.b;
        if (i10 == -2) {
            rVar.d();
            throw new y0(android.support.v4.media.a.o("Unable to bind a sample queue to TrackGroup with MIME type ", rVar.V.a(this.a).d[0].C, "."));
        }
        if (i10 == -1) {
            rVar.q();
        } else if (i10 != -3) {
            rVar.q();
            rVar.I[i10].w();
        }
    }

    public final void b() {
        h5.a.f(this.c == -1);
        r rVar = this.b;
        rVar.d();
        rVar.X.getClass();
        int[] iArr = rVar.X;
        int i10 = this.a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (rVar.W.contains(rVar.V.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = rVar.a0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.c = i11;
    }

    public final boolean c() {
        int i10 = this.c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // o4.l0
    public final boolean d() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i10 = this.c;
        r rVar = this.b;
        return !rVar.n() && rVar.I[i10].u(rVar.g0);
    }

    @Override // o4.l0
    public final int e(long j10) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i10 = this.c;
        r rVar = this.b;
        if (rVar.n()) {
            return 0;
        }
        q qVar = rVar.I[i10];
        int s6 = qVar.s(j10, rVar.g0);
        ArrayList arrayList = rVar.y;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = a2.i(1, arrayList);
            }
            obj = null;
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            obj = null;
        }
        k kVar = (k) obj;
        if (kVar != null && !kVar.X) {
            s6 = Math.min(s6, kVar.f(i10) - qVar.q());
        }
        qVar.E(s6);
        return s6;
    }

    @Override // o4.l0
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        n0 n0Var;
        if (this.c == -3) {
            iVar.a(4);
            return -4;
        }
        if (c()) {
            int i11 = this.c;
            r rVar = this.b;
            ArrayList arrayList = rVar.y;
            if (!rVar.n()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((k) arrayList.get(i13)).v;
                        int length = rVar.I.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (rVar.a0[i15] && rVar.I[i15].y() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    d0.L(0, i13, arrayList);
                    k kVar = (k) arrayList.get(0);
                    n0 n0Var2 = kVar.d;
                    if (!n0Var2.equals(rVar.T)) {
                        rVar.v.g(rVar.b, n0Var2, kVar.e, kVar.f, kVar.h);
                    }
                    rVar.T = n0Var2;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).X) {
                    int z4 = rVar.I[i11].z(bVar, iVar, i10, rVar.g0);
                    if (z4 == -5) {
                        n0 n0Var3 = (n0) bVar.c;
                        n0Var3.getClass();
                        if (i11 == rVar.O) {
                            int a2 = y7.a(rVar.I[i11].y());
                            while (i12 < arrayList.size() && ((k) arrayList.get(i12)).v != a2) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                n0Var = ((k) arrayList.get(i12)).d;
                            } else {
                                n0Var = rVar.S;
                                n0Var.getClass();
                            }
                            n0Var3 = n0Var3.c(n0Var);
                        }
                        bVar.c = n0Var3;
                    }
                    return z4;
                }
            }
        }
        return -3;
    }
}
