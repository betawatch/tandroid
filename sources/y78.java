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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y78 extends mb1 {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y78(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, z zVar, cja cjaVar, FrameLayout frameLayout, wjb wjbVar, sl0 sl0Var, l68 l68Var) {
        super(contextThemeWrapper, zVar, cjaVar, frameLayout, wjbVar, sl0Var, l68Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // mb1
    public final void A() {
        Drawable[] drawableArr = PhotoViewer.d9;
        this.u1.v2();
    }

    @Override // mb1
    public final void B() {
        z();
        x78 x78Var = this.u1.V1;
        if (x78Var != null) {
            x78Var.z();
        }
    }

    @Override // mb1
    public final boolean G() {
        o98 o98Var = this.u1.d;
        return o98Var != null && o98Var.l();
    }

    @Override // ib1
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        m21 m21Var = photoViewer.s7;
        if (m21Var == null || m21.w != m21Var) {
            return photoViewer.c2(photoViewer.f0);
        }
        return false;
    }

    @Override // ib1
    public final boolean g() {
        return true;
    }

    @Override // ib1
    public final void h(wl0 wl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
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
        int p1 = bkb.p1(1.0f, z ? -8882056 : -14277082);
        int p12 = bkb.p1(1.0f, z2 ? z ? 0 : 855638016 : 1140850688);
        boolean z3 = false;
        boolean z4 = !z;
        if (!z && z2) {
            z3 = true;
        }
        photoViewer.Q(canvas, wl0Var, p1, p12, false, z4, z3);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b;
        if (gba.Z && ((b = this.u1.m4) == 1 || b == 2 || b == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // ib1
    public final boolean l(float f, float f2) {
        return (this.p0 || this.u1.t4 == 0) ? false : true;
    }

    @Override // ib1
    public final void w() {
        this.N.setReversed(true);
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        mu1 mu1Var = photoViewer.k4;
        eb1 eb1Var = this.N;
        if (mu1Var != null) {
            eb1Var.getAdapter().n0 = false;
            this.N.getAdapter().V(photoViewer.k4.r8);
            this.N.getAdapter().f0 = photoViewer.k4.e != null;
        } else {
            eb1Var.getAdapter().n0 = true;
            this.N.getAdapter().V(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
        this.N.setLayoutParams(nme.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // mb1, ib1
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
            mb1 d0 = photoViewer.d0();
            y78 y78Var = photoViewer.W1;
            if (d0 != y78Var || !y78Var.M.c()) {
                f = 1.0f;
                animate.alpha(f).start();
                if (photoViewer.Q0.getVisibility() != 0) {
                    if (photoViewer.K) {
                        mb1 d02 = photoViewer.d0();
                        y78 y78Var2 = photoViewer.W1;
                        if (d02 != y78Var2 || !y78Var2.M.c()) {
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

    @Override // ib1
    public final void y() {
        eb1 eb1Var = this.N;
        if (eb1Var != null) {
            eb1Var.setTranslationY(getEditTextHeight());
        }
    }
}
