// default package

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p1 extends k11 {
    public qa6 d;
    public final /* synthetic */ Layout e;
    public final /* synthetic */ ClickableSpan f;
    public final /* synthetic */ float g;
    public final /* synthetic */ s1 h;

    public p1(s1 s1Var, Layout layout, ClickableSpan clickableSpan, float f) {
        this.h = s1Var;
        this.e = layout;
        this.f = clickableSpan;
        this.g = f;
    }

    @Override // k11
    public final void c(boolean z) {
        gm.d3(new b1(this, (byte) 1), z ? 0L : 350L);
    }

    @Override // k11
    public final void d() {
        s1 s1Var = this.h;
        i66 i66Var = s1Var.F;
        qa6 qa6Var = s1Var.H;
        if (qa6Var != null) {
            i66Var.m(qa6Var, true);
        }
        qa6 j = i66.j(this.e, this.f, this.g);
        this.d = j;
        s1Var.H = j;
        int v0 = cmb.v0(cmb.Be, s1Var.J);
        RectF rectF = ProfileActivity.e7;
        this.d.g(cmb.p1(0.8f, v0), cmb.p1(1.3f, v0), cmb.p1(1.0f, v0), cmb.p1(4.0f, v0));
        this.d.x.setStrokeWidth(gm.N(1.25f));
        i66Var.b(this.d, null);
    }
}
