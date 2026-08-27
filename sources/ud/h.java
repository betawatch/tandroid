package ud;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements Iterable {
    public final d a;
    public final c c;
    public final g d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public h(d dVar, Interpolator interpolator, long j10) {
        this.a = dVar;
        this.d = new g(this, dVar);
        if (interpolator == null || j10 <= 0) {
            this.c = null;
        } else {
            this.c = new c(0, new o0.b(this, 20), interpolator, j10);
        }
    }

    public final void i(float f10) {
        g gVar = this.d;
        boolean z10 = gVar.a.G(f10) || (gVar.c.a(f10) || (gVar.g.a(f10) || (gVar.f.a(f10) || (gVar.e.a(f10) || (gVar.d.a(f10) || gVar.b.a(f10))))));
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            boolean z11 = eVar.f.a(f10) || (eVar.e.a(f10) || (eVar.d.a(f10) || eVar.c.a(f10)));
            Object obj2 = eVar.a;
            if (obj2 instanceof l) {
                z11 = ((l) obj2).a(f10) || z11;
            }
            z10 = z11 || z10;
        }
        if (z10) {
            this.a.l1();
            if (f10 == 1.0f) {
                q(true);
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final e n(int i10) {
        return (e) this.b.get(i10);
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
            e eVar = (e) obj;
            Object obj2 = eVar.a;
            k kVar = eVar.f;
            l lVar = eVar.e;
            if (obj2 instanceof f) {
                f fVar = (f) obj2;
                boolean z11 = eVar.b == 0;
                arrayList2.size();
                int b10 = fVar.b(z11);
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                int i15 = b10 + width + i10;
                int i16 = i11 + b10 + height;
                if (!z10 || eVar.c() <= 0.0f) {
                    arrayList = arrayList2;
                    lVar.d(i10, i11, i15, i16);
                    kVar.d(b10);
                } else {
                    float f10 = i10;
                    float f11 = i11;
                    float f12 = i15;
                    arrayList = arrayList2;
                    float f13 = i16;
                    if (lVar.b(f10, f11, f12, f13)) {
                        p();
                        lVar.e(f10, f11, f12, f13);
                    }
                    float f14 = b10;
                    if (kVar.b(f14)) {
                        p();
                        kVar.c = f14;
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
                Object obj4 = ((e) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i18 = 0;
        while (i18 < size3) {
            Object obj5 = arrayList3.get(i18);
            i18++;
            Object obj6 = ((e) obj5).a;
        }
        g gVar = this.d;
        if (!z10) {
            gVar.f.d(i10);
            gVar.g.d(i11);
            gVar.d.d(i12);
            gVar.e.d(i13);
            gVar.a.b();
            return;
        }
        k kVar2 = gVar.f;
        d dVar = gVar.a;
        k kVar3 = gVar.e;
        k kVar4 = gVar.d;
        k kVar5 = gVar.g;
        float f15 = i10;
        if (kVar2.b(f15)) {
            p();
            gVar.f.c = f15;
        }
        float f16 = i11;
        if (kVar5.b(f16)) {
            p();
            kVar5.c = f16;
        }
        float f17 = i12;
        if (kVar4.b(f17)) {
            p();
            kVar4.c = f17;
        }
        float f18 = i13;
        if (kVar3.b(f18)) {
            p();
            kVar3.c = f18;
        }
        if (dVar.E()) {
            p();
            dVar.K();
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
            e eVar = (e) arrayList.get(size);
            eVar.a(z10);
            if (eVar.c() == 0.0f && eVar.h) {
                arrayList.remove(size);
                Object obj = eVar.a;
                if (obj instanceof xd.a) {
                    ((xd.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        g gVar = this.d;
        gVar.b.c(z10);
        gVar.d.c(z10);
        gVar.e.c(z10);
        gVar.f.c(z10);
        gVar.g.c(z10);
        gVar.c.c(z10);
        gVar.a.A(z10);
    }

    public final void r(List list, boolean z10) {
        boolean isEmpty;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        c cVar = this.c;
        g gVar = this.d;
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
                Object obj = ((e) arrayList2.get(size)).a;
                if (obj instanceof xd.a) {
                    ((xd.a) obj).a();
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
            o(false);
            this.a.l1();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (((e) arrayList.get(i11)).equals(list.get(i11))) {
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
                    if (((e) obj2).d.b(0.0f)) {
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
                    e eVar2 = (e) obj3;
                    if (eVar2.d.b(0.0f)) {
                        p();
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
            z11 = true;
            z12 = false;
        } else {
            boolean z14 = false;
            int i14 = 0;
            boolean z15 = false;
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                e eVar3 = (e) arrayList2.get(i15);
                Object obj4 = eVar3.a;
                k kVar = eVar3.d;
                k kVar2 = eVar3.c;
                int indexOf = list.indexOf(obj4);
                if (indexOf != -1) {
                    i14++;
                    float f10 = indexOf;
                    if (kVar2.b(f10)) {
                        p();
                        kVar2.c = f10;
                    }
                    if (eVar3.b != indexOf) {
                        eVar3.b = indexOf;
                        z14 = z14 || !eVar3.h;
                        z15 = true;
                    }
                    if (kVar.b(1.0f)) {
                        p();
                        kVar.c = 1.0f;
                        eVar3.h = false;
                        arrayList.add(eVar3);
                        g.a(gVar, arrayList.size(), true);
                        z14 = true;
                    }
                } else if (kVar.b(0.0f)) {
                    p();
                    kVar.c = 0.0f;
                    eVar3.h = true;
                    if (z14) {
                        z13 = arrayList.remove(eVar3);
                    } else {
                        int binarySearch2 = Collections.binarySearch(arrayList, eVar3);
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
                    g.a(gVar, arrayList.size(), true);
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
                            if (((e) obj6).a == null) {
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
                            if (obj5.equals(((e) obj7).a)) {
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
                        e eVar4 = new e(i16, obj5, false);
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
                e eVar5 = (e) obj8;
                k kVar3 = eVar5.d;
                kVar3.b = kVar3.a;
                k kVar4 = eVar5.c;
                kVar4.b = kVar4.a;
            }
        }
    }
}
