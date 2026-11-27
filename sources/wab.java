// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class wab extends dx7 {
    public boolean n2;
    public final /* synthetic */ sbb o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wab(sbb sbbVar, Context context, boolean z, File file, boolean z2, boolean z3, rbb rbbVar, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, c8b c8bVar, int i3, int i4, fo6 fo6Var, tl0 tl0Var, x53 x53Var, o00 o00Var, hbb hbbVar) {
        super(context, z, file, z2, z3, rbbVar, activity, i, bitmap, bitmap2, i2, arrayList, c8bVar, i3, i4, fo6Var, tl0Var, x53Var, o00Var, hbbVar);
        this.o2 = sbbVar;
    }

    @Override // f44
    public final void B(boolean z) {
        sbb sbbVar = this.o2;
        sbbVar.p1.a(true, z, sbbVar.j0);
    }

    @Override // f44
    public final void C() {
        sbb sbbVar = this.o2;
        sbbVar.w1.N0(false);
        sbbVar.d1.clearAnimation();
        ViewPropertyAnimator duration = sbbVar.d1.animate().alpha(0.0f).setDuration(180L);
        k43 k43Var = k43.g;
        duration.setInterpolator(k43Var).start();
        if (sbbVar.h0 != 2) {
            sbbVar.Z0.clearAnimation();
            sbbVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(k43Var).start();
        }
        U0(o(), false);
    }

    public final void U0(boolean z, boolean z2) {
        sbb sbbVar = this.o2;
        j5c j5cVar = sbbVar.q1;
        if (!z) {
            j5cVar.a(false, z2);
            sbbVar.q1.clearAnimation();
            sbbVar.q1.animate().alpha(0.0f).withEndAction(new ew7(this, (byte) 1)).setDuration(180L).setInterpolator(k43.g).setStartDelay(z2 ? 500L : 0L).start();
        } else {
            j5cVar.setVisibility(0);
            sbbVar.q1.setAlpha(0.0f);
            sbbVar.q1.clearAnimation();
            sbbVar.q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(k43.g).start();
        }
    }

    @Override // f44
    public final void d(boolean z) {
        sbb sbbVar = this.o2;
        sbbVar.p1.b(sbbVar.d1.getText());
        sbbVar.p1.a(false, z && this.n2, null);
    }

    @Override // f44
    public final void e(boolean z) {
        h44 h44Var;
        if (!o()) {
            z = false;
        }
        sbb sbbVar = this.o2;
        sbbVar.d1.clearAnimation();
        ViewPropertyAnimator duration = sbbVar.d1.animate().alpha(sbbVar.h0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        k43 k43Var = k43.g;
        duration.setInterpolator(k43Var).start();
        sbbVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = sbbVar.Z0.animate();
        int i = sbbVar.h0;
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
        sbb sbbVar = this.o2;
        sbbVar.d1.f.d();
        sbbVar.k0(0, false, true);
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
        sbb sbbVar = this.o2;
        hbb hbbVar = sbbVar.Y0;
        if (hbbVar != null) {
            hbbVar.x(6, z);
            a81 a81Var = sbbVar.k1;
            if (a81Var != null) {
                ((mf8) a81Var.c).a(sbbVar.Y0.j(), true);
            }
        }
        ibb ibbVar = sbbVar.d1;
        if (ibbVar != null) {
            ibbVar.e0 = z;
            ibbVar.M.b(z);
        }
    }
}
