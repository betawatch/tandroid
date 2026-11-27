// default package

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pkf extends bif implements RandomAccess, rjf, flf {
    public static final pkf d = new pkf(new long[0], 0, false);
    public long[] b;
    public int c;

    public pkf(long[] jArr, int i, boolean z) {
        super(z);
        this.b = jArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        h();
        if (i < 0 || i > (i2 = this.c)) {
            su3.g(c00.h(i, this.c, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[qu6.y(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.b, i, jArr2, i3, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = longValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // bif, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h();
        Charset charset = ujf.a;
        collection.getClass();
        if (!(collection instanceof pkf)) {
            return super.addAll(collection);
        }
        pkf pkfVar = (pkf) collection;
        int i = pkfVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.b;
        if (i3 > jArr.length) {
            jArr = Arrays.copyOf(jArr, i3);
            this.b = jArr;
        }
        System.arraycopy(pkfVar.b, 0, jArr, this.c, pkfVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // bif, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkf)) {
            return super.equals(obj);
        }
        pkf pkfVar = (pkf) obj;
        if (this.c != pkfVar.c) {
            return false;
        }
        long[] jArr = pkfVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        i(i);
        return Long.valueOf(this.b[i]);
    }

    @Override // bif, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            long j = this.b[i2];
            Charset charset = ujf.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final void i(int i) {
        if (i < 0 || i >= this.c) {
            su3.g(c00.h(i, this.c, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // bif, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        h();
        i(i);
        long[] jArr = this.b;
        long j = jArr[i];
        if (i < this.c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        h();
        if (i2 < i) {
            su3.g("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        h();
        i(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // tjf
    public final /* bridge */ /* synthetic */ tjf zzg(int i) {
        if (i >= this.c) {
            return new pkf(Arrays.copyOf(this.b, i), this.c, true);
        }
        iy8.d();
        return null;
    }

    @Override // bif, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        h();
        int i = this.c;
        long[] jArr = this.b;
        if (i == jArr.length) {
            long[] jArr2 = new long[qu6.y(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.b = jArr2;
            jArr = jArr2;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        jArr[i2] = longValue;
        return true;
    }
}
