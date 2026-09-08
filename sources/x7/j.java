package x7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j extends AbstractMap implements Serializable {
    public static final Object s = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f;
    public transient h h;
    public transient h n;
    public transient e9.n r;

    public final Map a() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i10, int i11) {
        Object obj = this.a;
        obj.getClass();
        int[] iArr = this.b;
        iArr.getClass();
        Object[] objArr = this.c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
            return;
        }
        Object obj2 = objArr[i12];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[i12];
        objArr[i12] = null;
        objArr2[i12] = null;
        iArr[i10] = iArr[i12];
        iArr[i12] = 0;
        int a2 = w7.i8.a(obj2) & i11;
        int b10 = w7.h8.b(a2, obj);
        if (b10 == size) {
            w7.h8.d(a2, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = b10 - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            b10 = i15;
        }
    }

    public final boolean c() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.e += 32;
        Map a2 = a();
        if (a2 != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            a2.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f, (Object) null);
        Object[] objArr2 = this.d;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f, (Object) null);
        Object obj = this.a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.b;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a2 = a();
        return a2 != null ? a2.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            Object[] objArr = this.d;
            objArr.getClass();
            if (w7.l8.a(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int a2 = w7.i8.a(obj);
        int d = d();
        Object obj2 = this.a;
        obj2.getClass();
        int b10 = w7.h8.b(a2 & d, obj2);
        if (b10 != 0) {
            int i10 = ~d;
            int i11 = a2 & i10;
            do {
                int i12 = b10 - 1;
                int[] iArr = this.b;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.c;
                    objArr.getClass();
                    if (w7.l8.a(obj, objArr[i12])) {
                        return i12;
                    }
                }
                b10 = i13 & d;
            } while (b10 != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        h hVar = this.n;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.n = hVar2;
        return hVar2;
    }

    public final int f(int i10, int i11, int i12, int i13) {
        Object c10 = w7.h8.c(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            w7.h8.d(i12 & i14, i13 + 1, c10);
        }
        Object obj = this.a;
        obj.getClass();
        int[] iArr = this.b;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int b10 = w7.h8.b(i15, obj);
            while (b10 != 0) {
                int i16 = b10 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int b11 = w7.h8.b(i19, c10);
                w7.h8.d(i19, b10, c10);
                iArr[i16] = ((~i14) & i18) | (b11 & i14);
                b10 = i17 & i10;
            }
        }
        this.a = c10;
        this.e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.e & (-32));
        return i14;
    }

    public final Object g(Object obj) {
        if (!c()) {
            int d = d();
            Object obj2 = this.a;
            obj2.getClass();
            int[] iArr = this.b;
            iArr.getClass();
            Object[] objArr = this.c;
            objArr.getClass();
            int a2 = w7.h8.a(obj, null, d, obj2, iArr, objArr, null);
            if (a2 != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[a2];
                b(a2, d);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.get(obj);
        }
        int e7 = e(obj);
        if (e7 == -1) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[e7];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        h hVar = this.h;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.h = hVar2;
        return hVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i10 = this.e;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = TLObject.FLAG_30;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = w7.h8.c(max2);
            this.e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.e & (-32));
            this.b = new int[i10];
            this.c = new Object[i10];
            this.d = new Object[i10];
        }
        Map a2 = a();
        if (a2 != null) {
            return a2.put(obj, obj2);
        }
        int[] iArr = this.b;
        iArr.getClass();
        Object[] objArr = this.c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int i11 = this.f;
        int i12 = i11 + 1;
        int a10 = w7.i8.a(obj);
        int d = d();
        int i13 = a10 & d;
        Object obj3 = this.a;
        obj3.getClass();
        int b10 = w7.h8.b(i13, obj3);
        if (b10 != 0) {
            int i14 = ~d;
            int i15 = a10 & i14;
            int i16 = 0;
            while (true) {
                int i17 = b10 - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && w7.l8.a(obj, objArr[i17])) {
                    Object obj4 = objArr2[i17];
                    objArr2[i17] = obj2;
                    return obj4;
                }
                int i20 = i18 & d;
                int i21 = i16 + 1;
                if (i20 != 0) {
                    i16 = i21;
                    b10 = i20;
                } else {
                    if (i21 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        int i22 = isEmpty() ? -1 : 0;
                        while (i22 >= 0) {
                            Object[] objArr3 = this.c;
                            objArr3.getClass();
                            Object obj5 = objArr3[i22];
                            Object[] objArr4 = this.d;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[i22]);
                            int i23 = i22 + 1;
                            i22 = i23 < this.f ? i23 : -1;
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i12 > d) {
                        d = f(d, (d + 1) * (d < 32 ? 4 : 2), a10, i11);
                    } else {
                        iArr[i17] = (i12 & d) | i19;
                    }
                }
            }
        } else if (i12 > d) {
            d = f(d, (d + 1) * (d < 32 ? 4 : 2), a10, i11);
        } else {
            Object obj6 = this.a;
            obj6.getClass();
            w7.h8.d(i13, i12, obj6);
        }
        int[] iArr2 = this.b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.b;
            iArr3.getClass();
            this.b = Arrays.copyOf(iArr3, min);
            Object[] objArr5 = this.c;
            objArr5.getClass();
            this.c = Arrays.copyOf(objArr5, min);
            Object[] objArr6 = this.d;
            objArr6.getClass();
            this.d = Arrays.copyOf(objArr6, min);
        }
        int[] iArr4 = this.b;
        iArr4.getClass();
        iArr4[i11] = (~d) & a10;
        Object[] objArr7 = this.c;
        objArr7.getClass();
        objArr7[i11] = obj;
        Object[] objArr8 = this.d;
        objArr8.getClass();
        objArr8[i11] = obj2;
        this.f = i12;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == s) {
            return null;
        }
        return g10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a2 = a();
        return a2 != null ? a2.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        e9.n nVar = this.r;
        if (nVar != null) {
            return nVar;
        }
        e9.n nVar2 = new e9.n(3, this);
        this.r = nVar2;
        return nVar2;
    }
}
