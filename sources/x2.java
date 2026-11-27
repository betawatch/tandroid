// default package

import java.util.ListIterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class x2 extends w2 implements ListIterator {
    public final /* synthetic */ z2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(z2 z2Var, int i) {
        super(z2Var);
        this.d = z2Var;
        int h = z2Var.h();
        if (i < 0 || i > h) {
            su3.g(c00.h(i, h, "index: ", ", size: "));
            throw null;
        }
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            lq5.n();
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
