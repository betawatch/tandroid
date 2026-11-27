// default package

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u59 extends View implements qk4 {
    public boolean A0;
    public boolean B0;
    public final mm C0;
    public final mm D0;
    public final Paint E;
    public final mm E0;
    public final Paint F;
    public final mm F0;
    public final Paint G;
    public final mm G0;
    public final Paint H;
    public final mm H0;
    public final Matrix I;
    public float I0;
    public final RadialGradient J;
    public final mm J0;
    public final v41 K;
    public final mm K0;
    public final v41 L;
    public final mm L0;
    public final v41 M;
    public final s59 M0;
    public float N;
    public final s59 N0;
    public final mm O;
    public final Path O0;
    public boolean P;
    public final Path P0;
    public final mm Q;
    public final PointF Q0;
    public long R;
    public final PointF R0;
    public long S;
    public final PointF S0;
    public final Path T;
    public final PointF T0;
    public final PointF U;
    public final PointF U0;
    public final PointF V;
    public final PointF V0;
    public final PointF W;
    public final PointF W0;
    public final PointF X0;
    public boolean Y0;
    public t59 a;
    public final cy0 a0;
    public final ImageReceiver b;
    public boolean b0;
    public final zm2 c;
    public boolean c0;
    public final Drawable d;
    public boolean d0;
    public final Drawable e;
    public boolean e0;
    public final Drawable f;
    public boolean f0;
    public boolean g0;
    public final Drawable h;
    public float h0;
    public final mm i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public final Drawable n;
    public final mm n0;
    public float o0;
    public boolean p0;
    public final mm q0;
    public final Paint r;
    public final mm r0;
    public final Paint s;
    public boolean s0;
    public final float[] t0;
    public final mm u0;
    public boolean v0;
    public final Paint w;
    public long w0;
    public final Paint x;
    public boolean x0;
    public final Paint y;
    public boolean y0;
    public float z0;

    public u59(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        this.r = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        Paint paint2 = new Paint(1);
        this.w = paint2;
        Paint paint3 = new Paint(1);
        this.x = paint3;
        Paint paint4 = new Paint(1);
        this.y = paint4;
        Paint paint5 = new Paint(1);
        this.E = paint5;
        Paint paint6 = new Paint(1);
        this.F = paint6;
        Paint paint7 = new Paint(1);
        this.G = paint7;
        Paint paint8 = new Paint(1);
        this.H = paint8;
        Matrix matrix = new Matrix();
        this.I = matrix;
        this.K = new v41(this);
        this.L = new v41(this);
        this.M = new v41(this);
        k43 k43Var = k43.h;
        this.O = new mm(this, 0L, 310L, k43Var);
        this.Q = new mm(this, 0L, 330L, k43Var);
        this.T = new Path();
        this.U = new PointF(-hl.N(9.666667f), hl.N(2.3333333f));
        this.V = new PointF(-hl.N(2.8333333f), hl.N(8.666667f));
        this.W = new PointF(hl.N(9.666667f), hl.N(-3.6666667f));
        this.i0 = new mm(this, 0L, 200L, k43.f);
        this.n0 = new mm(this, 0L, 350L, k43Var);
        this.o0 = -1.0f;
        this.p0 = true;
        this.q0 = new mm(this, 0L, 350L, k43Var);
        this.r0 = new mm(this, 0L, 850L, k43Var);
        this.t0 = new float[2];
        this.u0 = new mm(this, 0L, 350L, k43Var);
        this.C0 = new mm(this, 0L, 350L, k43Var);
        this.D0 = new mm(this, 0L, 650L, k43Var);
        this.E0 = new mm(this, 0L, 160L, k43.i);
        this.F0 = new mm(this, 0L, 750L, k43Var);
        this.G0 = new mm(this, 0L, 650L, k43Var);
        this.H0 = new mm(this, 0L, 320L, k43Var);
        this.J0 = new mm(this, 0L, 320L, k43Var);
        this.K0 = new mm(this, 0L, 320L, k43Var);
        this.L0 = new mm(this, 0L, 320L, k43Var);
        this.M0 = new s59(this, (byte) 2);
        this.N0 = new s59(this, (byte) 3);
        this.O0 = new Path();
        this.P0 = new Path();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        this.U0 = new PointF();
        this.V0 = new PointF();
        this.W0 = new PointF();
        this.X0 = new PointF();
        setWillNotDraw(false);
        cy0 cy0Var = new cy0(this, this);
        this.a0 = cy0Var;
        ihc.l(this, cy0Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, hl.L(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.J = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(radialGradient);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-577231);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint8.setStyle(style);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setStrokeCap(cap);
        if (Build.VERSION.SDK_INT >= 29) {
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.p0(this);
        imageReceiver.B0 = true;
        imageReceiver.q0(hl.L(6.0f));
        Drawable mutate = activity.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        zm2 zm2Var = new zm2(aob.b0(hl.L(6.0f), -13750737), mutate);
        this.c = zm2Var;
        zm2Var.x = false;
        int L = hl.L(24.0f);
        int L2 = hl.L(24.0f);
        zm2Var.e = L;
        zm2Var.f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f, float f2, double d, float f3, PointF pointF) {
        double d2 = f3;
        pointF.x = (float) ((Math.cos(d) * d2) + f);
        pointF.y = (float) ((Math.sin(d) * d2) + f2);
    }

    public static void f(Drawable drawable, float f, float f2) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f - max), (int) (f2 - max), (int) (f + max), (int) (f2 + max));
    }

    public final boolean b() {
        return this.I0 >= 1.0f;
    }

    public final boolean c(float f, float f2, float f3, float f4, float f5, boolean z) {
        return this.s0 ? (!z || f4 - f2 <= ((float) hl.L(100.0f))) && Math.abs(f3 - f) <= f5 : dte.a(f, f2, f3, f4) <= f5;
    }

    public final void d(float f) {
        this.O.g = f > 180.0f ? 620L : 310L;
        this.N += f;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        cy0 cy0Var = this.a0;
        if (cy0Var == null || !cy0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(boolean z, float f) {
        if (Math.abs(f - this.I0) < 0.01f) {
            return;
        }
        this.I0 = f;
        if (!z) {
            this.J0.f(f > 0.0f && !this.s0, true);
            this.K0.e(true, f);
        }
        invalidate();
    }

    public final void g(boolean z) {
        this.v0 = false;
        if (!z) {
            mm mmVar = this.u0;
            mmVar.getClass();
            mmVar.e(true, 0.0f);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        no6 no6Var;
        t59 t59Var = this.a;
        zm2 zm2Var = this.c;
        ImageReceiver imageReceiver = this.b;
        if (t59Var != null) {
            ArrayList arrayList = uc7.s1(imageReceiver.d).O1().w.b;
            imageReceiver.o0(0, 0, true);
            if (arrayList != null && !arrayList.isEmpty() && ((c8b) arrayList.get(0)).O0 != null) {
                imageReceiver.Z(jn5.g(((c8b) arrayList.get(0)).O0.getAbsolutePath()), "80_80", null, null, zm2Var, 0L, null, null, 0);
                return;
            }
        }
        do6 do6Var = MediaController.a2;
        if (do6Var != null) {
            ArrayList arrayList2 = do6Var.e;
            if (!arrayList2.isEmpty()) {
                no6Var = (no6) arrayList2.get(0);
                if (no6Var != null) {
                    String str = no6Var.c;
                    if (str != null) {
                        imageReceiver.Z(jn5.g(str), "80_80", null, null, zm2Var, 0L, null, null, 0);
                        return;
                    }
                    int i = no6Var.C;
                    String str2 = no6Var.I;
                    if (str2 != null) {
                        if (no6Var.b) {
                            imageReceiver.Z(jn5.g("vthumb://" + i + ":" + str2), "80_80", null, null, zm2Var, 0L, null, null, 0);
                            return;
                        }
                        imageReceiver.o0(no6Var.J, no6Var.K, true);
                        imageReceiver.Z(jn5.g("thumb://" + i + ":" + str2), "80_80", null, null, zm2Var, 0L, null, null, 0);
                        return;
                    }
                }
                imageReceiver.g0(zm2Var);
            }
        }
        no6Var = null;
        if (no6Var != null) {
        }
        imageReceiver.g0(zm2Var);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.b.K();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v9 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z;
        Canvas canvas2;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF;
        Paint paint;
        float f14;
        float f15;
        RectF rectF2;
        float f16;
        float f17;
        RectF rectF3;
        Canvas canvas3;
        float f18;
        float f19;
        float f20;
        float f21;
        int i;
        Drawable drawable;
        mm mmVar;
        v41 v41Var;
        float f22;
        float f23;
        float f24;
        double d;
        double d2;
        float e = this.q0.e(false, this.s0 ? 1.0f : 0.0f);
        float e2 = this.r0.e(false, this.s0 ? 1.0f : 0.0f);
        float f25 = this.o0;
        if (f25 < 0.0f) {
            f25 = this.n0.e(false, this.p0 ? 1.0f : 0.0f);
        }
        float max = Math.max(e, f25);
        float e3 = this.C0.e(false, this.x0 ? 1.0f : 0.0f);
        float abs = Math.abs(this.z0 - this.j0);
        float L = hl.L(64.0f);
        v41 v41Var2 = this.K;
        float e4 = this.D0.e(false, (abs >= L || !(this.s0 || v41Var2.i)) ? 0.0f : 1.0f) * e3;
        float e5 = this.E0.e(false, Math.abs(this.z0 - this.j0) < ((float) hl.L(64.0f)) ? 1.0f : 0.0f) * e3;
        float i2 = Utilities.i((this.z0 - this.j0) / hl.L(16.0f), 1.0f, -1.0f);
        float i3 = Utilities.i((this.z0 - this.j0) / hl.L(64.0f), 1.0f, -1.0f);
        float e6 = this.G0.e(false, Math.min(Math.abs(this.z0 - this.m0), Math.abs(this.z0 - this.l0)) < ((float) hl.L(16.0f)) ? 1.0f : 0.0f) * e3;
        float f26 = 1.0f - e;
        float d3 = this.J0.d(this.I0 > 0.0f) * f26;
        float e7 = this.K0.e(false, this.I0);
        float d4 = this.L0.d(b());
        float f27 = this.A0 ? e * max * e3 : 0.0f;
        if (f27 > 0.0f) {
            f4 = 1.0f;
            float L2 = this.j0 - hl.L(50.0f);
            f5 = 0.0f;
            float L3 = this.j0 + hl.L(50.0f);
            float L4 = hl.L(2.0f);
            Paint paint2 = this.F;
            paint2.setStrokeWidth(L4);
            float L5 = hl.L(2.0f);
            Paint paint3 = this.G;
            paint3.setStrokeWidth(L5);
            f7 = d3;
            float f28 = f27;
            f6 = e2;
            f2 = e6;
            f = e5;
            z = 1;
            f3 = d4;
            canvas.drawLine(L3, this.k0, hl.R1(L3, this.m0 - hl.L(30.0f), f27), this.k0, paint3);
            canvas.drawLine(L3, this.k0, hl.R1(L3, this.m0 - hl.L(30.0f), f28), this.k0, paint2);
            canvas.drawLine(L2, this.k0, hl.R1(L2, this.l0 + hl.L(30.0f), f28), this.k0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(L2, this.k0, hl.R1(L2, this.l0 + hl.L(30.0f), f28), this.k0, paint2);
        } else {
            f = e5;
            f2 = e6;
            f3 = d4;
            f4 = 1.0f;
            f5 = 0.0f;
            f6 = e2;
            z = 1;
            canvas2 = canvas;
            f7 = d3;
        }
        float f29 = this.j0;
        float R1 = hl.R1(f29, this.F0.e(false, (hl.L(4.0f) * i2) + f29), e4);
        float R12 = hl.R1(hl.U1(e, hl.L(29.0f), hl.L(12.0f)), hl.L(32.0f) - (Math.abs(i3) * hl.L(4.0f)), e4);
        float U1 = hl.U1(e4, hl.U1(e, hl.L(32.0f), hl.L(7.0f)), hl.L(32.0f));
        float R13 = hl.R1(v41Var2.a(this.p0 ? f5 : 0.2f), (this.i0.e(false, this.h0) * 0.2f) + f4, e);
        RectF rectF4 = hl.P;
        float f30 = R1 - R12;
        float f31 = this.k0;
        float f32 = R1 + R12;
        rectF4.set(f30, f31 - R12, f32, f31 + R12);
        float f33 = f4 - f3;
        int f34 = vm2.f(max * f33, -1, -577231);
        Paint paint4 = this.r;
        paint4.setColor(f34);
        if (f3 > f5) {
            canvas2.save();
            canvas2.scale(R13, R13, this.j0, this.k0);
            paint4.setAlpha((int) (f33 * 255.0f));
            canvas2.drawRoundRect(rectF4, U1, U1, paint4);
            canvas2.restore();
            f9 = f32;
            f10 = e;
            f11 = e3;
            f12 = f30;
            f8 = f33;
            paint = paint4;
            f13 = R13;
            rectF = rectF4;
            f14 = max;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
        } else {
            f8 = f33;
            f9 = f32;
            f10 = e;
            f11 = e3;
            f12 = f30;
            f13 = R13;
            rectF = rectF4;
            paint = paint4;
            f14 = max;
            canvas2.save();
        }
        canvas2.scale(f13, f13, this.j0, this.k0);
        paint.setAlpha(jn7.d4);
        canvas2.drawRoundRect(rectF, U1, U1, paint);
        if (f3 > f5) {
            float L6 = hl.L(4.0f);
            Paint paint5 = this.H;
            paint5.setStrokeWidth(L6);
            Path path = this.T;
            path.rewind();
            PointF pointF = this.U;
            f17 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f35 = pointF.x;
            PointF pointF2 = this.V;
            float f36 = f3 / 0.3f;
            f15 = 0.3f;
            rectF2 = rectF;
            f16 = U1;
            float f37 = f4;
            float f38 = f5;
            path.lineTo(hl.R1(f35, pointF2.x, Utilities.i(f36, f37, f38)), hl.R1(pointF.y, pointF2.y, Utilities.i(f36, f37, f38)));
            if (f3 > 0.3f) {
                float f39 = pointF2.x;
                PointF pointF3 = this.W;
                float f40 = (f3 - 0.3f) / 0.7f;
                path.lineTo(hl.R1(f39, pointF3.x, Utilities.i(f40, f37, f38)), hl.R1(pointF2.y, pointF3.y, Utilities.i(f40, f37, f38)));
            }
            canvas2.translate(this.j0, this.k0);
            canvas2.drawPath(path, paint5);
        } else {
            f15 = 0.3f;
            rectF2 = rectF;
            f16 = U1;
            f17 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f13, 1.0f);
        canvas2.scale(max2, max2, this.j0, this.k0);
        float max3 = Math.max(hl.N(33.5f), ((1.0f - e4) * hl.L(5.0f) * f7) + hl.R1(hl.N(4.5f), hl.L(9.0f), e4) + R12);
        float U12 = hl.U1(f7, hl.L(3.0f), hl.L(4.0f));
        float R14 = hl.R1(max3, (R12 - U12) - hl.L(4.0f), f3);
        float f41 = this.j0;
        float f42 = this.k0;
        RectF rectF5 = rectF2;
        rectF5.set(f41 - R14, f42 - R14, f41 + R14, f42 + R14);
        Paint paint6 = this.s;
        paint6.setStrokeWidth(U12);
        paint6.setAlpha((int) (hl.R1(1.0f, f15, f7) * 255.0f * f8));
        canvas2.drawCircle(this.j0, this.k0, R14, paint6);
        if ((f7 > 0.0f ? z : false) && (e7 > 0.0f ? z : false)) {
            paint6.setAlpha(jn7.d4);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, e7 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.R;
        float f43 = this.s0 ? 0.0f : 1.0f - f6;
        long j = this.a != null ? 177000L : 60000L;
        float min = Math.min((currentTimeMillis / 60000.0f) * 360.0f, 360.0f);
        float d5 = this.u0.d(this.v0);
        Paint paint7 = this.w;
        paint7.setStrokeWidth(U12);
        paint7.setAlpha((int) (Math.max(d5 * f17, 1.0f - f43) * 255.0f));
        if (d5 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            float elapsedRealtime = (SystemClock.elapsedRealtime() - this.w0) % 5400;
            float[] fArr = this.t0;
            di2.a(elapsedRealtime, fArr);
            invalidate();
            float f44 = fArr[0];
            float f45 = fArr[z];
            float f46 = (f44 + f45) / 2.0f;
            float abs2 = Math.abs(f45 - f44) / 2.0f;
            if (this.v0) {
                float f47 = min / 2.0f;
                f46 = hl.R1((-90.0f) + f47, f46, d5);
                abs2 = hl.R1(f47, abs2, d5);
            }
            float f48 = f46 - abs2;
            float f49 = abs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f48, f49, false, paint7);
        }
        if (this.s0) {
            invalidate();
            long j2 = currentTimeMillis / 1000;
            if (j2 != this.S / 1000) {
                ((sab) this.a).a.K0.a(j2, z);
            }
            if (j > 0 && currentTimeMillis >= j) {
                post(new s59(this, (byte) 0));
            }
            this.S = currentTimeMillis;
        }
        canvas3.restore();
        boolean z2 = this.B0;
        Paint paint8 = this.x;
        v41 v41Var3 = this.M;
        if (z2) {
            float a = v41Var3.a(0.2f) * f10;
            if (a > 0.0f) {
                canvas3.save();
                canvas3.scale(a, a, this.l0, this.k0);
                canvas3.drawCircle(this.l0, this.k0, hl.L(22.0f), paint8);
                canvas3.rotate(-getRotation(), this.l0, this.k0);
                this.f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a2 = v41Var3.a(0.2f) * f26 * f8;
        if (a2 > 0.0f) {
            canvas3.save();
            canvas3.scale(a2, a2, this.l0, this.k0);
            canvas3.rotate(-getRotation(), this.l0, this.k0);
            this.b.h(canvas3, null);
            canvas3.restore();
        }
        float e8 = this.Q.e(false, this.P ? 1.0f : 0.0f);
        Drawable drawable2 = this.e;
        Paint paint9 = this.y;
        mm mmVar2 = this.O;
        v41 v41Var4 = this.L;
        if (e8 > 0.0f) {
            canvas3.save();
            float a3 = v41Var4.a(0.2f) * e8 * f8;
            canvas3.scale(a3, a3, this.m0, this.k0);
            canvas3.rotate(mmVar2.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, hl.L(22.0f), paint9);
            drawable2.draw(canvas3);
            canvas3.restore();
        }
        if (e8 < 1.0f) {
            canvas3.save();
            f18 = f8;
            float z3 = qd4.z(1.0f, e8, v41Var4.a(0.2f), f18);
            canvas3.scale(z3, z3, this.m0, this.k0);
            canvas3.rotate(mmVar2.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, hl.L(22.0f), paint8);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f18 = f8;
        }
        if (!this.A0 || b()) {
            f19 = 0.0f;
        } else {
            float f50 = f2;
            f19 = hl.R1(hl.L(16.0f), hl.R1((Math.abs(i3) * hl.L(8.0f)) + hl.L(8.0f), hl.L(22.0f), f50), Math.max(f50, e4)) * f11 * f14 * f10;
        }
        float e9 = this.H0.e(false, (this.A0 || !this.s0) ? 0.0f : 1.0f);
        int i4 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
        if (i4 > 0) {
            Paint paint10 = this.E;
            paint10.setAlpha(jn7.d4);
            canvas3.drawCircle(this.z0, this.k0, f19, paint10);
            float f51 = this.z0;
            f21 = 22.0f;
            float f52 = f19;
            float i5 = Utilities.i(1.0f - ((Math.abs(i3) * f11) / 1.3f), 1.0f, 0.0f);
            float abs3 = Math.abs(R1 - f51);
            if (abs3 >= R12 + (f52 * 2.0f) || i5 >= 0.6f) {
                f20 = e9;
                i = i4;
                drawable = drawable2;
                mmVar = mmVar2;
                v41Var = v41Var4;
                f22 = f18;
                f23 = f52;
            } else {
                float f53 = R12 + f52;
                if (abs3 < f53) {
                    float f54 = R12 * R12;
                    float f55 = abs3 * abs3;
                    float f56 = f52 * f52;
                    f24 = abs3;
                    f20 = e9;
                    double acos = Math.acos(((f54 + f55) - f56) / ((R12 * 2.0f) * abs3));
                    d2 = Math.acos(((f56 + f55) - f54) / (r6 * f24));
                    d = acos;
                } else {
                    f24 = abs3;
                    f20 = e9;
                    d = 0.0d;
                    d2 = 0.0d;
                }
                double d6 = f51 <= R1 ? 3.141592653589793d : 0.0d;
                double d7 = d;
                double acos2 = (float) Math.acos((R12 - f52) / f24);
                double d8 = acos2 - d7;
                double d9 = i5;
                double d10 = d8 * d9;
                double d11 = d6 + d7 + d10;
                double d12 = (d6 - d7) - d10;
                double d13 = ((3.141592653589793d - d2) - acos2) * d9;
                double d14 = ((d6 + 3.141592653589793d) - d2) - d13;
                double d15 = (d6 - 3.141592653589793d) + d2 + d13;
                float f57 = this.k0;
                PointF pointF4 = this.Q0;
                a(R1, f57, d11, R12, pointF4);
                float f58 = this.k0;
                PointF pointF5 = this.R0;
                a(R1, f58, d12, R12, pointF5);
                float f59 = this.k0;
                PointF pointF6 = this.S0;
                a(f51, f59, d14, f52, pointF6);
                float f60 = this.k0;
                i = i4;
                PointF pointF7 = this.T0;
                a(f51, f60, d15, f52, pointF7);
                f23 = f52;
                f22 = f18;
                drawable = drawable2;
                mmVar = mmVar2;
                v41Var = v41Var4;
                float min2 = Math.min(1.0f, (f24 * 2.0f) / f53) * Math.min(i5 * 2.4f, dte.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f53);
                float f61 = R12 * min2;
                float f62 = f23 * min2;
                a(pointF4.x, pointF4.y, d11 - 1.5707963705062866d, f61, this.U0);
                a(pointF5.x, pointF5.y, d12 + 1.5707963705062866d, f61, this.V0);
                a(pointF6.x, pointF6.y, d14 + 1.5707963705062866d, f62, this.W0);
                a(pointF7.x, pointF7.y, d15 - 1.5707963705062866d, f62, this.X0);
                float f63 = f10;
                float C = xnb.C(f11, f14, f63, f);
                if (C > 0.0f) {
                    Path path2 = this.O0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.U0;
                    float f64 = pointF8.x;
                    float f65 = pointF8.y;
                    f10 = f63;
                    PointF pointF9 = this.W0;
                    path2.cubicTo(f64, f65, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.X0;
                    float f66 = pointF10.x;
                    float f67 = pointF10.y;
                    PointF pointF11 = this.V0;
                    path2.cubicTo(f66, f67, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint10.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path2, paint10);
                    float f68 = this.k0;
                    rectF3.set(f12, f68 - R12, f9, f68 + R12);
                    float f69 = f16;
                    canvas3.drawRoundRect(rectF3, f69, f69, paint10);
                } else {
                    f10 = f63;
                }
            }
        } else {
            f20 = e9;
            f21 = 22.0f;
            i = i4;
            drawable = drawable2;
            mmVar = mmVar2;
            v41Var = v41Var4;
            f22 = f18;
            f23 = f19;
        }
        if (i > 0 || f20 > 0.0f) {
            float a4 = v41Var3.a(0.2f) * f10 * f22;
            canvas3.save();
            Path path3 = this.P0;
            path3.rewind();
            if (i > 0) {
                path3.addCircle(this.z0, this.k0, f23, Path.Direction.CW);
            }
            if (f20 > 0.0f && this.B0) {
                path3.addCircle(this.l0, this.k0, hl.L(f21) * f20 * a4, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.B0) {
                canvas3.save();
                canvas3.scale(a4, a4, this.l0, this.k0);
                canvas3.drawCircle(this.l0, this.k0, hl.L(f21), paint9);
                canvas3.rotate(-getRotation(), this.l0, this.k0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a5 = v41Var.a(0.2f) * f22;
            canvas3.save();
            canvas3.scale(a5, a5, this.m0, this.k0);
            canvas3.rotate(mmVar.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, hl.L(f21), paint9);
            drawable.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        cy0 cy0Var = this.a0;
        if (cy0Var != null) {
            boolean b = b();
            boolean z4 = this.b0;
            boolean z5 = this.s0;
            if (z4 == z5 && this.c0 == b && this.d0 == this.P && this.e0 == this.p0 && this.f0 == this.v0 && this.g0 == this.B0) {
                return;
            }
            this.b0 = z5;
            this.c0 = b;
            this.d0 = this.P;
            this.e0 = this.p0;
            this.f0 = this.v0;
            this.g0 = this.B0;
            cy0Var.i();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(100.0f);
        float f = size;
        this.j0 = f / 2.0f;
        this.k0 = L / 2.0f;
        float min = Math.min(hl.L(135.0f), f * 0.35f);
        float f2 = this.j0;
        this.l0 = f2 - min;
        float f3 = f2 + min;
        this.m0 = f3;
        float f4 = this.k0;
        float L2 = hl.L(14.0f);
        this.d.setBounds((int) (f3 - L2), (int) (f4 - L2), (int) (f3 + L2), (int) (f4 + L2));
        float f5 = this.m0;
        float f6 = this.k0;
        float L3 = hl.L(14.0f);
        this.e.setBounds((int) (f5 - L3), (int) (f6 - L3), (int) (f5 + L3), (int) (f6 + L3));
        f(this.f, this.l0, this.k0);
        f(this.h, this.l0, this.k0);
        f(this.n, this.l0, this.k0);
        this.b.i0(this.l0 - hl.L(20.0f), this.k0 - hl.L(20.0f), hl.L(40.0f), hl.L(40.0f));
        Matrix matrix = this.I;
        matrix.reset();
        matrix.postTranslate(this.j0, this.k0);
        this.J.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        cy0 cy0Var = this.a0;
        if (cy0Var != null) {
            cy0Var.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float i = Utilities.i(motionEvent.getX() + 0.0f, this.m0, this.l0);
        float y = motionEvent.getY() + 0.0f;
        boolean c = c(i, y, this.m0, this.k0, hl.L(7.0f), true);
        boolean z = this.v0;
        v41 v41Var = this.M;
        v41 v41Var2 = this.K;
        v41 v41Var3 = this.L;
        boolean z2 = true;
        z2 = true;
        z2 = true;
        z2 = true;
        z2 = true;
        z2 = true;
        if (z) {
            v41Var2.c(false);
            v41Var3.c(false);
            v41Var.c(false);
        } else if (action == 0 || this.x0) {
            v41Var2.c(c(i, y, this.j0, this.k0, hl.L(60.0f), false));
            v41Var3.c(c(i, y, this.m0, this.k0, (float) hl.L(30.0f), true) && !b());
            v41Var.c(c(i, y, this.l0, this.k0, (float) hl.L(30.0f), false) && !b());
        }
        s59 s59Var = this.N0;
        s59 s59Var2 = this.M0;
        if (action == 0) {
            this.x0 = true;
            this.y0 = v41Var2.i || v41Var3.i;
            System.currentTimeMillis();
            this.z0 = i;
            if (Math.abs(i - this.j0) < hl.L(50.0f)) {
                hl.d3(s59Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (v41Var3.i) {
                hl.d3(s59Var, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.x0) {
                    this.z0 = Utilities.i(i, this.m0, this.l0);
                    invalidate();
                    if (this.s0 && !this.Y0 && c) {
                        d(180.0f);
                        ((sab) this.a).b();
                    }
                    if (this.s0 && this.A0) {
                        float i2 = Utilities.i(((this.k0 - hl.L(48.0f)) - y) / (hl.q.y / 2.0f), 1.0f, 0.0f);
                        sbb sbbVar = ((sab) this.a).a;
                        sbbVar.W0.b(true, i2);
                        sbbVar.i0(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.x0) {
                    this.x0 = false;
                    this.y0 = false;
                    hl.r(s59Var2);
                    hl.r(s59Var);
                    if (this.s0) {
                        if (this.A0) {
                            if (v41Var.i) {
                                this.A0 = false;
                                this.H0.e(true, 1.0f);
                                hg5 hg5Var = ((sab) this.a).a.U0;
                                hg5Var.a.t(ob6.M0(2131744315, null), true, true);
                                hg5Var.invalidate();
                            } else {
                                this.s0 = false;
                                this.w0 = SystemClock.elapsedRealtime();
                                this.v0 = true;
                                ((sab) this.a).e(false);
                            }
                            this.A0 = false;
                            if (v41Var3.i) {
                            }
                            v41Var2.c(false);
                            v41Var3.c(false);
                            v41Var.c(false);
                            invalidate();
                        }
                        if (v41Var2.i) {
                        }
                        this.A0 = false;
                        if (v41Var3.i) {
                        }
                        v41Var2.c(false);
                        v41Var3.c(false);
                        v41Var.c(false);
                        invalidate();
                    } else {
                        if (v41Var.i) {
                            ((sab) this.a).c();
                            this.A0 = false;
                            if (v41Var3.i) {
                                d(180.0f);
                                ((sab) this.a).b();
                            }
                            v41Var2.c(false);
                            v41Var3.c(false);
                            v41Var.c(false);
                            invalidate();
                        }
                        if (v41Var2.i) {
                            if (b()) {
                                ((sab) this.a).a();
                            } else if (!this.p0 && !this.s0 && !this.A0) {
                                ((sab) this.a).d();
                            } else if (this.s0) {
                                this.s0 = false;
                                this.w0 = SystemClock.elapsedRealtime();
                                this.v0 = true;
                                ((sab) this.a).e(false);
                            } else if (((sab) this.a).a.Y()) {
                                this.S = 0L;
                                this.R = System.currentTimeMillis();
                                this.B0 = false;
                                ((sab) this.a).f(new s59(this, z2 ? (byte) 1 : (byte) 0), false);
                            }
                        }
                        this.A0 = false;
                        if (v41Var3.i) {
                        }
                        v41Var2.c(false);
                        v41Var3.c(false);
                        v41Var.c(false);
                        invalidate();
                    }
                }
                return false;
            }
            z2 = false;
        }
        this.Y0 = c;
        return z2;
    }

    public void setDelegate(t59 t59Var) {
        this.a = t59Var;
    }

    public void setDual(boolean z) {
        if (z != this.P) {
            this.P = z;
            invalidate();
        }
    }

    @Override // qk4
    public void setInvert(float f) {
        this.s.setColor(vm2.f(f, -1, -16777216));
        this.x.setColor(vm2.f(f, 1677721600, 369098752));
        this.F.setColor(vm2.f(f, 1493172223, 285212671));
        this.G.setColor(vm2.f(f, 402653184, 805306368));
        int f2 = vm2.f(f, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f2, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(vm2.f(f, -1, -16777216), mode));
    }
}
