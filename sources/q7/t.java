package q7;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class t extends d0 {
    public static final Object b = new Object();
    public Object a;

    public t(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.a;
        Object obj2 = b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.a = obj2;
        return obj;
    }
}
