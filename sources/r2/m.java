package r2;

import a8.ia;
import a8.p0;
import c8.e1;
import e2.u;
import h2.m0;
import java.util.ArrayList;
import java.util.Iterator;
import x2.c1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class m implements c1 {
    public final int a;
    public final q b;
    public int c = -1;

    public m(q qVar, int i7) {
        this.b = qVar;
        this.a = i7;
    }

    @Override // x2.c1
    public final void a() {
        int i7 = this.c;
        q qVar = this.b;
        if (i7 == -2) {
            qVar.l();
            throw new androidx.datastore.preferences.protobuf.l(p0.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.a).d[0].s, "."));
        }
        if (i7 == -1) {
            qVar.A();
        } else if (i7 != -3) {
            qVar.A();
            qVar.L[i7].C();
        }
    }

    public final void b() {
        ia.f(this.c == -1);
        q qVar = this.b;
        qVar.l();
        qVar.a0.getClass();
        int[] iArr = qVar.a0;
        int i7 = this.a;
        int i10 = iArr[i7];
        if (i10 == -1) {
            if (qVar.Z.contains(qVar.Y.a(i7))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = qVar.d0;
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

    @Override // x2.c1
    public final boolean f() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i7 = this.c;
        q qVar = this.b;
        return !qVar.y() && qVar.L[i7].A(qVar.j0);
    }

    @Override // x2.c1
    public final int l(long j3) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i7 = this.c;
        q qVar = this.b;
        if (qVar.y()) {
            return 0;
        }
        p pVar = qVar.L[i7];
        int x10 = pVar.x(j3, qVar.j0);
        ArrayList arrayList = qVar.D;
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
        j jVar = (j) obj;
        if (jVar != null && !jVar.g()) {
            x10 = Math.min(x10, jVar.f(i7) - pVar.v());
        }
        pVar.L(x10);
        return x10;
    }

    @Override // x2.c1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        u uVar;
        if (this.c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.c;
            q qVar = this.b;
            ArrayList arrayList = qVar.D;
            if (!qVar.y()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((j) arrayList.get(i12)).w;
                        int length = qVar.L.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (qVar.d0[i14] && qVar.L[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    m0.X(0, i12, arrayList);
                    j jVar = (j) arrayList.get(0);
                    u uVar2 = jVar.d;
                    if (!uVar2.equals(qVar.W)) {
                        qVar.w.j(qVar.b, uVar2, jVar.e, jVar.f, jVar.h);
                    }
                    qVar.W = uVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.L[i10].F(bVar, hVar, i7, qVar.j0);
                    if (F == -5) {
                        u uVar3 = (u) bVar.c;
                        uVar3.getClass();
                        if (i10 == qVar.R) {
                            int b10 = e1.b(qVar.L[i10].E());
                            while (i11 < arrayList.size() && ((j) arrayList.get(i11)).w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                uVar = ((j) arrayList.get(i11)).d;
                            } else {
                                uVar = qVar.V;
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
