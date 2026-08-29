package p5;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.i3;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.t2;
import com.google.android.gms.internal.cast.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c0 extends q5.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q5.g
    public void a() {
        switch (this.a) {
            case 2:
                ((r5.h) this.b).b();
                break;
        }
    }

    @Override // q5.g
    public void c() {
        switch (this.a) {
            case 2:
                ((r5.h) this.b).b();
                break;
        }
    }

    @Override // q5.g
    public void d() {
        switch (this.a) {
            case 2:
                ((r5.h) this.b).b();
                break;
        }
    }

    @Override // q5.g
    public void e() {
        switch (this.a) {
            case 2:
                ((r5.h) this.b).b();
                break;
        }
    }

    @Override // q5.g
    public void g() {
        switch (this.a) {
            case 1:
                q5.c cVar = (q5.c) this.b;
                long e10 = cVar.e();
                if (e10 != cVar.b) {
                    cVar.b = e10;
                    cVar.c();
                    if (cVar.b != 0) {
                        cVar.d();
                        break;
                    }
                }
                break;
            case 2:
                ((r5.h) this.b).b();
                break;
        }
    }

    @Override // q5.g
    public void h(String str, long j10, int i10, long j11, long j12) {
        switch (this.a) {
            case 0:
                o4 o4Var = ((c) this.b).l;
                if (o4Var != null) {
                    v6 A = o4Var.a.A();
                    t2 t2Var = new t2(str);
                    t2Var.b = j10;
                    t2Var.c = i10;
                    t2Var.d = j11;
                    t2Var.e = j12;
                    i3 i3Var = new i3(t2Var);
                    i3Var.f = A.h;
                    A.d.add(i3Var);
                    break;
                }
                break;
        }
    }

    @Override // q5.g
    public void i(int[] iArr) {
        switch (this.a) {
            case 1:
                q5.c cVar = (q5.c) this.b;
                ArrayList c3 = s5.a.c(iArr);
                if (!cVar.d.equals(c3)) {
                    cVar.h();
                    cVar.f.evictAll();
                    cVar.g.clear();
                    cVar.d = c3;
                    q5.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    break;
                }
                break;
        }
    }

    @Override // q5.g
    public void j(int[] iArr, int i10) {
        int i11;
        switch (this.a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((q5.c) this.b).d.size();
                } else {
                    i11 = ((q5.c) this.b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((q5.c) this.b).d();
                        return;
                    }
                }
                ((q5.c) this.b).h();
                ((q5.c) this.b).d.addAll(i11, s5.a.c(iArr));
                q5.c.b((q5.c) this.b);
                q5.c cVar = (q5.c) this.b;
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((q5.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // q5.g
    public void k(o5.o[] oVarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                q5.c cVar = (q5.c) this.b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.g;
                arrayList.clear();
                int i10 = 0;
                for (o5.o oVar : oVarArr) {
                    int i11 = oVar.b;
                    cVar.f.put(Integer.valueOf(i11), oVar);
                    int i12 = sparseIntArray.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        break;
                    } else {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    int i13 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i13 != -1) {
                        hashSet.add(Integer.valueOf(i13));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                s5.a.e(arrayList2);
                q5.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // q5.g
    public void l(int[] iArr) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((q5.c) this.b).f.remove(Integer.valueOf(i10));
                    int i11 = ((q5.c) this.b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((q5.c) this.b).d();
                        return;
                    } else {
                        ((q5.c) this.b).e.delete(i10);
                        arrayList.add(Integer.valueOf(i11));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((q5.c) this.b).h();
                ((q5.c) this.b).d.removeAll(s5.a.c(iArr));
                q5.c.b((q5.c) this.b);
                q5.c cVar = (q5.c) this.b;
                s5.a.e(arrayList);
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((q5.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // q5.g
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((q5.c) this.b).d.size();
                } else if (arrayList2.isEmpty()) {
                    s5.b bVar = ((q5.c) this.b).a;
                    Log.w(bVar.a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((q5.c) this.b).e.get(i10, -1) == -1) {
                    q5.c cVar = (q5.c) this.b;
                    cVar.e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((q5.c) this.b).e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((q5.c) this.b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((q5.c) this.b).h();
                q5.c cVar2 = (q5.c) this.b;
                cVar2.d = arrayList;
                q5.c.b(cVar2);
                q5.c cVar3 = (q5.c) this.b;
                synchronized (cVar3.m) {
                    Iterator it = cVar3.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((q5.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // q5.g
    public void n(int[] iArr) {
        switch (this.a) {
            case 1:
                q5.c cVar = (q5.c) this.b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f.remove(Integer.valueOf(i11));
                    int i12 = cVar.e.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        break;
                    } else {
                        i10 = th.d(i12, i10, 1, arrayList);
                    }
                }
                Collections.sort(arrayList);
                cVar.h();
                s5.a.e(arrayList);
                q5.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // q5.g
    public void o() {
        switch (this.a) {
            case 1:
                ((q5.c) this.b).d();
                break;
        }
    }
}
