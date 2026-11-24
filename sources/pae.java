// default package

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pae extends bsd implements RandomAccess {
    public static final Object[] d;
    public static final pae e;
    public Object[] b;
    public int c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        e = new pae(objArr, 0, false);
    }

    public pae(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        h();
        if (i < 0 || i > (i2 = this.c)) {
            k93.i(b00.g(i, this.c, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i3, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        i(i);
        return this.b[i];
    }

    public final void i(int i) {
        if (i < 0 || i >= this.c) {
            k93.i(b00.g(i, this.c, "Index:", ", Size:"));
        }
    }

    @Override // bsd, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        i(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        i(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // a3e
    public final /* bridge */ /* synthetic */ a3e zzd(int i) {
        if (i >= this.c) {
            return new pae(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        sc8.e();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i = this.c;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i == length) {
            objArr = Arrays.copyOf(this.b, Math.max(((length * 3) / 2) + 1, 10));
            this.b = objArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
