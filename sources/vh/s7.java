package vh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.s9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s7 extends b4 {
    public boolean i2;
    public final /* synthetic */ o8 j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(o8 o8Var, Context context, boolean z10, File file, boolean z11, boolean z12, n8 n8Var, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, n5 n5Var, int i12, int i13, ye yeVar, s9 s9Var, th.b bVar, j4 j4Var, d8 d8Var) {
        super(context, z10, file, z11, z12, n8Var, activity, i10, bitmap, bitmap2, i11, arrayList, n5Var, i12, i13, yeVar, s9Var, bVar, j4Var, d8Var);
        this.j2 = o8Var;
    }

    @Override // jg.h
    public final void B(boolean z10) {
        o8 o8Var = this.j2;
        o8Var.o1.a(true, z10, o8Var.i0);
    }

    @Override // jg.h
    public final void C() {
        o8 o8Var = this.j2;
        o8Var.v1.L0(false);
        o8Var.c1.clearAnimation();
        ViewPropertyAnimator duration = o8Var.c1.animate().alpha(0.0f).setDuration(180L);
        gr grVar = gr.g;
        duration.setInterpolator(grVar).start();
        if (o8Var.g0 != 2) {
            o8Var.Y0.clearAnimation();
            o8Var.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(grVar).start();
        }
        S0(o(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        o8 o8Var = this.j2;
        if (!z10) {
            o8Var.p1.a(false, z11);
            o8Var.p1.clearAnimation();
            o8Var.p1.animate().alpha(0.0f).withEndAction(new d0(this, 17)).setDuration(180L).setInterpolator(gr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            o8Var.p1.setVisibility(0);
            o8Var.p1.setAlpha(0.0f);
            o8Var.p1.clearAnimation();
            o8Var.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(gr.g).start();
        }
    }

    @Override // jg.h
    public final void e(boolean z10) {
        o8 o8Var = this.j2;
        o8Var.o1.b(o8Var.c1.getText());
        o8Var.o1.a(false, z10 && this.i2, null);
    }

    @Override // jg.h
    public final void f(boolean z10) {
        jg.j jVar;
        if (!o()) {
            z10 = false;
        }
        o8 o8Var = this.j2;
        o8Var.c1.clearAnimation();
        ViewPropertyAnimator duration = o8Var.c1.animate().alpha(o8Var.g0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        gr grVar = gr.g;
        duration.setInterpolator(grVar).start();
        o8Var.Y0.clearAnimation();
        ViewPropertyAnimator animate = o8Var.Y0.animate();
        int i10 = o8Var.g0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(grVar).start();
        S0(false, z10);
        if (z10 && (jVar = this.s0) != null) {
            z0(jVar);
        }
        Q0();
        this.U1 = true;
        this.i2 = false;
    }

    @Override // jg.h
    public final void g() {
        this.i2 = false;
        S0(o(), false);
        this.j2.o1.a(false, false, null);
    }

    @Override // jg.h
    public final void h() {
        this.i2 = true;
        this.j2.v1.L0(false);
        S0(false, false);
    }

    @Override // jg.h
    public final void j(boolean z10) {
        this.j2.p1.a(z10, false);
    }

    @Override // vh.b4
    public final void o0() {
        o8 o8Var = this.j2;
        o8Var.c1.f.d();
        o8Var.k0(0, false, true);
        jg.j jVar = this.s0;
        if (!(jVar instanceof jg.g3) || this.t0) {
            return;
        }
        jg.g3 g3Var = (jg.g3) jVar;
        this.t0 = true;
        g3Var.q();
        View focusedView = g3Var.getFocusedView();
        focusedView.requestFocus();
        org.telegram.messenger.i0.J3(focusedView);
    }

    @Override // jg.h
    public final void w() {
        this.j2.v1.L0(false);
    }

    @Override // vh.b4
    public final void w0(boolean z10) {
        o8 o8Var = this.j2;
        d8 d8Var = o8Var.X0;
        if (d8Var != null) {
            d8Var.x(6, z10);
            kg.f0 f0Var = o8Var.j1;
            if (f0Var != null) {
                ((kf0) f0Var.c).a(o8Var.X0.k(), true);
            }
        }
        e8 e8Var = o8Var.c1;
        if (e8Var != null) {
            e8Var.d0 = z10;
            e8Var.L.b(z10);
        }
    }
}
