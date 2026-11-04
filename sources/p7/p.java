package p7;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import k2.p1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class p extends i implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient n b;

    public static p m(int i3, Object... objArr) {
        if (i3 == 0) {
            return z.s;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new c0(obj);
        }
        int n4 = n(i3);
        Object[] objArr2 = new Object[n4];
        int i10 = n4 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(p1.i(i13, "at index "));
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
        Arrays.fill(objArr, i12, i3, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new c0(obj4);
        }
        if (n(i12) < n4 / 2) {
            return m(i12, objArr);
        }
        if (i12 <= 0) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new z(i11, i10, i12, objArr, objArr2);
    }

    public static int n(int i3) {
        int max = Math.max(i3, 2);
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
        if ((obj instanceof p) && (this instanceof z) && (((p) obj) instanceof z) && ((z) this).e != obj.hashCode()) {
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

    public n o() {
        n nVar = this.b;
        if (nVar != null) {
            return nVar;
        }
        n p10 = p();
        this.b = p10;
        return p10;
    }

    public n p() {
        Object[] array = toArray(i.a);
        j jVar = n.b;
        return n.o(array.length, array);
    }
}
