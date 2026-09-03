package ra;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l extends AbstractMap implements Serializable {
    public static final b7.r r = new b7.r(6);
    public final boolean b;
    public k c;
    public final k f;
    public j h;
    public j n;
    public int d = 0;
    public int e = 0;
    public final Comparator a = r;

    public l(boolean z4) {
        this.b = z4;
        this.f = new k(z4);
    }

    public final k a(Object obj, boolean z4) {
        int i10;
        k kVar;
        k kVar2 = this.c;
        b7.r rVar = r;
        Comparator comparator = this.a;
        if (kVar2 != null) {
            Comparable comparable = comparator == rVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = kVar2.f;
                i10 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i10 == 0) {
                    return kVar2;
                }
                k kVar3 = i10 < 0 ? kVar2.b : kVar2.c;
                if (kVar3 == null) {
                    break;
                }
                kVar2 = kVar3;
            }
        } else {
            i10 = 0;
        }
        k kVar4 = kVar2;
        if (!z4) {
            return null;
        }
        k kVar5 = this.f;
        if (kVar4 != null) {
            kVar = new k(this.b, kVar4, obj, kVar5, kVar5.e);
            if (i10 < 0) {
                kVar4.b = kVar;
            } else {
                kVar4.c = kVar;
            }
            b(kVar4, true);
        } else {
            if (comparator == rVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.b, kVar4, obj, kVar5, kVar5.e);
            this.c = kVar;
        }
        this.d++;
        this.e++;
        return kVar;
    }

    public final void b(k kVar, boolean z4) {
        while (kVar != null) {
            k kVar2 = kVar.b;
            k kVar3 = kVar.c;
            int i10 = kVar2 != null ? kVar2.r : 0;
            int i11 = kVar3 != null ? kVar3.r : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                k kVar4 = kVar3.b;
                k kVar5 = kVar3.c;
                int i13 = (kVar4 != null ? kVar4.r : 0) - (kVar5 != null ? kVar5.r : 0);
                if (i13 == -1 || (i13 == 0 && !z4)) {
                    e(kVar);
                } else {
                    f(kVar3);
                    e(kVar);
                }
                if (z4) {
                    return;
                }
            } else if (i12 == 2) {
                k kVar6 = kVar2.b;
                k kVar7 = kVar2.c;
                int i14 = (kVar6 != null ? kVar6.r : 0) - (kVar7 != null ? kVar7.r : 0);
                if (i14 == 1 || (i14 == 0 && !z4)) {
                    f(kVar);
                } else {
                    e(kVar2);
                    f(kVar);
                }
                if (z4) {
                    return;
                }
            } else if (i12 == 0) {
                kVar.r = i10 + 1;
                if (z4) {
                    return;
                }
            } else {
                kVar.r = Math.max(i10, i11) + 1;
                if (!z4) {
                    return;
                }
            }
            kVar = kVar.a;
        }
    }

    public final void c(k kVar, boolean z4) {
        k kVar2;
        k kVar3;
        int i10;
        if (z4) {
            k kVar4 = kVar.e;
            kVar4.d = kVar.d;
            kVar.d.e = kVar4;
        }
        k kVar5 = kVar.b;
        k kVar6 = kVar.c;
        k kVar7 = kVar.a;
        int i11 = 0;
        if (kVar5 == null || kVar6 == null) {
            if (kVar5 != null) {
                d(kVar, kVar5);
                kVar.b = null;
            } else if (kVar6 != null) {
                d(kVar, kVar6);
                kVar.c = null;
            } else {
                d(kVar, null);
            }
            b(kVar7, false);
            this.d--;
            this.e++;
            return;
        }
        if (kVar5.r > kVar6.r) {
            k kVar8 = kVar5.c;
            while (true) {
                k kVar9 = kVar8;
                kVar3 = kVar5;
                kVar5 = kVar9;
                if (kVar5 == null) {
                    break;
                } else {
                    kVar8 = kVar5.c;
                }
            }
        } else {
            k kVar10 = kVar6.b;
            while (true) {
                kVar2 = kVar6;
                kVar6 = kVar10;
                if (kVar6 == null) {
                    break;
                } else {
                    kVar10 = kVar6.b;
                }
            }
            kVar3 = kVar2;
        }
        c(kVar3, false);
        k kVar11 = kVar.b;
        if (kVar11 != null) {
            i10 = kVar11.r;
            kVar3.b = kVar11;
            kVar11.a = kVar3;
            kVar.b = null;
        } else {
            i10 = 0;
        }
        k kVar12 = kVar.c;
        if (kVar12 != null) {
            i11 = kVar12.r;
            kVar3.c = kVar12;
            kVar12.a = kVar3;
            kVar.c = null;
        }
        kVar3.r = Math.max(i10, i11) + 1;
        d(kVar, kVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        k kVar = this.f;
        kVar.e = kVar;
        kVar.d = kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        k kVar = null;
        if (obj != null) {
            try {
                kVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return kVar != null;
    }

    public final void d(k kVar, k kVar2) {
        k kVar3 = kVar.a;
        kVar.a = null;
        if (kVar2 != null) {
            kVar2.a = kVar3;
        }
        if (kVar3 == null) {
            this.c = kVar2;
        } else if (kVar3.b == kVar) {
            kVar3.b = kVar2;
        } else {
            kVar3.c = kVar2;
        }
    }

    public final void e(k kVar) {
        k kVar2 = kVar.b;
        k kVar3 = kVar.c;
        k kVar4 = kVar3.b;
        k kVar5 = kVar3.c;
        kVar.c = kVar4;
        if (kVar4 != null) {
            kVar4.a = kVar;
        }
        d(kVar, kVar3);
        kVar3.b = kVar;
        kVar.a = kVar3;
        int max = Math.max(kVar2 != null ? kVar2.r : 0, kVar4 != null ? kVar4.r : 0) + 1;
        kVar.r = max;
        kVar3.r = Math.max(max, kVar5 != null ? kVar5.r : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j jVar = this.h;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.h = jVar2;
        return jVar2;
    }

    public final void f(k kVar) {
        k kVar2 = kVar.b;
        k kVar3 = kVar.c;
        k kVar4 = kVar2.b;
        k kVar5 = kVar2.c;
        kVar.b = kVar5;
        if (kVar5 != null) {
            kVar5.a = kVar;
        }
        d(kVar, kVar2);
        kVar2.c = kVar;
        kVar.a = kVar2;
        int max = Math.max(kVar3 != null ? kVar3.r : 0, kVar5 != null ? kVar5.r : 0) + 1;
        kVar.r = max;
        kVar2.r = Math.max(max, kVar4 != null ? kVar4.r : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        k kVar;
        if (obj != null) {
            try {
                kVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (kVar == null) {
                return kVar.n;
            }
            return null;
        }
        kVar = null;
        if (kVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j jVar = this.n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.n = jVar2;
        return jVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        k a2 = a(obj, true);
        Object obj3 = a2.n;
        a2.n = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        k kVar;
        if (obj != null) {
            try {
                kVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (kVar != null) {
                c(kVar, true);
            }
            if (kVar == null) {
                return kVar.n;
            }
            return null;
        }
        kVar = null;
        if (kVar != null) {
        }
        if (kVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
