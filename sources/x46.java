// default package

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x46 implements Iterable {
    public final t46 a;
    public final y74 c;
    public final w46 d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public x46(t46 t46Var, Interpolator interpolator, long j) {
        this.a = t46Var;
        this.d = new w46(this, t46Var);
        if (interpolator == null || j <= 0) {
            this.c = null;
        } else {
            this.c = new y74(0, new z24((Object) this, (byte) 12), interpolator, j);
        }
    }

    public final void h(float f) {
        w46 w46Var = this.d;
        boolean z = w46Var.a.n(f) || (w46Var.c.a(f) || (w46Var.g.a(f) || (w46Var.f.a(f) || (w46Var.e.a(f) || (w46Var.d.a(f) || w46Var.b.a(f))))));
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u46 u46Var = (u46) obj;
            boolean z2 = u46Var.f.a(f) || (u46Var.e.a(f) || (u46Var.d.a(f) || u46Var.c.a(f)));
            Object obj2 = u46Var.a;
            if (obj2 instanceof b9c) {
                z2 = ((b9c) obj2).a(f) || z2;
            }
            z = z2 || z;
        }
        if (z) {
            this.a.F();
            if (f == 1.0f) {
                l(true);
            }
        }
    }

    public final u46 i(int i) {
        return (u46) this.b.get(i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final void j(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            u46 u46Var = (u46) obj;
            Object obj2 = u46Var.a;
            a9c a9cVar = u46Var.f;
            b9c b9cVar = u46Var.e;
            if (obj2 instanceof v46) {
                v46 v46Var = (v46) obj2;
                boolean z2 = u46Var.b == 0;
                arrayList2.size();
                int b = v46Var.b(z2);
                int width = v46Var.getWidth();
                int height = v46Var.getHeight();
                int i6 = b + width + i;
                int i7 = i2 + b + height;
                if (!z || u46Var.c() <= 0.0f) {
                    arrayList = arrayList2;
                    b9cVar.d(i, i2, i6, i7);
                    a9cVar.d(b);
                } else {
                    float f = i;
                    float f2 = i2;
                    float f3 = i6;
                    arrayList = arrayList2;
                    float f4 = i7;
                    if (b9cVar.b(f, f2, f3, f4)) {
                        k();
                        b9cVar.e(f, f2, f3, f4);
                    }
                    float f5 = b;
                    if (a9cVar.b(f5)) {
                        k();
                        a9cVar.c = f5;
                    }
                }
                i3 = Math.max(i3, width);
                i4 = Math.max(i4, height);
                i2 = i7;
                i = i6;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.b;
        if (z) {
            int size2 = arrayList3.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj3 = arrayList3.get(i8);
                i8++;
                Object obj4 = ((u46) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj5 = arrayList3.get(i9);
            i9++;
            Object obj6 = ((u46) obj5).a;
        }
        w46 w46Var = this.d;
        if (!z) {
            w46Var.f.d(i);
            w46Var.g.d(i2);
            w46Var.d.d(i3);
            w46Var.e.d(i4);
            w46Var.a.c();
            return;
        }
        a9c a9cVar2 = w46Var.f;
        t46 t46Var = w46Var.a;
        a9c a9cVar3 = w46Var.e;
        a9c a9cVar4 = w46Var.d;
        a9c a9cVar5 = w46Var.g;
        float f6 = i;
        if (a9cVar2.b(f6)) {
            k();
            w46Var.f.c = f6;
        }
        float f7 = i2;
        if (a9cVar5.b(f7)) {
            k();
            a9cVar5.c = f7;
        }
        float f8 = i3;
        if (a9cVar4.b(f8)) {
            k();
            a9cVar4.c = f8;
        }
        float f9 = i4;
        if (a9cVar3.b(f9)) {
            k();
            a9cVar3.c = f9;
        }
        if (t46Var.m()) {
            k();
            t46Var.p();
        }
    }

    public final void k() {
        if (this.f) {
            return;
        }
        this.f = true;
        y74 y74Var = this.c;
        if (y74Var == null) {
            l(false);
            return;
        }
        y74Var.b();
        l(false);
        y74Var.c(0.0f);
    }

    public final void l(boolean z) {
        ArrayList arrayList = this.b;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u46 u46Var = (u46) arrayList.get(size);
            u46Var.a(z);
            if (u46Var.c() == 0.0f && u46Var.h) {
                arrayList.remove(size);
                Object obj = u46Var.a;
                if (obj instanceof be3) {
                    ((be3) obj).a();
                }
                z2 = true;
            }
        }
        if (z2) {
            arrayList.trimToSize();
        }
        w46 w46Var = this.d;
        w46Var.b.c(z);
        w46Var.d.c(z);
        w46Var.e.c(z);
        w46Var.f.c(z);
        w46Var.g.c(z);
        w46Var.c.c(z);
        w46Var.a.k(z);
    }

    public final void m(List list, boolean z) {
        boolean isEmpty;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        y74 y74Var = this.c;
        w46 w46Var = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z) {
            if (y74Var != null) {
                y74Var.b();
                l(false);
                y74Var.c(0.0f);
            } else {
                l(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((u46) arrayList2.get(size)).a;
                if (obj instanceof be3) {
                    ((be3) obj).a();
                }
            }
            arrayList2.clear();
            arrayList.clear();
            int size2 = list != null ? list.size() : 0;
            if (size2 > 0) {
                arrayList2.ensureCapacity(size2);
                arrayList.ensureCapacity(size2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    u46 u46Var = new u46(arrayList.size(), it.next(), true);
                    arrayList2.add(u46Var);
                    arrayList.add(u46Var);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            w46Var.a(size2, false);
            j(false);
            this.a.F();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (((u46) arrayList.get(i2)).equals(list.get(i2))) {
                    }
                }
                isEmpty = true;
            }
            isEmpty = false;
            break;
        }
        isEmpty = arrayList.isEmpty();
        if (isEmpty) {
            return;
        }
        k();
        if (list == null || list.isEmpty()) {
            if (!this.f) {
                int size3 = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    if (((u46) obj2).d.b(0.0f)) {
                        k();
                        break;
                    }
                }
            }
            if (this.f) {
                int size4 = arrayList2.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    u46 u46Var2 = (u46) obj3;
                    if (u46Var2.d.b(0.0f)) {
                        k();
                        u46Var2.d.c = 0.0f;
                        u46Var2.h = true;
                        int binarySearch = Collections.binarySearch(arrayList, u46Var2);
                        if (binarySearch >= 0) {
                            arrayList.remove(binarySearch);
                        }
                        w46Var.a(arrayList.size(), true);
                    }
                }
            }
            z2 = true;
            z3 = false;
        } else {
            boolean z5 = false;
            int i5 = 0;
            boolean z6 = false;
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                u46 u46Var3 = (u46) arrayList2.get(i6);
                Object obj4 = u46Var3.a;
                a9c a9cVar = u46Var3.d;
                a9c a9cVar2 = u46Var3.c;
                int indexOf = list.indexOf(obj4);
                if (indexOf != -1) {
                    i5++;
                    float f = indexOf;
                    if (a9cVar2.b(f)) {
                        k();
                        a9cVar2.c = f;
                    }
                    if (u46Var3.b != indexOf) {
                        u46Var3.b = indexOf;
                        z5 = z5 || !u46Var3.h;
                        z6 = true;
                    }
                    if (a9cVar.b(1.0f)) {
                        k();
                        a9cVar.c = 1.0f;
                        u46Var3.h = false;
                        arrayList.add(u46Var3);
                        w46Var.a(arrayList.size(), true);
                        z5 = true;
                    }
                } else if (a9cVar.b(0.0f)) {
                    k();
                    a9cVar.c = 0.0f;
                    u46Var3.h = true;
                    if (z5) {
                        z4 = arrayList.remove(u46Var3);
                    } else {
                        int binarySearch2 = Collections.binarySearch(arrayList, u46Var3);
                        if (binarySearch2 >= 0) {
                            arrayList.remove(binarySearch2);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    if (!z4) {
                        sc8.e();
                        return;
                    }
                    w46Var.a(arrayList.size(), true);
                } else {
                    continue;
                }
            }
            if (z5) {
                Collections.sort(arrayList);
            }
            if (i5 < list.size()) {
                arrayList2.ensureCapacity((list.size() - i5) + arrayList2.size());
                int i7 = 0;
                for (Object obj5 : list) {
                    if (obj5 == null) {
                        int size5 = arrayList2.size();
                        i = 0;
                        int i8 = 0;
                        while (i8 < size5) {
                            Object obj6 = arrayList2.get(i8);
                            i8++;
                            if (((u46) obj6).a == null) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        i = -1;
                    } else {
                        int size6 = arrayList2.size();
                        i = 0;
                        int i9 = 0;
                        while (i9 < size6) {
                            Object obj7 = arrayList2.get(i9);
                            i9++;
                            if (obj5.equals(((u46) obj7).a)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        i = -1;
                    }
                    if (i == -1) {
                        if (i7 != arrayList2.size()) {
                            z6 = true;
                        }
                        k();
                        u46 u46Var4 = new u46(i7, obj5, false);
                        u46Var4.d.c = 1.0f;
                        u46Var4.h = false;
                        arrayList2.add(u46Var4);
                        int binarySearch3 = Collections.binarySearch(arrayList, u46Var4);
                        if (binarySearch3 >= 0) {
                            w26.j("Element already exists in list");
                            return;
                        } else {
                            arrayList.add((-binarySearch3) - 1, u46Var4);
                            w46Var.a(arrayList.size(), true);
                        }
                    }
                    i7++;
                }
            }
            z3 = z6;
            z2 = true;
        }
        if (z3) {
            Collections.sort(arrayList2);
        }
        j(z2);
        if (this.f) {
            this.f = false;
            if (y74Var != null) {
                y74Var.a(1.0f);
                return;
            }
            return;
        }
        if (y74Var == null) {
            int size7 = arrayList2.size();
            int i10 = 0;
            while (i10 < size7) {
                Object obj8 = arrayList2.get(i10);
                i10++;
                u46 u46Var5 = (u46) obj8;
                a9c a9cVar3 = u46Var5.d;
                a9cVar3.b = a9cVar3.a;
                a9c a9cVar4 = u46Var5.c;
                a9cVar4.b = a9cVar4.a;
            }
        }
    }
}
