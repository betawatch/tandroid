package q4;

import a4.w;
import com.google.android.gms.internal.cast.z4;
import f5.d0;
import j3.t0;
import j3.u0;
import j7.l1;
import java.util.ArrayList;
import java.util.Iterator;
import l4.c1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n implements c1 {
    public final int a;
    public final r b;
    public int c = -1;

    public n(r rVar, int i10) {
        this.b = rVar;
        this.a = i10;
    }

    @Override // l4.c1
    public final void a() {
        int i10 = this.c;
        r rVar = this.b;
        if (i10 == -2) {
            rVar.d();
            throw new z4(w.n("Unable to bind a sample queue to TrackGroup with mime type ", rVar.U.a(this.a).d[0].B, "."));
        }
        if (i10 == -1) {
            rVar.w();
        } else if (i10 != -3) {
            rVar.w();
            rVar.H[i10].w();
        }
    }

    public final void b() {
        f5.a.f(this.c == -1);
        r rVar = this.b;
        rVar.d();
        rVar.W.getClass();
        int[] iArr = rVar.W;
        int i10 = this.a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (rVar.V.contains(rVar.U.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = rVar.Z;
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

    @Override // l4.c1
    public final int d(u0 u0Var, m3.i iVar, int i10) {
        t0 t0Var;
        if (this.c == -3) {
            iVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i11 = this.c;
            r rVar = this.b;
            ArrayList arrayList = rVar.y;
            if (!rVar.u()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((k) arrayList.get(i13)).v;
                        int length = rVar.H.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (rVar.Z[i15] && rVar.H[i15].y() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    d0.N(0, i13, arrayList);
                    k kVar = (k) arrayList.get(0);
                    t0 t0Var2 = kVar.d;
                    if (!t0Var2.equals(rVar.S)) {
                        rVar.v.b(rVar.b, t0Var2, kVar.e, kVar.f, kVar.h);
                    }
                    rVar.S = t0Var2;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).W) {
                    int z10 = rVar.H[i11].z(u0Var, iVar, i10, rVar.f0);
                    if (z10 == -5) {
                        t0 t0Var3 = u0Var.b;
                        t0Var3.getClass();
                        if (i11 == rVar.N) {
                            int y8 = rVar.H[i11].y();
                            while (i12 < arrayList.size() && ((k) arrayList.get(i12)).v != y8) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                t0Var = ((k) arrayList.get(i12)).d;
                            } else {
                                t0Var = rVar.R;
                                t0Var.getClass();
                            }
                            t0Var3 = t0Var3.c(t0Var);
                        }
                        u0Var.b = t0Var3;
                    }
                    return z10;
                }
            }
        }
        return -3;
    }

    @Override // l4.c1
    public final boolean e() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i10 = this.c;
        r rVar = this.b;
        return !rVar.u() && rVar.H[i10].u(rVar.f0);
    }

    @Override // l4.c1
    public final int i(long j10) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i10 = this.c;
        r rVar = this.b;
        if (rVar.u()) {
            return 0;
        }
        q qVar = rVar.H[i10];
        int s10 = qVar.s(j10, rVar.f0);
        ArrayList arrayList = rVar.y;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = l1.i(1, arrayList);
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
        if (kVar != null && !kVar.W) {
            s10 = Math.min(s10, kVar.f(i10) - qVar.q());
        }
        qVar.E(s10);
        return s10;
    }
}
