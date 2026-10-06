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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.Components.md {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(PhotoViewer photoViewer, Context context, xu0 xu0Var, org.telegram.ui.Components.mw0 mw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ka kaVar, dr0 dr0Var) {
        super(context, xu0Var, mw0Var, frameLayout, d6Var, kaVar, dr0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.md
    public final void A() {
        PhotoViewer.U(this.u1);
    }

    @Override // org.telegram.ui.Components.md
    public final void B() {
        z();
        xs0 xs0Var = this.u1.V1;
        if (xs0Var != null) {
            xs0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.md
    public final boolean G() {
        wu0 wu0Var = this.u1.d;
        return wu0Var != null && wu0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.u1;
        wu0 wu0Var = photoViewer.d;
        D(wu0Var != null && wu0Var.l() && (photoViewer.U1.L.c() || !(photoViewer.r1 || TextUtils.isEmpty(photoViewer.f1().getText()))), true);
    }

    @Override // ci.m
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.rc rcVar = photoViewer.n7;
        if (rcVar == null || org.telegram.ui.Components.rc.w != rcVar) {
            return photoViewer.T2(photoViewer.e0);
        }
        return false;
    }

    @Override // ci.m
    public final boolean g() {
        return true;
    }

    @Override // ci.m
    public final void h(org.telegram.ui.Components.oa oaVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
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
        photoViewer.T0(canvas, oaVar, org.telegram.ui.ActionBar.i6.l1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.i6.l1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
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

    @Override // ci.m
    public final boolean l(float f7, float f10) {
        return (this.p0 || this.u1.u4 == 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.md, ci.m
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.md, ci.m
    public final void u(float f7) {
        super.u(f7);
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.ActionBar.k0 k0Var = photoViewer.e1;
        float f10 = 1.0f - f7;
        k0Var.setAlpha((k0Var.getTag() != null ? 1 : 0) * f10);
        org.telegram.ui.Components.s90 s90Var = photoViewer.f1;
        s90Var.setAlpha((s90Var.getTag() != null ? 1 : 0) * f10);
        FrameLayout frameLayout = photoViewer.R7;
        frameLayout.setAlpha(f10 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // ci.m
    public final void w() {
        this.M.getAdapter().c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.X7);
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
    @Override // org.telegram.ui.Components.md, ci.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f7;
        PhotoViewer photoViewer = this.u1;
        super.x(i10 - photoViewer.s2.bottom);
        org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.w;
        if (rcVar != null) {
            rcVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.R0;
        boolean z10 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i10 - r1.bottom) - photoViewer.P0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.F.animate();
        if (photoViewer.J) {
            org.telegram.ui.Components.md f12 = photoViewer.f1();
            xs0 xs0Var = photoViewer.V1;
            if (f12 != xs0Var || !xs0Var.L.c()) {
                f7 = 1.0f;
                animate.alpha(f7).start();
                if (photoViewer.P0.getVisibility() != 0) {
                    if (photoViewer.J) {
                        org.telegram.ui.Components.md f13 = photoViewer.f1();
                        xs0 xs0Var2 = photoViewer.V1;
                        if (f13 != xs0Var2 || !xs0Var2.L.c()) {
                            z10 = true;
                        }
                    }
                    photoViewer.o3(z10);
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

    @Override // ci.m
    public final void y() {
        ci.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.l);
        }
    }
}
