// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class y39 extends ka {
    public final w49 c;

    public y39(int i, w49 w49Var) {
        super(i, false);
        this.c = w49Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y39.class == obj.getClass()) {
            y39 y39Var = (y39) obj;
            int i = this.a;
            int i2 = y39Var.a;
            if (i == i2 && (i == 0 || i == 3)) {
                w49 w49Var = this.c;
                return w49Var != null && w49Var.equals(y39Var.c);
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
