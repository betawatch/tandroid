package s8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class z extends q implements Set {
    public static final /* synthetic */ int c = 0;
    public transient v b;

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

    public static z t(int i10, Object... objArr) {
        if (i10 == 0) {
            return o0.s;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new t0(obj);
        }
        int s6 = s(i10);
        Object[] objArr2 = new Object[s6];
        int i11 = s6 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i14);
                throw new NullPointerException(sb.toString());
            }
            int hashCode = obj2.hashCode();
            int m9 = l.m(hashCode);
            while (true) {
                int i15 = m9 & i11;
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
                m9++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new t0(obj4);
        }
        if (s(i13) < s6 / 2) {
            return t(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new o0(i12, i11, i13, objArr, objArr2);
    }

    public static z u(Collection collection) {
        if ((collection instanceof z) && !(collection instanceof SortedSet)) {
            z zVar = (z) collection;
            if (!zVar.r()) {
                return zVar;
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
        if ((obj instanceof z) && (this instanceof o0) && (((z) obj) instanceof o0) && hashCode() != obj.hashCode()) {
            return false;
        }
        return l.e(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return l.i(this);
    }

    @Override // s8.q
    public v i() {
        v vVar = this.b;
        if (vVar != null) {
            return vVar;
        }
        v v = v();
        this.b = v;
        return v;
    }

    public v v() {
        Object[] array = toArray(q.a);
        t tVar = v.b;
        return v.s(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract u0 iterator();
}
