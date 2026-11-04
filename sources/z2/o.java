package z2;

import d2.o1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o {
    public final o1 a;
    public final int[] b;

    public o(o1 o1Var, int... iArr) {
        if (iArr.length == 0) {
            g2.a.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = o1Var;
        this.b = iArr;
    }
}
