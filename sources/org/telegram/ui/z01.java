package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z01 extends FrameLayout {
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.r5 I;
    public final org.telegram.ui.Components.h6 J;
    public boolean K;
    public boolean L;
    public final /* synthetic */ ProfileActivity M;
    public int a;
    public final Paint b;
    public boolean c;
    public final org.telegram.ui.Components.h6 d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 n;
    public int r;
    public int s;
    public int v;
    public float w;
    public float x;
    public RadialGradient y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.M = profileActivity;
        this.b = new Paint();
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.d = new org.telegram.ui.Components.h6(this, 350L, dsVar);
        this.h = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.n = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.r5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.h6(this, 0L, 440L, dsVar);
        new org.telegram.ui.Components.h6(this, 0L, 440L, dsVar);
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.M;
        if (peerColor != null) {
            this.c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.y6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.y6.I.q());
            this.f = bgColor2;
            profileActivity.c1 = i0.a.f(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.y6.o1(0.45f, i10);
            } else {
                this.G = tp0.x0(this.e);
                this.H = org.telegram.ui.ActionBar.y6.o1(0.15f, tp0.x0(this.e));
            }
        } else {
            profileActivity.c1 = this.a;
            this.c = false;
            int i11 = org.telegram.ui.ActionBar.y6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.z0)));
                this.H = org.telegram.ui.ActionBar.y6.o1(0.35f, org.telegram.ui.ActionBar.y6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.z0)));
            } else {
                this.G = tp0.x0(org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.z0));
                this.H = org.telegram.ui.ActionBar.y6.o1(0.15f, tp0.x0(org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.z0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.r5 r5Var = this.I;
        boolean z11 = true;
        r5Var.j(j10, true);
        r5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j10 == 0 || j10 == -1)) {
            z11 = false;
        }
        this.K = z11;
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
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        di.f3 f3Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.M;
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        int i10 = (int) ((1.0f - profileActivity.K5) * (currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + profileActivity.Q1 + profileActivity.T1));
        if (i10 != 0) {
            int i11 = this.a;
            Paint paint = this.b;
            paint.setColor(i11);
            int a2 = this.h.a(this.e, false);
            int a10 = this.n.a(this.f, false);
            org.telegram.ui.Components.ci0 ci0Var = profileActivity.Z;
            if (ci0Var != null) {
                int i12 = this.H;
                boolean z10 = this.c;
                if (ci0Var.S == null || ci0Var.Q != i12 || ci0Var.R != z10) {
                    ci0Var.Q = i12;
                    ci0Var.R = z10;
                    ci0Var.g();
                }
            }
            org.telegram.ui.Components.vi0 vi0Var = profileActivity.b0;
            if (vi0Var != null) {
                vi0Var.f(this.H, this.c);
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.y;
            Paint paint2 = this.F;
            if (radialGradient == null || this.r != a2 || this.s != a10 || this.v != width) {
                this.w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                float currentActionBarHeight2 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f);
                kVar3 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                this.x = kVar3.getTranslationY() + currentActionBarHeight2;
                this.v = width;
                float f7 = width;
                float f10 = this.x;
                float f11 = this.w;
                this.s = a10;
                this.r = a2;
                RadialGradient radialGradient2 = new RadialGradient(f7, (f11 / 2.0f) + f10, f11, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint2.setShader(this.y);
            }
            float e = this.d.e(this.c) * (profileActivity.J1 == 0 ? 1.0f : profileActivity.S1);
            if (e < 1.0f) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint);
            }
            if (e > 0.0f) {
                paint2.setAlpha((int) (e * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.K) {
                boolean z11 = this.L;
                org.telegram.ui.Components.r5 r5Var = this.I;
                boolean z12 = true;
                if (!z11) {
                    if (r5Var != null) {
                        Drawable drawable = r5Var.f[0];
                        if ((drawable instanceof org.telegram.ui.Components.t5) && (f3Var = ((org.telegram.ui.Components.t5) drawable).k) != null && f3Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e10 = this.J.e(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && e10 > 0.0f && profileActivity.X != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i10);
                    kVar4 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                    float f12 = kVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
                    kVar5 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                    float B = c3.h0.B(kVar5.getHeight(), f12, 2.0f, profileActivity.d4() + f12);
                    int measuredWidth = getMeasuredWidth();
                    float G3 = profileActivity.G3();
                    k0 k0Var = profileActivity.X;
                    float[][] fArr = bi.l1.a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    bi.l1.c(canvas2, r5Var, measuredWidth, B, G3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            Object obj = profileActivity.m5;
            if (obj == null || (zVar = (actionBar = ((org.telegram.ui.ActionBar.r2) obj).getActionBar()).E) == null) {
                return;
            }
            int save = canvas2.save();
            canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
            zVar.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        if (i10 != this.a) {
            this.a = i10;
            this.b.setColor(i10);
            invalidate();
            if (this.c) {
                return;
            }
            this.M.c1 = this.a;
        }
    }
}
