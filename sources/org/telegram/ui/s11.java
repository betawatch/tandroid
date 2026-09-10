package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s11 extends FrameLayout {
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.n5 I;
    public final org.telegram.ui.Components.d6 J;
    public boolean K;
    public boolean L;
    public final Rect M;
    public final /* synthetic */ ProfileActivity N;
    public int a;
    public final Paint b;
    public boolean c;
    public final org.telegram.ui.Components.d6 d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 n;
    public int r;
    public int s;
    public int v;
    public float w;
    public float x;
    public RadialGradient y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.b = new Paint();
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.d = new org.telegram.ui.Components.d6(this, 350L, wrVar);
        this.h = new org.telegram.ui.Components.g5(this, 350L, wrVar);
        this.n = new org.telegram.ui.Components.g5(this, 350L, wrVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.d6(this, 0L, 440L, wrVar);
        new org.telegram.ui.Components.d6(this, 0L, 440L, wrVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.j6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
            this.f = bgColor2;
            profileActivity.c1 = i0.a.d(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.j6.l1(0.45f, i10);
            } else {
                this.G = bq0.w0(this.e);
                this.H = org.telegram.ui.ActionBar.j6.l1(0.15f, bq0.w0(this.e));
            }
        } else {
            profileActivity.c1 = this.a;
            this.c = false;
            int i11 = org.telegram.ui.ActionBar.j6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.z0)));
                this.H = org.telegram.ui.ActionBar.j6.l1(0.35f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.z0)));
            } else {
                this.G = bq0.w0(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.z0));
                this.H = org.telegram.ui.ActionBar.j6.l1(0.15f, bq0.w0(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.z0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z10) {
        org.telegram.ui.Components.n5 n5Var = this.I;
        boolean z11 = true;
        n5Var.j(j3, true);
        n5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j3 == 0 || j3 == -1)) {
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
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        Paint paint2;
        float f7;
        Object obj;
        org.telegram.ui.ActionBar.l actionBar;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        gg.h1 h1Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.N;
        lVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        float f10 = currentActionBarHeight + (lVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + profileActivity.Q1 + profileActivity.T1;
        int i10 = (int) ((1.0f - profileActivity.E5) * f10);
        Paint paint3 = this.b;
        if (i10 != 0) {
            paint3.setColor(this.a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.n.a(this.f, false);
            org.telegram.ui.Components.nh0 nh0Var = profileActivity.a0;
            if (nh0Var != null) {
                int i11 = this.H;
                boolean z10 = this.c;
                if (nh0Var.S == null || nh0Var.Q != i11 || nh0Var.R != z10) {
                    nh0Var.Q = i11;
                    nh0Var.R = z10;
                    nh0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.r != a2 || this.s != a10 || this.v != width) {
                this.w = AndroidUtilities.dp(96.0f) * 2;
                lVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                float currentActionBarHeight2 = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (lVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f);
                lVar3 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                this.x = lVar3.getTranslationY() + currentActionBarHeight2;
                this.v = width;
                float f11 = this.x;
                float f12 = this.w;
                this.s = a10;
                this.r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f12 / 2.0f) + f11, f12, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.y);
            }
            float e = this.d.e(this.c) * (profileActivity.J1 == 0 ? 1.0f : profileActivity.S1);
            if (e < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint2);
            } else {
                paint2 = paint3;
            }
            if (e > 0.0f) {
                paint4.setAlpha((int) (e * 255.0f));
                paint = paint2;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint4);
            } else {
                canvas2 = canvas;
                paint = paint2;
            }
            if (this.K) {
                boolean z11 = this.L;
                org.telegram.ui.Components.n5 n5Var = this.I;
                boolean z12 = true;
                if (!z11) {
                    if (n5Var != null) {
                        Drawable drawable = n5Var.f[0];
                        if ((drawable instanceof org.telegram.ui.Components.p5) && (h1Var = ((org.telegram.ui.Components.p5) drawable).k) != null && h1Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e7 = this.J.e(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && e7 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i10);
                    lVar4 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    float f13 = lVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
                    lVar5 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    float A = com.google.android.gms.internal.vision.e2.A(lVar5.getHeight(), f13, 2.0f, profileActivity.U3() + f13);
                    int measuredWidth = getMeasuredWidth();
                    float y3 = profileActivity.y3();
                    k0 k0Var = profileActivity.Y;
                    float[][] fArr = xh.j0.a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f7 = 1.0f;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    xh.j0.c(canvas2, n5Var, measuredWidth, A, y3, rectF, 1.0f);
                    canvas2.restore();
                    obj = profileActivity.g5;
                    if (obj != null && (zVar = (actionBar = ((org.telegram.ui.ActionBar.p2) obj).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f7 - profileActivity.S1) * 255.0f), 31);
                        zVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f7 = 1.0f;
            obj = profileActivity.g5;
            if (obj != null) {
                int save2 = canvas2.save();
                canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f7 - profileActivity.S1) * 255.0f), 31);
                zVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i10 == f10 || profileActivity.G1) {
            return;
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.z0));
        this.M.set(0, i10, getMeasuredWidth(), (int) f10);
        profileActivity.m5.J(canvas2, getY(), this.M, paint, true);
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
            this.N.c1 = this.a;
        }
    }
}
