package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ww0 extends FrameLayout {
    public RadialGradient D;
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.g5 I;
    public final org.telegram.ui.Components.w5 J;
    public boolean K;
    public boolean L;
    public final Paint M;
    public final RectF N;
    public boolean O;
    public final /* synthetic */ ProfileActivity P;
    public int a;
    public final Paint b;
    public boolean c;
    public final org.telegram.ui.Components.w5 d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.z4 h;
    public final org.telegram.ui.Components.z4 n;
    public int r;
    public int s;
    public int w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P = profileActivity;
        this.b = new Paint();
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.d = new org.telegram.ui.Components.w5(this, 350L, xqVar);
        this.h = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.n = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.w5(this, 0L, 440L, xqVar);
        new org.telegram.ui.Components.w5(this, 0L, 440L, xqVar);
        this.M = new Paint();
        this.N = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.fp fpVar, boolean z9) {
        ProfileActivity profileActivity = this.P;
        if (fpVar != null) {
            this.c = true;
            this.e = fpVar.c(org.telegram.ui.ActionBar.k6.I.q());
            int d = fpVar.d(org.telegram.ui.ActionBar.k6.I.q());
            this.f = d;
            profileActivity.b1 = i0.a.f(0.25f, this.e, d);
            int i7 = fpVar.a;
            if (i7 != 0) {
                this.G = i7;
                this.H = org.telegram.ui.ActionBar.k6.r1(0.45f, i7);
            } else {
                this.G = hm0.B0(this.e);
                this.H = org.telegram.ui.ActionBar.k6.r1(0.15f, hm0.B0(this.e));
            }
        } else {
            profileActivity.b1 = this.a;
            this.c = false;
            int i10 = org.telegram.ui.ActionBar.k6.s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.z0)));
                this.H = org.telegram.ui.ActionBar.k6.r1(0.35f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.z0)));
            } else {
                this.G = hm0.B0(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.z0));
                this.H = org.telegram.ui.ActionBar.k6.r1(0.15f, hm0.B0(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.z0)));
            }
        }
        if (!z9) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z9) {
        org.telegram.ui.Components.g5 g5Var = this.I;
        boolean z10 = true;
        g5Var.j(j3, true);
        g5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j3 == 0 || j3 == -1)) {
            z10 = false;
        }
        this.K = z10;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        float f10;
        vv0 vv0Var;
        float f11;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f12;
        float f13;
        float f14;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        di.z2 z2Var;
        oi.q qVar;
        boolean z9 = this.O;
        ProfileActivity profileActivity = this.P;
        if (!z9) {
            qVar = ((org.telegram.ui.ActionBar.f2) profileActivity).glassEngine;
            qVar.g();
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
        float f15 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) + profileActivity.P1 + profileActivity.S1;
        int i7 = (int) ((1.0f - profileActivity.Q5) * f15);
        boolean z10 = true;
        boolean z11 = profileActivity.A5 > 0.0f && i7 != 0;
        if (z11) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i7, (int) ((1.0f - profileActivity.A5) * 255.0f));
        }
        if (i7 != 0) {
            int i10 = this.a;
            Paint paint = this.b;
            paint.setColor(i10);
            int a10 = this.h.a(this.e, false);
            int a11 = this.n.a(this.f, false);
            org.telegram.ui.Components.ef0 ef0Var = profileActivity.Z;
            if (ef0Var != null) {
                int i11 = this.H;
                boolean z12 = this.c;
                f11 = 1.0f;
                if (ef0Var.P == null || ef0Var.N != i11 || ef0Var.O != z12) {
                    ef0Var.N = i11;
                    ef0Var.O = z12;
                    ef0Var.g();
                }
            } else {
                f11 = 1.0f;
            }
            org.telegram.ui.Components.zf0 zf0Var = profileActivity.b0;
            if (zf0Var != null) {
                zf0Var.d(this.H, this.c);
            }
            org.telegram.ui.Components.if0 if0Var = profileActivity.I5;
            if (if0Var != null) {
                int i12 = this.H;
                boolean z13 = this.c;
                if (if0Var.i != i12 || if0Var.j != z13) {
                    if0Var.i = i12;
                    if0Var.j = z13;
                    if0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.D;
            f10 = 0.0f;
            Paint paint2 = this.F;
            if (radialGradient != null && this.r == a10 && this.s == a11 && this.w == width) {
                f12 = 2.0f;
            } else {
                this.x = org.telegram.messenger.g0.L(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                float currentActionBarHeight2 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (kVar2.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f);
                kVar3 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                this.y = kVar3.getTranslationY() + currentActionBarHeight2;
                this.w = width;
                float f16 = this.y;
                f12 = 2.0f;
                float f17 = this.x;
                this.s = a11;
                this.r = a10;
                RadialGradient radialGradient2 = new RadialGradient(width, (f17 / 2.0f) + f16, f17, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.D = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint2.setShader(this.D);
            }
            float d = this.d.d(this.c) * (profileActivity.I1 == 0 ? f11 : profileActivity.R1);
            if (d < f11) {
                f13 = 255.0f;
                f14 = f12;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i7, paint);
            } else {
                f13 = 255.0f;
                f14 = f12;
            }
            if (d > 0.0f) {
                paint2.setAlpha((int) (d * f13));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i7, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.K && !this.O) {
                boolean z14 = this.L;
                org.telegram.ui.Components.g5 g5Var = this.I;
                if (!z14) {
                    if (g5Var != null) {
                        Drawable drawable = g5Var.f[0];
                        if ((drawable instanceof org.telegram.ui.Components.i5) && (z2Var = ((org.telegram.ui.Components.i5) drawable).k) != null && z2Var.J()) {
                            this.L = true;
                        }
                    }
                    z10 = false;
                }
                float d2 = this.J.d(z10);
                if ((!profileActivity.F1 || profileActivity.I1 != 2) && d2 > 0.0f && profileActivity.X != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i7);
                    kVar4 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                    float f18 = kVar4.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0.0f;
                    kVar5 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                    float A = com.google.android.recaptcha.internal.a.A(kVar5.getHeight(), f18, f14, profileActivity.k4() + f18);
                    int measuredWidth = getMeasuredWidth();
                    float L3 = profileActivity.L3();
                    k0 k0Var = profileActivity.X;
                    float[][] fArr = bi.i1.a;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    canvas2 = canvas;
                    bi.i1.c(canvas2, g5Var, measuredWidth, A, L3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            Object obj = profileActivity.g5;
            if (obj != null) {
                org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.f2) obj).getActionBar();
                org.telegram.ui.ActionBar.y yVar = actionBar.E;
                View view = (View) actionBar.getParent();
                if (yVar != null && view != null) {
                    RectF rectF2 = this.N;
                    if (jh.k.c(yVar, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f11 - profileActivity.R1) * f13), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f10 = 0.0f;
        }
        if (z11) {
            canvas2.restore();
        }
        if (profileActivity.Q5 > f10) {
            float f19 = i7;
            if (f19 >= f15 || (vv0Var = profileActivity.N) == null || !vv0Var.isAttachedToWindow()) {
                return;
            }
            float y10 = (profileActivity.N.getY() + profileActivity.a.getY()) - profileActivity.U5;
            if (y10 > f19) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, profileActivity.z0);
                Paint paint3 = this.M;
                paint3.setColor(w02);
                canvas2.drawRect(0.0f, f19, getMeasuredWidth(), Math.min(f15, y10), paint3);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i7) {
        if (i7 != this.a) {
            this.a = i7;
            this.b.setColor(i7);
            invalidate();
            if (this.c) {
                return;
            }
            this.P.b1 = this.a;
        }
    }
}
