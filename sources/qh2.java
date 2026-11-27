// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qh2 implements o43 {
    public final ArrayList a;

    public qh2(byte b) {
        switch (b) {
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    @Override // o43
    public final long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((p43) arrayList.get(0)).b) {
            return ((p43) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((p43) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((p43) arrayList.get(i - 1)).d;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((p43) dqe.b(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // o43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(p43 p43Var, long j) {
        boolean z;
        int size;
        long j2 = p43Var.b;
        yve.f(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = p43Var.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
                ArrayList arrayList = this.a;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((p43) arrayList.get(size)).b) {
                        arrayList.add(size + 1, p43Var);
                        return z;
                    }
                    if (((p43) arrayList.get(size)).b <= j) {
                        z = false;
                    }
                }
                arrayList.add(0, p43Var);
                return z;
            }
        }
        z = false;
        ArrayList arrayList2 = this.a;
        while (size >= 0) {
        }
        arrayList2.add(0, p43Var);
        return z;
    }

    @Override // o43
    public final po5 c(long j) {
        int f = f(j);
        if (f == 0) {
            no5 no5Var = po5.b;
            return j99.e;
        }
        p43 p43Var = (p43) this.a.get(f - 1);
        long j2 = p43Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return p43Var.a;
        }
        no5 no5Var2 = po5.b;
        return j99.e;
    }

    @Override // o43
    public final void clear() {
        this.a.clear();
    }

    @Override // o43
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((p43) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((p43) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                p43 p43Var = (p43) arrayList.get(i - 1);
                long j3 = p43Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? p43Var.b : j3;
            }
        }
        p43 p43Var2 = (p43) dqe.b(arrayList);
        long j4 = p43Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? p43Var2.b : j4;
    }

    @Override // o43
    public final void e(long j) {
        int f = f(j);
        if (f == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        long j2 = ((p43) arrayList.get(f - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            f--;
        }
        arrayList.subList(0, f).clear();
    }

    public final int f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((p43) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    public final synchronized List g() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.a));
    }

    public final ph2 h(int i) {
        return (ph2) this.a.get(i);
    }

    public final ArrayList i(int i, int i2, int i3, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        int size = arrayList3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList3.get(i4);
            i4++;
            int[] iArr = (int[]) obj;
            if (!z || iArr[2] != 0) {
                if (i3 != 0) {
                    if (iArr[2] <= i3) {
                        arrayList.add(iArr);
                        arrayList2.remove(iArr);
                    }
                } else if (iArr[0] == i) {
                    if (i2 != 0 && iArr[1] != i2) {
                    }
                    arrayList.add(iArr);
                    arrayList2.remove(iArr);
                }
            }
        }
        return arrayList;
    }

    public qh2(ph2 ph2Var) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(ph2Var);
    }

    public qh2(ArrayList arrayList) {
        this.a = arrayList;
    }
}
