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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xw0 extends FrameLayout {
    public RadialGradient E;
    public final Matrix F;
    public final Paint G;
    public int H;
    public int I;
    public final org.telegram.ui.Components.m5 J;
    public final org.telegram.ui.Components.c6 K;
    public boolean L;
    public boolean M;
    public final Paint N;
    public final RectF O;
    public boolean P;
    public final /* synthetic */ ProfileActivity Q;
    public int a;
    public final Paint b;
    public boolean c;
    public final org.telegram.ui.Components.c6 d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 n;
    public int r;
    public int s;
    public int w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.Q = profileActivity;
        this.b = new Paint();
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.d = new org.telegram.ui.Components.c6(this, 350L, krVar);
        this.h = new org.telegram.ui.Components.f5(this, 350L, krVar);
        this.n = new org.telegram.ui.Components.f5(this, 350L, krVar);
        this.F = new Matrix();
        this.G = new Paint(1);
        this.J = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.K = new org.telegram.ui.Components.c6(this, 0L, 440L, krVar);
        new org.telegram.ui.Components.c6(this, 0L, 440L, krVar);
        this.N = new Paint();
        this.O = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.bp bpVar, boolean z10) {
        ProfileActivity profileActivity = this.Q;
        if (bpVar != null) {
            this.c = true;
            this.e = bpVar.c(org.telegram.ui.ActionBar.n6.I.q());
            int d = bpVar.d(org.telegram.ui.ActionBar.n6.I.q());
            this.f = d;
            profileActivity.c1 = i0.a.f(0.25f, this.e, d);
            int i7 = bpVar.a;
            if (i7 != 0) {
                this.H = i7;
                this.I = org.telegram.ui.ActionBar.n6.r1(0.45f, i7);
            } else {
                this.H = jm0.B0(this.e);
                this.I = org.telegram.ui.ActionBar.n6.r1(0.15f, jm0.B0(this.e));
            }
        } else {
            profileActivity.c1 = this.a;
            this.c = false;
            int i10 = org.telegram.ui.ActionBar.n6.s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)) > 0.8f) {
                this.H = -1;
                this.I = -1;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)) < 0.2f) {
                this.H = org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)));
                this.I = org.telegram.ui.ActionBar.n6.r1(0.35f, org.telegram.ui.ActionBar.n6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)));
            } else {
                this.H = jm0.B0(org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0));
                this.I = org.telegram.ui.ActionBar.n6.r1(0.15f, jm0.B0(org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z10) {
        org.telegram.ui.Components.m5 m5Var = this.J;
        boolean z11 = true;
        m5Var.j(j3, true);
        m5Var.k(Integer.valueOf(this.H));
        if (!this.L && (j3 == 0 || j3 == -1)) {
            z11 = false;
        }
        this.L = z11;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J.b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        float f10;
        uv0 uv0Var;
        float f11;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f12;
        float f13;
        float f14;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        fi.s2 s2Var;
        ri.q qVar;
        boolean z10 = this.P;
        ProfileActivity profileActivity = this.Q;
        if (!z10) {
            qVar = ((org.telegram.ui.ActionBar.g2) profileActivity).glassEngine;
            qVar.g();
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
        float f15 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) + profileActivity.Q1 + profileActivity.U1;
        int i7 = (int) ((1.0f - profileActivity.W5) * f15);
        boolean z11 = true;
        boolean z12 = profileActivity.G5 > 0.0f && i7 != 0;
        if (z12) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i7, (int) ((1.0f - profileActivity.G5) * 255.0f));
        }
        if (i7 != 0) {
            int i10 = this.a;
            Paint paint = this.b;
            paint.setColor(i10);
            int a10 = this.h.a(this.e, false);
            int a11 = this.n.a(this.f, false);
            org.telegram.ui.Components.sf0 sf0Var = profileActivity.a0;
            if (sf0Var != null) {
                int i11 = this.I;
                boolean z13 = this.c;
                f11 = 1.0f;
                if (sf0Var.Q == null || sf0Var.O != i11 || sf0Var.P != z13) {
                    sf0Var.O = i11;
                    sf0Var.P = z13;
                    sf0Var.g();
                }
            } else {
                f11 = 1.0f;
            }
            org.telegram.ui.Components.ng0 ng0Var = profileActivity.c0;
            if (ng0Var != null) {
                ng0Var.d(this.I, this.c);
            }
            org.telegram.ui.Components.wf0 wf0Var = profileActivity.O5;
            if (wf0Var != null) {
                int i12 = this.I;
                boolean z14 = this.c;
                if (wf0Var.i != i12 || wf0Var.j != z14) {
                    wf0Var.i = i12;
                    wf0Var.j = z14;
                    wf0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.E;
            f10 = 0.0f;
            Paint paint2 = this.G;
            if (radialGradient != null && this.r == a10 && this.s == a11 && this.w == width) {
                f12 = 2.0f;
            } else {
                this.x = org.telegram.messenger.g0.L(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                float currentActionBarHeight2 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (kVar2.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f);
                kVar3 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                this.y = kVar3.getTranslationY() + currentActionBarHeight2;
                this.w = width;
                float f16 = this.y;
                f12 = 2.0f;
                float f17 = this.x;
                this.s = a11;
                this.r = a10;
                RadialGradient radialGradient2 = new RadialGradient(width, (f17 / 2.0f) + f16, f17, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.E = radialGradient2;
                radialGradient2.setLocalMatrix(this.F);
                paint2.setShader(this.E);
            }
            float d = this.d.d(this.c) * (profileActivity.J1 == 0 ? f11 : profileActivity.T1);
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
            if (this.L && !this.P) {
                boolean z15 = this.M;
                org.telegram.ui.Components.m5 m5Var = this.J;
                if (!z15) {
                    if (m5Var != null) {
                        Drawable drawable = m5Var.f[0];
                        if ((drawable instanceof org.telegram.ui.Components.o5) && (s2Var = ((org.telegram.ui.Components.o5) drawable).k) != null && s2Var.K()) {
                            this.M = true;
                        }
                    }
                    z11 = false;
                }
                float d2 = this.K.d(z11);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && d2 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i7);
                    kVar4 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                    float f18 = kVar4.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0.0f;
                    kVar5 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                    float A = com.google.android.gms.internal.vision.e2.A(kVar5.getHeight(), f18, f14, profileActivity.k4() + f18);
                    int measuredWidth = getMeasuredWidth();
                    float L3 = profileActivity.L3();
                    k0 k0Var = profileActivity.Y;
                    float[][] fArr = di.v0.a;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    canvas2 = canvas;
                    di.v0.c(canvas2, m5Var, measuredWidth, A, L3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            Object obj = profileActivity.m5;
            if (obj != null) {
                org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.g2) obj).getActionBar();
                org.telegram.ui.ActionBar.y yVar = actionBar.F;
                View view = (View) actionBar.getParent();
                if (yVar != null && view != null) {
                    RectF rectF2 = this.O;
                    if (jh.k.c(yVar, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f11 - profileActivity.T1) * f13), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f10 = 0.0f;
        }
        if (z12) {
            canvas2.restore();
        }
        if (profileActivity.W5 > f10) {
            float f19 = i7;
            if (f19 >= f15 || (uv0Var = profileActivity.O) == null || !uv0Var.isAttachedToWindow()) {
                return;
            }
            float y10 = (profileActivity.O.getY() + profileActivity.a.getY()) - profileActivity.a6;
            if (y10 > f19) {
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, profileActivity.A0);
                Paint paint3 = this.N;
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
            this.Q.c1 = this.a;
        }
    }
}
