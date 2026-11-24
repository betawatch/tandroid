// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x07 implements w33 {
    public static final rq2 b = new rq2(new v41(new g31((byte) 14), hi7.b), new v41(new g31((byte) 15), hi7.c));
    public final ArrayList a = new ArrayList();

    @Override // w33
    public final long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((x33) arrayList.get(i)).b;
            long j4 = ((x33) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // w33
    public final boolean b(x33 x33Var, long j) {
        long j2 = x33Var.b;
        gre.f(j2 != -9223372036854775807L);
        gre.f(x33Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < x33Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((x33) arrayList.get(size)).b) {
                arrayList.add(size + 1, x33Var);
                return z;
            }
        }
        arrayList.add(0, x33Var);
        return z;
    }

    @Override // w33
    public final mm5 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((x33) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    x33 x33Var = (x33) arrayList.get(i);
                    if (j >= x33Var.b && j < x33Var.d) {
                        arrayList2.add(x33Var);
                    }
                    if (j < x33Var.b) {
                        break;
                    }
                }
                w59 w = mm5.w(b, arrayList2);
                jm5 p = mm5.p();
                for (int i2 = 0; i2 < w.d; i2++) {
                    p.d(((x33) w.get(i2)).a);
                }
                return p.f();
            }
        }
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // w33
    public final void clear() {
        this.a.clear();
    }

    @Override // w33
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((x33) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j2 = ((x33) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((x33) arrayList.get(i)).b;
            long j4 = ((x33) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    @Override // w33
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((x33) arrayList.get(i)).b;
            if (j > j2 && j > ((x33) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
