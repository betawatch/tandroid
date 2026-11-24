// default package

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class t6e extends l1d implements Set, j$.util.Set {
    public static final /* synthetic */ int r = 0;
    public transient x5e n;

    public static int y(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit <<= 1;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return TLObject.FLAG_30;
        }
        u36.j("collection too large");
        return 0;
    }

    public static t6e z(int i, Object... objArr) {
        if (i == 0) {
            return h9e.G;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new t9e(obj);
        }
        int y = y(i);
        Object[] objArr2 = new Object[y];
        int i2 = y - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                gxc.d(hg9.j(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int a = y3f.a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new t9e(obj4);
        }
        if (y(i4) < y / 2) {
            return z(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new h9e(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t6e) && (this instanceof h9e) && (((t6e) obj) instanceof h9e) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
