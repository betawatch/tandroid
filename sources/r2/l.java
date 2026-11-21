package r2;

import a8.la;
import a8.p0;
import c8.k1;
import e2.u;
import h2.l0;
import java.util.ArrayList;
import java.util.Iterator;
import x2.d1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class l implements d1 {
    public final int a;
    public final p b;
    public int c = -1;

    public l(p pVar, int i7) {
        this.b = pVar;
        this.a = i7;
    }

    @Override // x2.d1
    public final void a() {
        int i7 = this.c;
        p pVar = this.b;
        if (i7 == -2) {
            pVar.h();
            throw new androidx.datastore.preferences.protobuf.l(p0.p("Unable to bind a sample queue to TrackGroup with MIME type ", pVar.Z.a(this.a).d[0].s, "."));
        }
        if (i7 == -1) {
            pVar.E();
        } else if (i7 != -3) {
            pVar.E();
            pVar.M[i7].C();
        }
    }

    public final void b() {
        la.f(this.c == -1);
        p pVar = this.b;
        pVar.h();
        pVar.b0.getClass();
        int[] iArr = pVar.b0;
        int i7 = this.a;
        int i10 = iArr[i7];
        if (i10 == -1) {
            if (pVar.a0.contains(pVar.Z.a(i7))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = pVar.e0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.c = i10;
    }

    public final boolean c() {
        int i7 = this.c;
        return (i7 == -1 || i7 == -3 || i7 == -2) ? false : true;
    }

    @Override // x2.d1
    public final boolean h() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i7 = this.c;
        p pVar = this.b;
        return !pVar.C() && pVar.M[i7].A(pVar.k0);
    }

    @Override // x2.d1
    public final int j(long j3) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i7 = this.c;
        p pVar = this.b;
        if (pVar.C()) {
            return 0;
        }
        o oVar = pVar.M[i7];
        int x10 = oVar.x(j3, pVar.k0);
        ArrayList arrayList = pVar.E;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = i5.c.h(1, arrayList);
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
        i iVar = (i) obj;
        if (iVar != null && !iVar.g()) {
            x10 = Math.min(x10, iVar.f(i7) - oVar.v());
        }
        oVar.L(x10);
        return x10;
    }

    @Override // x2.d1
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        u uVar;
        if (this.c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.c;
            p pVar = this.b;
            ArrayList arrayList = pVar.E;
            if (!pVar.C()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((i) arrayList.get(i12)).w;
                        int length = pVar.M.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (pVar.e0[i14] && pVar.M[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    l0.X(0, i12, arrayList);
                    i iVar = (i) arrayList.get(0);
                    u uVar2 = iVar.d;
                    if (!uVar2.equals(pVar.X)) {
                        pVar.w.j(pVar.b, uVar2, iVar.e, iVar.f, iVar.h);
                    }
                    pVar.X = uVar2;
                }
                if (arrayList.isEmpty() || ((i) arrayList.get(0)).g()) {
                    int F = pVar.M[i10].F(aVar, hVar, i7, pVar.k0);
                    if (F == -5) {
                        u uVar3 = (u) aVar.c;
                        uVar3.getClass();
                        if (i10 == pVar.S) {
                            int b10 = k1.b(pVar.M[i10].E());
                            while (i11 < arrayList.size() && ((i) arrayList.get(i11)).w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                uVar = ((i) arrayList.get(i11)).d;
                            } else {
                                uVar = pVar.W;
                                uVar.getClass();
                            }
                            uVar3 = uVar3.d(uVar);
                        }
                        aVar.c = uVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
