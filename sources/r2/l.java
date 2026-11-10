package r2;

import a8.ia;
import a8.p0;
import c8.e1;
import e2.u;
import h2.m0;
import java.util.ArrayList;
import java.util.Iterator;
import x2.b1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class l implements b1 {
    public final int a;
    public final p b;
    public int c = -1;

    public l(p pVar, int i7) {
        this.b = pVar;
        this.a = i7;
    }

    @Override // x2.b1
    public final void a() {
        int i7 = this.c;
        p pVar = this.b;
        if (i7 == -2) {
            pVar.l();
            throw new androidx.datastore.preferences.protobuf.l(p0.p("Unable to bind a sample queue to TrackGroup with MIME type ", pVar.Y.a(this.a).d[0].s, "."));
        }
        if (i7 == -1) {
            pVar.A();
        } else if (i7 != -3) {
            pVar.A();
            pVar.L[i7].C();
        }
    }

    public final void b() {
        ia.f(this.c == -1);
        p pVar = this.b;
        pVar.l();
        pVar.a0.getClass();
        int[] iArr = pVar.a0;
        int i7 = this.a;
        int i10 = iArr[i7];
        if (i10 == -1) {
            if (pVar.Z.contains(pVar.Y.a(i7))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = pVar.d0;
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

    @Override // x2.b1
    public final boolean f() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i7 = this.c;
        p pVar = this.b;
        return !pVar.y() && pVar.L[i7].A(pVar.j0);
    }

    @Override // x2.b1
    public final int l(long j3) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i7 = this.c;
        p pVar = this.b;
        if (pVar.y()) {
            return 0;
        }
        o oVar = pVar.L[i7];
        int x10 = oVar.x(j3, pVar.j0);
        ArrayList arrayList = pVar.D;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = jg.g.i(1, arrayList);
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

    @Override // x2.b1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        u uVar;
        if (this.c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.c;
            p pVar = this.b;
            ArrayList arrayList = pVar.D;
            if (!pVar.y()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((i) arrayList.get(i12)).w;
                        int length = pVar.L.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (pVar.d0[i14] && pVar.L[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    m0.X(0, i12, arrayList);
                    i iVar = (i) arrayList.get(0);
                    u uVar2 = iVar.d;
                    if (!uVar2.equals(pVar.W)) {
                        pVar.w.j(pVar.b, uVar2, iVar.e, iVar.f, iVar.h);
                    }
                    pVar.W = uVar2;
                }
                if (arrayList.isEmpty() || ((i) arrayList.get(0)).g()) {
                    int F = pVar.L[i10].F(bVar, hVar, i7, pVar.j0);
                    if (F == -5) {
                        u uVar3 = (u) bVar.c;
                        uVar3.getClass();
                        if (i10 == pVar.R) {
                            int b10 = e1.b(pVar.L[i10].E());
                            while (i11 < arrayList.size() && ((i) arrayList.get(i11)).w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                uVar = ((i) arrayList.get(i11)).d;
                            } else {
                                uVar = pVar.V;
                                uVar.getClass();
                            }
                            uVar3 = uVar3.d(uVar);
                        }
                        bVar.c = uVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
