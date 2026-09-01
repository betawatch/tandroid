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
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class f9 extends b5 {
    public boolean w2;
    public final /* synthetic */ ca x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(ca caVar, Context context, boolean z4, File file, boolean z10, boolean z11, ba baVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, s6 s6Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar2, oh.b bVar, i5 i5Var, q9 q9Var) {
        super(context, z4, file, z10, z11, baVar, activity, i10, bitmap, bitmap2, i11, arrayList, s6Var, i12, i13, cropState, baVar2, bVar, i5Var, q9Var);
        this.x2 = caVar;
    }

    @Override // eg.h
    public final void B(boolean z4) {
        ca caVar = this.x2;
        caVar.l1.a(true, z4, caVar.f0);
    }

    @Override // eg.h
    public final void C() {
        ca caVar = this.x2;
        caVar.s1.O0(false);
        caVar.Z0.clearAnimation();
        ViewPropertyAnimator duration = caVar.Z0.animate().alpha(0.0f).setDuration(180L);
        pr prVar = pr.g;
        duration.setInterpolator(prVar).start();
        if (caVar.d0 != 2) {
            caVar.V0.clearAnimation();
            caVar.V0.animate().alpha(0.0f).setDuration(180L).setInterpolator(prVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z4, boolean z10) {
        ca caVar = this.x2;
        if (!z4) {
            caVar.m1.a(false, z10);
            caVar.m1.clearAnimation();
            caVar.m1.animate().alpha(0.0f).withEndAction(new org.telegram.ui.web.s0(this, 28)).setDuration(180L).setInterpolator(pr.g).setStartDelay(z10 ? 500L : 0L).start();
        } else {
            caVar.m1.setVisibility(0);
            caVar.m1.setAlpha(0.0f);
            caVar.m1.clearAnimation();
            caVar.m1.animate().alpha(1.0f).setDuration(180L).setInterpolator(pr.g).start();
        }
    }

    @Override // qh.b5
    public final boolean f0(jm jmVar) {
        ca caVar = this.x2;
        Activity activity = caVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            caVar.v2 = jmVar;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        caVar.v2 = jmVar;
        return false;
    }

    @Override // eg.h
    public final void h(boolean z4) {
        ca caVar = this.x2;
        caVar.l1.b(caVar.Z0.getText());
        caVar.l1.a(false, z4 && this.w2, null);
    }

    @Override // eg.h
    public final void i(boolean z4) {
        eg.j jVar;
        if (!q()) {
            z4 = false;
        }
        ca caVar = this.x2;
        caVar.Z0.clearAnimation();
        ViewPropertyAnimator duration = caVar.Z0.animate().alpha(caVar.d0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        pr prVar = pr.g;
        duration.setInterpolator(prVar).start();
        caVar.V0.clearAnimation();
        ViewPropertyAnimator animate = caVar.V0.animate();
        int i10 = caVar.d0;
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

    @Override // qh.b5
    public final void r0() {
        ca caVar = this.x2;
        caVar.Z0.f.d();
        caVar.l0(0, false, true);
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

    @Override // qh.b5
    public final void z0(boolean z4) {
        ca caVar = this.x2;
        q9 q9Var = caVar.U0;
        if (q9Var != null) {
            q9Var.x(6, z4);
            fg.i0 i0Var = caVar.g1;
            if (i0Var != null) {
                ((og0) i0Var.c).a(caVar.U0.k(), true);
            }
        }
        r9 r9Var = caVar.Z0;
        if (r9Var != null) {
            r9Var.b0 = z4;
            r9Var.I.b(z4);
        }
    }
}
