package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zr0 extends org.telegram.ui.Components.ad {
    public final Path p1;
    public final /* synthetic */ PhotoViewer q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, au0 au0Var, org.telegram.ui.Components.xu0 xu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar, gq0 gq0Var) {
        super(contextThemeWrapper, au0Var, xu0Var, frameLayout, b6Var, baVar, gq0Var);
        this.q1 = photoViewer;
        this.p1 = new Path();
    }

    @Override // org.telegram.ui.Components.ad
    public final void A() {
        PhotoViewer.V(this.q1);
    }

    @Override // org.telegram.ui.Components.ad
    public final void B() {
        z();
        yr0 yr0Var = this.q1.Q1;
        if (yr0Var != null) {
            yr0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.ad
    public final boolean G() {
        zt0 zt0Var = this.q1.d;
        return zt0Var != null && zt0Var.l();
    }

    @Override // kh.m
    public final boolean e() {
        PhotoViewer photoViewer = this.q1;
        org.telegram.ui.Components.gc gcVar = photoViewer.j7;
        if (gcVar == null || org.telegram.ui.Components.gc.w != gcVar) {
            return photoViewer.T2(photoViewer.a0);
        }
        return false;
    }

    @Override // kh.m
    public final boolean g() {
        return true;
    }

    @Override // kh.m
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        canvas.save();
        Path path = this.p1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.q1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.U1.getX()) + f11, ((-getY()) - photoViewer.U1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        photoViewer.T0(canvas, faVar, org.telegram.ui.ActionBar.f6.l1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.f6.l1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i9;
        if (SharedConfig.photoViewerBlur && ((i9 = this.q1.j4) == 1 || i9 == 2 || i9 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // kh.m
    public final boolean l(float f10, float f11) {
        return (this.l0 || this.q1.q4 == 0) ? false : true;
    }

    @Override // kh.m
    public final void w() {
        this.I.setReversed(true);
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
        this.I.setLayoutParams(g7.e6.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ad, kh.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i9) {
        float f10;
        boolean z10;
        PhotoViewer photoViewer = this.q1;
        super.x(i9 - photoViewer.o2.bottom);
        ViewPropertyAnimator animate = photoViewer.B.animate();
        if (photoViewer.F) {
            org.telegram.ui.Components.ad f12 = photoViewer.f1();
            zr0 zr0Var = photoViewer.R1;
            if (f12 != zr0Var || !zr0Var.H.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.L0.getVisibility() != 0) {
                    if (photoViewer.F) {
                        org.telegram.ui.Components.ad f13 = photoViewer.f1();
                        zr0 zr0Var2 = photoViewer.R1;
                        if (f13 != zr0Var2 || !zr0Var2.H.c()) {
                            z10 = true;
                            photoViewer.o3(z10);
                            return;
                        }
                    }
                    z10 = false;
                    photoViewer.o3(z10);
                    return;
                }
                return;
            }
        }
        f10 = 0.0f;
        animate.alpha(f10).start();
        if (photoViewer.L0.getVisibility() != 0) {
        }
    }

    @Override // kh.m
    public final void y() {
        kh.i iVar = this.I;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
