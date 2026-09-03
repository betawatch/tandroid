package s8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a0 extends u0 {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    public a0() {
        this.a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i10 = this.a;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int c3 = m1.j.c(i10);
        if (c3 == 0) {
            return true;
        }
        if (c3 == 2) {
            return false;
        }
        this.a = 4;
        switch (this.c) {
            case 0:
                do {
                    Iterator it = this.d;
                    if (!it.hasNext()) {
                        this.a = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((r8.f) this.e).apply(next));
            default:
                do {
                    Iterator it2 = this.d;
                    if (!it2.hasNext()) {
                        this.a = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((q0) this.e).b.contains(next));
        }
        this.b = next;
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(Iterator it, r8.f fVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(q0 q0Var) {
        this();
        this.c = 1;
        this.e = q0Var;
        this.d = q0Var.a.iterator();
    }
}
