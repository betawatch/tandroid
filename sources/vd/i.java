package vd;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements Iterable {
    public final e a;
    public final c c;
    public final h d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public i(e eVar, Interpolator interpolator, long j10) {
        this.a = eVar;
        this.d = new h(this, eVar);
        if (interpolator == null || j10 <= 0) {
            this.c = null;
            return;
        }
        d dVar = new d();
        dVar.a = this;
        this.c = new c(0, dVar, interpolator, j10);
    }

    public final void i(float f9) {
        h hVar = this.d;
        boolean z10 = hVar.a.k(f9) || (hVar.c.a(f9) || (hVar.g.a(f9) || (hVar.f.a(f9) || (hVar.e.a(f9) || (hVar.d.a(f9) || hVar.b.a(f9))))));
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f fVar = (f) obj;
            boolean z11 = fVar.f.a(f9) || (fVar.e.a(f9) || (fVar.d.a(f9) || fVar.c.a(f9)));
            Object obj2 = fVar.a;
            if (obj2 instanceof m) {
                z11 = ((m) obj2).a(f9) || z11;
            }
            z10 = z11 || z10;
        }
        if (z10) {
            this.a.w();
            if (f9 == 1.0f) {
                q(true);
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final f n(int i10) {
        return (f) this.b.get(i10);
    }

    public final void o(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            f fVar = (f) obj;
            Object obj2 = fVar.a;
            l lVar = fVar.f;
            m mVar = fVar.e;
            if (obj2 instanceof g) {
                g gVar = (g) obj2;
                boolean z11 = fVar.b == 0;
                arrayList2.size();
                int b10 = gVar.b(z11);
                int width = gVar.getWidth();
                int height = gVar.getHeight();
                int i15 = b10 + width + i10;
                int i16 = i11 + b10 + height;
                if (!z10 || fVar.c() <= 0.0f) {
                    arrayList = arrayList2;
                    mVar.d(i10, i11, i15, i16);
                    lVar.d(b10);
                } else {
                    float f9 = i10;
                    float f10 = i11;
                    float f11 = i15;
                    arrayList = arrayList2;
                    float f12 = i16;
                    if (mVar.b(f9, f10, f11, f12)) {
                        p();
                        mVar.e(f9, f10, f11, f12);
                    }
                    float f13 = b10;
                    if (lVar.b(f13)) {
                        p();
                        lVar.c = f13;
                    }
                }
                i12 = Math.max(i12, width);
                i13 = Math.max(i13, height);
                i11 = i16;
                i10 = i15;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.b;
        if (z10) {
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                Object obj4 = ((f) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i18 = 0;
        while (i18 < size3) {
            Object obj5 = arrayList3.get(i18);
            i18++;
            Object obj6 = ((f) obj5).a;
        }
        h hVar = this.d;
        if (!z10) {
            hVar.f.d(i10);
            hVar.g.d(i11);
            hVar.d.d(i12);
            hVar.e.d(i13);
            hVar.a.a();
            return;
        }
        l lVar2 = hVar.f;
        e eVar = hVar.a;
        l lVar3 = hVar.e;
        l lVar4 = hVar.d;
        l lVar5 = hVar.g;
        float f14 = i10;
        if (lVar2.b(f14)) {
            p();
            hVar.f.c = f14;
        }
        float f15 = i11;
        if (lVar5.b(f15)) {
            p();
            lVar5.c = f15;
        }
        float f16 = i12;
        if (lVar4.b(f16)) {
            p();
            lVar4.c = f16;
        }
        float f17 = i13;
        if (lVar3.b(f17)) {
            p();
            lVar3.c = f17;
        }
        if (eVar.j()) {
            p();
            eVar.l();
        }
    }

    public final void p() {
        if (this.f) {
            return;
        }
        this.f = true;
        c cVar = this.c;
        if (cVar == null) {
            q(false);
            return;
        }
        cVar.b();
        q(false);
        cVar.c(0.0f);
    }

    public final void q(boolean z10) {
        ArrayList arrayList = this.b;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            fVar.a(z10);
            if (fVar.c() == 0.0f && fVar.h) {
                arrayList.remove(size);
                Object obj = fVar.a;
                if (obj instanceof yd.a) {
                    ((yd.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        h hVar = this.d;
        hVar.b.c(z10);
        hVar.d.c(z10);
        hVar.e.c(z10);
        hVar.f.c(z10);
        hVar.g.c(z10);
        hVar.c.c(z10);
        hVar.a.h(z10);
    }

    public final void r(List list, boolean z10) {
        boolean isEmpty;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        c cVar = this.c;
        h hVar = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z10) {
            if (cVar != null) {
                cVar.b();
                q(false);
                cVar.c(0.0f);
            } else {
                q(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((f) arrayList2.get(size)).a;
                if (obj instanceof yd.a) {
                    ((yd.a) obj).a();
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
                    f fVar = new f(arrayList.size(), it.next(), true);
                    arrayList2.add(fVar);
                    arrayList.add(fVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            h.a(hVar, size2, false);
            o(false);
            this.a.w();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (((f) arrayList.get(i11)).equals(list.get(i11))) {
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
        p();
        if (list == null || list.isEmpty()) {
            if (!this.f) {
                int size3 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    if (((f) obj2).d.b(0.0f)) {
                        p();
                        break;
                    }
                }
            }
            if (this.f) {
                int size4 = arrayList2.size();
                int i13 = 0;
                while (i13 < size4) {
                    Object obj3 = arrayList2.get(i13);
                    i13++;
                    f fVar2 = (f) obj3;
                    if (fVar2.d.b(0.0f)) {
                        p();
                        fVar2.d.c = 0.0f;
                        fVar2.h = true;
                        int binarySearch = Collections.binarySearch(arrayList, fVar2);
                        if (binarySearch >= 0) {
                            arrayList.remove(binarySearch);
                        }
                        h.a(hVar, arrayList.size(), true);
                    }
                }
            }
            z11 = true;
            z12 = false;
        } else {
            boolean z14 = false;
            int i14 = 0;
            boolean z15 = false;
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                f fVar3 = (f) arrayList2.get(i15);
                Object obj4 = fVar3.a;
                l lVar = fVar3.d;
                l lVar2 = fVar3.c;
                int indexOf = list.indexOf(obj4);
                if (indexOf != -1) {
                    i14++;
                    float f9 = indexOf;
                    if (lVar2.b(f9)) {
                        p();
                        lVar2.c = f9;
                    }
                    if (fVar3.b != indexOf) {
                        fVar3.b = indexOf;
                        z14 = z14 || !fVar3.h;
                        z15 = true;
                    }
                    if (lVar.b(1.0f)) {
                        p();
                        lVar.c = 1.0f;
                        fVar3.h = false;
                        arrayList.add(fVar3);
                        h.a(hVar, arrayList.size(), true);
                        z14 = true;
                    }
                } else if (lVar.b(0.0f)) {
                    p();
                    lVar.c = 0.0f;
                    fVar3.h = true;
                    if (z14) {
                        z13 = arrayList.remove(fVar3);
                    } else {
                        int binarySearch2 = Collections.binarySearch(arrayList, fVar3);
                        if (binarySearch2 >= 0) {
                            arrayList.remove(binarySearch2);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (!z13) {
                        throw new IllegalArgumentException();
                    }
                    h.a(hVar, arrayList.size(), true);
                } else {
                    continue;
                }
            }
            if (z14) {
                Collections.sort(arrayList);
            }
            if (i14 < list.size()) {
                arrayList2.ensureCapacity((list.size() - i14) + arrayList2.size());
                int i16 = 0;
                for (Object obj5 : list) {
                    if (obj5 == null) {
                        int size5 = arrayList2.size();
                        i10 = 0;
                        int i17 = 0;
                        while (i17 < size5) {
                            Object obj6 = arrayList2.get(i17);
                            i17++;
                            if (((f) obj6).a == null) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        i10 = -1;
                    } else {
                        int size6 = arrayList2.size();
                        i10 = 0;
                        int i18 = 0;
                        while (i18 < size6) {
                            Object obj7 = arrayList2.get(i18);
                            i18++;
                            if (obj5.equals(((f) obj7).a)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        i10 = -1;
                    }
                    if (i10 == -1) {
                        if (i16 != arrayList2.size()) {
                            z15 = true;
                        }
                        p();
                        f fVar4 = new f(i16, obj5, false);
                        fVar4.d.c = 1.0f;
                        fVar4.h = false;
                        arrayList2.add(fVar4);
                        int binarySearch3 = Collections.binarySearch(arrayList, fVar4);
                        if (binarySearch3 >= 0) {
                            throw new IllegalArgumentException("Element already exists in list");
                        }
                        arrayList.add((-binarySearch3) - 1, fVar4);
                        h.a(hVar, arrayList.size(), true);
                    }
                    i16++;
                }
            }
            z12 = z15;
            z11 = true;
        }
        if (z12) {
            Collections.sort(arrayList2);
        }
        o(z11);
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
            int i19 = 0;
            while (i19 < size7) {
                Object obj8 = arrayList2.get(i19);
                i19++;
                f fVar5 = (f) obj8;
                l lVar3 = fVar5.d;
                lVar3.b = lVar3.a;
                l lVar4 = fVar5.c;
                lVar4.b = lVar4.a;
            }
        }
    }
}
