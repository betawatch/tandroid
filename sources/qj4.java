// default package

import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
