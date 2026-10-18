package x2;

import b2.p1;
import b2.w;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
