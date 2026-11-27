// default package

import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qj4 {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;

    public final void a(sx5 sx5Var, boolean z) {
        ea5 ea5Var = (ea5) this.d;
        if (((sx5) this.c) != sx5Var) {
            hl.r(ea5Var);
            this.c = sx5Var;
            if (z) {
                ((t2d) this.b).a(sx5Var);
            }
            if (sx5Var == sx5.b || sx5Var == sx5.c) {
                hl.d3(ea5Var, this.a);
            }
        }
    }
}
