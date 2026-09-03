package qh;

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
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class e9 extends a5 {
    public boolean w2;
    public final /* synthetic */ ba x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(ba baVar, Context context, boolean z4, File file, boolean z10, boolean z11, aa aaVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, r6 r6Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar2, oh.b bVar, h5 h5Var, p9 p9Var) {
        super(context, z4, file, z10, z11, aaVar, activity, i10, bitmap, bitmap2, i11, arrayList, r6Var, i12, i13, cropState, baVar2, bVar, h5Var, p9Var);
        this.x2 = baVar;
    }

    @Override // eg.h
    public final void B(boolean z4) {
        ba baVar = this.x2;
        baVar.l1.a(true, z4, baVar.f0);
    }

    @Override // eg.h
    public final void C() {
        ba baVar = this.x2;
        baVar.s1.O0(false);
        baVar.Z0.clearAnimation();
        ViewPropertyAnimator duration = baVar.Z0.animate().alpha(0.0f).setDuration(180L);
        pr prVar = pr.g;
        duration.setInterpolator(prVar).start();
        if (baVar.d0 != 2) {
            baVar.V0.clearAnimation();
            baVar.V0.animate().alpha(0.0f).setDuration(180L).setInterpolator(prVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z4, boolean z10) {
        ba baVar = this.x2;
        if (!z4) {
            baVar.m1.a(false, z10);
            baVar.m1.clearAnimation();
            baVar.m1.animate().alpha(0.0f).withEndAction(new org.telegram.ui.web.s0(this, 28)).setDuration(180L).setInterpolator(pr.g).setStartDelay(z10 ? 500L : 0L).start();
        } else {
            baVar.m1.setVisibility(0);
            baVar.m1.setAlpha(0.0f);
            baVar.m1.clearAnimation();
            baVar.m1.animate().alpha(1.0f).setDuration(180L).setInterpolator(pr.g).start();
        }
    }

    @Override // qh.a5
    public final boolean f0(im imVar) {
        ba baVar = this.x2;
        Activity activity = baVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            baVar.v2 = imVar;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        baVar.v2 = imVar;
        return false;
    }

    @Override // eg.h
    public final void h(boolean z4) {
        ba baVar = this.x2;
        baVar.l1.b(baVar.Z0.getText());
        baVar.l1.a(false, z4 && this.w2, null);
    }

    @Override // eg.h
    public final void i(boolean z4) {
        eg.j jVar;
        if (!q()) {
            z4 = false;
        }
        ba baVar = this.x2;
        baVar.Z0.clearAnimation();
        ViewPropertyAnimator duration = baVar.Z0.animate().alpha(baVar.d0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        pr prVar = pr.g;
        duration.setInterpolator(prVar).start();
        baVar.V0.clearAnimation();
        ViewPropertyAnimator animate = baVar.V0.animate();
        int i10 = baVar.d0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(prVar).start();
        V0(false, z4);
        if (z4 && (jVar = this.G0) != null) {
            C0(jVar);
        }
        T0();
        this.i2 = true;
        this.w2 = false;
    }

    @Override // eg.h
    public final void k() {
        this.w2 = false;
        V0(q(), false);
        this.x2.l1.a(false, false, null);
    }

    @Override // eg.h
    public final void l() {
        this.w2 = true;
        this.x2.s1.O0(false);
        V0(false, false);
    }

    @Override // eg.h
    public final void n(boolean z4) {
        this.x2.m1.a(z4, false);
    }

    @Override // qh.a5
    public final void r0() {
        ba baVar = this.x2;
        baVar.Z0.f.d();
        baVar.l0(0, false, true);
        eg.j jVar = this.G0;
        if (!(jVar instanceof eg.z3) || this.H0) {
            return;
        }
        eg.z3 z3Var = (eg.z3) jVar;
        this.H0 = true;
        z3Var.q();
        View focusedView = z3Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // eg.h
    public final void y() {
        this.x2.s1.O0(false);
    }

    @Override // qh.a5
    public final void z0(boolean z4) {
        ba baVar = this.x2;
        p9 p9Var = baVar.U0;
        if (p9Var != null) {
            p9Var.x(6, z4);
            fg.i0 i0Var = baVar.g1;
            if (i0Var != null) {
                ((og0) i0Var.c).a(baVar.U0.k(), true);
            }
        }
        q9 q9Var = baVar.Z0;
        if (q9Var != null) {
            q9Var.b0 = z4;
            q9Var.I.b(z4);
        }
    }
}
