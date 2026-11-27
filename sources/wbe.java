// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wbe extends g9e {
    public static final Object[] F;
    public static final wbe G;
    public final transient int E;
    public final transient Object[] s;
    public final transient int w;
    public final transient Object[] x;
    public final transient int y;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new wbe(0, 0, 0, objArr, objArr);
    }

    public wbe(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super((byte) 5);
        this.s = objArr;
        this.w = i;
        this.x = objArr2;
        this.y = i2;
        this.E = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.x;
            if (objArr.length != 0) {
                int a = o6f.a(obj.hashCode());
                while (true) {
                    int i = a & this.y;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a = i + 1;
                }
            }
        }
        return false;
    }

    @Override // g9e, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        k8e k8eVar = this.n;
        if (k8eVar == null) {
            k8eVar = k8e.z(this.E, this.s);
            this.n = k8eVar;
        }
        return k8eVar.listIterator(0);
    }

    @Override // b4d
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.s;
        int i = this.E;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // b4d
    public final int q() {
        return this.E;
    }

    @Override // b4d
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.E;
    }

    @Override // b4d
    public final Object[] x() {
        return this.s;
    }
}
