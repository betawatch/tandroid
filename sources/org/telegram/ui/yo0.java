package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yo0 extends org.telegram.ui.Components.pc {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, tq0 tq0Var, org.telegram.ui.Components.st0 st0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.u9 u9Var, dn0 dn0Var) {
        super(contextThemeWrapper, tq0Var, st0Var, frameLayout, e6Var, u9Var, dn0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.pc
    public final void A() {
        PhotoViewer.P(this.u1);
    }

    @Override // org.telegram.ui.Components.pc
    public final void B() {
        z();
        xo0 xo0Var = this.u1.V1;
        if (xo0Var != null) {
            xo0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.pc
    public final boolean G() {
        sq0 sq0Var = this.u1.d;
        return sq0Var != null && sq0Var.l();
    }

    @Override // hi.m
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.xb xbVar = photoViewer.n7;
        if (xbVar == null || org.telegram.ui.Components.xb.w != xbVar) {
            return photoViewer.R2(photoViewer.f0);
        }
        return false;
    }

    @Override // hi.m
    public final boolean g() {
        return true;
    }

    @Override // hi.m
    public final void h(org.telegram.ui.Components.y9 y9Var, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
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
        photoViewer.N0(canvas, y9Var, org.telegram.ui.ActionBar.j6.r1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.j6.r1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.gz.c0 && ((i7 = this.u1.n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // hi.m
    public final boolean l(float f10, float f11) {
        return (this.p0 || this.u1.u4 == 0) ? false : true;
    }

    @Override // hi.m
    public final void w() {
        this.N.setReversed(true);
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        if (photoViewer.l4 != null) {
            this.N.getAdapter().n0 = false;
            this.N.getAdapter().W(photoViewer.l4.q8);
            this.N.getAdapter().f0 = photoViewer.l4.e != null;
        } else {
            this.N.getAdapter().n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
        this.N.setLayoutParams(c8.ja.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.pc, hi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i7) {
        float f10;
        boolean z10;
        PhotoViewer photoViewer = this.u1;
        super.x(i7 - photoViewer.t2.bottom);
        ViewPropertyAnimator animate = photoViewer.G.animate();
        if (photoViewer.K) {
            org.telegram.ui.Components.pc b12 = photoViewer.b1();
            yo0 yo0Var = photoViewer.W1;
            if (b12 != yo0Var || !yo0Var.M.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.Q0.getVisibility() != 0) {
                    if (photoViewer.K) {
                        org.telegram.ui.Components.pc b13 = photoViewer.b1();
                        yo0 yo0Var2 = photoViewer.W1;
                        if (b13 != yo0Var2 || !yo0Var2.M.c()) {
                            z10 = true;
                            photoViewer.m3(z10);
                            return;
                        }
                    }
                    z10 = false;
                    photoViewer.m3(z10);
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

    @Override // hi.m
    public final void y() {
        hi.i iVar = this.N;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
