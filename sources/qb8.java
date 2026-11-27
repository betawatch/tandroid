// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qb8 extends ub1 {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb8(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, z zVar, wma wmaVar, FrameLayout frameLayout, vnb vnbVar, tl0 tl0Var, y98 y98Var) {
        super(contextThemeWrapper, zVar, wmaVar, frameLayout, vnbVar, tl0Var, y98Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // ub1
    public final void A() {
        Drawable[] drawableArr = PhotoViewer.d9;
        this.u1.v2();
    }

    @Override // ub1
    public final void B() {
        z();
        pb8 pb8Var = this.u1.V1;
        if (pb8Var != null) {
            pb8Var.z();
        }
    }

    @Override // ub1
    public final boolean G() {
        ed8 ed8Var = this.u1.d;
        return ed8Var != null && ed8Var.l();
    }

    @Override // qb1
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        v21 v21Var = photoViewer.s7;
        if (v21Var == null || v21.x != v21Var) {
            return photoViewer.c2(photoViewer.f0);
        }
        return false;
    }

    @Override // qb1
    public final boolean g() {
        return true;
    }

    @Override // qb1
    public final void h(xl0 xl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z2) {
            canvas.translate(((-getX()) - photoViewer.Z1.getX()) + f2, ((-getY()) - photoViewer.Z1.getY()) + f3);
        } else {
            canvas.translate(f2, f3);
        }
        int p1 = aob.p1(1.0f, z ? -8882056 : -14277082);
        int p12 = aob.p1(1.0f, z2 ? z ? 0 : 855638016 : 1140850688);
        boolean z3 = false;
        boolean z4 = !z;
        if (!z && z2) {
            z3 = true;
        }
        photoViewer.P(canvas, xl0Var, p1, p12, false, z4, z3);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b;
        if (xea.Z && ((b = this.u1.m4) == 1 || b == 2 || b == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // qb1
    public final boolean l(float f, float f2) {
        return (this.p0 || this.u1.t4 == 0) ? false : true;
    }

    @Override // qb1
    public final void w() {
        this.N.setReversed(true);
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        zu1 zu1Var = photoViewer.k4;
        mb1 mb1Var = this.N;
        if (zu1Var != null) {
            mb1Var.getAdapter().n0 = false;
            this.N.getAdapter().V(photoViewer.k4.r8);
            this.N.getAdapter().f0 = photoViewer.k4.e != null;
        } else {
            mb1Var.getAdapter().n0 = true;
            this.N.getAdapter().V(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
        this.N.setLayoutParams(tre.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // ub1, qb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i) {
        float f;
        boolean z;
        PhotoViewer photoViewer = this.u1;
        super.x(i - photoViewer.t2.bottom);
        ViewPropertyAnimator animate = photoViewer.G.animate();
        if (photoViewer.K) {
            ub1 c0 = photoViewer.c0();
            qb8 qb8Var = photoViewer.W1;
            if (c0 != qb8Var || !qb8Var.M.c()) {
                f = 1.0f;
                animate.alpha(f).start();
                if (photoViewer.Q0.getVisibility() != 0) {
                    if (photoViewer.K) {
                        ub1 c02 = photoViewer.c0();
                        qb8 qb8Var2 = photoViewer.W1;
                        if (c02 != qb8Var2 || !qb8Var2.M.c()) {
                            z = true;
                            photoViewer.z2(z);
                            return;
                        }
                    }
                    z = false;
                    photoViewer.z2(z);
                    return;
                }
                return;
            }
        }
        f = 0.0f;
        animate.alpha(f).start();
        if (photoViewer.Q0.getVisibility() != 0) {
        }
    }

    @Override // qb1
    public final void y() {
        mb1 mb1Var = this.N;
        if (mb1Var != null) {
            mb1Var.setTranslationY(getEditTextHeight());
        }
    }
}
