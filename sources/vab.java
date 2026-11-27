// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class vab extends dx7 {
    public boolean n2;
    public final /* synthetic */ rbb o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vab(rbb rbbVar, Context context, boolean z, File file, boolean z2, boolean z3, qbb qbbVar, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, c8b c8bVar, int i3, int i4, fo6 fo6Var, tl0 tl0Var, x53 x53Var, o00 o00Var, gbb gbbVar) {
        super(context, z, file, z2, z3, qbbVar, activity, i, bitmap, bitmap2, i2, arrayList, c8bVar, i3, i4, fo6Var, tl0Var, x53Var, o00Var, gbbVar);
        this.o2 = rbbVar;
    }

    @Override // f44
    public final void B(boolean z) {
        rbb rbbVar = this.o2;
        rbbVar.p1.a(true, z, rbbVar.j0);
    }

    @Override // f44
    public final void C() {
        rbb rbbVar = this.o2;
        rbbVar.w1.N0(false);
        rbbVar.d1.clearAnimation();
        ViewPropertyAnimator duration = rbbVar.d1.animate().alpha(0.0f).setDuration(180L);
        k43 k43Var = k43.g;
        duration.setInterpolator(k43Var).start();
        if (rbbVar.h0 != 2) {
            rbbVar.Z0.clearAnimation();
            rbbVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(k43Var).start();
        }
        U0(o(), false);
    }

    public final void U0(boolean z, boolean z2) {
        rbb rbbVar = this.o2;
        j5c j5cVar = rbbVar.q1;
        if (!z) {
            j5cVar.a(false, z2);
            rbbVar.q1.clearAnimation();
            rbbVar.q1.animate().alpha(0.0f).withEndAction(new ew7(this, (byte) 1)).setDuration(180L).setInterpolator(k43.g).setStartDelay(z2 ? 500L : 0L).start();
        } else {
            j5cVar.setVisibility(0);
            rbbVar.q1.setAlpha(0.0f);
            rbbVar.q1.clearAnimation();
            rbbVar.q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(k43.g).start();
        }
    }

    @Override // f44
    public final void d(boolean z) {
        rbb rbbVar = this.o2;
        rbbVar.p1.b(rbbVar.d1.getText());
        rbbVar.p1.a(false, z && this.n2, null);
    }

    @Override // f44
    public final void e(boolean z) {
        h44 h44Var;
        if (!o()) {
            z = false;
        }
        rbb rbbVar = this.o2;
        rbbVar.d1.clearAnimation();
        ViewPropertyAnimator duration = rbbVar.d1.animate().alpha(rbbVar.h0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        k43 k43Var = k43.g;
        duration.setInterpolator(k43Var).start();
        rbbVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = rbbVar.Z0.animate();
        int i = rbbVar.h0;
        animate.alpha((i == -1 || i == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(k43Var).start();
        U0(false, z);
        if (z && (h44Var = this.t0) != null) {
            B0(h44Var);
        }
        S0();
        this.Z1 = true;
        this.n2 = false;
    }

    @Override // f44
    public final void f() {
        this.n2 = false;
        U0(o(), false);
        this.o2.p1.a(false, false, null);
    }

    @Override // f44
    public final void g() {
        this.n2 = true;
        this.o2.w1.N0(false);
        U0(false, false);
    }

    @Override // f44
    public final void j(boolean z) {
        this.o2.q1.a(z, false);
    }

    @Override // dx7
    public final void o0() {
        rbb rbbVar = this.o2;
        rbbVar.d1.f.d();
        rbbVar.k0(0, false, true);
        h44 h44Var = this.t0;
        if (!(h44Var instanceof rlb) || this.u0) {
            return;
        }
        rlb rlbVar = (rlb) h44Var;
        if (rlbVar instanceof kc1) {
            kc1 kc1Var = (kc1) rlbVar;
            kc1Var.z();
            if (kc1Var.E0 == null) {
                return;
            }
        }
        this.u0 = true;
        rlbVar.q();
        View focusedView = rlbVar.getFocusedView();
        focusedView.requestFocus();
        hl.E3(focusedView);
    }

    @Override // f44
    public final void x() {
        this.o2.w1.N0(false);
    }

    @Override // dx7
    public final void y0(boolean z) {
        rbb rbbVar = this.o2;
        gbb gbbVar = rbbVar.Y0;
        if (gbbVar != null) {
            gbbVar.x(6, z);
            a81 a81Var = rbbVar.k1;
            if (a81Var != null) {
                ((mf8) a81Var.c).a(rbbVar.Y0.j(), true);
            }
        }
        hbb hbbVar = rbbVar.d1;
        if (hbbVar != null) {
            hbbVar.e0 = z;
            hbbVar.M.b(z);
        }
    }
}
