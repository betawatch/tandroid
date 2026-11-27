// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class z92 extends FrameLayout implements snb {
    public float E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public final Rect K;
    public final RectF L;
    public rl0 M;
    public float N;
    public float O;
    public int P;
    public float Q;
    public boolean R;
    public s2d a;
    public final tb b;
    public final FrameLayout c;
    public final zc d;
    public boolean e;
    public um3 f;
    public h01 h;
    public h01 n;
    public jl0 r;
    public jl0 s;
    public final Path w;
    public int x;
    public float y;

    public z92(Context context) {
        super(context);
        this.e = true;
        this.w = new Path();
        this.K = new Rect();
        this.L = new RectF();
        this.P = jn7.d4;
        this.Q = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, tre.e(-1, -2, 80));
        zc zcVar = new zc((byte) 13, context, (Object) this);
        this.d = zcVar;
        addView(zcVar, tre.e(-1, -2, 80));
        this.b = new tb((byte) 8, context, this);
    }

    public final void a(boolean z) {
        e();
        int round = Math.round(this.y) + hl.L(9.0f) + this.J;
        if (this.x != round || z) {
            this.x = round;
            int L = hl.L(29.0f);
            float measuredHeight = getMeasuredHeight() - this.E;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.L;
            rectF.set(0.0f, measuredHeight, measuredWidth, measuredHeight2);
            Path path = this.w;
            path.rewind();
            float f = L;
            path.addRoundRect(rectF, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            path.close();
            invalidate();
        }
    }

    public final void b() {
        int i;
        int measuredHeight;
        rl0 rl0Var = this.M;
        if (rl0Var == null || (i = rl0Var.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.N))) {
            return;
        }
        this.M.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        l2d l2dVar = ((v2d) this.a).r;
        int i = l2dVar != null ? l2dVar.a.f(2).d : 0;
        float c = ((v2d) this.a).c();
        zc zcVar = this.d;
        int childCount = zcVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            KeyEvent.Callback childAt = zcVar.getChildAt(i2);
            if (childAt instanceof fp5) {
                fp5 fp5Var = (fp5) childAt;
                fp5Var.a(i);
                fp5Var.b(c);
            }
        }
    }

    public final void d() {
        int i;
        WindowInsets rootWindowInsets;
        this.y = ((v2d) this.a).d();
        this.E = ((v2d) this.a).c();
        int i2 = 0;
        this.F = ((v2d) this.a).s != 1;
        zc zcVar = this.d;
        boolean z = zcVar.getVisibility() == 0;
        boolean z2 = this.F;
        if (z != z2) {
            zcVar.setVisibility(z2 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zcVar.getLayoutParams();
        int i3 = layoutParams.height;
        int i4 = ((v2d) this.a).x;
        if (i3 != i4) {
            layoutParams.height = i4;
            requestLayout();
        }
        a(false);
        c();
        if (this.s != null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                i = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                i = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 != null) {
                    i2 = roundedCorner2.getRadius();
                }
            }
            this.s.t(hl.L(29.0f), hl.L(29.0f), i2, i, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        Canvas canvas2;
        float d;
        int[] iArr;
        float f5;
        int[] iArr2;
        float f6;
        tw1 tw1Var;
        tx1 tx1Var;
        int f7;
        int i;
        int f8;
        float f9;
        int i2;
        int f10;
        float c;
        this.s.setBounds(0, getMeasuredHeight() - ((int) this.E), getMeasuredWidth(), qu6.e(58.0f, getMeasuredHeight() - ((int) this.E), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.x;
        int round = Math.round(this.G);
        int measuredWidth = getMeasuredWidth() - Math.round(this.H);
        int i3 = this.J;
        Rect rect = this.K;
        rect.set(round, 0, measuredWidth, i3);
        rect.inset(0, -hl.L(7.0f));
        rect.offset(0, measuredHeight + ((int) this.O));
        this.r.setBounds(rect);
        if (this.e) {
            this.r.draw(canvas);
        }
        um3 um3Var = this.f;
        if (um3Var == null || !this.e) {
            f = 0.45f;
            f2 = 0.3f;
            f3 = 1000.0f;
            f4 = 22.0f;
        } else {
            Rect rect2 = this.r.S.m;
            bn3 bn3Var = um3Var.b;
            vnb vnbVar = bn3Var.n;
            RectF rectF = bn3Var.y;
            int[] iArr3 = bn3Var.E;
            RectF rectF2 = bn3Var.a0;
            f = 0.45f;
            gn3 gn3Var = bn3Var.x;
            f2 = 0.3f;
            d dVar = bn3Var.f;
            f3 = 1000.0f;
            rn3 rn3Var = bn3Var.w;
            f4 = 22.0f;
            if (rn3Var != null && (rn3Var.T || rn3Var.W.c > 0.0f || rn3Var.y0 || rn3Var.C0.c > 0.0f)) {
                rn3Var.invalidate();
            }
            if (bn3Var.Z != null) {
                boolean z = bn3Var.r == 4;
                sn3 sn3Var = bn3Var.a;
                boolean z2 = sn3Var != null && sn3Var.d;
                boolean z3 = SystemClock.uptimeMillis() < bn3Var.X;
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z4 = z;
                long j = bn3Var.b;
                if (j <= 0 || uptimeMillis < j || bn3Var.Y || z4) {
                    d = bn3Var.Z.d(bn3Var.Y || z4 || z3 || z2 || j > 0);
                } else {
                    float min = Math.min(1.0f, (uptimeMillis - j) / 580.0f);
                    if (min >= 1.0f) {
                        bn3Var.b = 0L;
                        bn3Var.Z.e(true, 0.0f);
                        d = 0.0f;
                    } else {
                        bn3Var.Z.e(true, 1.0f);
                        d = 1.0f - bn3.J0.getInterpolation(min);
                    }
                }
                if (d <= 0.0f) {
                    bn3Var.d = false;
                    bn3Var.I(0.0f, 0.0f);
                    dVar.c(0.0f, 0);
                } else {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    float min2 = bn3Var.S == 0 ? 0.016f : Math.min(0.05f, (uptimeMillis2 - r11) / 1000.0f);
                    bn3Var.S = uptimeMillis2;
                    float f11 = z4 ? 0.55f : bn3Var.Q;
                    float f12 = bn3Var.R;
                    float A = qd4.A(1.0f, (float) Math.exp((-min2) / (f11 > f12 ? 0.12f : 0.4f)), f11 - f12, f12);
                    bn3Var.R = A;
                    if (bn3Var.Y && !z4) {
                        float f13 = bn3Var.Q;
                        if (f13 > 0.3f && f13 > (A * 1.5f) + 0.08f && uptimeMillis2 - bn3Var.T > 1000) {
                            bn3Var.T = uptimeMillis2;
                            bn3Var.U = (float) (((Math.random() * 3.141592653589793d) * 2.0d) - 3.141592653589793d);
                        }
                    }
                    float f14 = (uptimeMillis2 - bn3Var.T) / 1200.0f;
                    float interpolation = (f14 < 0.0f || f14 >= 1.0f || z4) ? -1.0f : k43.g.getInterpolation(f14);
                    float f15 = bn3Var.U;
                    gn3Var.C = interpolation;
                    int[] iArr4 = gn3Var.B;
                    gn3Var.D = f15;
                    bn3Var.c = (f14 < 0.0f || f14 >= 1.0f) ? 0.0f : (float) Math.sin(f14 * 3.141592653589793d);
                    rectF2.set(rect2);
                    if (z4) {
                        ho3 ho3Var = bn3Var.F;
                        float uptimeMillis3 = (SystemClock.uptimeMillis() - bn3Var.W) / 1000.0f;
                        Matrix matrix = ho3Var.l;
                        if (ho3Var.k == null) {
                            f5 = 0.7f;
                            iArr = iArr3;
                        } else {
                            f5 = 0.7f;
                            iArr = iArr3;
                            float sin = (((float) Math.sin((0.23f * uptimeMillis3) + 1.3f)) * 12.0f) + (((float) Math.sin(uptimeMillis3 * 0.45f)) * 28.0f);
                            matrix.reset();
                            matrix.setRotate(sin);
                            matrix.postTranslate(hl.L(46.0f) * uptimeMillis3, hl.L(10.0f) * ((float) Math.sin(uptimeMillis3 * 0.7f)));
                            ho3Var.k.setLocalMatrix(matrix);
                        }
                        iArr2 = iArr4;
                    } else {
                        iArr = iArr3;
                        f5 = 0.7f;
                        if (z2) {
                            float g = bn3Var.a.g();
                            bn3Var.d = true;
                            iArr2 = iArr4;
                            f6 = g;
                        } else {
                            iArr2 = iArr4;
                            if (bn3Var.d) {
                                f6 = 1.0f;
                            }
                        }
                        float e = d * bn3Var.e.e(false, !bn3Var.Y ? 1.0f : (z4 || z2 || bn3Var.d) ? 0.85f : f5);
                        int[] iArr5 = iArr;
                        bn3Var.x.b(Math.min(hl.L(22.0f), rectF2.height() / 2.0f), e, f6, bn3Var.R, canvas, rectF2);
                        bn3Var.I(e, bn3Var.c);
                        tw1Var = dVar.a.R0;
                        if (tw1Var == null && tw1Var.getVisibility() == 0 && tw1Var.getAlpha() > 0.01f && bn3Var.p(rectF)) {
                            tw1Var.getLocationInWindow(iArr5);
                            int a = gn3Var.a((tw1Var.getWidth() / 2.0f) + iArr5[0], (tw1Var.getHeight() / 2.0f) + iArr5[1], rectF);
                            if (gn3.c(aob.v0(aob.d6, vnbVar))) {
                                f10 = vm2.f(0.4f, a, -1);
                                c = 1.0f;
                            } else {
                                f10 = vm2.f(0.5f, a, iArr2[4]);
                                c = hn3.c(11);
                            }
                            dVar.c(e * c, f10);
                        } else {
                            dVar.c(0.0f, 0);
                        }
                        Matrix matrix2 = bn3Var.A0;
                        tx1Var = dVar.a.F0;
                        if (tx1Var != null) {
                            if (bn3Var.r == 1) {
                                boolean c2 = gn3.c(aob.v0(aob.d6, vnbVar));
                                if (bn3Var.x0 == null || bn3Var.y0 != c2 || bn3Var.z0 != gn3.V) {
                                    bn3Var.y0 = c2;
                                    bn3Var.z0 = gn3.V;
                                    int i4 = aob.Me;
                                    int v0 = aob.v0(i4, vnbVar);
                                    if (c2) {
                                        v0 = gn3.d(v0);
                                    }
                                    int i5 = v0 | (-16777216);
                                    if (c2) {
                                        f7 = gn3.e(-7359233);
                                        i2 = gn3.e(-7411982);
                                        f8 = gn3.e(-4940545);
                                        f9 = 0.92f;
                                        i = -16777216;
                                    } else {
                                        f7 = vm2.f(0.55f, iArr2[0], iArr2[4]);
                                        i = -16777216;
                                        int f16 = vm2.f(0.55f, iArr2[1], iArr2[4]);
                                        f8 = vm2.f(0.55f, iArr2[2], iArr2[4]);
                                        f9 = 0.9f;
                                        i2 = f16;
                                    }
                                    if (c2) {
                                        bn3Var.x0 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{vm2.f(f9, i5, f7), vm2.f(f9, i5, i2), vm2.f(f9, i5, f8), vm2.f(f9, i5, f7)}, (float[]) null, Shader.TileMode.MIRROR);
                                    } else {
                                        int v02 = aob.v0(i4, vnbVar);
                                        int alpha = Color.alpha(v02);
                                        int[] iArr6 = new int[4];
                                        iArr6[0] = f7;
                                        iArr6[1] = i2;
                                        iArr6[2] = f8;
                                        iArr6[3] = f7;
                                        for (int i6 = 0; i6 < 4; i6++) {
                                            iArr6[i6] = vm2.o(vm2.f(0.12f, v02 | i, iArr6[i6]), alpha);
                                        }
                                        bn3Var.x0 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr6, (float[]) null, Shader.TileMode.MIRROR);
                                    }
                                }
                                float L = hl.L(160.0f);
                                matrix2.setScale(L, 1.0f);
                                matrix2.postTranslate(((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L, 0.0f);
                                bn3Var.x0.setLocalMatrix(matrix2);
                                tx1Var.m1 = bn3Var.x0;
                                tx1Var.invalidate();
                            } else if (tx1Var.m1 != null) {
                                tx1Var.m1 = null;
                                tx1Var.invalidate();
                            }
                        }
                        bn3Var.b0.postInvalidateOnAnimation();
                    }
                    f6 = -1.0f;
                    float e2 = d * bn3Var.e.e(false, !bn3Var.Y ? 1.0f : (z4 || z2 || bn3Var.d) ? 0.85f : f5);
                    int[] iArr52 = iArr;
                    bn3Var.x.b(Math.min(hl.L(22.0f), rectF2.height() / 2.0f), e2, f6, bn3Var.R, canvas, rectF2);
                    bn3Var.I(e2, bn3Var.c);
                    tw1Var = dVar.a.R0;
                    if (tw1Var == null) {
                    }
                    dVar.c(0.0f, 0);
                    Matrix matrix22 = bn3Var.A0;
                    tx1Var = dVar.a.F0;
                    if (tx1Var != null) {
                    }
                    bn3Var.b0.postInvalidateOnAnimation();
                }
            }
        }
        h01 h01Var = this.h;
        if (h01Var != null && this.e) {
            Rect rect3 = this.r.S.m;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) h01Var.b;
            z92 z92Var = (z92) h01Var.c;
            RectF rectF3 = chatActivityEnterView.O6;
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
            if (recordCircle != null && chatActivityEnterView.N6 != null) {
                long uptimeMillis4 = SystemClock.uptimeMillis();
                if (recordCircle.e0 > 0.003f && uptimeMillis4 - recordCircle.f0 <= 100) {
                    float f17 = recordCircle.n.t;
                    znc zncVar = chatActivityEnterView.N6;
                    float max = Math.max(0.0f, Math.min(1.0f, f17));
                    float min3 = Math.min(0.1f, Math.max(0.0f, (uptimeMillis4 - zncVar.d) / f3));
                    zncVar.d = uptimeMillis4;
                    float f18 = zncVar.c;
                    zncVar.c = qd4.A(1.0f, (float) Math.exp((-min3) / (max > f18 ? 0.04f : 0.18f)), max - f18, f18);
                    rectF3.set(rect3);
                    chatActivityEnterView.N6.a(canvas, rectF3, Math.min(hl.L(f4), rectF3.height() / 2.0f), recordCircle.e0, uptimeMillis4, chatActivityEnterView.k5);
                    z92Var.postInvalidateOnAnimation();
                }
            }
        }
        h01 h01Var2 = this.n;
        if (h01Var2 != null && this.e) {
            Rect rect4 = this.r.S.m;
            ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) h01Var2.b;
            z92 z92Var2 = (z92) h01Var2.c;
            RectF rectF4 = chatActivityEnterView2.M6;
            sn3 sn3Var2 = chatActivityEnterView2.z6;
            if (sn3Var2 != null && sn3Var2.d && chatActivityEnterView2.L6 != null && gn3.c(chatActivityEnterView2.J0(aob.d6))) {
                float g2 = sn3Var2.g();
                if (g2 >= 0.0f) {
                    float min4 = Math.min(1.0f, (1.0f - g2) / f2) * Math.min(1.0f, g2 / 0.15f);
                    gn3 gn3Var2 = chatActivityEnterView2.L6;
                    if (!gn3Var2.h) {
                        gn3Var2.h = true;
                    }
                    if (min4 > 0.001f) {
                        rectF4.set(rect4);
                        canvas2 = canvas;
                        chatActivityEnterView2.L6.b(Math.min(hl.L(f4), rectF4.height() / 2.0f), min4 * f, g2, 0.35f, canvas2, rectF4);
                    } else {
                        canvas2 = canvas;
                    }
                    z92Var2.postInvalidateOnAnimation();
                    if (this.F) {
                        this.s.draw(canvas2);
                    }
                    super.dispatchDraw(canvas);
                }
            }
        }
        canvas2 = canvas;
        if (this.F) {
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.d;
        if (z) {
            canvas.save();
            canvas.clipPath(this.s.S.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.c.setTranslationY((-this.y) - hl.L(9.0f));
        this.d.setTranslationY(r0.getMeasuredHeight() - this.E);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.y) - hl.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.I;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a(true);
        b();
        e();
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jl0 jl0Var;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            jl0 jl0Var2 = this.r;
            this.R = (jl0Var2 != null && jl0Var2.c == 255 && jl0Var2.getBounds().contains(x, y)) || ((jl0Var = this.s) != null && jl0Var.getBounds().contains(x, y));
        }
        if (action == 1 || action == 3) {
            this.R = false;
        }
        return this.R;
    }

    public void setBackgroundWithFadeDrawable(rl0 rl0Var) {
        this.M = rl0Var;
    }

    public void setBlurredBottomHeight(float f) {
        if (this.N != f) {
            this.N = f;
            b();
        }
    }

    public void setInputBubbleAlpha(int i) {
        this.P = i;
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.setAlpha((int) (i * this.Q));
        }
    }

    public void setInputBubbleExtraAlpha(float f) {
        if (this.Q != f) {
            this.Q = f;
            jl0 jl0Var = this.r;
            if (jl0Var != null) {
                jl0Var.setAlpha((int) (this.P * f));
            }
            invalidate();
        }
    }

    public void setInputBubbleHeight(float f) {
        this.I = f;
        this.J = Math.round(f);
        a(false);
    }

    public void setInputBubbleTranslationY(float f) {
        this.O = f;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(jl0 jl0Var) {
        this.r = jl0Var;
        jl0Var.q(hl.L(7.0f));
        this.r.r(hl.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(jl0 jl0Var) {
        this.s = jl0Var;
        jl0Var.U = true;
        jl0Var.s(hl.L(29.0f), hl.L(29.0f), 0.0f, 0.0f);
        this.s.u(hl.L(32.0f));
        jl0 jl0Var2 = this.s;
        jl0Var2.S.g = 0.4f;
        jl0Var2.n();
    }

    public void setWindowInsetsProvider(s2d s2dVar) {
        this.a = s2dVar;
    }

    @Override // snb
    public final void updateColors() {
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.s;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        invalidate();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
