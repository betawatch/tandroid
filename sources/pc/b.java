package pc;

import g7.m6;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {
    public final c a;
    public final int b;
    public final int c;

    public b(c cVar, int i9, int i10) {
        this.a = cVar;
        this.b = i9;
        m6.a(i9, i10, cVar.i());
        this.c = i10 - i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        int i10 = this.c;
        if (i9 < 0 || i9 >= i10) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "index: ", ", size: "));
        }
        return this.a.get(this.b + i9);
    }

    @Override // pc.c
    public final int i() {
        return this.c;
    }
}
