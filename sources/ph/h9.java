package ph;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ng0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class h9 extends c5 {
    public boolean w2;
    public final /* synthetic */ da x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(da daVar, Context context, boolean z4, File file, boolean z10, boolean z11, ca caVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, t6 t6Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar, nh.b bVar, j5 j5Var, s9 s9Var) {
        super(context, z4, file, z10, z11, caVar, activity, i10, bitmap, bitmap2, i11, arrayList, t6Var, i12, i13, cropState, baVar, bVar, j5Var, s9Var);
        this.x2 = daVar;
    }

    @Override // dg.h
    public final void B(boolean z4) {
        da daVar = this.x2;
        daVar.l1.a(true, z4, daVar.f0);
    }

    @Override // dg.h
    public final void C() {
        da daVar = this.x2;
        daVar.s1.O0(false);
        daVar.Z0.clearAnimation();
        ViewPropertyAnimator duration = daVar.Z0.animate().alpha(0.0f).setDuration(180L);
        mr mrVar = mr.g;
        duration.setInterpolator(mrVar).start();
        if (daVar.d0 != 2) {
            daVar.V0.clearAnimation();
            daVar.V0.animate().alpha(0.0f).setDuration(180L).setInterpolator(mrVar).start();
        }
        V0(p(), false);
    }

    public final void V0(boolean z4, boolean z10) {
        da daVar = this.x2;
        if (!z4) {
            daVar.m1.a(false, z10);
            daVar.m1.clearAnimation();
            daVar.m1.animate().alpha(0.0f).withEndAction(new org.telegram.ui.web.q0(this, 27)).setDuration(180L).setInterpolator(mr.g).setStartDelay(z10 ? 500L : 0L).start();
        } else {
            daVar.m1.setVisibility(0);
            daVar.m1.setAlpha(0.0f);
            daVar.m1.clearAnimation();
            daVar.m1.animate().alpha(1.0f).setDuration(180L).setInterpolator(mr.g).start();
        }
    }

    @Override // ph.c5
    public final boolean f0(dw dwVar) {
        da daVar = this.x2;
        Activity activity = daVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            daVar.v2 = dwVar;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        daVar.v2 = dwVar;
        return false;
    }

    @Override // dg.h
    public final void g(boolean z4) {
        da daVar = this.x2;
        daVar.l1.b(daVar.Z0.getText());
        daVar.l1.a(false, z4 && this.w2, null);
    }

    @Override // dg.h
    public final void h(boolean z4) {
        dg.j jVar;
        if (!p()) {
            z4 = false;
        }
        da daVar = this.x2;
        daVar.Z0.clearAnimation();
        ViewPropertyAnimator duration = daVar.Z0.animate().alpha(daVar.d0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        mr mrVar = mr.g;
        duration.setInterpolator(mrVar).start();
        daVar.V0.clearAnimation();
        ViewPropertyAnimator animate = daVar.V0.animate();
        int i10 = daVar.d0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(mrVar).start();
        V0(false, z4);
        if (z4 && (jVar = this.G0) != null) {
            C0(jVar);
        }
        T0();
        this.i2 = true;
        this.w2 = false;
    }

    @Override // dg.h
    public final void j() {
        this.w2 = false;
        V0(p(), false);
        this.x2.l1.a(false, false, null);
    }

    @Override // dg.h
    public final void k() {
        this.w2 = true;
        this.x2.s1.O0(false);
        V0(false, false);
    }

    @Override // dg.h
    public final void m(boolean z4) {
        this.x2.m1.a(z4, false);
    }

    @Override // ph.c5
    public final void r0() {
        da daVar = this.x2;
        daVar.Z0.f.d();
        daVar.l0(0, false, true);
        dg.j jVar = this.G0;
        if (!(jVar instanceof dg.b4) || this.H0) {
            return;
        }
        dg.b4 b4Var = (dg.b4) jVar;
        this.H0 = true;
        b4Var.q();
        View focusedView = b4Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // dg.h
    public final void y() {
        this.x2.s1.O0(false);
    }

    @Override // ph.c5
    public final void z0(boolean z4) {
        da daVar = this.x2;
        s9 s9Var = daVar.U0;
        if (s9Var != null) {
            s9Var.x(6, z4);
            eg.i0 i0Var = daVar.g1;
            if (i0Var != null) {
                ((ng0) i0Var.c).a(daVar.U0.k(), true);
            }
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null) {
            t9Var.b0 = z4;
            t9Var.I.b(z4);
        }
    }
}
