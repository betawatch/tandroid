package te;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.ui.Components.n;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class h implements Iterable {
    public final d a;
    public final c c;
    public final g d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public h(d dVar, Interpolator interpolator, long j3) {
        this.a = dVar;
        this.d = new g(this, dVar);
        if (interpolator == null || j3 <= 0) {
            this.c = null;
        } else {
            this.c = new c(0, new n(this), interpolator, j3);
        }
    }

    public final void f(float f10) {
        g gVar = this.d;
        boolean z9 = gVar.a.B(f10) || (gVar.c.a(f10) || (gVar.g.a(f10) || (gVar.f.a(f10) || (gVar.e.a(f10) || (gVar.d.a(f10) || gVar.b.a(f10))))));
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e eVar = (e) obj;
            boolean z10 = eVar.f.a(f10) || (eVar.e.a(f10) || (eVar.d.a(f10) || eVar.c.a(f10)));
            Object obj2 = eVar.a;
            if (obj2 instanceof l) {
                z10 = ((l) obj2).a(f10) || z10;
            }
            z9 = z10 || z9;
        }
        if (z9) {
            this.a.Y0();
            if (f10 == 1.0f) {
                l(true);
            }
        }
    }

    public final e i(int i7) {
        return (e) this.b.get(i7);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final void j(boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            e eVar = (e) obj;
            Object obj2 = eVar.a;
            k kVar = eVar.f;
            l lVar = eVar.e;
            if (obj2 instanceof f) {
                f fVar = (f) obj2;
                boolean z10 = eVar.b == 0;
                arrayList2.size();
                int b10 = fVar.b(z10);
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                int i14 = b10 + width + i7;
                int i15 = i10 + b10 + height;
                if (!z9 || eVar.c() <= 0.0f) {
                    arrayList = arrayList2;
                    lVar.d(i7, i10, i14, i15);
                    kVar.d(b10);
                } else {
                    float f10 = i7;
                    float f11 = i10;
                    float f12 = i14;
                    arrayList = arrayList2;
                    float f13 = i15;
                    if (lVar.b(f10, f11, f12, f13)) {
                        k();
                        lVar.e(f10, f11, f12, f13);
                    }
                    float f14 = b10;
                    if (kVar.b(f14)) {
                        k();
                        kVar.c = f14;
                    }
                }
                i11 = Math.max(i11, width);
                i12 = Math.max(i12, height);
                i10 = i15;
                i7 = i14;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.b;
        if (z9) {
            int size2 = arrayList3.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                Object obj4 = ((e) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i17 = 0;
        while (i17 < size3) {
            Object obj5 = arrayList3.get(i17);
            i17++;
            Object obj6 = ((e) obj5).a;
        }
        g gVar = this.d;
        if (!z9) {
            gVar.f.d(i7);
            gVar.g.d(i10);
            gVar.d.d(i11);
            gVar.e.d(i12);
            gVar.a.a();
            return;
        }
        k kVar2 = gVar.f;
        d dVar = gVar.a;
        k kVar3 = gVar.e;
        k kVar4 = gVar.d;
        k kVar5 = gVar.g;
        float f15 = i7;
        if (kVar2.b(f15)) {
            k();
            gVar.f.c = f15;
        }
        float f16 = i10;
        if (kVar5.b(f16)) {
            k();
            kVar5.c = f16;
        }
        float f17 = i11;
        if (kVar4.b(f17)) {
            k();
            kVar4.c = f17;
        }
        float f18 = i12;
        if (kVar3.b(f18)) {
            k();
            kVar3.c = f18;
        }
        if (dVar.A()) {
            k();
            dVar.D();
        }
    }

    public final void k() {
        if (this.f) {
            return;
        }
        this.f = true;
        c cVar = this.c;
        if (cVar == null) {
            l(false);
            return;
        }
        cVar.b();
        l(false);
        cVar.c(0.0f);
    }

    public final void l(boolean z9) {
        ArrayList arrayList = this.b;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e eVar = (e) arrayList.get(size);
            eVar.a(z9);
            if (eVar.c() == 0.0f && eVar.h) {
                arrayList.remove(size);
                Object obj = eVar.a;
                if (obj instanceof we.a) {
                    ((we.a) obj).a();
                }
                z10 = true;
            }
        }
        if (z10) {
            arrayList.trimToSize();
        }
        g gVar = this.d;
        gVar.b.c(z9);
        gVar.d.c(z9);
        gVar.e.c(z9);
        gVar.f.c(z9);
        gVar.g.c(z9);
        gVar.c.c(z9);
        gVar.a.l(z9);
    }

    public final void m(List list, boolean z9) {
        boolean isEmpty;
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        c cVar = this.c;
        g gVar = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z9) {
            if (cVar != null) {
                cVar.b();
                l(false);
                cVar.c(0.0f);
            } else {
                l(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((e) arrayList2.get(size)).a;
                if (obj instanceof we.a) {
                    ((we.a) obj).a();
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
                    e eVar = new e(arrayList.size(), it.next(), true);
                    arrayList2.add(eVar);
                    arrayList.add(eVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            g.a(gVar, size2, false);
            j(false);
            this.a.Y0();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (((e) arrayList.get(i10)).equals(list.get(i10))) {
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
                int i11 = 0;
                while (true) {
                    if (i11 >= size3) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (((e) obj2).d.b(0.0f)) {
                        k();
                        break;
                    }
                }
            }
            if (this.f) {
                int size4 = arrayList2.size();
                int i12 = 0;
                while (i12 < size4) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    e eVar2 = (e) obj3;
                    if (eVar2.d.b(0.0f)) {
                        k();
                        eVar2.d.c = 0.0f;
                        eVar2.h = true;
                        int binarySearch = Collections.binarySearch(arrayList, eVar2);
                        if (binarySearch >= 0) {
                            arrayList.remove(binarySearch);
                        }
                        g.a(gVar, arrayList.size(), true);
                    }
                }
            }
            z10 = true;
            z11 = false;
        } else {
            boolean z13 = false;
            int i13 = 0;
            boolean z14 = false;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                e eVar3 = (e) arrayList2.get(i14);
                Object obj4 = eVar3.a;
                k kVar = eVar3.d;
                k kVar2 = eVar3.c;
                int indexOf = list.indexOf(obj4);
                if (indexOf != -1) {
                    i13++;
                    float f10 = indexOf;
                    if (kVar2.b(f10)) {
                        k();
                        kVar2.c = f10;
                    }
                    if (eVar3.b != indexOf) {
                        eVar3.b = indexOf;
                        z13 = z13 || !eVar3.h;
                        z14 = true;
                    }
                    if (kVar.b(1.0f)) {
                        k();
                        kVar.c = 1.0f;
                        eVar3.h = false;
                        arrayList.add(eVar3);
                        g.a(gVar, arrayList.size(), true);
                        z13 = true;
                    }
                } else if (kVar.b(0.0f)) {
                    k();
                    kVar.c = 0.0f;
                    eVar3.h = true;
                    if (z13) {
                        z12 = arrayList.remove(eVar3);
                    } else {
                        int binarySearch2 = Collections.binarySearch(arrayList, eVar3);
                        if (binarySearch2 >= 0) {
                            arrayList.remove(binarySearch2);
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (!z12) {
                        throw new IllegalArgumentException();
                    }
                    g.a(gVar, arrayList.size(), true);
                } else {
                    continue;
                }
            }
            if (z13) {
                Collections.sort(arrayList);
            }
            if (i13 < list.size()) {
                arrayList2.ensureCapacity((list.size() - i13) + arrayList2.size());
                int i15 = 0;
                for (Object obj5 : list) {
                    if (obj5 == null) {
                        int size5 = arrayList2.size();
                        i7 = 0;
                        int i16 = 0;
                        while (i16 < size5) {
                            Object obj6 = arrayList2.get(i16);
                            i16++;
                            if (((e) obj6).a == null) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        i7 = -1;
                    } else {
                        int size6 = arrayList2.size();
                        i7 = 0;
                        int i17 = 0;
                        while (i17 < size6) {
                            Object obj7 = arrayList2.get(i17);
                            i17++;
                            if (obj5.equals(((e) obj7).a)) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        i7 = -1;
                    }
                    if (i7 == -1) {
                        if (i15 != arrayList2.size()) {
                            z14 = true;
                        }
                        k();
                        e eVar4 = new e(i15, obj5, false);
                        eVar4.d.c = 1.0f;
                        eVar4.h = false;
                        arrayList2.add(eVar4);
                        int binarySearch3 = Collections.binarySearch(arrayList, eVar4);
                        if (binarySearch3 >= 0) {
                            throw new IllegalArgumentException("Element already exists in list");
                        }
                        arrayList.add((-binarySearch3) - 1, eVar4);
                        g.a(gVar, arrayList.size(), true);
                    }
                    i15++;
                }
            }
            z11 = z14;
            z10 = true;
        }
        if (z11) {
            Collections.sort(arrayList2);
        }
        j(z10);
        if (this.f) {
            this.f = false;
            if (cVar != null) {
                cVar.a(1.0f);
                return;
            }
            return;
        }
        if (cVar == null) {
            int size7 = arrayList2.size();
            int i18 = 0;
            while (i18 < size7) {
                Object obj8 = arrayList2.get(i18);
                i18++;
                e eVar5 = (e) obj8;
                k kVar3 = eVar5.d;
                kVar3.b = kVar3.a;
                k kVar4 = eVar5.c;
                kVar4.b = kVar4.a;
            }
        }
    }
}
