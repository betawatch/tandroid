package z7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d extends AbstractMap implements Serializable {
    public static final Object s = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f;
    public transient b h;
    public transient b n;
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
        int i13 = i10 + 1;
        Object obj2 = objArr[i12];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[i12];
        objArr[i12] = null;
        objArr2[i12] = null;
        iArr[i10] = iArr[i12];
        iArr[i12] = 0;
        int a2 = w7.f9.a(obj2) & i11;
        int b10 = w7.e9.b(a2, obj);
        if (b10 == size) {
            w7.e9.d(a2, i13, obj);
            return;
        }
        while (true) {
            int i14 = b10 - 1;
            int i15 = iArr[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArr[i14] = (i15 & (~i11)) | (i11 & i13);
                return;
            }
            b10 = i16;
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
            if (w7.i9.a(obj, objArr[i10])) {
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
        int a2 = w7.f9.a(obj);
        int d = d();
        Object obj2 = this.a;
        obj2.getClass();
        int b10 = w7.e9.b(a2 & d, obj2);
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
                    if (w7.i9.a(obj, objArr[i12])) {
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
        b bVar = this.n;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 0);
        this.n = bVar2;
        return bVar2;
    }

    public final int f(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object c10 = w7.e9.c(i11);
        if (i13 != 0) {
            w7.e9.d(i12 & i14, i13 + 1, c10);
        }
        Object obj = this.a;
        obj.getClass();
        int[] iArr = this.b;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int b10 = w7.e9.b(i15, obj);
            while (b10 != 0) {
                int i16 = b10 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int b11 = w7.e9.b(i19, c10);
                w7.e9.d(i19, b10, c10);
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
            int a2 = w7.e9.a(obj, null, d, obj2, iArr, objArr, null);
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
        b bVar = this.h;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 1);
        this.h = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        int i11 = 32;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i12 = this.e;
            int max = Math.max(i12 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = TLObject.FLAG_30;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = w7.e9.c(max2);
            this.e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.e & (-32));
            this.b = new int[i12];
            this.c = new Object[i12];
            this.d = new Object[i12];
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
        int i13 = this.f;
        int i14 = i13 + 1;
        int a10 = w7.f9.a(obj);
        int d = d();
        int i15 = a10 & d;
        Object obj3 = this.a;
        obj3.getClass();
        int b10 = w7.e9.b(i15, obj3);
        if (b10 == 0) {
            if (i14 > d) {
                d = f(d, (d + 1) * (d < 32 ? 4 : 2), a10, i13);
            } else {
                Object obj4 = this.a;
                obj4.getClass();
                w7.e9.d(i15, i14, obj4);
            }
            i10 = 1;
        } else {
            int i16 = ~d;
            int i17 = a10 & i16;
            int i18 = 0;
            while (true) {
                int i19 = b10 - 1;
                int i20 = iArr[i19];
                i10 = 1;
                int i21 = i20 & i16;
                int i22 = i11;
                if (i21 == i17 && w7.i9.a(obj, objArr[i19])) {
                    Object obj5 = objArr2[i19];
                    objArr2[i19] = obj2;
                    return obj5;
                }
                int i23 = i20 & d;
                int i24 = i18 + 1;
                if (i23 != 0) {
                    i18 = i24;
                    b10 = i23;
                    i11 = i22;
                } else {
                    if (i24 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        int i25 = isEmpty() ? -1 : 0;
                        while (i25 >= 0) {
                            Object[] objArr3 = this.c;
                            objArr3.getClass();
                            Object obj6 = objArr3[i25];
                            Object[] objArr4 = this.d;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[i25]);
                            int i26 = i25 + 1;
                            i25 = i26 < this.f ? i26 : -1;
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i14 > d) {
                        d = f(d, (d + 1) * (d < i22 ? 4 : 2), a10, i13);
                    } else {
                        iArr[i19] = (i14 & d) | i21;
                    }
                }
            }
        }
        int[] iArr2 = this.b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i14 > length) {
            int i27 = i10;
            int min = Math.min(1073741823, (Math.max(i27, length >>> 1) + length) | i27);
            if (min != length) {
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
        }
        int i28 = (~d) & a10;
        int[] iArr4 = this.b;
        iArr4.getClass();
        iArr4[i13] = i28;
        Object[] objArr7 = this.c;
        objArr7.getClass();
        objArr7[i13] = obj;
        Object[] objArr8 = this.d;
        objArr8.getClass();
        objArr8[i13] = obj2;
        this.f = i14;
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
        e9.n nVar2 = new e9.n(5, this);
        this.r = nVar2;
        return nVar2;
    }
}
