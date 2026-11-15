package r2;

import a8.ja;
import a8.p0;
import c8.g1;
import e2.u;
import h2.l0;
import java.util.ArrayList;
import java.util.Iterator;
import x2.b1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class m implements b1 {
    public final int a;
    public final q b;
    public int c = -1;

    public m(q qVar, int i7) {
        this.b = qVar;
        this.a = i7;
    }

    @Override // x2.b1
    public final void a() {
        int i7 = this.c;
        q qVar = this.b;
        if (i7 == -2) {
            qVar.n();
            throw new androidx.datastore.preferences.protobuf.l(p0.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Z.a(this.a).d[0].s, "."));
        }
        if (i7 == -1) {
            qVar.E();
        } else if (i7 != -3) {
            qVar.E();
            qVar.M[i7].C();
        }
    }

    public final void b() {
        ja.f(this.c == -1);
        q qVar = this.b;
        qVar.n();
        qVar.b0.getClass();
        int[] iArr = qVar.b0;
        int i7 = this.a;
        int i10 = iArr[i7];
        if (i10 == -1) {
            if (qVar.a0.contains(qVar.Z.a(i7))) {
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
        q qVar = this.b;
        return !qVar.C() && qVar.M[i7].A(qVar.k0);
    }

    @Override // x2.b1
    public final int n(long j3) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i7 = this.c;
        q qVar = this.b;
        if (qVar.C()) {
            return 0;
        }
        p pVar = qVar.M[i7];
        int x10 = pVar.x(j3, qVar.k0);
        ArrayList arrayList = qVar.E;
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
            x10 = Math.min(x10, iVar.f(i7) - pVar.v());
        }
        pVar.L(x10);
        return x10;
    }

    @Override // x2.b1
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        u uVar;
        if (this.c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.c;
            q qVar = this.b;
            ArrayList arrayList = qVar.E;
            if (!qVar.C()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((i) arrayList.get(i12)).w;
                        int length = qVar.M.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (qVar.e0[i14] && qVar.M[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    l0.X(0, i12, arrayList);
                    i iVar = (i) arrayList.get(0);
                    u uVar2 = iVar.d;
                    if (!uVar2.equals(qVar.X)) {
                        qVar.w.i(qVar.b, uVar2, iVar.e, iVar.f, iVar.h);
                    }
                    qVar.X = uVar2;
                }
                if (arrayList.isEmpty() || ((i) arrayList.get(0)).g()) {
                    int F = qVar.M[i10].F(aVar, hVar, i7, qVar.k0);
                    if (F == -5) {
                        u uVar3 = (u) aVar.c;
                        uVar3.getClass();
                        if (i10 == qVar.S) {
                            int b10 = g1.b(qVar.M[i10].E());
                            while (i11 < arrayList.size() && ((i) arrayList.get(i11)).w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                uVar = ((i) arrayList.get(i11)).d;
                            } else {
                                uVar = qVar.W;
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
