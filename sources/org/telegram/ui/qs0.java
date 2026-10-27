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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qs0 extends org.telegram.ui.Components.jd {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(PhotoViewer photoViewer, Context context, ru0 ru0Var, org.telegram.ui.Components.ww0 ww0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.la laVar, zq0 zq0Var) {
        super(context, ru0Var, ww0Var, frameLayout, u6Var, laVar, zq0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.jd
    public final void A() {
        PhotoViewer.X(this.u1);
    }

    @Override // org.telegram.ui.Components.jd
    public final void B() {
        z();
        rs0 rs0Var = this.u1.V1;
        if (rs0Var != null) {
            rs0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.jd
    public final boolean G() {
        qu0 qu0Var = this.u1.d;
        return qu0Var != null && qu0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.u1;
        qu0 qu0Var = photoViewer.d;
        D(qu0Var != null && qu0Var.l() && (photoViewer.U1.L.c() || !(photoViewer.r1 || TextUtils.isEmpty(photoViewer.h1().getText()))), true);
    }

    @Override // fi.m
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.qc qcVar = photoViewer.n7;
        if (qcVar == null || org.telegram.ui.Components.qc.x != qcVar) {
            return photoViewer.W2(photoViewer.e0);
        }
        return false;
    }

    @Override // fi.m
    public final boolean g() {
        return true;
    }

    @Override // fi.m
    public final void h(org.telegram.ui.Components.pa paVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.X1.getX()) + f10, ((-getY()) - photoViewer.X1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        photoViewer.U0(canvas, paVar, org.telegram.ui.ActionBar.y6.o1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.y6.o1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.u1.n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // fi.m
    public final boolean l(float f7, float f10) {
        return (this.p0 || this.u1.u4 == 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.jd, fi.m
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.jd, fi.m
    public final void u(float f7) {
        super.u(f7);
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.ActionBar.k0 k0Var = photoViewer.e1;
        float f10 = 1.0f - f7;
        k0Var.setAlpha((k0Var.getTag() != null ? 1 : 0) * f10);
        org.telegram.ui.Components.ca0 ca0Var = photoViewer.f1;
        ca0Var.setAlpha((ca0Var.getTag() != null ? 1 : 0) * f10);
        FrameLayout frameLayout = photoViewer.R7;
        frameLayout.setAlpha(f10 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // fi.m
    public final void w() {
        this.M.getAdapter().c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.p8);
            this.M.getAdapter().e0 = photoViewer.l4.e != null;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().e0 = false;
        }
        this.M.getAdapter().f0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.jd, fi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f7;
        PhotoViewer photoViewer = this.u1;
        super.x(i10 - photoViewer.s2.bottom);
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
        if (qcVar != null) {
            qcVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.R0;
        boolean z10 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i10 - r1.bottom) - photoViewer.P0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.F.animate();
        if (photoViewer.J) {
            org.telegram.ui.Components.jd h12 = photoViewer.h1();
            rs0 rs0Var = photoViewer.V1;
            if (h12 != rs0Var || !rs0Var.L.c()) {
                f7 = 1.0f;
                animate.alpha(f7).start();
                if (photoViewer.P0.getVisibility() != 0) {
                    if (photoViewer.J) {
                        org.telegram.ui.Components.jd h13 = photoViewer.h1();
                        rs0 rs0Var2 = photoViewer.V1;
                        if (h13 != rs0Var2 || !rs0Var2.L.c()) {
                            z10 = true;
                        }
                    }
                    photoViewer.r3(z10);
                    return;
                }
                return;
            }
        }
        f7 = 0.0f;
        animate.alpha(f7).start();
        if (photoViewer.P0.getVisibility() != 0) {
        }
    }

    @Override // fi.m
    public final void y() {
        fi.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.l);
        }
    }
}
