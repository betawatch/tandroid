package p8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class c0 extends u implements Set {
    public static final /* synthetic */ int c = 0;
    public transient z b;

    public static int s(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return TLObject.FLAG_30;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static c0 t(int i10, Object... objArr) {
        if (i10 == 0) {
            return r0.s;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new w0(obj);
        }
        int s10 = s(i10);
        Object[] objArr2 = new Object[s10];
        int i11 = s10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i14);
                throw new NullPointerException(sb2.toString());
            }
            int hashCode = obj2.hashCode();
            int o10 = l.o(hashCode);
            while (true) {
                int i15 = o10 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                o10++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new w0(obj4);
        }
        if (s(i13) < s10 / 2) {
            return t(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new r0(i12, i11, i13, objArr, objArr2);
    }

    public static c0 u(Collection collection) {
        if ((collection instanceof c0) && !(collection instanceof SortedSet)) {
            c0 c0Var = (c0) collection;
            if (!c0Var.r()) {
                return c0Var;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof c0) && (this instanceof r0) && (((c0) obj) instanceof r0) && hashCode() != obj.hashCode()) {
            return false;
        }
        return l.d(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return l.h(this);
    }

    @Override // p8.u
    public z i() {
        z zVar = this.b;
        if (zVar != null) {
            return zVar;
        }
        z v = v();
        this.b = v;
        return v;
    }

    public z v() {
        Object[] array = toArray(u.a);
        x xVar = z.b;
        return z.s(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract x0 iterator();
}
