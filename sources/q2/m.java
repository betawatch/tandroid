package q2;

import b8.od;
import b8.zb;
import d2.v;
import g2.n0;
import java.util.ArrayList;
import java.util.Iterator;
import k2.p1;
import w2.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements d1 {
    public final int a;
    public final q b;
    public int c = -1;

    public m(q qVar, int i3) {
        this.b = qVar;
        this.a = i3;
    }

    @Override // w2.d1
    public final void a() {
        int i3 = this.c;
        q qVar = this.b;
        if (i3 == -2) {
            qVar.m();
            throw new androidx.datastore.preferences.protobuf.l(a1.g.q("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Z.a(this.a).d[0].s, "."));
        }
        if (i3 == -1) {
            qVar.C();
        } else if (i3 != -3) {
            qVar.C();
            qVar.M[i3].C();
        }
    }

    public final void b() {
        zb.f(this.c == -1);
        q qVar = this.b;
        qVar.m();
        qVar.b0.getClass();
        int[] iArr = qVar.b0;
        int i3 = this.a;
        int i10 = iArr[i3];
        if (i10 == -1) {
            if (qVar.a0.contains(qVar.Z.a(i3))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = qVar.e0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.c = i10;
    }

    public final boolean c() {
        int i3 = this.c;
        return (i3 == -1 || i3 == -3 || i3 == -2) ? false : true;
    }

    @Override // w2.d1
    public final boolean f() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i3 = this.c;
        q qVar = this.b;
        return !qVar.A() && qVar.M[i3].A(qVar.k0);
    }

    @Override // w2.d1
    public final int m(long j10) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i3 = this.c;
        q qVar = this.b;
        if (qVar.A()) {
            return 0;
        }
        p pVar = qVar.M[i3];
        int x10 = pVar.x(j10, qVar.k0);
        ArrayList arrayList = qVar.E;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = p1.h(1, arrayList);
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
            x10 = Math.min(x10, jVar.f(i3) - pVar.v());
        }
        pVar.L(x10);
        return x10;
    }

    @Override // w2.d1
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        v vVar;
        if (this.c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.c;
            q qVar = this.b;
            ArrayList arrayList = qVar.E;
            if (!qVar.A()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((j) arrayList.get(i12)).w;
                        int length = qVar.M.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (qVar.e0[i14] && qVar.M[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    n0.X(0, i12, arrayList);
                    j jVar = (j) arrayList.get(0);
                    v vVar2 = jVar.d;
                    if (!vVar2.equals(qVar.X)) {
                        qVar.w.k(qVar.b, vVar2, jVar.e, jVar.f, jVar.h);
                    }
                    qVar.X = vVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.M[i10].F(bVar, hVar, i3, qVar.k0);
                    if (F == -5) {
                        v vVar3 = (v) bVar.b;
                        vVar3.getClass();
                        if (i10 == qVar.S) {
                            int b10 = od.b(qVar.M[i10].E());
                            while (i11 < arrayList.size() && ((j) arrayList.get(i11)).w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                vVar = ((j) arrayList.get(i11)).d;
                            } else {
                                vVar = qVar.W;
                                vVar.getClass();
                            }
                            vVar3 = vVar3.d(vVar);
                        }
                        bVar.b = vVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
