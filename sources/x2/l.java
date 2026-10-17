package x2;

import b2.p1;
import b2.w;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class l {
    public final int a;
    public final p1 b;
    public final int c;
    public final w d;

    public l(int i10, p1 p1Var, int i11) {
        this.a = i10;
        this.b = p1Var;
        this.c = i11;
        this.d = p1Var.d[i11];
    }

    public abstract int a();

    public abstract boolean b(l lVar);
}
