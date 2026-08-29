package rc;

import a4.w;
import j7.l1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t extends c implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public t(int i10, Object[] objArr) {
        this.a = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.k(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= objArr.length) {
            this.b = objArr.length;
            this.d = i10;
        } else {
            StringBuilder o10 = l1.o(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            o10.append(objArr.length);
            throw new IllegalArgumentException(o10.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = i();
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(w.k(i10, i11, "index: ", ", size: "));
        }
        return this.a[(this.c + i10) % this.b];
    }

    @Override // rc.c
    public final int i() {
        return this.d;
    }

    @Override // rc.c, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final void n() {
        if (20 > this.d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
        }
        int i10 = this.c;
        int i11 = this.b;
        int i12 = (i10 + 20) % i11;
        Object[] objArr = this.a;
        if (i10 > i12) {
            f.e(i10, i11, objArr);
            f.e(0, i12, objArr);
        } else {
            f.e(i10, i12, objArr);
        }
        this.c = i12;
        this.d -= 20;
    }

    @Override // rc.c, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[i()]);
    }

    @Override // rc.c, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i10 = this.d;
        if (length < i10) {
            array = Arrays.copyOf(array, i10);
            kotlin.jvm.internal.j.d(array, "copyOf(...)");
        }
        int i11 = this.d;
        int i12 = this.c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.a;
            if (i14 >= i11 || i12 >= this.b) {
                break;
            }
            array[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            array[i14] = objArr[i13];
            i14++;
            i13++;
        }
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }
}
