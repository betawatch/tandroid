// default package

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z57 extends kw3 {
    public final int[] O;
    public final /* synthetic */ j67 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z57(j67 j67Var, y57 y57Var, int i) {
        super(i, y57Var);
        this.P = j67Var;
        this.O = new int[2];
    }

    @Override // kw3
    public final void g(jw3 jw3Var) {
        j67 j67Var = this.P;
        f67 f67Var = j67Var.K;
        if (jw3Var != null) {
            if (j67Var.l0 != null) {
                jw3Var.c = true;
                float f = (kw3.f() * gm.p) / 1.3f;
                float f2 = f / 3.0f;
                jw3Var.d = f2;
                jw3Var.e = f2;
                jw3Var.a = Utilities.i(j67Var.l0.right - (0.75f * f), gm.q.x - f, 0.0f);
                jw3Var.b = j67Var.l0.bottom - (f / 2.0f);
                return;
            }
            rc2 rc2Var = j67Var.Q;
            if (rc2Var == null || !rc2Var.isAttachedToWindow() || j67Var.Q.getMessageObject() == null || j67Var.Q.getMessageObject().e1() != j67Var.R) {
                return;
            }
            j67Var.Q.getLocationOnScreen(this.O);
            jw3Var.c = true;
            float f3 = (kw3.f() * gm.p) / 1.3f;
            float f4 = f3 / 3.0f;
            jw3Var.d = f4;
            jw3Var.e = f4;
            float f5 = f3 / 2.0f;
            jw3Var.a = Utilities.i(((f67Var.getScaleX() * j67Var.Q.getTimeX()) + r9[0]) - f5, gm.q.x - f3, 0.0f);
            jw3Var.b = ((f67Var.getScaleY() * j67Var.Q.getTimeY()) + r9[1]) - f5;
        }
    }
}
