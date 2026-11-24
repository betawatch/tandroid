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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class va2 extends FrameLayout implements vlb {
    public boolean E;
    public float F;
    public float G;
    public float H;
    public int I;
    public final Rect J;
    public final RectF K;
    public qm0 L;
    public float M;
    public float N;
    public int O;
    public float P;
    public boolean Q;
    public d0d a;
    public final sb b;
    public final FrameLayout c;
    public final yd d;
    public boolean e;
    public mn3 f;
    public g11 h;
    public im0 n;
    public im0 r;
    public final Path s;
    public int w;
    public float x;
    public float y;

    public va2(Context context) {
        super(context);
        this.e = true;
        this.s = new Path();
        this.J = new Rect();
        this.K = new RectF();
        this.O = nm7.d4;
        this.P = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, qoe.e(-1, -2, 80));
        yd ydVar = new yd((byte) 13, context, (Object) this);
        this.d = ydVar;
        addView(ydVar, qoe.e(-1, -2, 80));
        this.b = new sb((byte) 8, context, this);
    }

    public final void a(boolean z) {
        e();
        int round = Math.round(this.x) + gm.L(9.0f) + this.I;
        if (this.w != round || z) {
            this.w = round;
            int L = gm.L(29.0f);
            float measuredHeight = getMeasuredHeight() - this.y;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.K;
            rectF.set(0.0f, measuredHeight, measuredWidth, measuredHeight2);
            Path path = this.s;
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
        qm0 qm0Var = this.L;
        if (qm0Var == null || (i = qm0Var.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.M))) {
            return;
        }
        this.L.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        wzc wzcVar = ((g0d) this.a).r;
        int i = wzcVar != null ? wzcVar.a.f(2).d : 0;
        float c = ((g0d) this.a).c();
        yd ydVar = this.d;
        int childCount = ydVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            KeyEvent.Callback childAt = ydVar.getChildAt(i2);
            if (childAt instanceof cp5) {
                cp5 cp5Var = (cp5) childAt;
                cp5Var.a(i);
                cp5Var.b(c);
            }
        }
    }

    public final void d() {
        int i;
        WindowInsets rootWindowInsets;
        this.x = ((g0d) this.a).d();
        this.y = ((g0d) this.a).c();
        int i2 = 0;
        this.E = ((g0d) this.a).s != 1;
        yd ydVar = this.d;
        boolean z = ydVar.getVisibility() == 0;
        boolean z2 = this.E;
        if (z != z2) {
            ydVar.setVisibility(z2 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ydVar.getLayoutParams();
        int i3 = layoutParams.height;
        int i4 = ((g0d) this.a).x;
        if (i3 != i4) {
            layoutParams.height = i4;
            requestLayout();
        }
        a(false);
        c();
        if (this.r != null) {
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
            this.r.t(gm.L(29.0f), gm.L(29.0f), i2, i, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02da  */
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
        boolean z;
        long j;
        ylb ylbVar;
        RectF rectF;
        int[] iArr;
        float f5;
        float f6;
        rx1 rx1Var;
        sy1 sy1Var;
        int f7;
        float f8;
        int f9;
        int i;
        int f10;
        float c;
        this.r.setBounds(0, getMeasuredHeight() - ((int) this.y), getMeasuredWidth(), kt6.e(58.0f, getMeasuredHeight() - ((int) this.y), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.w;
        int round = Math.round(this.F);
        int measuredWidth = getMeasuredWidth() - Math.round(this.G);
        int i2 = this.I;
        Rect rect = this.J;
        rect.set(round, 0, measuredWidth, i2);
        rect.inset(0, -gm.L(7.0f));
        rect.offset(0, measuredHeight + ((int) this.N));
        this.n.setBounds(rect);
        if (this.e) {
            this.n.draw(canvas);
        }
        mn3 mn3Var = this.f;
        if (mn3Var == null || !this.e) {
            f = 22.0f;
            f2 = 0.45f;
            f3 = 0.3f;
            f4 = 2.0f;
        } else {
            Rect rect2 = this.n.S.m;
            un3 un3Var = mn3Var.b;
            ylb ylbVar2 = un3Var.n;
            RectF rectF2 = un3Var.y;
            int[] iArr2 = un3Var.E;
            RectF rectF3 = un3Var.Z;
            f = 22.0f;
            zn3 zn3Var = un3Var.x;
            f2 = 0.45f;
            d dVar = un3Var.f;
            f3 = 0.3f;
            ko3 ko3Var = un3Var.w;
            f4 = 2.0f;
            if (ko3Var != null && (ko3Var.T || ko3Var.W.c > 0.0f || ko3Var.y0 || ko3Var.C0.c > 0.0f)) {
                ko3Var.invalidate();
            }
            if (un3Var.Y != null) {
                boolean z2 = un3Var.r == 4;
                lo3 lo3Var = un3Var.a;
                boolean z3 = lo3Var != null && lo3Var.d;
                boolean z4 = SystemClock.uptimeMillis() < un3Var.W;
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z5 = z3;
                long j2 = un3Var.b;
                if (j2 <= 0 || uptimeMillis < j2 || un3Var.X || z2) {
                    d = un3Var.Y.d(un3Var.X || z2 || z4 || z5 || j2 > 0);
                } else {
                    float min = Math.min(1.0f, (uptimeMillis - j2) / 580.0f);
                    if (min >= 1.0f) {
                        un3Var.b = 0L;
                        un3Var.Y.e(true, 0.0f);
                        d = 0.0f;
                    } else {
                        un3Var.Y.e(true, 1.0f);
                        d = 1.0f - un3.I0.getInterpolation(min);
                    }
                }
                if (d <= 0.0f) {
                    un3Var.d = false;
                    un3Var.F(0.0f, 0.0f);
                    dVar.c(0.0f, 0);
                } else {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    float min2 = un3Var.R == 0 ? 0.016f : Math.min(0.05f, (uptimeMillis2 - r14) / 1000.0f);
                    un3Var.R = uptimeMillis2;
                    float f11 = z2 ? 0.55f : un3Var.P;
                    float f12 = un3Var.Q;
                    float f13 = d;
                    float A = td4.A(1.0f, (float) Math.exp((-min2) / (f11 > f12 ? 0.12f : 0.4f)), f11 - f12, f12);
                    un3Var.Q = A;
                    if (un3Var.X && !z2) {
                        float f14 = un3Var.P;
                        if (f14 > 0.3f && f14 > (A * 1.5f) + 0.08f && uptimeMillis2 - un3Var.S > 1000) {
                            j = uptimeMillis2;
                            un3Var.S = j;
                            z = z2;
                            un3Var.T = (float) (((Math.random() * 3.141592653589793d) * 2.0d) - 3.141592653589793d);
                            float f15 = (j - un3Var.S) / 1200.0f;
                            float interpolation = (f15 >= 0.0f || f15 >= 1.0f || z) ? -1.0f : d53.g.getInterpolation(f15);
                            float f16 = un3Var.T;
                            zn3Var.C = interpolation;
                            int[] iArr3 = zn3Var.B;
                            zn3Var.D = f16;
                            un3Var.c = (f15 >= 0.0f || f15 >= 1.0f) ? 0.0f : (float) Math.sin(f15 * 3.141592653589793d);
                            rectF3.set(rect2);
                            if (z) {
                                ylbVar = ylbVar2;
                                rectF = rectF2;
                                iArr = iArr2;
                                f5 = 0.7f;
                                if (z5) {
                                    float g = un3Var.a.g();
                                    un3Var.d = true;
                                    f6 = g;
                                } else if (un3Var.d) {
                                    f6 = 1.0f;
                                }
                                float e = f13 * un3Var.e.e(false, un3Var.X ? 1.0f : (z || z5 || un3Var.d) ? 0.85f : f5);
                                RectF rectF4 = rectF;
                                int[] iArr4 = iArr;
                                un3Var.x.b(Math.min(gm.L(22.0f), rectF3.height() / 2.0f), e, f6, un3Var.Q, canvas, rectF3);
                                un3Var.F(e, un3Var.c);
                                rx1Var = dVar.a.R0;
                                if (rx1Var == null && rx1Var.getVisibility() == 0 && rx1Var.getAlpha() > 0.01f && un3Var.n(rectF4)) {
                                    rx1Var.getLocationInWindow(iArr4);
                                    int a = zn3Var.a((rx1Var.getWidth() / 2.0f) + iArr4[0], (rx1Var.getHeight() / 2.0f) + iArr4[1], rectF4);
                                    if (zn3.c(cmb.v0(cmb.c6, ylbVar))) {
                                        f10 = on2.f(0.4f, a, -1);
                                        c = 1.0f;
                                    } else {
                                        f10 = on2.f(0.5f, a, iArr3[4]);
                                        c = ao3.c(11);
                                    }
                                    dVar.c(c * e, f10);
                                } else {
                                    dVar.c(0.0f, 0);
                                }
                                Matrix matrix = un3Var.z0;
                                sy1Var = dVar.a.F0;
                                if (sy1Var != null) {
                                    if (un3Var.r == 1) {
                                        boolean c2 = zn3.c(cmb.v0(cmb.c6, ylbVar));
                                        if (un3Var.w0 == null || un3Var.x0 != c2 || un3Var.y0 != zn3.U) {
                                            un3Var.x0 = c2;
                                            un3Var.y0 = zn3.U;
                                            int i3 = cmb.Le;
                                            int v0 = cmb.v0(i3, ylbVar);
                                            if (c2) {
                                                v0 = zn3.d(v0);
                                            }
                                            int i4 = v0 | (-16777216);
                                            if (c2) {
                                                f7 = zn3.e(-7359233);
                                                i = zn3.e(-7411982);
                                                f9 = zn3.e(-4940545);
                                                f8 = 0.92f;
                                            } else {
                                                f7 = on2.f(0.55f, iArr3[0], iArr3[4]);
                                                int f17 = on2.f(0.55f, iArr3[1], iArr3[4]);
                                                f8 = 0.9f;
                                                f9 = on2.f(0.55f, iArr3[2], iArr3[4]);
                                                i = f17;
                                            }
                                            if (c2) {
                                                un3Var.w0 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{on2.f(f8, i4, f7), on2.f(f8, i4, i), on2.f(f8, i4, f9), on2.f(f8, i4, f7)}, (float[]) null, Shader.TileMode.MIRROR);
                                            } else {
                                                int v02 = cmb.v0(i3, ylbVar);
                                                int alpha = Color.alpha(v02);
                                                int[] iArr5 = new int[4];
                                                iArr5[0] = f7;
                                                iArr5[1] = i;
                                                iArr5[2] = f9;
                                                iArr5[3] = f7;
                                                for (int i5 = 0; i5 < 4; i5++) {
                                                    iArr5[i5] = on2.p(on2.f(0.12f, v02 | (-16777216), iArr5[i5]), alpha);
                                                }
                                                un3Var.w0 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr5, (float[]) null, Shader.TileMode.MIRROR);
                                            }
                                        }
                                        float L = gm.L(160.0f);
                                        matrix.setScale(L, 1.0f);
                                        matrix.postTranslate(((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L, 0.0f);
                                        un3Var.w0.setLocalMatrix(matrix);
                                        sy1Var.m1 = un3Var.w0;
                                        sy1Var.invalidate();
                                    } else if (sy1Var.m1 != null) {
                                        sy1Var.m1 = null;
                                        sy1Var.invalidate();
                                    }
                                }
                                un3Var.a0.postInvalidateOnAnimation();
                            } else {
                                ap3 ap3Var = un3Var.F;
                                ylbVar = ylbVar2;
                                f5 = 0.7f;
                                float uptimeMillis3 = (SystemClock.uptimeMillis() - un3Var.V) / 1000.0f;
                                Matrix matrix2 = ap3Var.l;
                                if (ap3Var.k == null) {
                                    rectF = rectF2;
                                    iArr = iArr2;
                                } else {
                                    rectF = rectF2;
                                    iArr = iArr2;
                                    float sin = (((float) Math.sin((0.23f * uptimeMillis3) + 1.3f)) * 12.0f) + (((float) Math.sin(uptimeMillis3 * 0.45f)) * 28.0f);
                                    matrix2.reset();
                                    matrix2.setRotate(sin);
                                    matrix2.postTranslate(gm.L(46.0f) * uptimeMillis3, gm.L(10.0f) * ((float) Math.sin(uptimeMillis3 * 0.7f)));
                                    ap3Var.k.setLocalMatrix(matrix2);
                                }
                            }
                            f6 = -1.0f;
                            float e2 = f13 * un3Var.e.e(false, un3Var.X ? 1.0f : (z || z5 || un3Var.d) ? 0.85f : f5);
                            RectF rectF42 = rectF;
                            int[] iArr42 = iArr;
                            un3Var.x.b(Math.min(gm.L(22.0f), rectF3.height() / 2.0f), e2, f6, un3Var.Q, canvas, rectF3);
                            un3Var.F(e2, un3Var.c);
                            rx1Var = dVar.a.R0;
                            if (rx1Var == null) {
                            }
                            dVar.c(0.0f, 0);
                            Matrix matrix3 = un3Var.z0;
                            sy1Var = dVar.a.F0;
                            if (sy1Var != null) {
                            }
                            un3Var.a0.postInvalidateOnAnimation();
                        }
                    }
                    z = z2;
                    j = uptimeMillis2;
                    float f152 = (j - un3Var.S) / 1200.0f;
                    if (f152 >= 0.0f) {
                    }
                    float f162 = un3Var.T;
                    zn3Var.C = interpolation;
                    int[] iArr32 = zn3Var.B;
                    zn3Var.D = f162;
                    un3Var.c = (f152 >= 0.0f || f152 >= 1.0f) ? 0.0f : (float) Math.sin(f152 * 3.141592653589793d);
                    rectF3.set(rect2);
                    if (z) {
                    }
                    f6 = -1.0f;
                    float e22 = f13 * un3Var.e.e(false, un3Var.X ? 1.0f : (z || z5 || un3Var.d) ? 0.85f : f5);
                    RectF rectF422 = rectF;
                    int[] iArr422 = iArr;
                    un3Var.x.b(Math.min(gm.L(22.0f), rectF3.height() / 2.0f), e22, f6, un3Var.Q, canvas, rectF3);
                    un3Var.F(e22, un3Var.c);
                    rx1Var = dVar.a.R0;
                    if (rx1Var == null) {
                    }
                    dVar.c(0.0f, 0);
                    Matrix matrix32 = un3Var.z0;
                    sy1Var = dVar.a.F0;
                    if (sy1Var != null) {
                    }
                    un3Var.a0.postInvalidateOnAnimation();
                }
            }
        }
        g11 g11Var = this.h;
        if (g11Var != null && this.e) {
            Rect rect3 = this.n.S.m;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) g11Var.b;
            va2 va2Var = (va2) g11Var.c;
            RectF rectF5 = chatActivityEnterView.v6;
            lo3 lo3Var2 = chatActivityEnterView.n6;
            if (lo3Var2 != null && lo3Var2.d && chatActivityEnterView.u6 != null && zn3.c(chatActivityEnterView.F0(cmb.c6))) {
                float g2 = lo3Var2.g();
                if (g2 >= 0.0f) {
                    float min3 = Math.min(1.0f, (1.0f - g2) / f3) * Math.min(1.0f, g2 / 0.15f);
                    zn3 zn3Var2 = chatActivityEnterView.u6;
                    if (!zn3Var2.h) {
                        zn3Var2.h = true;
                    }
                    if (min3 > 0.001f) {
                        rectF5.set(rect3);
                        canvas2 = canvas;
                        chatActivityEnterView.u6.b(Math.min(gm.L(f), rectF5.height() / f4), min3 * f2, g2, 0.35f, canvas2, rectF5);
                    } else {
                        canvas2 = canvas;
                    }
                    va2Var.postInvalidateOnAnimation();
                    if (this.E) {
                        this.r.draw(canvas2);
                    }
                    super.dispatchDraw(canvas);
                }
            }
        }
        canvas2 = canvas;
        if (this.E) {
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.d;
        if (z) {
            canvas.save();
            canvas.clipPath(this.r.S.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.c.setTranslationY((-this.x) - gm.L(9.0f));
        this.d.setTranslationY(r0.getMeasuredHeight() - this.y);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.x) - gm.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.H;
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
        im0 im0Var;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            im0 im0Var2 = this.n;
            this.Q = (im0Var2 != null && im0Var2.c == 255 && im0Var2.getBounds().contains(x, y)) || ((im0Var = this.r) != null && im0Var.getBounds().contains(x, y));
        }
        if (action == 1 || action == 3) {
            this.Q = false;
        }
        return this.Q;
    }

    public void setBackgroundWithFadeDrawable(qm0 qm0Var) {
        this.L = qm0Var;
    }

    public void setBlurredBottomHeight(float f) {
        if (this.M != f) {
            this.M = f;
            b();
        }
    }

    public void setInputBubbleAlpha(int i) {
        this.O = i;
        im0 im0Var = this.n;
        if (im0Var != null) {
            im0Var.setAlpha((int) (i * this.P));
        }
    }

    public void setInputBubbleExtraAlpha(float f) {
        if (this.P != f) {
            this.P = f;
            im0 im0Var = this.n;
            if (im0Var != null) {
                im0Var.setAlpha((int) (this.O * f));
            }
            invalidate();
        }
    }

    public void setInputBubbleHeight(float f) {
        this.H = f;
        this.I = Math.round(f);
        a(false);
    }

    public void setInputBubbleTranslationY(float f) {
        this.N = f;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(im0 im0Var) {
        this.n = im0Var;
        im0Var.q(gm.L(7.0f));
        this.n.r(gm.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(im0 im0Var) {
        this.r = im0Var;
        im0Var.U = true;
        im0Var.s(gm.L(29.0f), gm.L(29.0f), 0.0f, 0.0f);
        this.r.u(gm.L(32.0f));
        im0 im0Var2 = this.r;
        im0Var2.S.g = 0.4f;
        im0Var2.n();
    }

    public void setWindowInsetsProvider(d0d d0dVar) {
        this.a = d0dVar;
    }

    @Override // vlb
    public final void updateColors() {
        im0 im0Var = this.n;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        im0 im0Var2 = this.r;
        if (im0Var2 != null) {
            im0Var2.updateColors();
        }
        invalidate();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
