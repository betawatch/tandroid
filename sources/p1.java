// default package

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p1 extends c01 {
    public r86 d;
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

    @Override // c01
    public final void c(boolean z) {
        gl.d3(new b1(this, (byte) 1), z ? 0L : 350L);
    }

    @Override // c01
    public final void d() {
        s1 s1Var = this.h;
        i46 i46Var = s1Var.F;
        r86 r86Var = s1Var.H;
        if (r86Var != null) {
            i46Var.m(r86Var, true);
        }
        r86 j = i46.j(this.e, this.f, this.g);
        this.d = j;
        s1Var.H = j;
        int v0 = bkb.v0(bkb.Be, s1Var.J);
        RectF rectF = ProfileActivity.Z6;
        this.d.g(bkb.p1(0.8f, v0), bkb.p1(1.3f, v0), bkb.p1(1.0f, v0), bkb.p1(4.0f, v0));
        this.d.x.setStrokeWidth(gl.N(1.25f));
        i46Var.b(this.d, null);
    }
}
