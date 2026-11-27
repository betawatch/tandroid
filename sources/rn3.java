// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.d;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rn3 extends FrameLayout {
    public static TextPaint K0;
    public static Paint L0;
    public boolean A0;
    public float B0;
    public final mm C0;
    public final mm D0;
    public final Paint E;
    public final mm E0;
    public final Paint F;
    public String[] F0;
    public final Paint G;
    public final mm G0;
    public final Path H;
    public zv4 H0;
    public jl0 I;
    public final mm I0;
    public jl0 J;
    public jl0 K;
    public jl0 L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final int[] S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final mm W;
    public final bn3 a;
    public final mm a0;
    public final vnb b;
    public final mm b0;
    public final View c;
    public final mm c0;
    public final View d;
    public final mm d0;
    public final hc e;
    public final mm e0;
    public final Drawable f;
    public final mm f0;
    public int g0;
    public final Drawable h;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public float l0;
    public float m0;
    public final Drawable n;
    public boolean n0;
    public final RectF o0;
    public float p0;
    public final Path q0;
    public final Drawable r;
    public boolean r0;
    public final hn s;
    public final mm s0;
    public final Paint t0;
    public long u0;
    public final mm v0;
    public final Paint w;
    public final String w0;
    public final Paint x;
    public final hn x0;
    public final Paint y;
    public boolean y0;
    public boolean z0;
    public static final k43 J0 = new k43(0.34d, 1.32d, 0.5d, 1.0d);
    public static final RectF M0 = new RectF();
    public static final float N0 = hl.L(36.0f);
    public static final float O0 = hl.L(8.0f);

    public rn3(Context context, vnb vnbVar, bn3 bn3Var) {
        super(context);
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.E = new Paint(1);
        new Paint(1);
        this.F = new Paint(1);
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Path path = new Path();
        this.H = path;
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new int[2];
        this.W = new mm(this, 0L, 280L, new k43(0.0f, 0.0f, 1.0f, 1.0f));
        k43 k43Var = k43.h;
        this.a0 = new mm(this, 0L, 240L, k43Var);
        k43 k43Var2 = J0;
        this.b0 = new mm(this, 0L, 460L, k43Var2);
        k43 k43Var3 = k43.g;
        this.c0 = new mm(this, 0L, 260L, k43Var3);
        this.d0 = new mm(this, 0L, 160L, k43Var);
        this.e0 = new mm(this, 0L, 160L, k43Var);
        this.f0 = new mm(this, 0L, 160L, k43Var);
        this.g0 = -1;
        this.o0 = new RectF();
        this.p0 = -1.0f;
        this.q0 = new Path();
        this.s0 = new mm(this, 0L, 300L, k43Var);
        this.t0 = new Paint(1);
        this.v0 = new mm(this, 0L, 260L, k43Var3);
        String M02 = ob6.M0(2131744986, null);
        this.w0 = M02;
        this.z0 = true;
        this.C0 = new mm(this, 0L, 380L, k43Var2);
        this.D0 = new mm(this, 0L, 260L, k43Var3);
        this.E0 = new mm(this, 0L, 260L, k43Var3);
        this.G0 = new mm(this, 0L, 160L, k43Var);
        this.I0 = new mm(this, 0L, 300L, k43Var);
        this.a = bn3Var;
        this.b = vnbVar;
        setWillNotDraw(false);
        setClipChildren(false);
        View view = new View(context);
        this.c = view;
        addView(view, new FrameLayout.LayoutParams(hl.L(10.0f), hl.L(10.0f)));
        View view2 = new View(context);
        this.d = view2;
        addView(view2, new FrameLayout.LayoutParams(hl.L(10.0f), hl.L(10.0f)));
        hc hcVar = new hc(context);
        this.e = hcVar;
        hcVar.setCallback(this);
        this.f = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.h = c00.e(context, R.drawable.chats_undo);
        this.n = c00.e(context, R.drawable.msg_settings);
        this.r = c00.e(context, R.drawable.msg_language);
        hn hnVar = new hn(false, false, false);
        this.s = hnVar;
        hnVar.n(0.33f, 260L, k43Var3);
        hnVar.A = true;
        hnVar.w(hl.L(15.0f));
        hnVar.x(hl.o());
        hnVar.setCallback(this);
        hnVar.t(ob6.M0(2131744979, null), false, true);
        hn hnVar2 = new hn(false, false, false);
        this.x0 = hnVar2;
        hnVar2.n(0.33f, 260L, k43Var3);
        hnVar2.w(hl.L(15.0f));
        hnVar2.x(hl.o());
        hnVar2.setCallback(this);
        hnVar2.t(M02, false, true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(hl.N(1.75f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(-hl.N(3.8f), hl.N(3.8f));
        path.lineTo(0.0f, 0.0f);
        path.lineTo(hl.N(3.8f), hl.N(3.8f));
        paint.setStyle(style);
        paint.setStrokeWidth(hl.N(0.66f));
        f();
    }

    public static void b(Canvas canvas, String[] strArr, float f, float f2, int i, boolean z, float f3) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        float f4 = 0.0f;
        if (f3 > 0.0f) {
            if (K0 == null) {
                TextPaint textPaint = new TextPaint(1);
                K0 = textPaint;
                textPaint.setTypeface(Typeface.MONOSPACE);
                L0 = new Paint(1);
            }
            K0.setTextSize(hl.L(12.0f));
            K0.setColor(i);
            K0.setAlpha((int) (255.0f * f3));
            for (String str : strArr) {
                f4 = Math.max(f4, K0.measureText(str));
            }
            float L = hl.L(16.0f);
            float L2 = hl.L(12.0f);
            float L3 = hl.L(8.0f);
            float L4 = hl.L(14.0f);
            float i2 = bs2.i(L2, 2.0f, f, f4);
            RectF rectF = M0;
            rectF.set(f, (f2 - (L3 * 2.0f)) - (strArr.length * L), i2, f2);
            L0.setStyle(Paint.Style.FILL);
            L0.setColor(z ? -265934287 : -167772161);
            L0.setAlpha((int) (r11.getAlpha() * f3));
            canvas.drawRoundRect(rectF, L4, L4, L0);
            L0.setStyle(Paint.Style.STROKE);
            L0.setStrokeWidth(hl.N(0.66f));
            L0.setColor(z ? 654311423 : 335544320);
            L0.setAlpha((int) (r11.getAlpha() * f3));
            canvas.drawRoundRect(rectF, L4, L4, L0);
            for (int i3 = 0; i3 < strArr.length; i3++) {
                canvas.drawText(strArr[i3], rectF.left + L2, (i3 * L) + rectF.top + L3 + hl.L(12.0f), K0);
            }
        }
    }

    public final void a() {
        zv4 zv4Var = this.H0;
        if (zv4Var == null || zv4Var.O) {
            return;
        }
        zv4Var.c(null);
        invalidate();
    }

    public final void c(Canvas canvas, jl0 jl0Var, RectF rectF, float f) {
        if (f <= 0.0f) {
            return;
        }
        float height = rectF.height() / 2.0f;
        if (jl0Var != null) {
            if (jl0Var == this.I && Math.abs(this.p0 - height) > 0.5f) {
                this.p0 = height;
                jl0Var.r(height);
            }
            jl0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            jl0Var.setAlpha((int) (f * 255.0f));
            jl0Var.draw(canvas);
            return;
        }
        Paint paint = this.y;
        paint.setAlpha((int) (255.0f * f));
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = this.w;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * f));
        canvas.drawRoundRect(rectF, height, height, paint2);
        paint2.setAlpha(alpha);
        Paint paint3 = this.x;
        int alpha2 = paint3.getAlpha();
        paint3.setAlpha((int) (alpha2 * f));
        canvas.drawRoundRect(rectF, height, height, paint3);
        paint3.setAlpha(alpha2);
    }

    public final int d(float f, float f2) {
        float L = hl.L(4.0f);
        if (this.y0 && this.C0.c > 0.7f) {
            RectF rectF = this.P;
            if (!rectF.isEmpty() && f2 >= rectF.top - L && f2 <= rectF.bottom + L) {
                RectF rectF2 = this.R;
                float f3 = rectF2.left - L;
                float f4 = O0;
                if (f >= f3) {
                    if (f < (f4 / 2.0f) + rectF2.right) {
                        return 3;
                    }
                }
                if (f >= rectF.left - (f4 / 2.0f) && f <= rectF.right + L) {
                    return 4;
                }
            }
        }
        if (this.T && this.W.c >= 0.7f) {
            RectF rectF3 = this.O;
            if (!rectF3.isEmpty() && f >= rectF3.left - L && f <= rectF3.right + L && f2 >= rectF3.top - L && f2 <= rectF3.bottom + L) {
                return 2;
            }
            RectF rectF4 = this.N;
            if (!rectF4.isEmpty() && f2 >= rectF4.top - L && f2 <= rectF4.bottom + L && f >= rectF4.left - L && f <= rectF4.right + L) {
                RectF rectF5 = this.Q;
                return (rectF5.isEmpty() || !rectF5.contains(f, Math.max(rectF4.top, Math.min(rectF4.bottom - 1.0f, f2)))) ? 0 : 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v106, types: [int] */
    /* JADX WARN: Type inference failed for: r2v127 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean z;
        hn hnVar;
        RectF rectF;
        Path path;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        Path path2;
        float f4;
        float f5;
        TextPaint textPaint;
        float f6;
        RectF rectF2;
        float f7;
        float R1;
        float min;
        float f8;
        float f9;
        float f10;
        float f11;
        RectF rectF3;
        RectF rectF4;
        float f12;
        float f13;
        float f14;
        int L;
        Canvas canvas2 = canvas;
        boolean z4 = this.T;
        mm mmVar = this.W;
        float d = mmVar.d(z4);
        float d2 = this.a0.d(!this.T);
        if (!this.T) {
            d = Math.min(1.0f, d) * (1.0f - d2);
        }
        if (this.T || d2 < 1.0f) {
            f = d;
        } else {
            mmVar.e(true, 0.0f);
            f = 0.0f;
        }
        float d3 = this.C0.d(this.y0);
        float L2 = hl.L(6.0f) + hl.L(18.0f) + hl.L(12.0f);
        hn hnVar2 = this.x0;
        float L3 = L2 + hnVar2.d + hl.L(8.0f) + hl.L(8.0f) + hl.L(13.0f);
        boolean z5 = this.z0;
        mm mmVar2 = this.D0;
        if (z5) {
            this.z0 = false;
            mmVar2.e(true, L3);
        }
        this.B0 = mmVar2.e(false, L3);
        RectF rectF5 = this.M;
        if ((f > 0.0f || d3 > 0.0f) && this.a.p(rectF5)) {
            getLocationInWindow(this.S);
            rectF5.offset(-r5[0], -r5[1]);
            z = true;
        } else {
            z = false;
        }
        Path path3 = this.H;
        float f15 = O0;
        float f16 = N0;
        RectF rectF6 = this.N;
        RectF rectF7 = this.O;
        Paint paint = this.G;
        if (f <= 0.0f || !z) {
            hnVar = hnVar2;
            rectF = rectF5;
            path = path3;
            z2 = false;
            z3 = true;
            f2 = d3;
            f3 = 2.0f;
            rectF6.setEmpty();
            rectF7.setEmpty();
        } else {
            boolean z6 = this.T;
            float L4 = hl.L(36.0f);
            f3 = 2.0f;
            float d4 = this.v0.d(this.V);
            hn hnVar3 = this.s;
            float f17 = hnVar3.d;
            TextPaint textPaint2 = hnVar3.a;
            float L5 = ((this.V ? 1.0f : 0.0f) * hl.L(16.0f)) + f17;
            float d5 = this.s0.d(this.r0);
            float L6 = ((hl.L(10.0f) + hl.L(14.0f) + hl.L(8.0f) + hl.L(1.0f)) * (1.0f - (this.r0 ? 1.0f : 0.0f))) + hl.L(6.0f) + hl.L(24.0f) + hl.L(12.0f) + L5 + hl.L(12.0f) + (this.r0 ? hl.L(4.0f) : 0);
            boolean z7 = this.n0;
            mm mmVar3 = this.c0;
            if (z7) {
                path2 = path3;
                this.n0 = false;
                mmVar3.e(true, L6);
            } else {
                path2 = path3;
            }
            float e = mmVar3.e(false, L6);
            float L7 = rectF5.left + hl.L(2.0f);
            if (this.y0) {
                f4 = e;
                f5 = f16 + f15 + this.B0 + f15;
            } else {
                f4 = e;
                f5 = 0.0f;
            }
            float f18 = L7 + f5;
            float L8 = rectF5.top - hl.L(8.0f);
            rectF6.set(f18, L8 - L4, f18 + f4, L8);
            View view = this.c;
            if (Math.abs(view.getLeft() - rectF6.left) > 1.0f || Math.abs(view.getTop() - rectF6.top) > 1.0f || Math.abs(view.getWidth() - rectF6.width()) > 1.0f || view.getHeight() != ((int) L4)) {
                textPaint = textPaint2;
                view.layout((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
            } else {
                textPaint = textPaint2;
            }
            zv4 zv4Var = this.H0;
            float d6 = this.I0.d((zv4Var == null || zv4Var.O) ? false : true);
            int i = this.g0;
            float d7 = this.d0.d(i == 0 || i == 1);
            RectF rectF8 = this.o0;
            if (!z6 || f >= 1.0f) {
                f6 = d7;
                rectF2 = rectF8;
                f7 = 1.0f;
                rectF2.set(rectF6);
                R1 = z6 ? 1.0f : hl.R1(0.85f, 1.0f, f);
                min = Math.min(1.0f, f) * 1.0f;
                f8 = min;
            } else {
                float max = Math.max(0.0f, f);
                float f19 = 1.0f - max;
                float pow = 1.0f - ((float) Math.pow(f19, 3.0d));
                float min2 = 1.0f - Math.min(1.0f, max / 0.55f);
                float sin = ((((float) Math.sin(Math.min(1.0f, max / 0.8f) * 3.141592653589793d)) * 0.07f * f19) + ((1.0f - (min2 * min2)) * 0.38f) + 0.62f) * L4;
                float max2 = Math.max(sin, hl.R1(L4 * 0.62f, rectF6.width(), pow));
                float f20 = rectF6.left;
                float f21 = rectF6.bottom;
                f6 = d7;
                rectF2 = rectF8;
                rectF2.set(f20, f21 - sin, max2 + f20, f21);
                f7 = 1.0f;
                min = Math.min(1.0f, max * 3.0f) * 1.0f;
                R1 = 1.0f;
                f8 = Math.max(0.0f, Math.min(1.0f, (max - 0.62f) / 0.38f)) * 1.0f;
            }
            canvas2.save();
            float f22 = (f7 - (f6 * 0.04f)) * R1;
            float f23 = f7;
            canvas2.scale(f22, f22, rectF6.left + hl.L(18.0f), rectF6.bottom);
            if (!z6 || f >= f23 || rectF2.width() <= 0.0f) {
                float f24 = min;
                f9 = L4;
                f10 = d4;
                f11 = f;
                f2 = d3;
                hnVar = hnVar2;
                path = path2;
                rectF = rectF5;
                z2 = false;
                z3 = true;
                rectF3 = rectF6;
                rectF4 = rectF7;
                c(canvas2, this.I, rectF3, f24);
                canvas2 = canvas;
                dz4.a(canvas2, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, rectF3.height() / 2.0f, this.i0, this.m0 * f24, this.l0);
            } else {
                c(canvas2, this.I, rectF2, min);
                f9 = L4;
                RectF rectF9 = rectF2;
                rectF4 = rectF7;
                f2 = d3;
                f10 = d4;
                f11 = f;
                hnVar = hnVar2;
                path = path2;
                rectF = rectF5;
                z2 = false;
                z3 = true;
                rectF3 = rectF6;
                dz4.a(canvas, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, rectF2.height() / 2.0f, this.i0, min * this.m0, this.l0);
                Path path4 = this.q0;
                path4.rewind();
                path4.addRoundRect(rectF9, rectF9.height() / 2.0f, rectF9.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path4);
                canvas2 = canvas;
            }
            if (f8 > 0.0f) {
                float L9 = rectF3.left + hl.L(12.0f);
                float centerY = rectF3.centerY();
                int i2 = (int) (f8 * 255.0f);
                if (d5 < 1.0f) {
                    f12 = 0.01f;
                    hc hcVar = this.e;
                    hcVar.setAlpha((int) (i2 * (1.0f - d5)));
                    canvas2.save();
                    float R12 = hl.R1(1.0f, 0.6f, d5);
                    canvas2.scale(R12, R12, hl.L(12.0f) + L9, centerY);
                    f13 = 0.4f;
                    hcVar.setBounds((int) L9, (int) (centerY - hl.L(12.0f)), (int) (hl.L(24.0f) + L9), (int) (hl.L(12.0f) + centerY));
                    hcVar.draw(canvas2);
                    canvas2.restore();
                } else {
                    f12 = 0.01f;
                    f13 = 0.4f;
                }
                if (d5 > 0.0f) {
                    int i3 = this.j0;
                    Paint paint2 = this.t0;
                    paint2.setColor(i3);
                    paint2.setAlpha((int) (i2 * d5));
                    float R13 = hl.R1(0.6f, 1.0f, d5) * hl.N(5.0f);
                    RectF rectF10 = hl.P;
                    f14 = L9;
                    rectF10.set((hl.L(12.0f) + L9) - R13, centerY - R13, f14 + hl.L(12.0f) + R13, R13 + centerY);
                    canvas2.drawRoundRect(rectF10, hl.N(2.2f), hl.N(2.2f), paint2);
                } else {
                    f14 = L9;
                }
                float L10 = f14 + hl.L(6.0f) + hl.L(24.0f);
                hnVar3.C = i2;
                hnVar3.setBounds((int) L10, (int) (centerY - hl.L(12.0f)), (int) (hl.L(240.0f) + L10), (int) (hl.L(12.0f) + centerY));
                if (textPaint.getShader() != null) {
                    textPaint.setShader(null);
                }
                canvas2.save();
                float L11 = L10 - hl.L(2.0f);
                float f25 = rectF3.top;
                boolean z8 = this.r0;
                float f26 = rectF3.right;
                if (z8) {
                    L = hl.L(6.0f);
                } else {
                    f26 = (((f26 - hl.L(10.0f)) - hl.L(14.0f)) - hl.L(8.0f)) - hl.L(1.0f);
                    L = hl.L(4.0f);
                }
                canvas2.clipRect(L11, f25, f26 - L, rectF3.bottom);
                hnVar3.draw(canvas2);
                if (f10 > f12) {
                    float c = hnVar3.c() + L10 + hl.L(3.0f);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int i4 = this.j0;
                    Paint paint3 = this.F;
                    paint3.setColor(i4);
                    for (?? r2 = z2; r2 < 3; r2++) {
                        float f27 = c;
                        paint3.setAlpha((int) (i2 * f10 * ((Math.max(0.0f, (float) Math.sin((((r53 - this.u0) / 1200.0f) - (((float) r2) * 0.18f)) * 3.141592653589793d * 2.0d)) * 0.65f) + 0.35f)));
                        canvas2.drawCircle((hl.L(4.5f) * r2) + f27, hl.L(4.5f) + centerY, hl.N(1.4f), paint3);
                        c = f27;
                        uptimeMillis = uptimeMillis;
                    }
                    invalidate();
                }
                canvas2.restore();
                float L12 = (((rectF3.right - hl.L(10.0f)) - hl.L(14.0f)) - hl.L(8.0f)) - hl.L(1.0f);
                int p1 = (aob.p1(0.14f, this.j0) >>> 24) & jn7.d4;
                Paint paint4 = this.E;
                paint4.setAlpha(p1);
                int alpha = paint4.getAlpha();
                float f28 = 1.0f - d5;
                paint4.setAlpha((int) (alpha * f8 * f28));
                canvas2.drawRect(L12, centerY - hl.L(9.0f), hl.N(1.0f) + L12, hl.L(9.0f) + centerY, paint4);
                paint4.setAlpha(alpha);
                boolean z9 = this.r0;
                RectF rectF11 = this.Q;
                if (z9) {
                    rectF11.setEmpty();
                } else {
                    rectF11.set(L12 - hl.L(4.0f), rectF3.top, rectF3.right, rectF3.bottom);
                }
                float L13 = (rectF3.right - hl.L(10.0f)) - hl.L(7.0f);
                paint.setAlpha((int) (i2 * f28));
                canvas2.save();
                canvas2.translate(L13, ((centerY - hl.N(1.9f)) - hl.N(f13)) - (hl.N(1.0f) * d6));
                canvas2.drawPath(path, paint);
                canvas2.restore();
            } else {
                f12 = 0.01f;
                f13 = 0.4f;
            }
            canvas2.restore();
            float d8 = this.b0.d(this.U) * f11;
            if (d8 > f12) {
                float d9 = this.e0.d(this.g0 == 2 ? z3 : z2);
                rectF4.set(rectF3.right + hl.L(6.0f), rectF3.top, rectF3.right + hl.L(6.0f) + f9, rectF3.bottom);
                float R14 = (1.0f - (d9 * 0.08f)) * hl.R1(f13, 1.0f, d8);
                canvas2.save();
                canvas2.scale(R14, R14, rectF4.centerX(), rectF4.centerY());
                float min3 = Math.min(1.0f, d8 * 1.5f) * 1.0f;
                c(canvas2, this.J, rectF4, min3);
                dz4.a(canvas2, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, rectF4.height() / 2.0f, this.i0, this.m0 * min3, this.l0);
                int centerX = (int) rectF4.centerX();
                int centerY2 = (int) rectF4.centerY();
                int L14 = centerX - hl.L(12.0f);
                int L15 = centerY2 - hl.L(12.0f);
                int L16 = hl.L(12.0f) + centerX;
                int L17 = hl.L(12.0f) + centerY2;
                Drawable drawable = this.h;
                drawable.setBounds(L14, L15, L16, L17);
                drawable.setAlpha((int) (min3 * 255.0f));
                drawable.draw(canvas2);
                canvas2.restore();
            } else {
                rectF4.setEmpty();
            }
        }
        RectF rectF12 = this.P;
        if (f2 <= 0.0f || !z) {
            rectF12.setEmpty();
        } else {
            float L18 = hl.L(36.0f);
            RectF rectF13 = rectF;
            float L19 = rectF13.top - hl.L(8.0f);
            float f29 = L19 - L18;
            float L20 = rectF13.left + hl.L(f3);
            float L21 = rectF13.left + hl.L(f3) + f16;
            RectF rectF14 = this.R;
            rectF14.set(L20, f29, L21, L19);
            float f30 = rectF14.right + f15;
            rectF12.set(f30, f29, this.B0 + f30, L19);
            View view2 = this.d;
            if (Math.abs(view2.getLeft() - rectF12.left) > 1.0f || Math.abs(view2.getTop() - rectF12.top) > 1.0f || Math.abs(view2.getRight() - rectF12.right) > 1.0f || view2.getHeight() != ((int) L18)) {
                view2.layout((int) rectF12.left, (int) rectF12.top, (int) rectF12.right, (int) rectF12.bottom);
            }
            float f31 = f2;
            float max3 = Math.max(0.0f, Math.min(1.0f, f31));
            float B = xnb.B(max3, f3, 3.0f, max3 * max3);
            float f32 = f31 * 1.5f;
            float max4 = Math.max(0.0f, Math.min(1.0f, f32));
            float d10 = this.f0.d(this.g0 == 3 ? z3 : z2);
            canvas2.save();
            float f33 = 1.0f - B;
            canvas2.translate(0.0f, hl.L(6.0f) * f33);
            float f34 = (B * 0.1f) + 0.9f;
            float B2 = xnb.B(d10, 0.06f, 1.0f, f34);
            canvas2.scale(B2, B2, rectF14.centerX(), rectF14.centerY());
            c(canvas2, this.L, rectF14, max4);
            float f35 = L18 / 2.0f;
            dz4.a(canvas, rectF14.left, rectF14.top, rectF14.right, rectF14.bottom, f35, this.i0, this.m0 * max4, this.l0);
            int centerX2 = (int) rectF14.centerX();
            int centerY3 = (int) rectF14.centerY();
            int L22 = hl.L(18.5f);
            float f36 = L22 / 2.0f;
            float f37 = centerX2 - f36;
            int round = Math.round(f37);
            float f38 = centerY3 - f36;
            int round2 = Math.round(f38);
            int round3 = Math.round(f37) + L22;
            int round4 = Math.round(f38) + L22;
            Drawable drawable2 = this.n;
            drawable2.setBounds(round, round2, round3, round4);
            float f39 = max4 * 255.0f;
            int i5 = (int) f39;
            drawable2.setAlpha(i5);
            drawable2.draw(canvas);
            canvas.restore();
            float d11 = this.G0.d(this.g0 == 4 ? z3 : z2);
            canvas.save();
            canvas.translate(0.0f, hl.L(6.0f) * f33);
            float f40 = (1.0f - (d11 * 0.04f)) * f34;
            canvas.scale(f40, f40, rectF12.left + hl.L(18.0f), rectF12.bottom);
            c(canvas, this.K, rectF12, max4);
            dz4.a(canvas, rectF12.left, rectF12.top, rectF12.right, rectF12.bottom, f35, this.i0, this.m0 * max4, this.l0);
            float centerY4 = rectF12.centerY();
            int L23 = (int) (rectF12.left + hl.L(12.0f));
            int L24 = (int) (centerY4 - hl.L(9.0f));
            int L25 = hl.L(18.0f) + L23;
            int L26 = hl.L(18.0f) + L24;
            Drawable drawable3 = this.r;
            drawable3.setBounds(L23, L24, L25, L26);
            drawable3.setAlpha(i5);
            drawable3.draw(canvas);
            float L27 = (rectF12.right - hl.L(13.0f)) - hl.L(4.0f);
            float L28 = rectF12.left + hl.L(12.0f) + hl.L(18.0f) + hl.L(6.0f);
            hn hnVar4 = hnVar;
            hnVar4.C = (int) (hl.R1(0.5f, 1.0f, this.E0.d(this.A0)) * f39);
            float N = centerY4 - hl.N(1.0f);
            hnVar4.setBounds((int) L28, (int) (N - hl.L(12.0f)), (int) (L28 + hl.L(240.0f)), (int) (N + hl.L(12.0f)));
            canvas.save();
            canvas.clipRect(rectF12.left, rectF12.top, L27 - hl.L(8.0f), rectF12.bottom);
            hnVar4.draw(canvas);
            canvas.restore();
            int alpha2 = paint.getAlpha();
            paint.setAlpha((int) (alpha2 * max4));
            canvas.save();
            canvas.translate(L27, centerY4 - hl.N(1.9f));
            canvas.drawPath(path, paint);
            canvas.restore();
            paint.setAlpha(alpha2);
            canvas.restore();
            b(canvas, this.F0, rectF13.left + hl.L(2.0f), ((rectF13.top - hl.L(8.0f)) - hl.L(36.0f)) - hl.L(8.0f), this.j0, this.i0, Math.max(0.0f, Math.min(1.0f, f32)));
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r22.g0 >= 0) goto L98;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b;
        String[] strArr;
        Runnable runnable;
        byte b2 = 3;
        boolean z = true;
        if (this.H0 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                RectF rectF = this.N;
                if (!rectF.isEmpty()) {
                    RectF rectF2 = hl.P;
                    rectF2.set(rectF);
                    rectF2.inset(-hl.L(4.0f), -hl.L(4.0f));
                    this.h0 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                }
            }
            if (!this.h0) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (actionMasked == 1) {
                this.h0 = false;
                a();
                return true;
            }
            if (actionMasked == 3) {
                this.h0 = false;
                return true;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 != 0) {
                int i = this.g0;
                if (i >= 0) {
                    if (actionMasked2 == 1) {
                        this.g0 = -1;
                        invalidate();
                        if (d(motionEvent.getX(), motionEvent.getY()) == i) {
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            bn3 bn3Var = this.a;
                            if (i == 0) {
                                byte b3 = bn3Var.r;
                                if (b3 == 1) {
                                    bn3Var.w();
                                } else if (b3 == 3) {
                                    bn3Var.c(bn3Var.K);
                                }
                            } else {
                                cm3 cm3Var = dm3.c;
                                byte b4 = 4;
                                Runnable runnable2 = null;
                                if (i == 1) {
                                    d dVar = bn3Var.f;
                                    Context context = bn3Var.h;
                                    vnb vnbVar = bn3Var.n;
                                    byte b5 = bn3Var.r;
                                    if (b5 == 3 || b5 == 4) {
                                        zv4 zv4Var = new zv4(context, this.c, vnbVar, new um3(bn3Var, b4));
                                        zv4Var.c0 = true;
                                        zv4Var.n = hl.L(316.0f);
                                        zv4Var.M = hl.L(220.0f);
                                        zv4Var.b0 = true;
                                        zv4Var.L = 0;
                                        int v0 = aob.v0(aob.G6, vnbVar);
                                        zv4Var.a(new tt(context, v0, aob.v0(aob.F8, vnbVar)), 44, new vm3(bn3Var, b2));
                                        String str = bn3Var.L;
                                        if (str == null) {
                                            str = r3c.H0();
                                        }
                                        if (str == null) {
                                            str = a5c.i();
                                        }
                                        cm3 cm3Var2 = new cm3(r3c.F0(r3c.K0(str, null, null)), 0L, null, false);
                                        cm3Var2.e = str;
                                        cm3Var2.f = R.drawable.outline_ai_translate2;
                                        an3 an3Var = new an3(bn3Var.h, cm3Var2, v0, dVar.a.R, false);
                                        String M02 = ob6.M0(2131754959, null);
                                        String a = cm3Var2.a();
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M02);
                                        boolean isEmpty = TextUtils.isEmpty(a);
                                        TextView textView = an3Var.a;
                                        if (!isEmpty) {
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            int length = spannableStringBuilder.length();
                                            spannableStringBuilder.append((CharSequence) a);
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(aob.p1(0.5f, textView.getCurrentTextColor())), length, spannableStringBuilder.length(), 33);
                                        }
                                        textView.setText(spannableStringBuilder);
                                        zv4Var.a(an3Var, 44, null);
                                        an3Var.setOnClickListener(new lc2(bn3Var, str, cm3Var2, v0, zv4Var, (byte) 1));
                                        ArrayList c = bn3Var.H.c();
                                        c.add(cm3Var);
                                        int size = c.size();
                                        int i2 = 0;
                                        while (i2 < size) {
                                            Object obj = c.get(i2);
                                            i2++;
                                            cm3 cm3Var3 = (cm3) obj;
                                            zv4Var.a(new an3(bn3Var.h, cm3Var3, v0, dVar.a.R, cm3Var3 == bn3Var.K && bn3Var.J != null), 44, new wd3(bn3Var, cm3Var3, (byte) 17));
                                        }
                                        rn3 rn3Var = bn3Var.w;
                                        rn3Var.H0 = zv4Var;
                                        rn3Var.addView(zv4Var, new FrameLayout.LayoutParams(-1, -1));
                                        rn3Var.invalidate();
                                        zv4Var.setFocusableInTouchMode(true);
                                        zv4Var.setOnKeyListener(new by1(zv4Var, (byte) 2));
                                        zv4Var.requestFocus();
                                        zv4Var.R = new vm3(bn3Var, (byte) 4);
                                        zv4Var.g();
                                    }
                                } else {
                                    int i3 = 44;
                                    if (i == 3) {
                                        if (bn3Var.r == 1) {
                                            bn3Var.w();
                                        }
                                        d dVar2 = bn3Var.f;
                                        woa woaVar = new woa();
                                        zu1 zu1Var = dVar2.a.E3;
                                        if (zu1Var != null) {
                                            zu1Var.presentFragment(woaVar);
                                        }
                                    } else if (i == 4) {
                                        bn3Var.w.a();
                                        Context context2 = bn3Var.h;
                                        vnb vnbVar2 = bn3Var.n;
                                        zv4 zv4Var2 = new zv4(context2, this.d, vnbVar2, new um3(bn3Var, b2));
                                        zv4Var2.c0 = true;
                                        zv4Var2.n = hl.L(316.0f);
                                        zv4Var2.M = hl.L(200.0f);
                                        zv4Var2.b0 = true;
                                        zv4Var2.L = 0;
                                        int v02 = aob.v0(aob.G6, vnbVar2);
                                        boolean y = DictationAsr.y();
                                        zv4Var2.a(new l7(bn3Var.h, ob6.M0(2131744990, null), null, v02, y), 44, new jm3((byte) 1));
                                        String[] I = DictationAsr.I();
                                        int length2 = I.length;
                                        int i4 = 0;
                                        while (i4 < length2) {
                                            String str2 = I[i4];
                                            boolean z2 = (y || !DictationAsr.A(str2)) ? false : z;
                                            nm3 N = DictationAsr.N(str2);
                                            if (N != null) {
                                                strArr = N.d(str2);
                                                b = 0;
                                            } else {
                                                b = 0;
                                                strArr = new String[0];
                                            }
                                            int length3 = strArr.length;
                                            Context context3 = bn3Var.h;
                                            if (length3 < 2) {
                                                zv4Var2.a(new l7(context3, bn3.t(str2), null, v02, z2), i3, new wm3(bn3Var, str2, b));
                                                runnable = runnable2;
                                            } else {
                                                l7 l7Var = new l7(context3, bn3.t(str2), bn3.S(DictationAsr.i0(N, str2)), v02, z2);
                                                zv4Var2.a(l7Var, 54, runnable2);
                                                runnable = runnable2;
                                                l7Var.setOnClickListener(new xm3(bn3Var, N, str2, strArr, v02, z2, zv4Var2));
                                            }
                                            i4++;
                                            runnable2 = runnable;
                                            i3 = 44;
                                            z = true;
                                        }
                                        rn3 rn3Var2 = bn3Var.w;
                                        rn3Var2.H0 = zv4Var2;
                                        rn3Var2.addView(zv4Var2, new FrameLayout.LayoutParams(-1, -1));
                                        rn3Var2.invalidate();
                                        zv4Var2.setFocusableInTouchMode(true);
                                        zv4Var2.setOnKeyListener(new by1(zv4Var2, (byte) 1));
                                        zv4Var2.requestFocus();
                                        zv4Var2.R = new vm3(bn3Var, (byte) 1);
                                        zv4Var2.g();
                                    } else {
                                        String str3 = bn3Var.J;
                                        if (str3 != null && bn3Var.r == 3) {
                                            bn3Var.J = null;
                                            bn3Var.y(str3);
                                            bn3Var.K = cm3Var;
                                            bn3Var.w.setRevert(false);
                                            bn3Var.w.e(cm3Var.a(), false);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (actionMasked2 == 3) {
                        this.g0 = -1;
                        invalidate();
                        return true;
                    }
                    return true;
                }
                return false;
            }
            this.g0 = d(motionEvent.getX(), motionEvent.getY());
            invalidate();
        }
        return true;
    }

    public final void e(String str, boolean z) {
        if (z && !this.V) {
            this.u0 = SystemClock.uptimeMillis();
        }
        this.V = z;
        String str2 = str == null ? "" : str.toString();
        if (str2.endsWith("…")) {
            str2 = bs2.n(1, 0, str2);
        } else if (str2.endsWith("...")) {
            str2 = bs2.n(3, 0, str2);
        }
        this.s.t(str2, true, true);
        invalidate();
    }

    public final void f() {
        int i = aob.d6;
        vnb vnbVar = this.b;
        this.i0 = hl.B(aob.v0(i, vnbVar)) < 0.5f;
        int v0 = aob.v0(aob.G6, vnbVar);
        this.j0 = v0;
        this.k0 = v0;
        this.s.u(v0);
        this.x0.u(this.j0);
        int i2 = this.k0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(new PorterDuffColorFilter(i2, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.G.setColor(this.k0);
        this.h.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.n.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.r.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.w.setColor(this.i0 ? -651810255 : -335544321);
        this.x.setColor(this.i0 ? 654311423 : 335544320);
        this.E.setColor(aob.p1(0.14f, this.j0));
        Paint paint = this.y;
        paint.setColor(16777216);
        paint.setShadowLayer(hl.L(8.0f), 0.0f, hl.L(2.0f), this.i0 ? 1426063360 : 570425344);
        jl0 jl0Var = this.I;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.J;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        jl0 jl0Var3 = this.K;
        if (jl0Var3 != null) {
            jl0Var3.updateColors();
        }
        jl0 jl0Var4 = this.L;
        if (jl0Var4 != null) {
            jl0Var4.updateColors();
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.c && childAt != this.d) {
                childAt.layout(0, 0, i3 - i, i4 - i2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.H0) {
            this.H0 = null;
            invalidate();
        }
    }

    public void setDetected(String[] strArr) {
        this.F0 = strArr;
        invalidate();
    }

    public void setGearGlass(jl0 jl0Var) {
        this.L = jl0Var;
        if (jl0Var != null) {
            jl0Var.r(hl.L(18.0f));
        }
    }

    public void setIsland(boolean z) {
        if (this.T == z) {
            return;
        }
        this.T = z;
        if (z) {
            this.a0.e(true, 0.0f);
            this.W.e(true, 0.0f);
            this.n0 = true;
            hc hcVar = this.e;
            Objects.requireNonNull(hcVar);
            hl.d3(new gc(hcVar, (byte) 1), 160L);
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        boolean z = false;
        boolean z2 = charSequence != null;
        if (this.y0 && this.C0.c > 0.0f) {
            z = true;
        }
        if (!z) {
            this.E0.a(z2);
            this.z0 = true;
        }
        this.A0 = z2;
        if (!z2) {
            charSequence = this.w0;
        }
        this.x0.t(charSequence, z, true);
        invalidate();
    }

    public void setRevert(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        invalidate();
    }

    public void setSettings(boolean z) {
        if (this.y0 == z) {
            return;
        }
        this.y0 = z;
        if (z && this.C0.c <= 0.0f) {
            this.z0 = true;
        }
        invalidate();
    }

    public void setStopMode(boolean z) {
        if (this.r0 == z) {
            return;
        }
        this.r0 = z;
        if (!this.T) {
            this.s0.e(true, z ? 1.0f : 0.0f);
        }
        if (!z) {
            hc hcVar = this.e;
            Objects.requireNonNull(hcVar);
            hl.d3(new gc(hcVar, (byte) 1), 120L);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || drawable == this.s || drawable == this.x0 || super.verifyDrawable(drawable);
    }
}
