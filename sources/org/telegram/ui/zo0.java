package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zo0 extends org.telegram.ui.Components.yc {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo0(PhotoViewer photoViewer, Context context, vq0 vq0Var, org.telegram.ui.Components.cu0 cu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ba baVar, kn0 kn0Var) {
        super(context, vq0Var, cu0Var, frameLayout, i6Var, baVar, kn0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.yc
    public final void A() {
        PhotoViewer.P(this.u1);
    }

    @Override // org.telegram.ui.Components.yc
    public final void B() {
        z();
        ap0 ap0Var = this.u1.W1;
        if (ap0Var != null) {
            ap0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.yc
    public final boolean G() {
        uq0 uq0Var = this.u1.d;
        return uq0Var != null && uq0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.u1;
        uq0 uq0Var = photoViewer.d;
        D(uq0Var != null && uq0Var.l() && (photoViewer.V1.M.c() || !(photoViewer.s1 || TextUtils.isEmpty(photoViewer.b1().getText()))), true);
    }

    @Override // hi.n
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.fc fcVar = photoViewer.t7;
        if (fcVar == null || org.telegram.ui.Components.fc.w != fcVar) {
            return photoViewer.S2(photoViewer.f0);
        }
        return false;
    }

    @Override // hi.n
    public final boolean g() {
        return true;
    }

    @Override // hi.n
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
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
        photoViewer.N0(canvas, faVar, org.telegram.ui.ActionBar.n6.r1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.n6.r1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.bz.c0 && ((i7 = this.u1.n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // hi.n
    public final boolean l(float f10, float f11) {
        return (this.p0 || this.u1.u4 == 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.yc, hi.n
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.yc, hi.n
    public final void u(float f10) {
        super.u(f10);
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.ActionBar.f0 f0Var = photoViewer.f1;
        float f11 = 1.0f - f10;
        f0Var.setAlpha((f0Var.getTag() != null ? 1 : 0) * f11);
        org.telegram.ui.Components.l80 l80Var = photoViewer.g1;
        l80Var.setAlpha((l80Var.getTag() != null ? 1 : 0) * f11);
        FrameLayout frameLayout = photoViewer.X7;
        frameLayout.setAlpha(f11 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // hi.n
    public final void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        if (photoViewer.l4 != null) {
            this.N.getAdapter().n0 = false;
            this.N.getAdapter().W(photoViewer.l4.r8);
            this.N.getAdapter().f0 = photoViewer.l4.e != null;
        } else {
            this.N.getAdapter().n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.yc, hi.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i7) {
        float f10;
        PhotoViewer photoViewer = this.u1;
        super.x(i7 - photoViewer.t2.bottom);
        org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.w;
        if (fcVar != null) {
            fcVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.S0;
        boolean z10 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i7 - r1.bottom) - photoViewer.Q0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.G.animate();
        if (photoViewer.K) {
            org.telegram.ui.Components.yc b12 = photoViewer.b1();
            ap0 ap0Var = photoViewer.W1;
            if (b12 != ap0Var || !ap0Var.M.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.Q0.getVisibility() != 0) {
                    if (photoViewer.K) {
                        org.telegram.ui.Components.yc b13 = photoViewer.b1();
                        ap0 ap0Var2 = photoViewer.W1;
                        if (b13 != ap0Var2 || !ap0Var2.M.c()) {
                            z10 = true;
                        }
                    }
                    photoViewer.n3(z10);
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

    @Override // hi.n
    public final void y() {
        hi.j jVar = this.N;
        if (jVar != null) {
            jVar.setTranslationY(((-getEditTextHeight()) - org.telegram.messenger.g0.L(14.0f)) - this.M.l);
        }
    }
}
