package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qo0 extends org.telegram.ui.Components.sc {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo0(PhotoViewer photoViewer, Context context, lq0 lq0Var, org.telegram.ui.Components.qt0 qt0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var, xm0 xm0Var) {
        super(context, lq0Var, qt0Var, frameLayout, e6Var, x9Var, xm0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.sc
    public final void A() {
        PhotoViewer.W(this.u1);
    }

    @Override // org.telegram.ui.Components.sc
    public final void B() {
        z();
        ro0 ro0Var = this.u1.W1;
        if (ro0Var != null) {
            ro0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.sc
    public final boolean G() {
        kq0 kq0Var = this.u1.d;
        return kq0Var != null && kq0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.u1;
        kq0 kq0Var = photoViewer.d;
        D(kq0Var != null && kq0Var.l() && (photoViewer.V1.M.c() || !(photoViewer.s1 || TextUtils.isEmpty(photoViewer.h1().getText()))), true);
    }

    @Override // gi.m
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.ac acVar = photoViewer.o7;
        if (acVar == null || org.telegram.ui.Components.ac.w != acVar) {
            return photoViewer.W2(photoViewer.f0);
        }
        return false;
    }

    @Override // gi.m
    public final boolean g() {
        return true;
    }

    @Override // gi.m
    public final void h(org.telegram.ui.Components.ba baVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f11, ((-getY()) - photoViewer.Y1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        photoViewer.U0(canvas, baVar, org.telegram.ui.ActionBar.k6.r1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.k6.r1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i3;
        if (org.telegram.messenger.az.c0 && ((i3 = this.u1.o4) == 1 || i3 == 2 || i3 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // gi.m
    public final boolean l(float f10, float f11) {
        return (this.p0 || this.u1.v4 == 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.sc, gi.m
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.sc, gi.m
    public final void u(float f10) {
        super.u(f10);
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.ActionBar.e0 e0Var = photoViewer.f1;
        float f11 = 1.0f - f10;
        e0Var.setAlpha((e0Var.getTag() != null ? 1 : 0) * f11);
        org.telegram.ui.Components.u70 u70Var = photoViewer.g1;
        u70Var.setAlpha((u70Var.getTag() != null ? 1 : 0) * f11);
        FrameLayout frameLayout = photoViewer.S7;
        frameLayout.setAlpha(f11 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // gi.m
    public final void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        if (photoViewer.m4 != null) {
            this.N.getAdapter().n0 = false;
            this.N.getAdapter().W(photoViewer.m4.q8);
            this.N.getAdapter().f0 = photoViewer.m4.e != null;
        } else {
            this.N.getAdapter().n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.sc, gi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i3) {
        float f10;
        PhotoViewer photoViewer = this.u1;
        super.x(i3 - photoViewer.t2.bottom);
        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
        if (acVar != null) {
            acVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.S0;
        boolean z10 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i3 - r1.bottom) - photoViewer.Q0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.G.animate();
        if (photoViewer.K) {
            org.telegram.ui.Components.sc h12 = photoViewer.h1();
            ro0 ro0Var = photoViewer.W1;
            if (h12 != ro0Var || !ro0Var.M.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.Q0.getVisibility() != 0) {
                    if (photoViewer.K) {
                        org.telegram.ui.Components.sc h13 = photoViewer.h1();
                        ro0 ro0Var2 = photoViewer.W1;
                        if (h13 != ro0Var2 || !ro0Var2.M.c()) {
                            z10 = true;
                        }
                    }
                    photoViewer.r3(z10);
                    return;
                }
                return;
            }
        }
        f10 = 0.0f;
        animate.alpha(f10).start();
        if (photoViewer.Q0.getVisibility() != 0) {
        }
    }

    @Override // gi.m
    public final void y() {
        gi.i iVar = this.N;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - org.telegram.messenger.g0.L(14.0f)) - this.M.l);
        }
    }
}
