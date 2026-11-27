// default package

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wjf extends d3 implements ListIterator {
    public final /* synthetic */ m3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjf(m3 m3Var, int i) {
        super(m3Var, ((List) m3Var.c).listIterator(i), (char) 0);
        this.e = m3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m3 m3Var = this.e;
        boolean isEmpty = m3Var.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        if (isEmpty) {
            m3Var.k();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjf(m3 m3Var) {
        super(m3Var, (char) 0);
        this.e = m3Var;
    }
}
