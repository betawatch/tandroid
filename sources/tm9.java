// default package

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class tm9 extends z2 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public tm9(int i, Object[] objArr) {
        this.a = objArr;
        if (i < 0) {
            bya.a(uh9.k(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            StringBuilder m = uh9.m(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            m.append(objArr.length);
            throw new IllegalArgumentException(m.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.d;
        if (i < 0 || i >= i2) {
            su3.g(c00.h(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.a[(this.c + i) % this.b];
    }

    @Override // z2
    public final int h() {
        return this.d;
    }

    public final void i() {
        if (20 > this.d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
        }
        int i = this.c;
        int i2 = this.b;
        int i3 = (i + 20) % i2;
        Object[] objArr = this.a;
        if (i > i3) {
            Arrays.fill(objArr, i, i2, (Object) null);
            Arrays.fill(objArr, 0, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i, i3, (Object) null);
        }
        this.c = i3;
        this.d -= 20;
    }

    @Override // z2, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new sm9(this);
    }

    @Override // z2, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // z2, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[h()]);
    }
}
