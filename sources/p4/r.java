package p4;

import android.os.Bundle;
import e9.x1;
import java.util.ArrayList;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class r implements w2.a {
    public ArrayList a;

    @Override // w2.a
    public long a(long j10) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.b) arrayList.get(0)).b) {
            return ((z3.b) arrayList.get(0)).b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.b bVar = (z3.b) arrayList.get(i10);
            long j11 = bVar.b;
            long j12 = bVar.b;
            if (j10 < j11) {
                long j13 = ((z3.b) arrayList.get(i10 - 1)).d;
                return (j13 == -9223372036854775807L || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((z3.b) e9.s.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override // w2.a
    public e9.n0 b(long j10) {
        int g10 = g(j10);
        if (g10 == 0) {
            e9.l0 l0Var = e9.n0.b;
            return x1.e;
        }
        z3.b bVar = (z3.b) this.a.get(g10 - 1);
        long j11 = bVar.d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return bVar.a;
        }
        e9.l0 l0Var2 = e9.n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(z3.b bVar, long j10) {
        boolean z10;
        int size;
        ArrayList arrayList = this.a;
        long j11 = bVar.b;
        u6.g(j11 != -9223372036854775807L);
        if (j11 <= j10) {
            long j12 = bVar.d;
            if (j12 == -9223372036854775807L || j10 < j12) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j11 >= ((z3.b) arrayList.get(size)).b) {
                        arrayList.add(size + 1, bVar);
                        return z10;
                    }
                    if (((z3.b) arrayList.get(size)).b <= j10) {
                        z10 = false;
                    }
                }
                arrayList.add(0, bVar);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        arrayList.add(0, bVar);
        return z10;
    }

    @Override // w2.a
    public void clear() {
        this.a.clear();
    }

    @Override // w2.a
    public long d(long j10) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j10 < ((z3.b) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.b) arrayList.get(i10)).b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                z3.b bVar = (z3.b) arrayList.get(i10 - 1);
                long j12 = bVar.d;
                return (j12 == -9223372036854775807L || j12 > j10) ? bVar.b : j12;
            }
        }
        z3.b bVar2 = (z3.b) e9.s.m(arrayList);
        long j13 = bVar2.d;
        return (j13 == -9223372036854775807L || j10 < j13) ? bVar2.b : j13;
    }

    @Override // w2.a
    public void e(long j10) {
        ArrayList arrayList = this.a;
        int g10 = g(j10);
        if (g10 == 0) {
            return;
        }
        long j11 = ((z3.b) arrayList.get(g10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            g10--;
        }
        arrayList.subList(0, g10).clear();
    }

    public s f() {
        if (this.a == null) {
            return s.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new s(bundle, this.a);
    }

    public int g(long j10) {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.b) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }
}
