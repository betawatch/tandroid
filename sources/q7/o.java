package q7;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class o extends h implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient m b;

    public static o m(int i7, Object... objArr) {
        if (i7 == 0) {
            return y.s;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new b0(obj);
        }
        int n10 = n(i7);
        Object[] objArr2 = new Object[n10];
        int i10 = n10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(jg.g.j(i13, "at index "));
            }
            int hashCode = obj2.hashCode();
            int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i14 = rotateLeft & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    rotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new b0(obj4);
        }
        if (n(i12) < n10 / 2) {
            return m(i12, objArr);
        }
        if (i12 <= 0) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new y(i11, i10, i12, objArr, objArr2);
    }

    public static int n(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return TLObject.FLAG_30;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof o) && (this instanceof y) && (((o) obj) instanceof y) && ((y) this).e != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return a.b(this);
    }

    public m o() {
        m mVar = this.b;
        if (mVar != null) {
            return mVar;
        }
        m p10 = p();
        this.b = p10;
        return p10;
    }

    public m p() {
        Object[] array = toArray(h.a);
        i iVar = m.b;
        return m.o(array.length, array);
    }
}
