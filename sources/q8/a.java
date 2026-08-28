package q8;

import g7.d0;
import g7.r6;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends AbstractList implements RandomAccess, Serializable {
    public final int[] a;
    public final int b;
    public final int c;

    public a(int i9, int i10, int[] iArr) {
        this.a = iArr;
        this.b = i9;
        this.c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && r6.c(((Integer) obj).intValue(), this.b, this.c, this.a) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return super.equals(obj);
        }
        a aVar = (a) obj;
        int size = size();
        if (aVar.size() != size) {
            return false;
        }
        for (int i9 = 0; i9 < size; i9++) {
            if (this.a[this.b + i9] != aVar.a[aVar.b + i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        d0.b(i9, size());
        return Integer.valueOf(this.a[this.b + i9]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = this.b; i10 < this.c; i10++) {
            i9 = (i9 * 31) + this.a[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i9 = this.c;
        int i10 = this.b;
        int c10 = r6.c(intValue, i10, i9, this.a);
        if (c10 >= 0) {
            return c10 - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i9;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.c;
            while (true) {
                i10--;
                i9 = this.b;
                if (i10 < i9) {
                    i10 = -1;
                    break;
                }
                if (this.a[i10] == intValue) {
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        Integer num = (Integer) obj;
        d0.b(i9, size());
        int i10 = this.b + i9;
        int[] iArr = this.a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i9, int i10) {
        d0.d(i9, i10, size());
        if (i9 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.b;
        return new a(i9 + i11, i11 + i10, this.a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.a;
        int i9 = this.b;
        sb2.append(iArr[i9]);
        while (true) {
            i9++;
            if (i9 >= this.c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i9]);
        }
    }
}
