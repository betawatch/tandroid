// default package

import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sm9 implements Iterator {
    public byte a;
    public Object b;
    public int c;
    public int d;
    public final /* synthetic */ tm9 e;

    public sm9(tm9 tm9Var) {
        this.e = tm9Var;
        this.c = tm9Var.d;
        this.d = tm9Var.c;
    }

    public final boolean a() {
        this.a = (byte) 3;
        int i = this.c;
        if (i == 0) {
            this.a = (byte) 2;
            return false;
        }
        tm9 tm9Var = this.e;
        Object[] objArr = tm9Var.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = (byte) 1;
        this.d = (i2 + 1) % tm9Var.b;
        this.c = i - 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        if (b == 0) {
            return a();
        }
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        lq5.j("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        if (b == 1) {
            this.a = (byte) 0;
            return this.b;
        }
        if (b == 2 || !a()) {
            lq5.n();
            return null;
        }
        this.a = (byte) 0;
        return this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
