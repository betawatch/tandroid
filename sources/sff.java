// default package

import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sff extends u99 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sff(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // u99
    public final void a() {
        switch (this.a) {
            case 2:
                ((alf) this.b).b();
                break;
        }
    }

    @Override // u99
    public final void c() {
        switch (this.a) {
            case 2:
                ((alf) this.b).b();
                break;
        }
    }

    @Override // u99
    public final void d() {
        switch (this.a) {
            case 2:
                ((alf) this.b).b();
                break;
        }
    }

    @Override // u99
    public final void e() {
        switch (this.a) {
            case 2:
                ((alf) this.b).b();
                break;
        }
    }

    @Override // u99
    public final void g() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                bu6 bu6Var = (bu6) obj;
                long d = bu6Var.d();
                if (d != bu6Var.b) {
                    bu6Var.b = d;
                    bu6Var.b();
                    if (bu6Var.b != 0) {
                        bu6Var.c();
                        break;
                    }
                }
                break;
            case 2:
                ((alf) obj).b();
                break;
        }
    }

    @Override // u99
    public final void h(String str, long j, int i, long j2, long j3) {
        switch (this.a) {
            case 0:
                uae uaeVar = ((md1) this.b).l;
                if (uaeVar != null) {
                    cmf S = ((am2) uaeVar.b).S();
                    ecf ecfVar = new ecf(str);
                    ecfVar.b = j;
                    ecfVar.c = i;
                    ecfVar.d = j2;
                    ecfVar.e = j3;
                    def defVar = new def(ecfVar);
                    defVar.f = S.h;
                    S.d.add(defVar);
                    break;
                }
                break;
        }
    }

    @Override // u99
    public final void i(int[] iArr) {
        switch (this.a) {
            case 1:
                bu6 bu6Var = (bu6) this.b;
                ArrayList c = qd1.c(iArr);
                if (!bu6Var.d.equals(c)) {
                    bu6Var.h();
                    bu6Var.f.evictAll();
                    bu6Var.g.clear();
                    bu6Var.d = c;
                    bu6.a(bu6Var);
                    bu6Var.f();
                    bu6Var.e();
                    break;
                }
                break;
        }
    }

    @Override // u99
    public final void j(int[] iArr, int i) {
        int i2;
        switch (this.a) {
            case 1:
                bu6 bu6Var = (bu6) this.b;
                if (i == 0) {
                    i2 = bu6Var.d.size();
                } else {
                    i2 = bu6Var.e.get(i, -1);
                    if (i2 == -1) {
                        ((bu6) this.b).c();
                        return;
                    }
                }
                ((bu6) this.b).h();
                ((bu6) this.b).d.addAll(i2, qd1.c(iArr));
                bu6.a((bu6) this.b);
                bu6 bu6Var2 = (bu6) this.b;
                synchronized (bu6Var2.m) {
                    Iterator it = bu6Var2.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((bu6) this.b).e();
                return;
            default:
                return;
        }
    }

    @Override // u99
    public final void k(eu6[] eu6VarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                bu6 bu6Var = (bu6) this.b;
                SparseIntArray sparseIntArray = bu6Var.e;
                ArrayList arrayList = bu6Var.g;
                arrayList.clear();
                int i = 0;
                for (eu6 eu6Var : eu6VarArr) {
                    int i2 = eu6Var.b;
                    bu6Var.f.put(Integer.valueOf(i2), eu6Var);
                    int i3 = sparseIntArray.get(i2, -1);
                    if (i3 == -1) {
                        bu6Var.c();
                        break;
                    } else {
                        hashSet.add(Integer.valueOf(i3));
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    int i4 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i4 != -1) {
                        hashSet.add(Integer.valueOf(i4));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                bu6Var.h();
                qd1.e(arrayList2);
                bu6Var.g();
                bu6Var.e();
                break;
        }
    }

    @Override // u99
    public final void l(int[] iArr) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    ((bu6) this.b).f.remove(Integer.valueOf(i));
                    int i2 = ((bu6) this.b).e.get(i, -1);
                    bu6 bu6Var = (bu6) this.b;
                    if (i2 == -1) {
                        bu6Var.c();
                        return;
                    } else {
                        bu6Var.e.delete(i);
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((bu6) this.b).h();
                ((bu6) this.b).d.removeAll(qd1.c(iArr));
                bu6.a((bu6) this.b);
                bu6 bu6Var2 = (bu6) this.b;
                qd1.e(arrayList);
                synchronized (bu6Var2.m) {
                    Iterator it = bu6Var2.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((bu6) this.b).e();
                return;
            default:
                return;
        }
    }

    @Override // u99
    public final void m(ArrayList arrayList, ArrayList arrayList2, int i) {
        switch (this.a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                if (i == 0) {
                    ((bu6) this.b).d.size();
                } else {
                    boolean isEmpty = arrayList2.isEmpty();
                    bu6 bu6Var = (bu6) this.b;
                    if (isEmpty) {
                        he6 he6Var = bu6Var.a;
                        Log.w(he6Var.a, he6Var.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                    } else if (bu6Var.e.get(i, -1) == -1) {
                        bu6 bu6Var2 = (bu6) this.b;
                        bu6Var2.e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                    }
                }
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = ((bu6) this.b).e.get(((Integer) obj).intValue(), -1);
                    if (i3 == -1) {
                        ((bu6) this.b).c();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                ((bu6) this.b).h();
                bu6 bu6Var3 = (bu6) this.b;
                bu6Var3.d = arrayList;
                bu6.a(bu6Var3);
                bu6 bu6Var4 = (bu6) this.b;
                synchronized (bu6Var4.m) {
                    Iterator it = bu6Var4.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((bu6) this.b).e();
                return;
            default:
                return;
        }
    }

    @Override // u99
    public final void n(int[] iArr) {
        switch (this.a) {
            case 1:
                bu6 bu6Var = (bu6) this.b;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < iArr.length) {
                    int i2 = iArr[i];
                    bu6Var.f.remove(Integer.valueOf(i2));
                    int i3 = bu6Var.e.get(i2, -1);
                    if (i3 == -1) {
                        bu6Var.c();
                        break;
                    } else {
                        i = qd4.g(i3, i, 1, arrayList);
                    }
                }
                Collections.sort(arrayList);
                bu6Var.h();
                qd1.e(arrayList);
                bu6Var.g();
                bu6Var.e();
                break;
        }
    }

    @Override // u99
    public final void o() {
        switch (this.a) {
            case 1:
                ((bu6) this.b).c();
                break;
        }
    }
}
