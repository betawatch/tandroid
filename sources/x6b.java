// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class x6b extends wt7 {
    public boolean t2;
    public final /* synthetic */ t7b u2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6b(t7b t7bVar, Context context, boolean z, File file, boolean z2, boolean z3, s7b s7bVar, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, f4b f4bVar, int i3, int i4, zl6 zl6Var, sl0 sl0Var, f53 f53Var, n00 n00Var, i7b i7bVar) {
        super(context, z, file, z2, z3, s7bVar, activity, i, bitmap, bitmap2, i2, arrayList, f4bVar, i3, i4, zl6Var, sl0Var, f53Var, n00Var, i7bVar);
        this.u2 = t7bVar;
    }

    @Override // j34
    public final void B(boolean z) {
        t7b t7bVar = this.u2;
        t7bVar.p1.a(true, z, t7bVar.j0);
    }

    @Override // j34
    public final void C() {
        t7b t7bVar = this.u2;
        t7bVar.w1.O0(false);
        t7bVar.d1.clearAnimation();
        ViewPropertyAnimator duration = t7bVar.d1.animate().alpha(0.0f).setDuration(180L);
        s33 s33Var = s33.g;
        duration.setInterpolator(s33Var).start();
        if (t7bVar.h0 != 2) {
            t7bVar.Z0.clearAnimation();
            t7bVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(s33Var).start();
        }
        V0(o(), false);
    }

    public final void V0(boolean z, boolean z2) {
        t7b t7bVar = this.u2;
        k1c k1cVar = t7bVar.q1;
        if (!z) {
            k1cVar.a(false, z2);
            t7bVar.q1.clearAnimation();
            t7bVar.q1.animate().alpha(0.0f).withEndAction(new xs7(this, (byte) 1)).setDuration(180L).setInterpolator(s33.g).setStartDelay(z2 ? 500L : 0L).start();
        } else {
            k1cVar.setVisibility(0);
            t7bVar.q1.setAlpha(0.0f);
            t7bVar.q1.clearAnimation();
            t7bVar.q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(s33.g).start();
        }
    }

    @Override // j34
    public final void d(boolean z) {
        t7b t7bVar = this.u2;
        t7bVar.p1.b(t7bVar.d1.getText());
        t7bVar.p1.a(false, z && this.t2, null);
    }

    @Override // j34
    public final void e(boolean z) {
        l34 l34Var;
        if (!o()) {
            z = false;
        }
        t7b t7bVar = this.u2;
        t7bVar.d1.clearAnimation();
        ViewPropertyAnimator duration = t7bVar.d1.animate().alpha(t7bVar.h0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        s33 s33Var = s33.g;
        duration.setInterpolator(s33Var).start();
        t7bVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = t7bVar.Z0.animate();
        int i = t7bVar.h0;
        animate.alpha((i == -1 || i == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(s33Var).start();
        V0(false, z);
        if (z && (l34Var = this.z0) != null) {
            B0(l34Var);
        }
        T0();
        this.f2 = true;
        this.t2 = false;
    }

    @Override // j34
    public final void f() {
        this.t2 = false;
        V0(o(), false);
        this.u2.p1.a(false, false, null);
    }

    @Override // j34
    public final void g() {
        this.t2 = true;
        this.u2.w1.O0(false);
        V0(false, false);
    }

    @Override // j34
    public final void j(boolean z) {
        this.u2.q1.a(z, false);
    }

    @Override // wt7
    public final void o0() {
        t7b t7bVar = this.u2;
        t7bVar.d1.f.d();
        t7bVar.k0(0, false, true);
        l34 l34Var = this.z0;
        if (!(l34Var instanceof vhb) || this.A0) {
            return;
        }
        vhb vhbVar = (vhb) l34Var;
        if (vhbVar instanceof cc1) {
            cc1 cc1Var = (cc1) vhbVar;
            cc1Var.z();
            if (cc1Var.E0 == null) {
                return;
            }
        }
        this.A0 = true;
        vhbVar.q();
        View focusedView = vhbVar.getFocusedView();
        focusedView.requestFocus();
        gl.E3(focusedView);
    }

    @Override // j34
    public final void x() {
        this.u2.w1.O0(false);
    }

    @Override // wt7
    public final void y0(boolean z) {
        t7b t7bVar = this.u2;
        i7b i7bVar = t7bVar.Y0;
        if (i7bVar != null) {
            i7bVar.x(6, z);
            s71 s71Var = t7bVar.k1;
            if (s71Var != null) {
                ((xb8) s71Var.c).a(t7bVar.Y0.j(), true);
            }
        }
        j7b j7bVar = t7bVar.d1;
        if (j7bVar != null) {
            j7bVar.e0 = z;
            j7bVar.M.b(z);
        }
    }
}
