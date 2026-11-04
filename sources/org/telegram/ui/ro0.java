package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ro0 extends org.telegram.ui.Components.sc {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, lq0 lq0Var, org.telegram.ui.Components.qt0 qt0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var, xm0 xm0Var) {
        super(contextThemeWrapper, lq0Var, qt0Var, frameLayout, e6Var, x9Var, xm0Var);
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
        qo0 qo0Var = this.u1.V1;
        if (qo0Var != null) {
            qo0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.sc
    public final boolean G() {
        kq0 kq0Var = this.u1.d;
        return kq0Var != null && kq0Var.l();
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
            canvas.translate(((-getX()) - photoViewer.Z1.getX()) + f11, ((-getY()) - photoViewer.Z1.getY()) + f12);
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

    @Override // gi.m
    public final void w() {
        this.N.setReversed(true);
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
        this.N.setLayoutParams(b8.mf.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.sc, gi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i3) {
        float f10;
        boolean z10;
        PhotoViewer photoViewer = this.u1;
        super.x(i3 - photoViewer.t2.bottom);
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
                            photoViewer.r3(z10);
                            return;
                        }
                    }
                    z10 = false;
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
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
