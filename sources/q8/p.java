package q8;

import i7.o6;
import i7.p7;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p extends AbstractMap implements Serializable {
    public static final Object s = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient n h;
    public transient n n;
    public transient j7.m r;

    public static p a() {
        p pVar = new p();
        pVar.e = p7.b(8, 1);
        return pVar;
    }

    public final Map b() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.e += 32;
        Map b10 = b();
        if (b10 != null) {
            this.e = p7.b(size(), 3);
            b10.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f, (Object) null);
        Arrays.fill(j(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map b10 = b();
        return b10 != null ? b10.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (o6.a(obj, j()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int p10 = l.p(obj);
        int c3 = c();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int q6 = l.q(p10 & c3, obj2);
        if (q6 == 0) {
            return -1;
        }
        int i10 = ~c3;
        int i11 = p10 & i10;
        do {
            int i12 = q6 - 1;
            int i13 = h()[i12];
            if ((i13 & i10) == i11 && o6.a(obj, i()[i12])) {
                return i12;
            }
            q6 = i13 & c3;
        } while (q6 != 0);
        return -1;
    }

    public final void e(int i10, int i11) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i12 = i();
        Object[] j10 = j();
        int size = size();
        int i13 = size - 1;
        if (i10 >= i13) {
            i12[i10] = null;
            j10[i10] = null;
            h[i10] = 0;
            return;
        }
        Object obj2 = i12[i13];
        i12[i10] = obj2;
        j10[i10] = j10[i13];
        i12[i13] = null;
        j10[i13] = null;
        h[i10] = h[i13];
        h[i13] = 0;
        int p10 = l.p(obj2) & i11;
        int q6 = l.q(p10, obj);
        if (q6 == size) {
            l.r(p10, i10 + 1, obj);
            return;
        }
        while (true) {
            int i14 = q6 - 1;
            int i15 = h[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                h[i14] = l.j(i15, i10 + 1, i11);
                return;
            }
            q6 = i16;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        n nVar = this.n;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 0);
        this.n = nVar2;
        return nVar2;
    }

    public final boolean f() {
        return this.a == null;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int c3 = c();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int m10 = l.m(obj, null, c3, obj2, h(), i(), null);
            if (m10 != -1) {
                Object obj3 = j()[m10];
                e(m10, c3);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        return j()[d];
    }

    public final int[] h() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i10, int i11, int i12, int i13) {
        Object b10 = l.b(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l.r(i12 & i14, i13 + 1, b10);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int q6 = l.q(i15, obj);
            while (q6 != 0) {
                int i16 = q6 - 1;
                int i17 = h[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int q9 = l.q(i19, b10);
                l.r(i19, q6, b10);
                h[i16] = l.j(i18, q9, i14);
                q6 = i17 & i10;
            }
        }
        this.a = b10;
        this.e = l.j(this.e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        n nVar = this.h;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 1);
        this.h = nVar2;
        return nVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0105 -> B:47:0x00eb). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i10;
        int min;
        int i11 = 1;
        if (f()) {
            if (!f()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i12 = this.e;
            int max = Math.max(i12 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = TLObject.FLAG_30;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = l.b(max2);
            this.e = l.j(this.e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.b = new int[i12];
            this.c = new Object[i12];
            this.d = new Object[i12];
        }
        Map b10 = b();
        if (b10 != null) {
            return b10.put(obj, obj2);
        }
        int[] h = h();
        Object[] i13 = i();
        Object[] j10 = j();
        int i14 = this.f;
        int i15 = i14 + 1;
        int p10 = l.p(obj);
        int c3 = c();
        int i16 = p10 & c3;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int q6 = l.q(i16, obj3);
        if (q6 != 0) {
            int i17 = ~c3;
            int i18 = p10 & i17;
            int i19 = 0;
            while (true) {
                int i20 = q6 - i11;
                int i21 = h[i20];
                if ((i21 & i17) == i18 && o6.a(obj, i13[i20])) {
                    Object obj4 = j10[i20];
                    j10[i20] = obj2;
                    return obj4;
                }
                int i22 = i21 & c3;
                int i23 = i19 + 1;
                if (i22 != 0) {
                    i19 = i23;
                    q6 = i22;
                    i11 = 1;
                } else {
                    if (i23 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        if (!isEmpty()) {
                            i10 = 0;
                            while (i10 >= 0) {
                                linkedHashMap.put(i()[i10], j()[i10]);
                                int i24 = i10 + 1;
                                if (i24 < this.f) {
                                    i10 = i24;
                                }
                            }
                            this.a = linkedHashMap;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i10 = -1;
                        while (i10 >= 0) {
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i15 > c3) {
                        c3 = k(c3, (c3 + 1) * (c3 < 32 ? 4 : 2), p10, i14);
                    } else {
                        h[i20] = l.j(i21, i15, c3);
                    }
                }
            }
        } else if (i15 > c3) {
            c3 = k(c3, (c3 + 1) * (c3 < 32 ? 4 : 2), p10, i14);
        } else {
            Object obj5 = this.a;
            Objects.requireNonNull(obj5);
            l.r(i16, i15, obj5);
        }
        int length = h().length;
        if (i15 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(h(), min);
            this.c = Arrays.copyOf(i(), min);
            this.d = Arrays.copyOf(j(), min);
        }
        h()[i14] = l.j(p10, 0, c3);
        i()[i14] = obj;
        j()[i14] = obj2;
        this.f = i15;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == s) {
            return null;
        }
        return g10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map b10 = b();
        return b10 != null ? b10.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        j7.m mVar = this.r;
        if (mVar != null) {
            return mVar;
        }
        j7.m mVar2 = new j7.m(5, this);
        this.r = mVar2;
        return mVar2;
    }
}
