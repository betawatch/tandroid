package x2;

import b2.p1;
import b2.x;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class m {
    public final int a;
    public final p1 b;
    public final int c;
    public final x d;

    public m(int i10, p1 p1Var, int i11) {
        this.a = i10;
        this.b = p1Var;
        this.c = i11;
        this.d = p1Var.d[i11];
    }

    public abstract int a();

    public abstract boolean b(m mVar);
}
