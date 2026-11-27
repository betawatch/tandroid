// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class pk9 extends dk9 implements jq3 {
    public static Paint p0;
    public static ColorMatrixColorFilter q0;
    public final boolean X;
    public final ImageReceiver Y;
    public final ImageReceiver Z;
    public Bitmap a0;
    public RadialProgress2 b0;
    public int c0;
    public int d0;
    public boolean e0;
    public final int f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public final int l0;
    public boolean m0;
    public final Path n0;
    public final dl9 o0;

    public pk9(hl9 hl9Var, Rect rect, int i, boolean z) {
        super(hl9Var, rect, i);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Z = imageReceiver2;
        this.g0 = -1;
        this.l0 = hl.L(48.0f);
        this.n0 = new Path();
        this.o0 = new dl9();
        this.X = z;
        this.f0 = lq3.q(hl9Var.a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
        imageReceiver.h1 = new pq8(this, (byte) 9);
    }

    @Override // dk9
    public final int A() {
        return 1;
    }

    @Override // jq3
    public final void B(boolean z) {
        s0(false);
    }

    @Override // dk9
    public final CharSequence D(int i) {
        String M0 = ob6.M0(p0() ? 2131753926 : 2131753941, null);
        return (!q0() || this.o0.b()) ? M0 : TextUtils.concat(M0, ", ", ob6.M0(2131744919, null));
    }

    @Override // dk9
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.d0 + rect.bottom;
    }

    @Override // dk9
    public final int I() {
        return J();
    }

    @Override // dk9
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.c0 + rect.right;
    }

    @Override // jq3
    public final void N(String str) {
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null) {
            radialProgress2.o(true, 1.0f);
        }
        if (o0() && (h0() || this.m0)) {
            i0(true);
        }
        s0(true);
    }

    @Override // dk9
    public final void S() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Y;
        imageReceiver.p0(view);
        imageReceiver.I();
        View view2 = this.W;
        ImageReceiver imageReceiver2 = this.Z;
        imageReceiver2.p0(view2);
        imageReceiver2.I();
        s0(false);
    }

    @Override // dk9
    public final boolean T(int i, View view) {
        if (q0()) {
            dl9 dl9Var = this.o0;
            if (!dl9Var.b && dl9Var.f == null) {
                ImageReceiver imageReceiver = this.Y;
                float f = imageReceiver.N0;
                float f2 = imageReceiver.O0;
                dl9Var.c(this.W, (f / 2.0f) + imageReceiver.L0, (f2 / 2.0f) + imageReceiver.M0, f, f2);
                return true;
            }
        }
        hl9 hl9Var = this.a;
        rb2 rb2Var = hl9Var.F;
        if (rb2Var == null) {
            return false;
        }
        rb2Var.P0(hl9Var.E, m0());
        return true;
    }

    @Override // dk9
    public final void U() {
        this.Y.K();
        this.Z.K();
        this.a0 = null;
        lq3.q(this.a.a).v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // dk9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(Canvas canvas) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        Canvas canvas2 = canvas;
        if (p0 == null) {
            Paint paint = new Paint(1);
            p0 = paint;
            paint.setColor(251658240);
        }
        hl9 hl9Var = this.a;
        int i = hl9Var.C;
        Rect rect = this.b;
        int i2 = (i - rect.left) - rect.right;
        boolean Q = Q();
        int L = hl.L(2.0f);
        int i3 = (Q || hl9Var.C()) ? 0 : hl9Var.S - L;
        int i4 = (Q || hl9Var.C()) ? 0 : hl9Var.T - L;
        boolean z = (hl9Var.C - rect.left) - rect.right > this.c0;
        if (Q) {
            canvas2.save();
            Path path = this.n0;
            path.rewind();
            path.addRoundRect(0.0f, 0.0f, i2, this.d0, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        }
        ImageReceiver imageReceiver3 = this.Y;
        if (imageReceiver3.B() && imageReceiver3.i1 == 1.0f) {
            imageReceiver = imageReceiver3;
        } else {
            imageReceiver = imageReceiver3;
            canvas2.drawRect(-i3, 0.0f, i2 + i4, this.d0, p0);
        }
        mpa mpaVar = null;
        ImageReceiver imageReceiver4 = this.Z;
        if (z) {
            r0();
            t0(imageReceiver4, false);
            imageReceiver2 = imageReceiver;
            t0(imageReceiver2, true);
            if (imageReceiver4.n() != null) {
                imageReceiver4.i0(-i3, 0.0f, i3 + i2 + i4, this.d0);
                imageReceiver4.setAlpha(imageReceiver2.i1);
                imageReceiver4.h(canvas2, null);
            }
            imageReceiver2.S0 = true;
            imageReceiver2.i0(0.0f, 0.0f, (hl9Var.C - rect.left) - rect.right, this.d0);
        } else {
            imageReceiver2 = imageReceiver;
            t0(imageReceiver2, false);
            imageReceiver2.S0 = false;
            imageReceiver2.i0(-i3, 0.0f, i3 + i2 + i4, this.d0);
        }
        imageReceiver2.h(canvas2, null);
        if (q0()) {
            dl9 dl9Var = this.o0;
            if (!dl9Var.b()) {
                if (!dl9Var.b()) {
                    r0();
                    float f = imageReceiver2.L0;
                    float f2 = imageReceiver2.M0;
                    float f3 = imageReceiver2.N0;
                    float f4 = imageReceiver2.O0;
                    if (f3 > 0.0f && f4 > 0.0f) {
                        canvas2.save();
                        canvas2.clipRect(f, f2, f + f3, f2 + f4);
                        dl9Var.a(canvas2);
                        if (imageReceiver4.n() != null) {
                            t0(imageReceiver4, false);
                            imageReceiver4.i0(f, f2, f3, f4);
                            imageReceiver4.setAlpha(imageReceiver2.i1);
                            imageReceiver4.h(canvas2, null);
                        }
                        View view = hl9Var.Q;
                        if (view != null) {
                            mpa mpaVar2 = hl9Var.R;
                            if (mpaVar2 == null || !mpaVar2.i) {
                                mpaVar = mpaVar2;
                            } else {
                                hl9Var.R = null;
                            }
                            if (mpaVar == null) {
                                mpaVar = mpa.e(view);
                                hl9Var.R = mpaVar;
                            }
                        }
                        if (mpaVar != null) {
                            canvas2.translate(f, f2);
                            mpaVar.c(canvas2, this.W, Math.round(f3), Math.round(f4), imageReceiver2.i1, false);
                            canvas2 = canvas2;
                        }
                        canvas2.restore();
                        View view2 = this.W;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    }
                }
                if (Q) {
                    return;
                }
                canvas2.restore();
                return;
            }
        }
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null && this.g0 != -1) {
            int i5 = (hl9Var.C - rect.left) - rect.right;
            int i6 = this.c0;
            int i7 = (i5 > i6 ? (i5 - i6) / 2 : 0) + this.j0;
            int i8 = this.k0;
            int i9 = this.l0;
            radialProgress2.p(i7, i8, i7 + i9, i9 + i8);
            this.b0.draw(canvas2);
        }
        if (Q) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Override // dk9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(MotionEvent motionEvent) {
        boolean z;
        rb2 rb2Var;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        Rect rect = this.b;
        int i = rect.left;
        float f = x - i;
        hl9 hl9Var = this.a;
        float f2 = f - ((hl9Var.C - i) - rect.right > this.c0 ? (r5 - r3) / 2 : 0);
        float y = motionEvent.getY() - rect.top;
        boolean z2 = f2 >= 0.0f && f2 <= ((float) this.c0) && y >= 0.0f && y <= ((float) this.d0);
        int i2 = this.g0;
        if (i2 != -1) {
            if (f2 >= this.j0) {
                int i3 = this.l0;
                if (f2 <= r10 + i3) {
                    if (y >= this.k0 && y <= r1 + i3) {
                        z = true;
                        if (actionMasked != 0) {
                            if (z2) {
                                if (!z && i2 != 0 && i2 != 2) {
                                    this.i0 = true;
                                    return true;
                                }
                                this.h0 = true;
                                View view = this.W;
                                if (view != null) {
                                    view.invalidate();
                                    return true;
                                }
                            }
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 3) {
                                return this.i0 || this.h0;
                            }
                            this.i0 = false;
                            this.h0 = false;
                            return false;
                        }
                        boolean z3 = this.h0;
                        ImageReceiver imageReceiver = this.Y;
                        if (!z3) {
                            if (this.i0) {
                                this.i0 = false;
                                if (z2) {
                                    View view2 = this.W;
                                    if (view2 != null) {
                                        view2.playSoundEffect(0);
                                    }
                                    if (q0()) {
                                        dl9 dl9Var = this.o0;
                                        if (!dl9Var.b && dl9Var.f == null) {
                                            float f3 = imageReceiver.N0;
                                            float f4 = imageReceiver.O0;
                                            dl9Var.c(this.W, (f3 / 2.0f) + imageReceiver.L0, (f4 / 2.0f) + imageReceiver.M0, f3, f4);
                                            return true;
                                        }
                                    }
                                    rb2 rb2Var2 = hl9Var.F;
                                    if (rb2Var2 != null) {
                                        rb2Var2.P0(hl9Var.E, m0());
                                        return true;
                                    }
                                }
                            }
                        }
                        this.h0 = false;
                        View view3 = this.W;
                        if (view3 != null) {
                            view3.playSoundEffect(0);
                            this.W.invalidate();
                        }
                        int i4 = this.g0;
                        if (i4 == 0) {
                            this.m0 = true;
                            RadialProgress2 radialProgress2 = this.b0;
                            if (radialProgress2 != null) {
                                radialProgress2.o(true, 0.0f);
                            }
                            i0(true);
                            this.g0 = 1;
                            RadialProgress2 radialProgress22 = this.b0;
                            if (radialProgress22 != null) {
                                radialProgress22.setIcon(3, true, true);
                            }
                            View view4 = this.W;
                            if (view4 != null) {
                                view4.invalidate();
                                return true;
                            }
                        } else if (i4 == 1) {
                            this.m0 = false;
                            imageReceiver.c();
                            this.g0 = 0;
                            RadialProgress2 radialProgress23 = this.b0;
                            if (radialProgress23 != null) {
                                radialProgress23.setIcon(2, false, true);
                            }
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                                return true;
                            }
                        } else if (i4 == 2) {
                            this.m0 = true;
                            imageReceiver.u0 = true;
                            i0(true);
                            imageReceiver.w0(false);
                            this.g0 = -1;
                            RadialProgress2 radialProgress24 = this.b0;
                            if (radialProgress24 != null) {
                                radialProgress24.setIcon(4, false, true);
                            }
                            View view6 = this.W;
                            if (view6 != null) {
                                view6.invalidate();
                                return true;
                            }
                        } else if (i4 == 3 && (rb2Var = hl9Var.F) != null) {
                            rb2Var.P0(hl9Var.E, m0());
                            return true;
                        }
                    }
                }
            }
        }
        z = false;
        if (actionMasked != 0) {
        }
    }

    @Override // jq3
    public final int getObserverTag() {
        return this.f0;
    }

    public boolean h0() {
        return true;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null) {
            radialProgress2.o(true, Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2));
        }
        if (this.g0 != 1) {
            s0(true);
        }
    }

    public abstract void i0(boolean z);

    public boolean j0() {
        return (lq3.q(this.a.a).m() & 1) != 0;
    }

    public abstract boolean k0();

    public final void l0() {
        this.Y.i0(0.0f, 0.0f, this.c0, this.d0);
        int i = this.c0;
        int i2 = this.l0;
        this.j0 = (i - i2) / 2;
        this.k0 = (this.d0 - i2) / 2;
        boolean j0 = j0();
        this.e0 = j0;
        i0(j0 || k0());
    }

    public abstract TL_iv.PageBlock m0();

    public abstract String n0();

    public boolean o0() {
        return false;
    }

    public boolean p0() {
        return false;
    }

    public abstract boolean q0();

    public final void r0() {
        Bitmap n;
        ImageReceiver imageReceiver = this.Z;
        Bitmap n2 = imageReceiver.n();
        ImageReceiver imageReceiver2 = this.Y;
        if ((n2 != null && imageReceiver2.m() != null) || (n = imageReceiver2.n()) == null || n.isRecycled()) {
            return;
        }
        if (n != this.a0 || imageReceiver.n() == null) {
            this.a0 = n;
            imageReceiver.f0(Utilities.D(n, false));
            ColorMatrixColorFilter colorMatrixColorFilter = q0;
            if (colorMatrixColorFilter == null) {
                ColorMatrix colorMatrix = new ColorMatrix();
                hl.l2(colorMatrix, 0.9f);
                hl.i(colorMatrix, 0.6f);
                ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
                q0 = colorMatrixColorFilter2;
                colorMatrixColorFilter = colorMatrixColorFilter2;
            }
            imageReceiver.p1 = colorMatrixColorFilter;
        }
    }

    public final void s0(boolean z) {
        RadialProgress2 radialProgress2 = this.b0;
        View view = this.W;
        int i = this.l0;
        if (radialProgress2 == null) {
            if (view != null) {
                RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
                this.b0 = radialProgress22;
                radialProgress22.d = -1;
                radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
                RadialProgress2 radialProgress23 = this.b0;
                int i2 = this.j0;
                int i3 = this.k0;
                radialProgress23.p(i2, i3, i2 + i, i + i3);
            }
        } else if (view != null) {
            radialProgress2.m(view);
            RadialProgress2 radialProgress24 = this.b0;
            int i4 = this.j0;
            int i5 = this.k0;
            radialProgress24.p(i4, i5, i4 + i, i + i5);
        }
        String n0 = n0();
        if (TextUtils.isEmpty(n0)) {
            this.g0 = -1;
            RadialProgress2 radialProgress25 = this.b0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.Y;
        lm m = imageReceiver.m();
        boolean z2 = m != null && (m.s() || imageReceiver.F());
        boolean k0 = k0();
        hl9 hl9Var = this.a;
        if (k0 || (o0() && z2)) {
            lq3.q(hl9Var.a).v(this);
            if (p0() && !z2) {
                this.g0 = 3;
                RadialProgress2 radialProgress26 = this.b0;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z);
                }
            } else if (!o0() || z2 || h0() || this.m0) {
                this.g0 = -1;
                RadialProgress2 radialProgress27 = this.b0;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(4, false, z);
                }
            } else {
                this.g0 = 2;
                RadialProgress2 radialProgress28 = this.b0;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(8, false, z);
                }
            }
        } else {
            lq3.q(hl9Var.a).a(n0, null, this);
            if (this.e0 || this.m0 || xb4.G(hl9Var.a).S(n0)) {
                this.g0 = 1;
                Float s = in5.z().s(n0);
                r2 = s != null ? s.floatValue() : 0.0f;
                RadialProgress2 radialProgress29 = this.b0;
                if (radialProgress29 != null) {
                    radialProgress29.setIcon(3, true, z);
                }
            } else if (p0()) {
                this.g0 = 3;
                RadialProgress2 radialProgress210 = this.b0;
                if (radialProgress210 != null) {
                    radialProgress210.setIcon(0, true, z);
                }
            } else {
                this.g0 = 0;
                RadialProgress2 radialProgress211 = this.b0;
                if (radialProgress211 != null) {
                    radialProgress211.setIcon(2, true, z);
                }
            }
            RadialProgress2 radialProgress212 = this.b0;
            if (radialProgress212 != null) {
                radialProgress212.o(false, r2);
            }
        }
        View view2 = this.W;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    public final void t0(ImageReceiver imageReceiver, boolean z) {
        if (z) {
            imageReceiver.q0(0);
            return;
        }
        int i = xea.U0;
        int L = i > 2 ? hl.L(i - 2) : hl.L(i);
        int min = Math.min(hl.L(3.0f), L);
        hl9 hl9Var = this.a;
        if (hl9Var.C()) {
            imageReceiver.q0(hl.L(12.0f));
            return;
        }
        boolean z2 = this.X;
        int i2 = (!z2 || hl9Var.A() || (!hl9Var.D() && hl9Var.F())) ? min : L;
        if (!z2 || (hl9Var.D() && hl9Var.F())) {
            L = min;
        }
        imageReceiver.r0(i2, L, min, min);
    }

    @Override // dk9
    public final void z(int i, Rect rect) {
        Rect rect2 = this.b;
        int i2 = rect2.left;
        int i3 = (this.a.C - i2) - rect2.right;
        int i4 = this.c0;
        int i5 = (i3 > i4 ? (i3 - i4) / 2 : 0) + i2;
        int i6 = ((int) this.N) + rect2.top;
        rect.set(i5, i6, i4 + i5, this.d0 + i6);
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }
}
