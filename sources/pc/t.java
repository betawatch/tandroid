package pc;

import j3.r0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t extends c implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public t(int i9, Object[] objArr) {
        this.a = objArr;
        if (i9 < 0) {
            throw new IllegalArgumentException(r0.l(i9, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i9 <= objArr.length) {
            this.b = objArr.length;
            this.d = i9;
        } else {
            StringBuilder p6 = r0.p(i9, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            p6.append(objArr.length);
            throw new IllegalArgumentException(p6.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i9) {
        int i10 = i();
        if (i9 < 0 || i9 >= i10) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "index: ", ", size: "));
        }
        return this.a[(this.c + i9) % this.b];
    }

    @Override // pc.c
    public final int i() {
        return this.d;
    }

    @Override // pc.c, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final void n() {
        if (20 > this.d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
        }
        int i9 = this.c;
        int i10 = this.b;
        int i11 = (i9 + 20) % i10;
        Object[] objArr = this.a;
        if (i9 > i11) {
            f.e(i9, i10, objArr);
            f.e(0, i11, objArr);
        } else {
            f.e(i9, i11, objArr);
        }
        this.c = i11;
        this.d -= 20;
    }

    @Override // pc.c, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[i()]);
    }

    @Override // pc.c, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i9 = this.d;
        if (length < i9) {
            array = Arrays.copyOf(array, i9);
            kotlin.jvm.internal.i.d(array, "copyOf(...)");
        }
        int i10 = this.d;
        int i11 = this.c;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.a;
            if (i13 >= i10 || i11 >= this.b) {
                break;
            }
            array[i13] = objArr[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            array[i13] = objArr[i12];
            i13++;
            i12++;
        }
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
