// default package

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pf5 implements ip9 {
    public final int a;
    public final tf5 b;
    public int c = -1;

    public pf5(tf5 tf5Var, int i) {
        this.b = tf5Var;
        this.a = i;
    }

    @Override // ip9
    public final int a() {
        return 0;
    }

    @Override // ip9
    public final void b() {
        int i = this.c;
        tf5 tf5Var = this.b;
        if (i == -2) {
            tf5Var.b();
            throw new bk2(tb4.y("Unable to bind a sample queue to TrackGroup with MIME type ", tf5Var.Z.a(this.a).d[0].t, "."));
        }
        if (i == -1) {
            tf5Var.C();
        } else if (i != -3) {
            tf5Var.C();
            tf5Var.M[i].C();
        }
    }

    public final void c() {
        gre.f(this.c == -1);
        tf5 tf5Var = this.b;
        tf5Var.b();
        tf5Var.b0.getClass();
        int[] iArr = tf5Var.b0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (tf5Var.a0.contains(tf5Var.Z.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = tf5Var.e0;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean d() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // ip9
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        fm4 fm4Var;
        if (this.c == -3) {
            z83Var.addFlag(4);
            return -4;
        }
        if (d()) {
            int i2 = this.c;
            tf5 tf5Var = this.b;
            ArrayList arrayList = tf5Var.E;
            if (!tf5Var.A()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((te5) arrayList.get(i4)).w;
                        int length = tf5Var.M.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (tf5Var.e0[i6] && tf5Var.M[i6].E() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    g8c.Y(0, i4, arrayList);
                    te5 te5Var = (te5) arrayList.get(0);
                    fm4 fm4Var2 = te5Var.d;
                    if (!fm4Var2.equals(tf5Var.X)) {
                        tf5Var.w.i(tf5Var.b, fm4Var2, te5Var.e, te5Var.f, te5Var.h);
                    }
                    tf5Var.X = fm4Var2;
                }
                if (arrayList.isEmpty() || ((te5) arrayList.get(0)).h()) {
                    int F = tf5Var.M[i2].F(sk4Var, z83Var, i, tf5Var.k0);
                    if (F == -5) {
                        fm4 fm4Var3 = (fm4) sk4Var.c;
                        fm4Var3.getClass();
                        if (i2 == tf5Var.S) {
                            int b = gle.b(tf5Var.M[i2].E());
                            while (i3 < arrayList.size() && ((te5) arrayList.get(i3)).w != b) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                fm4Var = ((te5) arrayList.get(i3)).d;
                            } else {
                                fm4Var = tf5Var.W;
                                fm4Var.getClass();
                            }
                            fm4Var3 = fm4Var3.d(fm4Var);
                        }
                        sk4Var.c = fm4Var3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }

    @Override // ip9
    public final boolean j() {
        if (this.c == -3) {
            return true;
        }
        if (!d()) {
            return false;
        }
        int i = this.c;
        tf5 tf5Var = this.b;
        return !tf5Var.A() && tf5Var.M[i].A(tf5Var.k0);
    }

    @Override // ip9
    public final int n(long j) {
        Object next;
        Object obj;
        if (!d()) {
            return 0;
        }
        int i = this.c;
        tf5 tf5Var = this.b;
        if (tf5Var.A()) {
            return 0;
        }
        sf5 sf5Var = tf5Var.M[i];
        int x = sf5Var.x(j, tf5Var.k0);
        ArrayList arrayList = tf5Var.E;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = b00.f(1, arrayList);
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
        te5 te5Var = (te5) obj;
        if (te5Var != null && !te5Var.h()) {
            x = Math.min(x, te5Var.g(i) - sf5Var.v());
        }
        sf5Var.L(x);
        return x;
    }
}
