package p4;

import android.os.Bundle;
import e9.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r implements w2.a {
    public final /* synthetic */ int a;
    public ArrayList b;

    public r(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
            case 2:
                this.b = new ArrayList();
                break;
        }
    }

    @Override // w2.a
    public long a(long j10) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.a) arrayList.get(0)).b) {
            return ((z3.a) arrayList.get(0)).b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j11 = aVar.b;
            long j12 = aVar.b;
            if (j10 < j11) {
                long j13 = ((z3.a) arrayList.get(i10 - 1)).d;
                return (j13 == -9223372036854775807L || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((z3.a) e9.s.m(arrayList)).d;
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
        z3.a aVar = (z3.a) this.b.get(g10 - 1);
        long j11 = aVar.d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return aVar.a;
        }
        e9.l0 l0Var2 = e9.n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(z3.a aVar, long j10) {
        boolean z10;
        int size;
        ArrayList arrayList = this.b;
        long j11 = aVar.b;
        t6.f(j11 != -9223372036854775807L);
        if (j11 <= j10) {
            long j12 = aVar.d;
            if (j12 == -9223372036854775807L || j10 < j12) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j11 >= ((z3.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z10;
                    }
                    if (((z3.a) arrayList.get(size)).b <= j10) {
                        z10 = false;
                    }
                }
                arrayList.add(0, aVar);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // w2.a
    public void clear() {
        switch (this.a) {
            case 1:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (obj != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                        break;
                    } catch (Exception e) {
                        sc.j.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                    }
                }
                arrayList.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    @Override // w2.a
    public long d(long j10) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || j10 < ((z3.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.a) arrayList.get(i10)).b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j12 = aVar.d;
                return (j12 == -9223372036854775807L || j12 > j10) ? aVar.b : j12;
            }
        }
        z3.a aVar2 = (z3.a) e9.s.m(arrayList);
        long j13 = aVar2.d;
        return (j13 == -9223372036854775807L || j10 < j13) ? aVar2.b : j13;
    }

    @Override // w2.a
    public void e(long j10) {
        ArrayList arrayList = this.b;
        int g10 = g(j10);
        if (g10 == 0) {
            return;
        }
        long j11 = ((z3.a) arrayList.get(g10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            g10--;
        }
        arrayList.subList(0, g10).clear();
    }

    public s f() {
        if (this.b == null) {
            return s.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.b);
        return new s(bundle, this.b);
    }

    public int g(long j10) {
        ArrayList arrayList = this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.a) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }
}
