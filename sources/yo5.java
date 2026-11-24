// default package

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class yo5 extends go5 implements Set, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    public transient mo5 b;

    public static int o(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            jte.e("collection too large", max < 1073741824);
            return TLObject.FLAG_30;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static yo5 p(int i, Object... objArr) {
        if (i == 0) {
            return f89.s;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new vka(obj);
        }
        int o = o(i);
        Object[] objArr2 = new Object[o];
        int i2 = o - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                gxc.d(hg9.j(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int a = dle.a(hashCode);
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
                if (obj3.equals(obj2)) {
                    break;
                }
                a++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new vka(obj4);
        }
        if (o(i4) < o / 2) {
            return p(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new f89(i3, i2, i4, objArr, objArr2);
    }

    public static yo5 q(Collection collection) {
        if ((collection instanceof yo5) && !(collection instanceof SortedSet)) {
            yo5 yo5Var = (yo5) collection;
            if (!yo5Var.m()) {
                return yo5Var;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static yo5 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        jte.e("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return p(length, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof yo5) && (this instanceof f89) && (((yo5) obj) instanceof f89) && ((f89) this).e != obj.hashCode()) {
            return false;
        }
        return bwe.a(this, obj);
    }

    @Override // go5
    public mo5 h() {
        mo5 mo5Var = this.b;
        if (mo5Var != null) {
            return mo5Var;
        }
        mo5 r = r();
        this.b = r;
        return r;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return bwe.c(this);
    }

    public mo5 r() {
        Object[] array = toArray(go5.a);
        ko5 ko5Var = mo5.b;
        return mo5.o(array.length, array);
    }
}
