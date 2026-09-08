package x2;

import b2.l1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class q {
    public final l1 a;
    public final int[] b;

    public q(l1 l1Var, int... iArr) {
        if (iArr.length == 0) {
            e2.a.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = l1Var;
        this.b = iArr;
    }
}
