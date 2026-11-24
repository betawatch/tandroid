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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class zg9 extends mg9 implements sp3 {
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
    public final nh9 o0;

    public zg9(rh9 rh9Var, Rect rect, int i, boolean z) {
        super(rh9Var, rect, i);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Z = imageReceiver2;
        this.g0 = -1;
        this.l0 = gl.L(48.0f);
        this.n0 = new Path();
        this.o0 = new nh9();
        this.X = z;
        this.f0 = up3.q(rh9Var.a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
        imageReceiver.h1 = new g29(this, (byte) 5);
    }

    @Override // mg9
    public final void A(int i, Rect rect) {
        Rect rect2 = this.b;
        int i2 = rect2.left;
        int i3 = (this.a.C - i2) - rect2.right;
        int i4 = this.c0;
        int i5 = (i3 > i4 ? (i3 - i4) / 2 : 0) + i2;
        int i6 = ((int) this.N) + rect2.top;
        rect.set(i5, i6, i4 + i5, this.d0 + i6);
    }

    @Override // sp3
    public final void B(boolean z) {
        t0(false);
    }

    @Override // mg9
    public final int C() {
        return 1;
    }

    @Override // mg9
    public final CharSequence E(int i) {
        String M0 = k96.M0(q0() ? 2131753930 : 2131753945, null);
        return (!r0() || this.o0.b()) ? M0 : TextUtils.concat(M0, ", ", k96.M0(2131745025, null));
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.d0 + rect.bottom;
    }

    @Override // mg9
    public final int J() {
        return K();
    }

    @Override // mg9
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.c0 + rect.right;
    }

    @Override // sp3
    public final void N(String str) {
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null) {
            radialProgress2.o(true, 1.0f);
        }
        if (p0() && (i0() || this.m0)) {
            j0(true);
        }
        t0(true);
    }

    @Override // mg9
    public final void T() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Y;
        imageReceiver.p0(view);
        imageReceiver.I();
        View view2 = this.W;
        ImageReceiver imageReceiver2 = this.Z;
        imageReceiver2.p0(view2);
        imageReceiver2.I();
        t0(false);
    }

    @Override // mg9
    public final boolean U(int i, View view) {
        if (r0()) {
            nh9 nh9Var = this.o0;
            if (!nh9Var.b && nh9Var.f == null) {
                ImageReceiver imageReceiver = this.Y;
                float f = imageReceiver.N0;
                float f2 = imageReceiver.O0;
                nh9Var.c(this.W, (f / 2.0f) + imageReceiver.L0, (f2 / 2.0f) + imageReceiver.M0, f, f2);
                return true;
            }
        }
        rh9 rh9Var = this.a;
        bb2 bb2Var = rh9Var.F;
        if (bb2Var == null) {
            return false;
        }
        bb2Var.h1(rh9Var.E, n0());
        return true;
    }

    @Override // mg9
    public final void V() {
        this.Y.K();
        this.Z.K();
        this.a0 = null;
        up3.q(this.a.a).v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // mg9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(Canvas canvas) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        Canvas canvas2 = canvas;
        if (p0 == null) {
            Paint paint = new Paint(1);
            p0 = paint;
            paint.setColor(251658240);
        }
        rh9 rh9Var = this.a;
        int i = rh9Var.C;
        Rect rect = this.b;
        int i2 = (i - rect.left) - rect.right;
        boolean R = R();
        int L = gl.L(2.0f);
        int i3 = (R || rh9Var.C()) ? 0 : rh9Var.S - L;
        int i4 = (R || rh9Var.C()) ? 0 : rh9Var.T - L;
        boolean z = (rh9Var.C - rect.left) - rect.right > this.c0;
        if (R) {
            canvas2.save();
            Path path = this.n0;
            path.rewind();
            path.addRoundRect(0.0f, 0.0f, i2, this.d0, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        }
        ImageReceiver imageReceiver3 = this.Y;
        if (imageReceiver3.B() && imageReceiver3.i1 == 1.0f) {
            imageReceiver = imageReceiver3;
        } else {
            imageReceiver = imageReceiver3;
            canvas2.drawRect(-i3, 0.0f, i2 + i4, this.d0, p0);
        }
        pla plaVar = null;
        ImageReceiver imageReceiver4 = this.Z;
        if (z) {
            s0();
            u0(imageReceiver4, false);
            imageReceiver2 = imageReceiver;
            u0(imageReceiver2, true);
            if (imageReceiver4.n() != null) {
                imageReceiver4.i0(-i3, 0.0f, i3 + i2 + i4, this.d0);
                imageReceiver4.setAlpha(imageReceiver2.i1);
                imageReceiver4.h(canvas2, null);
            }
            imageReceiver2.S0 = true;
            imageReceiver2.i0(0.0f, 0.0f, (rh9Var.C - rect.left) - rect.right, this.d0);
        } else {
            imageReceiver2 = imageReceiver;
            u0(imageReceiver2, false);
            imageReceiver2.S0 = false;
            imageReceiver2.i0(-i3, 0.0f, i3 + i2 + i4, this.d0);
        }
        imageReceiver2.h(canvas2, null);
        if (r0()) {
            nh9 nh9Var = this.o0;
            if (!nh9Var.b()) {
                if (!nh9Var.b()) {
                    s0();
                    float f = imageReceiver2.L0;
                    float f2 = imageReceiver2.M0;
                    float f3 = imageReceiver2.N0;
                    float f4 = imageReceiver2.O0;
                    if (f3 > 0.0f && f4 > 0.0f) {
                        canvas2.save();
                        canvas2.clipRect(f, f2, f + f3, f2 + f4);
                        nh9Var.a(canvas2);
                        if (imageReceiver4.n() != null) {
                            u0(imageReceiver4, false);
                            imageReceiver4.i0(f, f2, f3, f4);
                            imageReceiver4.setAlpha(imageReceiver2.i1);
                            imageReceiver4.h(canvas2, null);
                        }
                        View view = rh9Var.Q;
                        if (view != null) {
                            pla plaVar2 = rh9Var.R;
                            if (plaVar2 == null || !plaVar2.i) {
                                plaVar = plaVar2;
                            } else {
                                rh9Var.R = null;
                            }
                            if (plaVar == null) {
                                plaVar = pla.e(view);
                                rh9Var.R = plaVar;
                            }
                        }
                        if (plaVar != null) {
                            canvas2.translate(f, f2);
                            plaVar.c(canvas2, this.W, Math.round(f3), Math.round(f4), imageReceiver2.i1, false);
                            canvas2 = canvas2;
                        }
                        canvas2.restore();
                        View view2 = this.W;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    }
                }
                if (R) {
                    return;
                }
                canvas2.restore();
                return;
            }
        }
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null && this.g0 != -1) {
            int i5 = (rh9Var.C - rect.left) - rect.right;
            int i6 = this.c0;
            int i7 = (i5 > i6 ? (i5 - i6) / 2 : 0) + this.j0;
            int i8 = this.k0;
            int i9 = this.l0;
            radialProgress2.p(i7, i8, i7 + i9, i9 + i8);
            this.b0.draw(canvas2);
        }
        if (R) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Override // mg9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(MotionEvent motionEvent) {
        boolean z;
        bb2 bb2Var;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        Rect rect = this.b;
        int i = rect.left;
        float f = x - i;
        rh9 rh9Var = this.a;
        float f2 = f - ((rh9Var.C - i) - rect.right > this.c0 ? (r5 - r3) / 2 : 0);
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
                                    if (r0()) {
                                        nh9 nh9Var = this.o0;
                                        if (!nh9Var.b && nh9Var.f == null) {
                                            float f3 = imageReceiver.N0;
                                            float f4 = imageReceiver.O0;
                                            nh9Var.c(this.W, (f3 / 2.0f) + imageReceiver.L0, (f4 / 2.0f) + imageReceiver.M0, f3, f4);
                                            return true;
                                        }
                                    }
                                    bb2 bb2Var2 = rh9Var.F;
                                    if (bb2Var2 != null) {
                                        bb2Var2.h1(rh9Var.E, n0());
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
                            j0(true);
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
                            j0(true);
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
                        } else if (i4 == 3 && (bb2Var = rh9Var.F) != null) {
                            bb2Var.h1(rh9Var.E, n0());
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

    @Override // sp3
    public final int getObserverTag() {
        return this.f0;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null) {
            radialProgress2.o(true, Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2));
        }
        if (this.g0 != 1) {
            t0(true);
        }
    }

    public boolean i0() {
        return true;
    }

    public abstract void j0(boolean z);

    public boolean k0() {
        return (up3.q(this.a.a).m() & 1) != 0;
    }

    public abstract boolean l0();

    public final void m0() {
        this.Y.i0(0.0f, 0.0f, this.c0, this.d0);
        int i = this.c0;
        int i2 = this.l0;
        this.j0 = (i - i2) / 2;
        this.k0 = (this.d0 - i2) / 2;
        boolean k0 = k0();
        this.e0 = k0;
        j0(k0 || l0());
    }

    public abstract TL_iv.PageBlock n0();

    public abstract String o0();

    public boolean p0() {
        return false;
    }

    public boolean q0() {
        return false;
    }

    public abstract boolean r0();

    public final void s0() {
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
                gl.l2(colorMatrix, 0.9f);
                gl.i(colorMatrix, 0.6f);
                ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
                q0 = colorMatrixColorFilter2;
                colorMatrixColorFilter = colorMatrixColorFilter2;
            }
            imageReceiver.p1 = colorMatrixColorFilter;
        }
    }

    public final void t0(boolean z) {
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
        String o0 = o0();
        if (TextUtils.isEmpty(o0)) {
            this.g0 = -1;
            RadialProgress2 radialProgress25 = this.b0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.Y;
        km m = imageReceiver.m();
        boolean z2 = m != null && (m.s() || imageReceiver.F());
        boolean l0 = l0();
        rh9 rh9Var = this.a;
        if (l0 || (p0() && z2)) {
            up3.q(rh9Var.a).v(this);
            if (q0() && !z2) {
                this.g0 = 3;
                RadialProgress2 radialProgress26 = this.b0;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z);
                }
            } else if (!p0() || z2 || i0() || this.m0) {
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
            up3.q(rh9Var.a).a(o0, null, this);
            if (this.e0 || this.m0 || ba4.G(rh9Var.a).S(o0)) {
                this.g0 = 1;
                Float s = fl5.z().s(o0);
                r2 = s != null ? s.floatValue() : 0.0f;
                RadialProgress2 radialProgress29 = this.b0;
                if (radialProgress29 != null) {
                    radialProgress29.setIcon(3, true, z);
                }
            } else if (q0()) {
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

    public final void u0(ImageReceiver imageReceiver, boolean z) {
        if (z) {
            imageReceiver.q0(0);
            return;
        }
        int i = gba.V0;
        int L = i > 2 ? gl.L(i - 2) : gl.L(i);
        int min = Math.min(gl.L(3.0f), L);
        rh9 rh9Var = this.a;
        if (rh9Var.C()) {
            imageReceiver.q0(gl.L(12.0f));
            return;
        }
        boolean z2 = this.X;
        int i2 = (!z2 || rh9Var.A() || (!rh9Var.D() && rh9Var.F())) ? min : L;
        if (!z2 || (rh9Var.D() && rh9Var.F())) {
            L = min;
        }
        imageReceiver.r0(i2, L, min, min);
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }
}
