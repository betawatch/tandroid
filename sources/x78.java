// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class x78 extends mb1 {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x78(PhotoViewer photoViewer, Context context, z zVar, cja cjaVar, FrameLayout frameLayout, wjb wjbVar, sl0 sl0Var, l68 l68Var) {
        super(context, zVar, cjaVar, frameLayout, wjbVar, sl0Var, l68Var);
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
        y78 y78Var = this.u1.W1;
        if (y78Var != null) {
            y78Var.z();
        }
    }

    @Override // mb1
    public final boolean G() {
        o98 o98Var = this.u1.d;
        return o98Var != null && o98Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.u1;
        o98 o98Var = photoViewer.d;
        D(o98Var != null && o98Var.l() && (photoViewer.V1.M.c() || !(photoViewer.s1 || TextUtils.isEmpty(photoViewer.d0().getText()))), true);
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
    public final void h(wl0 wl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z2) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f2, ((-getY()) - photoViewer.Y1.getY()) + f3);
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

    @Override // mb1, ib1
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // mb1, ib1
    public final void u(float f) {
        super.u(f);
        PhotoViewer photoViewer = this.u1;
        c7 c7Var = photoViewer.f1;
        float f2 = 1.0f - f;
        c7Var.setAlpha((c7Var.getTag() != null ? 1 : 0) * f2);
        o76 o76Var = photoViewer.g1;
        o76Var.setAlpha((o76Var.getTag() != null ? 1 : 0) * f2);
        FrameLayout frameLayout = photoViewer.W7;
        frameLayout.setAlpha(f2 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // ib1
    public final void w() {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // mb1, ib1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i) {
        float f;
        PhotoViewer photoViewer = this.u1;
        super.x(i - photoViewer.t2.bottom);
        m21 m21Var = m21.w;
        if (m21Var != null) {
            m21Var.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.S0;
        boolean z = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i - r1.bottom) - photoViewer.Q0.getHeight())).setDuration(250L).setInterpolator(gb.w).start();
        }
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
                        }
                    }
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
            eb1Var.setTranslationY(((-getEditTextHeight()) - gl.L(14.0f)) - this.M.l);
        }
    }
}
