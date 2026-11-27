// default package

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class q1 extends l01 {
    public va6 d;
    public final /* synthetic */ Layout e;
    public final /* synthetic */ ClickableSpan f;
    public final /* synthetic */ float g;
    public final /* synthetic */ t1 h;

    public q1(t1 t1Var, Layout layout, ClickableSpan clickableSpan, float f) {
        this.h = t1Var;
        this.e = layout;
        this.f = clickableSpan;
        this.g = f;
    }

    @Override // l01
    public final void c(boolean z) {
        hl.d3(new c1(this, (byte) 1), z ? 0L : 350L);
    }

    @Override // l01
    public final void d() {
        t1 t1Var = this.h;
        m66 m66Var = t1Var.F;
        va6 va6Var = t1Var.H;
        if (va6Var != null) {
            m66Var.m(va6Var, true);
        }
        va6 j = m66.j(this.e, this.f, this.g);
        this.d = j;
        t1Var.H = j;
        int v0 = aob.v0(aob.Ce, t1Var.J);
        RectF rectF = ProfileActivity.Z6;
        this.d.g(aob.p1(0.8f, v0), aob.p1(1.3f, v0), aob.p1(1.0f, v0), aob.p1(4.0f, v0));
        this.d.x.setStrokeWidth(hl.N(1.25f));
        m66Var.b(this.d, null);
    }
}
