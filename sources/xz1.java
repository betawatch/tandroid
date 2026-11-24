// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class xz1 extends View implements au5 {
    public final ho E;
    public final ln F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public Drawable J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final Paint O;
    public float P;
    public float Q;
    public final pn2[] R;
    public final ln S;
    public final u51 T;
    public boolean U;
    public final l94 V;
    public boolean W;
    public boolean a;
    public float a0;
    public final ln b;
    public final ln b0;
    public final ylb c;
    public final ln c0;
    public int d;
    public final Path d0;
    public Drawable e;
    public final Paint e0;
    public Drawable f;
    public final ho f0;
    public float g0;
    public Drawable h;
    public dd h0;
    public ChatActivityEnterView i0;
    public float j0;
    public float k0;
    public float l0;
    public int m0;
    public final tm n;
    public int n0;
    public boolean o0;
    public final ln p0;
    public Drawable q0;
    public float r;
    public im0 r0;
    public float s;
    public boolean s0;
    public int t0;
    public int u0;
    public int v0;
    public long w;
    public ValueAnimator w0;
    public int x;
    public final RectF x0;
    public boolean y;

    public xz1(int i, ylb ylbVar, Context context, boolean z) {
        super(context);
        d53 d53Var = d53.h;
        this.b = new ln(this, 0L, 260L, d53Var);
        this.F = new ln(this, 0L, 320L, d53Var);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new pn2[1];
        this.S = new ln(this, 0L, 420L, d53Var);
        this.T = new u51(this);
        this.V = new l94();
        this.b0 = new ln(this, 0L, 420L, d53Var);
        this.c0 = new ln(this, 0L, 500L, d53Var);
        this.d0 = new Path();
        Paint paint = new Paint(1);
        this.e0 = paint;
        ho hoVar = new ho(true, true, true);
        this.f0 = hoVar;
        this.g0 = 1.0f;
        this.p0 = new ln(this, 0L, 320L, d53Var);
        this.x0 = new RectF();
        this.d = i;
        this.c = ylbVar;
        this.H = z;
        ho hoVar2 = new ho(false, false, false);
        this.E = hoVar2;
        hoVar2.w(gm.L(15.0f));
        hoVar2.x(gm.o());
        hoVar2.u(-1);
        hoVar2.b = 3;
        hoVar2.setCallback(this);
        hoVar2.N = gm.q.x;
        this.e = b10.d(context, i);
        this.f = b10.d(context, i);
        this.h = b10.d(context, i);
        this.n = new tm(gm.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        hoVar.setCallback(this);
        hoVar.u(-1);
        hoVar.w(gm.L(12.0f));
        hoVar.x(gm.o());
        hoVar.b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.w0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.w0 = ofFloat;
        ofFloat.addUpdateListener(new et1(this, (byte) 1));
        this.w0.addListener(new b91((Object) this, (byte) 12));
        this.w0.setDuration(180L);
        this.w0.setInterpolator(new OvershootInterpolator());
        this.w0.start();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.I) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-gm.L(6.0f), -gm.L(6.0f), getWidth(), getHeight(), nm7.d4, 31);
        super.draw(canvas);
        float L = gm.L(18.0f);
        RectF rectF = this.x0;
        float f = L / 2.0f;
        float L2 = (rectF.left + f) - gm.L(6.0f);
        float L3 = (rectF.top + f) - gm.L(6.0f);
        canvas.drawCircle(L2, L3, gm.L(2.0f) + f, cmb.Fm);
        canvas.drawCircle(L2, L3, f, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.J = mutate;
            int i = this.t0;
            this.K = i;
            mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.t0) {
            Drawable drawable = this.J;
            int i2 = this.t0;
            this.K = i2;
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.J.setBounds((int) (L2 - gm.L(8.0f)), (int) (L3 - gm.L(8.0f)), (int) (L2 + gm.L(8.0f)), (int) (L3 + gm.L(8.0f)));
        this.J.draw(canvas);
        canvas.restore();
    }

    @Override // au5
    public final void e(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - gm.L(4.0f)) - this.P;
        float measuredHeight = (getMeasuredHeight() - gm.L(4.0f)) - this.Q;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    public final void f(int i, boolean z) {
        this.f0.t(i <= 0 ? "" : String.valueOf(i), z, true);
        invalidate();
    }

    @Override // au5
    public final void g(Canvas canvas, float f) {
        float R1;
        float R12;
        float U1;
        float f2;
        float f3;
        int i = this.N;
        if (i != 0) {
            Paint paint = this.O;
            paint.setColor(i);
            paint.setAlpha((int) (Color.alpha(this.N) * f));
            float f4 = this.S.c;
            float f5 = this.F.c;
            if (this.s0) {
                R1 = gm.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gm.L(4.0f), f4) - this.P;
                U1 = getCircleHeight() * f4;
                R12 = ((getMeasuredHeight() - this.Q) - gm.L(4.0f)) - (U1 / 2.0f);
            } else {
                R1 = gm.R1(gm.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gm.L(4.0f), f4) - this.P, getMeasuredWidth() - gm.L(9.0f), f5);
                R12 = gm.R1(((getMeasuredHeight() - this.Q) - gm.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - gm.L(24.0f), f5);
                U1 = gm.U1(f5, getCircleHeight(), gm.L(32.0f)) * f4;
            }
            float R13 = gm.R1(getCircleWidth(), this.E.c() + gm.L(this.H ? 20.0f : 22.0f), f5) * f4;
            if (f4 > 0.0f && R13 > 0.0f && U1 > 0.0f) {
                RectF rectF = gm.P;
                float f6 = U1 / 2.0f;
                rectF.set(R1 - R13, R12 - f6, R1, f6 + R12);
                rectF.inset(-gm.L(4.0f), -gm.L(4.0f));
                float min = (Math.min(R13, U1) / 2.0f) + gm.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            ho hoVar = this.f0;
            float i2 = (1.0f - f5) * hoVar.i();
            if (i2 > 0.0f) {
                float max = Math.max(hoVar.c() + gm.L(9.0f), gm.L(18.0f));
                if (this.s0) {
                    f2 = R1 - gm.L(50.0f);
                    f3 = (max / 2.0f) + (R12 - (getCircleHeight() / 2.0f));
                } else {
                    float f7 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f7;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f7;
                    f2 = measuredWidth;
                    f3 = measuredHeight;
                }
                canvas.drawCircle(f2, f3, ((max / 2.0f) + gm.L(2.0f)) * i2 * this.g0, paint);
            }
        }
        draw(canvas);
    }

    public int getCircleHeight() {
        int i = this.M;
        return i >= 0 ? i : getMeasuredHeight() - gm.L(8.0f);
    }

    public int getCircleWidth() {
        int i = this.L;
        return i >= 0 ? i : getMeasuredHeight() - gm.L(8.0f);
    }

    public int getFillColor() {
        return cmb.v0(cmb.Oe, this.c);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int, short] */
    public final void h(boolean z) {
        if (this.W != z || ((z && Math.abs(this.a0 - (-3.0f)) >= 0.01f) || !this.U)) {
            this.U = true;
            if (!this.W && z) {
                this.c0.e(true, 0.0f);
            }
            ln lnVar = this.b0;
            lnVar.f = (int) ((!z || lnVar.c < 1.0f) ? 0L : 650L);
            this.W = z;
            this.a0 = z ? -3.0f : 1.0f;
            invalidate();
        }
    }

    public final void i(int i, long j, boolean z) {
        if (this.w == j && this.x == i) {
            return;
        }
        this.w = j;
        this.x = i;
        ho hoVar = this.E;
        if (j > 0) {
            hoVar.t(nxa.Z0(false, "⭐️".concat(jb6.E(j * Math.max(1, i), ',')), this.R), z, true);
        } else {
            hoVar.t("", z, true);
        }
        if (z) {
            invalidate();
        } else {
            this.F.a(this.w > 0);
        }
    }

    public boolean j() {
        return this instanceof p12;
    }

    public final void k() {
        boolean z = this.H;
        ylb ylbVar = this.c;
        int v0 = z ? -1 : cmb.v0(cmb.Oe, ylbVar);
        int v02 = cmb.v0(cmb.Ml, ylbVar);
        int v03 = cmb.v0(cmb.Sf, ylbVar);
        if (v0 != this.t0 || v02 != this.u0 || v03 != this.v0) {
            this.t0 = v0;
            this.u0 = v02;
            this.v0 = v03;
            Drawable drawable = this.e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
            this.f.setColorFilter(new PorterDuffColorFilter(Color.argb(nm7.J2, Color.red(v02), Color.green(v02), Color.blue(v02)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(v03, mode));
        }
        boolean z2 = this.H;
        Paint paint = this.G;
        if (z2) {
            paint.setColor(cmb.v0(cmb.Oe, ylbVar));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(on2.p(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        return (int) gm.R1(this.P + getCircleWidth() + this.P, gm.L(this.H ? 20.0f : 22.0f) + gm.L(18.0f) + this.E.d, (this.w > 0 ? 1.0f : 0.0f) * (d() ? 1.0f : 0.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if ((android.os.SystemClock.uptimeMillis() - r2.t6) < 1200) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05fa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        long j;
        boolean z;
        float f2;
        float f3;
        long j2;
        float f4;
        Paint paint;
        float f5;
        int A;
        int measuredHeight;
        float d;
        float R1;
        float R12;
        float U1;
        float f6;
        int i;
        float f7;
        float i2;
        float measuredWidth;
        float measuredHeight2;
        float f8;
        int i3;
        int i4;
        int i5;
        float f9;
        float f10;
        float f11;
        float f12;
        float L;
        float sin;
        float f13;
        float f14;
        Paint paint2;
        ChatActivityEnterView chatActivityEnterView;
        long uptimeMillis;
        un3 un3Var;
        int save = canvas.save();
        if (this.H) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), nm7.d4, 31);
        }
        k();
        float N = gm.N(3.0f);
        float N2 = gm.N(38.0f);
        float N3 = gm.N(20.0f);
        ho hoVar = this.E;
        RectF rectF = this.x0;
        rectF.set((getMeasuredWidth() - gm.R1(Math.max(N2, hoVar.c() + N3), N2, this.s)) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        if (this.h0 == null || !this.H) {
            f = 1.0f;
            j = 1200;
        } else {
            j = 1200;
            if (this.w <= 0 && Math.abs(rectF.width() - rectF.height()) < 1.0f) {
                ChatActivityEnterView chatActivityEnterView2 = this.i0;
                if (chatActivityEnterView2 != null) {
                    boolean z2 = chatActivityEnterView2.U1 || chatActivityEnterView2.T1 != null || ((un3Var = chatActivityEnterView2.j1) != null && un3Var.o());
                    if (chatActivityEnterView2.R3 != null || chatActivityEnterView2.U3 != null || (chatActivityEnterView2.U0() && !z2)) {
                        f = 1.0f;
                        chatActivityEnterView2.t6 = SystemClock.uptimeMillis();
                    } else if (chatActivityEnterView2.t6 != 0) {
                        f = 1.0f;
                    }
                }
                f = 1.0f;
                z = true;
                if (!z && this.h0 != null && (chatActivityEnterView = this.i0) != null && chatActivityEnterView.t6 != 0) {
                    uptimeMillis = SystemClock.uptimeMillis() - this.i0.t6;
                    if (j - uptimeMillis > 0) {
                        postInvalidateDelayed(1216 - uptimeMillis);
                    }
                }
                Paint paint3 = this.G;
                if (z) {
                    f2 = 3.0f;
                    f3 = 20.0f;
                    j2 = 0;
                    f4 = 0.003f;
                } else {
                    dd ddVar = this.h0;
                    int color = paint3.getColor();
                    f4 = 0.003f;
                    Paint paint4 = ddVar.n;
                    f2 = 3.0f;
                    f3 = 20.0f;
                    float d2 = ddVar.f.d(ddVar.c);
                    if (d2 <= 0.003f) {
                        j2 = 0;
                    } else {
                        float height = rectF.height() / 2.0f;
                        ddVar.a(height, color);
                        canvas2.save();
                        j2 = 0;
                        canvas2.translate(rectF.centerX(), rectF.centerY());
                        paint4.setAlpha((int) mlb.A((float) Math.sin(ddVar.d() * 4.2f), 0.25f, 0.75f, d2 * 255.0f));
                        canvas2.drawCircle(0.0f, 0.0f, height + gm.L(4.0f), paint4);
                        canvas2.restore();
                    }
                }
                if (this.H) {
                    canvas2.drawRoundRect(rectF, gm.L(19.0f), gm.L(19.0f), paint3);
                }
                if (z) {
                    paint = paint3;
                    f5 = 1.25f;
                } else {
                    dd ddVar2 = this.h0;
                    int color2 = paint3.getColor();
                    Paint paint5 = ddVar2.j;
                    Paint paint6 = ddVar2.h;
                    f5 = 1.25f;
                    Paint paint7 = ddVar2.m;
                    Path path = ddVar2.o;
                    Matrix matrix = ddVar2.q;
                    float d3 = ddVar2.f.d(ddVar2.c);
                    if (d3 <= f4) {
                        paint = paint3;
                    } else {
                        float height2 = rectF.height() / 2.0f;
                        ddVar2.a(height2, color2);
                        float d4 = ddVar2.d();
                        canvas2.save();
                        path.rewind();
                        path.addCircle(rectF.centerX(), rectF.centerY(), height2, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.translate(rectF.centerX(), rectF.centerY());
                        matrix.reset();
                        float f15 = -height2;
                        matrix.setTranslate((((d4 / 1.25f) % f) * 2.2f * height2) + (1.1f * f15), 0.0f);
                        matrix.postRotate(-32.0f);
                        ddVar2.r.setLocalMatrix(matrix);
                        paint5.setAlpha((int) (d3 * 255.0f));
                        paint = paint3;
                        canvas2.drawRect(f15, f15, height2, height2, paint5);
                        float f16 = height2;
                        int i6 = 0;
                        while (i6 < 5) {
                            float f17 = (d4 + ddVar2.L[i6]) / ddVar2.M[i6];
                            float floor = f17 - ((int) Math.floor(f17));
                            float f18 = ((((104729 * i6) + (r4 * 7919)) & 1023) / 1023.0f) - 0.5f;
                            float L2 = (gm.L(f2) * f18) + ddVar2.N[i6];
                            float w = b10.w(floor, f16, 2.1f, 1.05f * f15);
                            float f19 = (w * (-0.848f)) - (L2 * 0.53f);
                            float f20 = (L2 * (-0.848f)) + (w * 0.53f);
                            float f21 = f16;
                            int i7 = i6;
                            float sin2 = ((float) Math.sin(floor * 3.141592653589793d)) * d3 * 0.5f;
                            if (sin2 <= 0.01f) {
                                f13 = f21;
                                f14 = d3;
                                paint2 = paint7;
                            } else {
                                float A2 = mlb.A(f18, 0.3f, 1.0f, ddVar2.O[i7]);
                                float f22 = ddVar2.P[i7];
                                int i8 = 0;
                                while (i8 < 4) {
                                    float f23 = i8 / 4.0f;
                                    int i9 = i8 + 1;
                                    float f24 = i9 / 4.0f;
                                    float f25 = A2;
                                    float f26 = 1.0f - f23;
                                    paint7.setStrokeWidth(Math.max(gm.L(0.5f), f25 * 0.55f * f26));
                                    paint7.setColor(Color.argb((int) (sin2 * 255.0f * 0.55f * f26 * f26), nm7.d4, nm7.d4, nm7.d4));
                                    float f27 = f22 * (-0.848f);
                                    float f28 = f19 - (f27 * f23);
                                    float f29 = f22 * 0.53f;
                                    float f30 = f20 - (f23 * f29);
                                    float f31 = f19 - (f27 * f24);
                                    float f32 = f20 - (f29 * f24);
                                    float f33 = d3;
                                    float f34 = f20;
                                    Paint paint8 = paint7;
                                    canvas.drawLine(f28, f30, f31, f32, paint8);
                                    A2 = f25;
                                    f21 = f21;
                                    i8 = i9;
                                    paint7 = paint8;
                                    f20 = f34;
                                    d3 = f33;
                                }
                                f13 = f21;
                                f14 = d3;
                                float f35 = f20;
                                paint2 = paint7;
                                float f36 = A2;
                                paint6.setColor(-1);
                                paint6.setAlpha((int) (sin2 * 255.0f));
                                canvas.save();
                                canvas.translate(f19, f35);
                                canvas.rotate(floor * 30.0f);
                                canvas.scale(f36, f36);
                                canvas.drawPath(ddVar2.i, paint6);
                                canvas.restore();
                            }
                            i6 = i7 + 1;
                            paint7 = paint2;
                            d3 = f14;
                            f16 = f13;
                        }
                        canvas2 = canvas;
                        canvas2.restore();
                    }
                }
                Drawable drawable = !c() ? this.f : this.e;
                if (this.H) {
                    A = aq1.A(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
                    measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
                    if (b()) {
                        measuredHeight -= gm.L(1.0f);
                    } else {
                        A += gm.L(2.0f);
                    }
                } else {
                    A = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
                    measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
                }
                int i10 = A;
                int i11 = measuredHeight;
                float d5 = this.b0.d(this.W);
                d = this.S.d(d());
                float d6 = this.F.d(this.w <= j2 && !this.y) * (1.0f - this.r);
                float e = this.p0.e(false, 1.0f);
                if (d < 1.0f) {
                    canvas2.save();
                    float f37 = 1.0f - e;
                    canvas2.translate((-gm.L(24.0f)) * f37, gm.L(24.0f) * f37);
                    float R13 = gm.R1(0.35f, 1.0f, e);
                    float f38 = i10;
                    float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) + f38;
                    float f39 = i11;
                    canvas2.scale(R13, R13, intrinsicWidth, (drawable.getIntrinsicHeight() / 2.0f) + f39);
                    canvas2.rotate(60.0f * f37, (drawable.getIntrinsicWidth() / 2.0f) + f38, (drawable.getIntrinsicHeight() / 2.0f) + f39);
                    if (z) {
                        float f40 = this.h0.f.c;
                        if (f40 <= 0.001f) {
                            f12 = 0.001f;
                            L = 0.0f;
                        } else {
                            f12 = 0.001f;
                            double d7 = r3.d() * 6.283185307179586d;
                            L = gm.L(f5) * f40 * ((float) Math.sin((Math.sin(d7 / 3.0999999046325684d) * 0.6000000238418579d) + (d7 / 1.2999999523162842d)));
                        }
                        canvas2.translate(0.0f, L);
                        float f41 = this.h0.f.c;
                        if (f41 <= f12) {
                            sin = 0.0f;
                        } else {
                            double d8 = r3.d() * 6.283185307179586d;
                            sin = f41 * 3.5f * ((float) Math.sin((Math.sin(d8 / 2.9000000953674316d) * 0.5d) + (d8 / 1.7000000476837158d) + 1.100000023841858d));
                        }
                        canvas2.rotate(sin, (drawable.getIntrinsicWidth() / 2.0f) + f38, (drawable.getIntrinsicHeight() / 2.0f) + f39);
                    }
                    drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
                    drawable.setAlpha((int) (gm.R1(1.0f, 0.6f, this.b.d(this.a)) * (1.0f - d6) * 255.0f));
                    drawable.draw(canvas2);
                    canvas2.restore();
                }
                if (z && d < 1.0f) {
                    this.h0.b(canvas2, rectF, this.t0, paint.getColor());
                }
                if (this.s0) {
                    R1 = gm.R1(gm.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gm.L(4.0f), d) - this.P, getMeasuredWidth() - gm.L(9.0f), d6);
                    R12 = gm.R1(((getMeasuredHeight() - this.Q) - gm.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - gm.L(24.0f), d6);
                    U1 = gm.U1(d6, getCircleHeight(), gm.L(32.0f)) * d;
                } else {
                    R1 = gm.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gm.L(4.0f), d) - this.P;
                    U1 = getCircleHeight() * d;
                    R12 = ((getMeasuredHeight() - this.Q) - gm.L(4.0f)) - (U1 / 2.0f);
                }
                float R14 = gm.R1(getCircleWidth(), hoVar.c() + gm.L(!this.H ? f3 : 22.0f), d6);
                float R15 = gm.R1(R14, U1, this.s) * d;
                float f42 = R14 - R15;
                float f43 = R1 - (R15 / 2.0f);
                setPivotX(f43);
                setPivotY(R12);
                float f44 = R12;
                float R16 = gm.R1(1.0f, 0.79f, this.r);
                if (d <= 0.0f) {
                    canvas2.save();
                    Path path2 = this.d0;
                    path2.rewind();
                    float min = Math.min(R15, U1) / 2.0f;
                    float f45 = U1;
                    RectF rectF2 = gm.P;
                    float f46 = f45 / 2.0f;
                    i = save;
                    float f47 = f44 - f46;
                    float f48 = f44 + f46;
                    rectF2.set(R1 - R15, f47, R1, f48);
                    path2.addRoundRect(rectF2, min, min, Path.Direction.CW);
                    float centerX = rectF2.centerX();
                    float centerY = rectF2.centerY();
                    f6 = R1;
                    if (this.r > 0.0f) {
                        Drawable drawable2 = this.q0;
                        if (drawable2 == null) {
                            i3 = i10;
                            drawable2 = getContext().getResources().getDrawable(R.drawable.send_outline);
                            this.q0 = drawable2;
                        } else {
                            i3 = i10;
                        }
                        i4 = i11;
                        drawable2.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                        ur3.d(this.q0, centerX, centerY, 17);
                        ur3.b(canvas2, this.q0, this.r);
                    } else {
                        i3 = i10;
                        i4 = i11;
                    }
                    canvas2.scale(R16, R16, centerX, centerY);
                    if (this.r0 != null) {
                        Rect rect = gm.Q;
                        rectF2.round(rect);
                        rect.inset(-gm.L(7.0f), -gm.L(7.0f));
                        this.r0.setBounds(rect);
                        this.r0.draw(canvas2);
                    }
                    if (!this.H) {
                        canvas2.drawPath(path2, paint);
                    }
                    canvas2.clipPath(path2);
                    int i12 = (d5 > 0.0f ? 1 : (d5 == 0.0f ? 0 : -1));
                    if (i12 > 0) {
                        Paint paint9 = this.e0;
                        paint9.setColor(-1);
                        paint9.setAlpha((int) (d5 * 255.0f));
                        float L3 = gm.L(8.66f);
                        rectF2.set(f43 - L3, f44 - L3, f43 + L3, f44 + L3);
                        if (this.U) {
                            long currentTimeMillis = System.currentTimeMillis() % 5400;
                            float f49 = (1520 * currentTimeMillis) / 5400.0f;
                            float max = Math.max(0.0f, f49 - f3);
                            int i13 = 0;
                            while (i13 < 4) {
                                int i14 = i13 * 1350;
                                l94 l94Var = this.V;
                                f49 += l94Var.getInterpolation((r38 - i14) / 667.0f) * 250.0f;
                                max += l94Var.getInterpolation((r38 - (i14 + 667)) / 667.0f) * 250.0f;
                                i13++;
                                currentTimeMillis = currentTimeMillis;
                            }
                            canvas2 = canvas;
                            i5 = i12;
                            f7 = f44;
                            f9 = f43;
                            f11 = 0.6f;
                            canvas2.drawArc(gm.P, max, f49 - max, false, paint9);
                        } else {
                            i5 = i12;
                            f7 = f44;
                            f9 = f43;
                            f11 = 0.6f;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF2, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.c0.e(false, this.a0) * 360.0f, false, paint9);
                        }
                        canvas2.save();
                        float R17 = gm.R1(1.0f, f11, d5);
                        canvas2.scale(R17, R17, f9, f7);
                        invalidate();
                    } else {
                        i5 = i12;
                        f7 = f44;
                        f9 = f43;
                    }
                    if (d6 > 0.0f) {
                        if (this.s0) {
                            hoVar.o((f6 - hoVar.d) - gm.L(11.0f), f47, f6 - gm.L(11.0f), f48);
                        } else if (this.H) {
                            hoVar.o(rectF.left + gm.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                        } else {
                            hoVar.o((getMeasuredWidth() - hoVar.d) - gm.L(f3), getMeasuredHeight() - gm.L(48.0f), getMeasuredWidth() - gm.L(f3), getMeasuredHeight());
                        }
                        f10 = 1.0f;
                        hoVar.C = (int) ((1.0f - d5) * d6 * 255.0f);
                        hoVar.draw(canvas2);
                    } else {
                        f10 = 1.0f;
                    }
                    this.h.setAlpha((int) ((f10 - d6) * (f10 - d5) * 255.0f));
                    int i15 = this.L;
                    Drawable drawable3 = this.h;
                    if (i15 > 0) {
                        drawable3.setBounds((int) (f9 - (drawable3.getIntrinsicWidth() / 2.0f)), (int) (f7 - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + f9), (int) ((this.h.getIntrinsicHeight() / 2.0f) + f7));
                    } else {
                        drawable3.setBounds(i3, i4, drawable.getIntrinsicWidth() + i3, drawable.getIntrinsicHeight() + i4);
                    }
                    if (d >= 1.0f && d6 <= 0.0f && d5 <= 0.0f && R15 > 0.0f) {
                        this.j0 = f9;
                        this.k0 = f7;
                        this.l0 = f46;
                        this.m0 = this.h.getBounds().left;
                        this.n0 = this.h.getBounds().top;
                        this.o0 = true;
                    }
                    this.h.draw(canvas2);
                    if (i5 > 0) {
                        canvas2.restore();
                    }
                    canvas2.restore();
                } else {
                    f6 = R1;
                    i = save;
                    f7 = f44;
                }
                ho hoVar2 = this.f0;
                i2 = (1.0f - d6) * hoVar2.i();
                if (!this.I) {
                    float max2 = Math.max(hoVar2.c() + gm.L(9.0f), gm.L(18.0f));
                    if (this.s0) {
                        measuredWidth = (f6 - gm.L(50.0f)) + f42;
                        measuredHeight2 = (max2 / 2.0f) + (f7 - (getCircleHeight() / 2.0f));
                        f8 = gm.L(0.66f);
                    } else {
                        float f50 = max2 / 2.0f;
                        measuredWidth = (getMeasuredWidth() - this.P) - f50;
                        measuredHeight2 = (getMeasuredHeight() - this.Q) - f50;
                        f8 = 0.0f;
                    }
                    float f51 = max2 / 2.0f;
                    hoVar2.setBounds((int) (measuredWidth - f51), (int) ((measuredHeight2 - f51) - f8), (int) (measuredWidth + f51), (int) ((measuredHeight2 + f51) - f8));
                    if (i2 > 0.0f) {
                        float R18 = gm.R1(1.0f, 0.85f, this.r);
                        canvas2.save();
                        canvas2.scale(R18, R18, measuredWidth, measuredHeight2);
                        if (!this.H) {
                            canvas2.drawCircle(measuredWidth, measuredHeight2, (gm.L(2.0f) + f51) * i2 * this.g0, cmb.Fm);
                            canvas2.drawCircle(measuredWidth, measuredHeight2, f51 * i2 * this.g0, paint);
                        }
                        hoVar2.C = (int) (i2 * 255.0f);
                        hoVar2.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (i2 < 1.0f) {
                    int L4 = gm.L(8.0f);
                    int R19 = (int) gm.R1(((getMeasuredWidth() - (getCircleWidth() / 2.0f)) - this.P) + gm.L(12.0f), f6 - gm.L(2.0f), d6);
                    int R110 = (int) gm.R1(((getMeasuredHeight() - (getCircleHeight() / 2.0f)) - this.Q) + gm.L(10.0f), getMeasuredHeight() - gm.L(12.0f), d6);
                    int i16 = R19 - L4;
                    int i17 = R110 - L4;
                    int i18 = R19 + L4;
                    int i19 = R110 + L4;
                    tm tmVar = this.n;
                    tmVar.setBounds(i16, i17, i18, i19);
                    tmVar.w = (int) ((1.0f - i2) * 255.0f);
                    tmVar.draw(canvas2);
                }
                if (!this.H) {
                    canvas2.restore();
                }
                canvas2.restoreToCount(i);
                super.onDraw(canvas);
            }
            f = 1.0f;
        }
        z = false;
        if (!z) {
            uptimeMillis = SystemClock.uptimeMillis() - this.i0.t6;
            if (j - uptimeMillis > 0) {
            }
        }
        Paint paint32 = this.G;
        if (z) {
        }
        if (this.H) {
        }
        if (z) {
        }
        Drawable drawable4 = !c() ? this.f : this.e;
        if (this.H) {
        }
        int i102 = A;
        int i112 = measuredHeight;
        float d52 = this.b0.d(this.W);
        d = this.S.d(d());
        float d62 = this.F.d(this.w <= j2 && !this.y) * (1.0f - this.r);
        float e2 = this.p0.e(false, 1.0f);
        if (d < 1.0f) {
        }
        if (z) {
            this.h0.b(canvas2, rectF, this.t0, paint.getColor());
        }
        if (this.s0) {
        }
        float R142 = gm.R1(getCircleWidth(), hoVar.c() + gm.L(!this.H ? f3 : 22.0f), d62);
        float R152 = gm.R1(R142, U1, this.s) * d;
        float f422 = R142 - R152;
        float f432 = R1 - (R152 / 2.0f);
        setPivotX(f432);
        setPivotY(R12);
        float f442 = R12;
        float R162 = gm.R1(1.0f, 0.79f, this.r);
        if (d <= 0.0f) {
        }
        ho hoVar22 = this.f0;
        i2 = (1.0f - d62) * hoVar22.i();
        if (!this.I) {
        }
        if (i2 < 1.0f) {
        }
        if (!this.H) {
        }
        canvas2.restoreToCount(i);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) gm.R1((r8.Q + getCircleHeight()) + r8.Q, gm.L(32.0f), r8.w > 0 ? 1.0f : 0.0f)))) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getX() >= getWidth() - l()) {
                float y = motionEvent.getY();
                int height = getHeight();
                getMeasuredHeight();
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlurredBackgroundDrawable(im0 im0Var) {
        this.r0 = im0Var;
        im0Var.r(gm.L(22.0f));
        this.r0.q(gm.L(4.0f));
    }

    public void setCircleSize(int i) {
        this.L = i;
        this.M = i;
    }

    public void setEffect(long j) {
        TLRPC.TL_availableEffect Y0 = oc7.r1(z8c.t0).Y0(j);
        setEmoji(Y0 != null ? gw3.g(Y0.emoticon) : null);
    }

    public void setEmoji(Drawable drawable) {
        this.n.g(drawable, true);
    }

    public void setEphemeralFactor(float f) {
        if (this.r != f) {
            this.r = f;
            invalidate();
        }
    }

    public void setIconDimmed(boolean z) {
        if (this.a != z) {
            this.a = z;
            invalidate();
        }
    }

    public void setLocked(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.T.c(z);
    }

    public void setResourceId(int i) {
        if (this.d != i) {
            this.d = i;
            this.e = getContext().getResources().getDrawable(i).mutate();
            this.f = getContext().getResources().getDrawable(i).mutate();
            this.h = getContext().getResources().getDrawable(i).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f) {
        if (this.s != f) {
            this.s = f;
            invalidate();
        }
    }

    @Override // au5
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z) {
        td4.a(this, z);
    }

    public void setScrimViewBackgroundColor(int i) {
        this.N = i;
        this.O.setColor(i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f0 || drawable == this.n || drawable == this.E || super.verifyDrawable(drawable);
    }
}
