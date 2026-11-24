// default package

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x66 implements Iterable {
    public final t66 a;
    public final h94 c;
    public final w66 d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public x66(t66 t66Var, Interpolator interpolator, long j) {
        this.a = t66Var;
        this.d = new w66(this, t66Var);
        if (interpolator == null || j <= 0) {
            this.c = null;
        } else {
            this.c = new h94(0, new ai4((Object) this, (byte) 10), interpolator, j);
        }
    }

    public final void h(float f) {
        w66 w66Var = this.d;
        boolean z = w66Var.a.m(f) || (w66Var.c.a(f) || (w66Var.g.a(f) || (w66Var.f.a(f) || (w66Var.e.a(f) || (w66Var.d.a(f) || w66Var.b.a(f))))));
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u66 u66Var = (u66) obj;
            boolean z2 = u66Var.f.a(f) || (u66Var.e.a(f) || (u66Var.d.a(f) || u66Var.c.a(f)));
            Object obj2 = u66Var.a;
            if (obj2 instanceof cbc) {
                z2 = ((cbc) obj2).a(f) || z2;
            }
            z = z2 || z;
        }
        if (z) {
            this.a.A();
            if (f == 1.0f) {
                l(true);
            }
        }
    }

    public final u66 i(int i) {
        return (u66) this.b.get(i);
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
            u66 u66Var = (u66) obj;
            Object obj2 = u66Var.a;
            bbc bbcVar = u66Var.f;
            cbc cbcVar = u66Var.e;
            if (obj2 instanceof v66) {
                v66 v66Var = (v66) obj2;
                boolean z2 = u66Var.b == 0;
                arrayList2.size();
                int b = v66Var.b(z2);
                int width = v66Var.getWidth();
                int height = v66Var.getHeight();
                int i6 = b + width + i;
                int i7 = i2 + b + height;
                if (!z || u66Var.c() <= 0.0f) {
                    arrayList = arrayList2;
                    cbcVar.d(i, i2, i6, i7);
                    bbcVar.d(b);
                } else {
                    float f = i;
                    float f2 = i2;
                    float f3 = i6;
                    arrayList = arrayList2;
                    float f4 = i7;
                    if (cbcVar.b(f, f2, f3, f4)) {
                        k();
                        cbcVar.e(f, f2, f3, f4);
                    }
                    float f5 = b;
                    if (bbcVar.b(f5)) {
                        k();
                        bbcVar.c = f5;
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
                Object obj4 = ((u66) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj5 = arrayList3.get(i9);
            i9++;
            Object obj6 = ((u66) obj5).a;
        }
        w66 w66Var = this.d;
        if (!z) {
            w66Var.f.d(i);
            w66Var.g.d(i2);
            w66Var.d.d(i3);
            w66Var.e.d(i4);
            w66Var.a.c();
            return;
        }
        bbc bbcVar2 = w66Var.f;
        t66 t66Var = w66Var.a;
        bbc bbcVar3 = w66Var.e;
        bbc bbcVar4 = w66Var.d;
        bbc bbcVar5 = w66Var.g;
        float f6 = i;
        if (bbcVar2.b(f6)) {
            k();
            w66Var.f.c = f6;
        }
        float f7 = i2;
        if (bbcVar5.b(f7)) {
            k();
            bbcVar5.c = f7;
        }
        float f8 = i3;
        if (bbcVar4.b(f8)) {
            k();
            bbcVar4.c = f8;
        }
        float f9 = i4;
        if (bbcVar3.b(f9)) {
            k();
            bbcVar3.c = f9;
        }
        if (t66Var.l()) {
            k();
            t66Var.o();
        }
    }

    public final void k() {
        if (this.f) {
            return;
        }
        this.f = true;
        h94 h94Var = this.c;
        if (h94Var == null) {
            l(false);
            return;
        }
        h94Var.b();
        l(false);
        h94Var.c(0.0f);
    }

    public final void l(boolean z) {
        ArrayList arrayList = this.b;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u66 u66Var = (u66) arrayList.get(size);
            u66Var.a(z);
            if (u66Var.c() == 0.0f && u66Var.h) {
                arrayList.remove(size);
                Object obj = u66Var.a;
                if (obj instanceof nf3) {
                    ((nf3) obj).a();
                }
                z2 = true;
            }
        }
        if (z2) {
            arrayList.trimToSize();
        }
        w66 w66Var = this.d;
        w66Var.b.c(z);
        w66Var.d.c(z);
        w66Var.e.c(z);
        w66Var.f.c(z);
        w66Var.g.c(z);
        w66Var.c.c(z);
        w66Var.a.j(z);
    }

    public final void m(List list, boolean z) {
        boolean isEmpty;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        h94 h94Var = this.c;
        w66 w66Var = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z) {
            if (h94Var != null) {
                h94Var.b();
                l(false);
                h94Var.c(0.0f);
            } else {
                l(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((u66) arrayList2.get(size)).a;
                if (obj instanceof nf3) {
                    ((nf3) obj).a();
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
                    u66 u66Var = new u66(arrayList.size(), it.next(), true);
                    arrayList2.add(u66Var);
                    arrayList.add(u66Var);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            w66Var.a(size2, false);
            j(false);
            this.a.A();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (((u66) arrayList.get(i2)).equals(list.get(i2))) {
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
                    if (((u66) obj2).d.b(0.0f)) {
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
                    u66 u66Var2 = (u66) obj3;
                    if (u66Var2.d.b(0.0f)) {
                        k();
                        u66Var2.d.c = 0.0f;
                        u66Var2.h = true;
                        int binarySearch = Collections.binarySearch(arrayList, u66Var2);
                        if (binarySearch >= 0) {
                            arrayList.remove(binarySearch);
                        }
                        w66Var.a(arrayList.size(), true);
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
                u66 u66Var3 = (u66) arrayList2.get(i6);
                Object obj4 = u66Var3.a;
                bbc bbcVar = u66Var3.d;
                bbc bbcVar2 = u66Var3.c;
                int indexOf = list.indexOf(obj4);
                if (indexOf != -1) {
                    i5++;
                    float f = indexOf;
                    if (bbcVar2.b(f)) {
                        k();
                        bbcVar2.c = f;
                    }
                    if (u66Var3.b != indexOf) {
                        u66Var3.b = indexOf;
                        z5 = z5 || !u66Var3.h;
                        z6 = true;
                    }
                    if (bbcVar.b(1.0f)) {
                        k();
                        bbcVar.c = 1.0f;
                        u66Var3.h = false;
                        arrayList.add(u66Var3);
                        w66Var.a(arrayList.size(), true);
                        z5 = true;
                    }
                } else if (bbcVar.b(0.0f)) {
                    k();
                    bbcVar.c = 0.0f;
                    u66Var3.h = true;
                    if (z5) {
                        z4 = arrayList.remove(u66Var3);
                    } else {
                        int binarySearch2 = Collections.binarySearch(arrayList, u66Var3);
                        if (binarySearch2 >= 0) {
                            arrayList.remove(binarySearch2);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    if (!z4) {
                        i98.g();
                        return;
                    }
                    w66Var.a(arrayList.size(), true);
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
                            if (((u66) obj6).a == null) {
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
                            if (obj5.equals(((u66) obj7).a)) {
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
                        u66 u66Var4 = new u66(i7, obj5, false);
                        u66Var4.d.c = 1.0f;
                        u66Var4.h = false;
                        arrayList2.add(u66Var4);
                        int binarySearch3 = Collections.binarySearch(arrayList, u66Var4);
                        if (binarySearch3 >= 0) {
                            u36.j("Element already exists in list");
                            return;
                        } else {
                            arrayList.add((-binarySearch3) - 1, u66Var4);
                            w66Var.a(arrayList.size(), true);
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
            if (h94Var != null) {
                h94Var.a(1.0f);
                return;
            }
            return;
        }
        if (h94Var == null) {
            int size7 = arrayList2.size();
            int i10 = 0;
            while (i10 < size7) {
                Object obj8 = arrayList2.get(i10);
                i10++;
                u66 u66Var5 = (u66) obj8;
                bbc bbcVar3 = u66Var5.d;
                bbcVar3.b = bbcVar3.a;
                bbc bbcVar4 = u66Var5.c;
                bbcVar4.b = bbcVar4.a;
            }
        }
    }
}
