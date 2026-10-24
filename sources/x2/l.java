package x2;

import b2.p1;
import b2.w;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
