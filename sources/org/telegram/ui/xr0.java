package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xr0 extends org.telegram.ui.Components.ed {
    public final Path p1;
    public final /* synthetic */ PhotoViewer q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(PhotoViewer photoViewer, Context context, yt0 yt0Var, org.telegram.ui.Components.hv0 hv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar, gq0 gq0Var) {
        super(context, yt0Var, hv0Var, frameLayout, c6Var, gaVar, gq0Var);
        this.q1 = photoViewer;
        this.p1 = new Path();
    }

    @Override // org.telegram.ui.Components.ed
    public final void A() {
        PhotoViewer.W(this.q1);
    }

    @Override // org.telegram.ui.Components.ed
    public final void B() {
        z();
        yr0 yr0Var = this.q1.R1;
        if (yr0Var != null) {
            yr0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.ed
    public final boolean G() {
        xt0 xt0Var = this.q1.d;
        return xt0Var != null && xt0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.q1;
        xt0 xt0Var = photoViewer.d;
        D(xt0Var != null && xt0Var.l() && (photoViewer.Q1.H.c() || !(photoViewer.n1 || TextUtils.isEmpty(photoViewer.f1().getText()))), true);
    }

    @Override // nh.m
    public final boolean e() {
        PhotoViewer photoViewer = this.q1;
        org.telegram.ui.Components.mc mcVar = photoViewer.j7;
        if (mcVar == null || org.telegram.ui.Components.mc.w != mcVar) {
            return photoViewer.T2(photoViewer.a0);
        }
        return false;
    }

    @Override // nh.m
    public final boolean g() {
        return true;
    }

    @Override // nh.m
    public final void h(org.telegram.ui.Components.ka kaVar, Canvas canvas, RectF rectF, float f9, boolean z10, float f10, float f11, boolean z11) {
        canvas.save();
        Path path = this.p1;
        path.rewind();
        path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.q1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.T1.getX()) + f10, ((-getY()) - photoViewer.T1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        photoViewer.T0(canvas, kaVar, org.telegram.ui.ActionBar.g6.l1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.g6.l1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.q1.j4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // nh.m
    public final boolean l(float f9, float f10) {
        return (this.l0 || this.q1.q4 == 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ed, nh.m
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.ed, nh.m
    public final void u(float f9) {
        super.u(f9);
        PhotoViewer photoViewer = this.q1;
        org.telegram.ui.ActionBar.m0 m0Var = photoViewer.a1;
        float f10 = 1.0f - f9;
        m0Var.setAlpha((m0Var.getTag() != null ? 1 : 0) * f10);
        org.telegram.ui.Components.a90 a90Var = photoViewer.b1;
        a90Var.setAlpha((a90Var.getTag() != null ? 1 : 0) * f10);
        FrameLayout frameLayout = photoViewer.M7;
        frameLayout.setAlpha(f10 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // nh.m
    public final void w() {
        this.I.getAdapter().c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().e = false;
        PhotoViewer photoViewer = this.q1;
        if (photoViewer.h4 != null) {
            this.I.getAdapter().i0 = false;
            this.I.getAdapter().W(photoViewer.h4.V7);
            this.I.getAdapter().a0 = photoViewer.h4.e != null;
        } else {
            this.I.getAdapter().i0 = true;
            this.I.getAdapter().W(null);
            this.I.getAdapter().a0 = false;
        }
        this.I.getAdapter().b0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ed, nh.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f9;
        PhotoViewer photoViewer = this.q1;
        super.x(i10 - photoViewer.o2.bottom);
        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
        if (mcVar != null) {
            mcVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.N0;
        boolean z10 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i10 - r1.bottom) - photoViewer.L0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.B.animate();
        if (photoViewer.F) {
            org.telegram.ui.Components.ed f12 = photoViewer.f1();
            yr0 yr0Var = photoViewer.R1;
            if (f12 != yr0Var || !yr0Var.H.c()) {
                f9 = 1.0f;
                animate.alpha(f9).start();
                if (photoViewer.L0.getVisibility() != 0) {
                    if (photoViewer.F) {
                        org.telegram.ui.Components.ed f13 = photoViewer.f1();
                        yr0 yr0Var2 = photoViewer.R1;
                        if (f13 != yr0Var2 || !yr0Var2.H.c()) {
                            z10 = true;
                        }
                    }
                    photoViewer.o3(z10);
                    return;
                }
                return;
            }
        }
        f9 = 0.0f;
        animate.alpha(f9).start();
        if (photoViewer.L0.getVisibility() != 0) {
        }
    }

    @Override // nh.m
    public final void y() {
        nh.i iVar = this.I;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.H.l);
        }
    }
}
