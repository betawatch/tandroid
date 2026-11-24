// default package

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yg2 implements w33 {
    public final /* synthetic */ byte a;
    public final ArrayList b;

    public yg2(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
            case 3:
                this.b = new ArrayList();
                break;
            case 4:
                this.b = new ArrayList();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    @Override // w33
    public final long a(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((x33) arrayList.get(0)).b) {
            return ((x33) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((x33) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((x33) arrayList.get(i - 1)).d;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((x33) jle.b(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // w33
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(x33 x33Var, long j) {
        boolean z;
        int size;
        long j2 = x33Var.b;
        gre.f(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = x33Var.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
                ArrayList arrayList = this.b;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((x33) arrayList.get(size)).b) {
                        arrayList.add(size + 1, x33Var);
                        return z;
                    }
                    if (((x33) arrayList.get(size)).b <= j) {
                        z = false;
                    }
                }
                arrayList.add(0, x33Var);
                return z;
            }
        }
        z = false;
        ArrayList arrayList2 = this.b;
        while (size >= 0) {
        }
        arrayList2.add(0, x33Var);
        return z;
    }

    @Override // w33
    public final mm5 c(long j) {
        int f = f(j);
        if (f == 0) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        x33 x33Var = (x33) this.b.get(f - 1);
        long j2 = x33Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return x33Var.a;
        }
        km5 km5Var2 = mm5.b;
        return w59.e;
    }

    @Override // w33
    public final void clear() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 2:
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (obj != null) {
                        fyb.g();
                        return;
                    }
                    try {
                        throw null;
                        break;
                    } catch (Exception e) {
                        ei7.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                    }
                }
                arrayList.clear();
                return;
            default:
                arrayList.clear();
                return;
        }
    }

    @Override // w33
    public final long d(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || j < ((x33) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((x33) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                x33 x33Var = (x33) arrayList.get(i - 1);
                long j3 = x33Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? x33Var.b : j3;
            }
        }
        x33 x33Var2 = (x33) jle.b(arrayList);
        long j4 = x33Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? x33Var2.b : j4;
    }

    @Override // w33
    public final void e(long j) {
        int f = f(j);
        if (f == 0) {
            return;
        }
        ArrayList arrayList = this.b;
        long j2 = ((x33) arrayList.get(f - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            f--;
        }
        arrayList.subList(0, f).clear();
    }

    public final int f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((x33) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    public final synchronized List g() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.b));
    }

    public final xg2 h(int i) {
        return (xg2) this.b.get(i);
    }

    public yg2(ArrayList arrayList) {
        this.a = (byte) 0;
        this.b = arrayList;
    }

    public yg2(xg2 xg2Var) {
        this.a = (byte) 0;
        ArrayList arrayList = new ArrayList(1);
        this.b = arrayList;
        arrayList.add(xg2Var);
    }
}
