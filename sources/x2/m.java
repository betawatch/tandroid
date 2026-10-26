package x2;

import b2.q1;
import b2.x;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class m {
    public final int a;
    public final q1 b;
    public final int c;
    public final x d;

    public m(int i10, q1 q1Var, int i11) {
        this.a = i10;
        this.b = q1Var;
        this.c = i11;
        this.d = q1Var.d[i11];
    }

    public abstract int a();

    public abstract boolean b(m mVar);
}
