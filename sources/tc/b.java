package tc;

import java.util.RandomAccess;
import k7.r7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {
    public final c a;
    public final int b;
    public final int c;

    public b(c cVar, int i10, int i11) {
        this.a = cVar;
        this.b = i10;
        r7.a(i10, i11, cVar.i());
        this.c = i11 - i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "index: ", ", size: "));
        }
        return this.a.get(this.b + i10);
    }

    @Override // tc.c
    public final int i() {
        return this.c;
    }
}
