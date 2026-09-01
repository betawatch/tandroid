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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class v01 extends FrameLayout {
    public final Matrix B;
    public final Paint C;
    public int D;
    public int E;
    public final org.telegram.ui.Components.j5 F;
    public final org.telegram.ui.Components.z5 G;
    public boolean H;
    public boolean I;
    public final Rect J;
    public final /* synthetic */ ProfileActivity K;
    public int a;
    public final Paint b;
    public boolean c;
    public final org.telegram.ui.Components.z5 d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.c5 h;
    public final org.telegram.ui.Components.c5 n;
    public int r;
    public int s;
    public int v;
    public float w;
    public float x;
    public RadialGradient y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.K = profileActivity;
        this.b = new Paint();
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.d = new org.telegram.ui.Components.z5(this, 350L, prVar);
        this.h = new org.telegram.ui.Components.c5(this, 350L, prVar);
        this.n = new org.telegram.ui.Components.c5(this, 350L, prVar);
        this.B = new Matrix();
        this.C = new Paint(1);
        this.F = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.G = new org.telegram.ui.Components.z5(this, 0L, 440L, prVar);
        new org.telegram.ui.Components.z5(this, 0L, 440L, prVar);
        this.J = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z4) {
        ProfileActivity profileActivity = this.K;
        if (peerColor != null) {
            this.c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.k6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
            this.f = bgColor2;
            profileActivity.Z0 = i0.a.d(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.D = i10;
                this.E = org.telegram.ui.ActionBar.k6.l1(0.45f, i10);
            } else {
                this.D = ip0.u0(this.e);
                this.E = org.telegram.ui.ActionBar.k6.l1(0.15f, ip0.u0(this.e));
            }
        } else {
            profileActivity.Z0 = this.a;
            this.c = false;
            int i11 = org.telegram.ui.ActionBar.k6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.w0)) > 0.8f) {
                this.D = -1;
                this.E = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.w0)) < 0.2f) {
                this.D = org.telegram.ui.ActionBar.k6.l1(0.5f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.w0)));
                this.E = org.telegram.ui.ActionBar.k6.l1(0.35f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.w0)));
            } else {
                this.D = ip0.u0(org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.w0));
                this.E = org.telegram.ui.ActionBar.k6.l1(0.15f, ip0.u0(org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.w0)));
            }
        }
        if (!z4) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z4) {
        org.telegram.ui.Components.j5 j5Var = this.F;
        boolean z10 = true;
        j5Var.j(j10, true);
        j5Var.k(Integer.valueOf(this.D));
        if (!this.H && (j10 == 0 || j10 == -1)) {
            z10 = false;
        }
        this.H = z10;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        Paint paint2;
        float f10;
        Object obj;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        oh.z2 z2Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.K;
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        float f11 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + profileActivity.N1 + profileActivity.Q1;
        int i10 = (int) ((1.0f - profileActivity.B5) * f11);
        Paint paint3 = this.b;
        if (i10 != 0) {
            paint3.setColor(this.a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.n.a(this.f, false);
            org.telegram.ui.Components.lh0 lh0Var = profileActivity.X;
            if (lh0Var != null) {
                int i11 = this.E;
                boolean z4 = this.c;
                if (lh0Var.P == null || lh0Var.N != i11 || lh0Var.O != z4) {
                    lh0Var.N = i11;
                    lh0Var.O = z4;
                    lh0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.y;
            Paint paint4 = this.C;
            if (radialGradient == null || this.r != a2 || this.s != a10 || this.v != width) {
                this.w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                float currentActionBarHeight2 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f);
                kVar3 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                this.x = kVar3.getTranslationY() + currentActionBarHeight2;
                this.v = width;
                float f12 = this.x;
                float f13 = this.w;
                this.s = a10;
                this.r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f13 / 2.0f) + f12, f13, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y = radialGradient2;
                radialGradient2.setLocalMatrix(this.B);
                paint4.setShader(this.y);
            }
            float e6 = this.d.e(this.c) * (profileActivity.G1 == 0 ? 1.0f : profileActivity.P1);
            if (e6 < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint2);
            } else {
                paint2 = paint3;
            }
            if (e6 > 0.0f) {
                paint4.setAlpha((int) (e6 * 255.0f));
                paint = paint2;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint4);
            } else {
                canvas2 = canvas;
                paint = paint2;
            }
            if (this.H) {
                boolean z10 = this.I;
                org.telegram.ui.Components.j5 j5Var = this.F;
                boolean z11 = true;
                if (!z10) {
                    if (j5Var != null) {
                        Drawable drawable = j5Var.f[0];
                        if ((drawable instanceof org.telegram.ui.Components.l5) && (z2Var = ((org.telegram.ui.Components.l5) drawable).k) != null && z2Var.hasImageLoaded()) {
                            this.I = true;
                        }
                    }
                    z11 = false;
                }
                float e10 = this.G.e(z11);
                if ((!profileActivity.D1 || profileActivity.G1 != 2) && e10 > 0.0f && profileActivity.V != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i10);
                    kVar4 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    float f14 = kVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
                    kVar5 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    float x10 = e2.c.x(kVar5.getHeight(), f14, 2.0f, profileActivity.U3() + f14);
                    int measuredWidth = getMeasuredWidth();
                    float y32 = profileActivity.y3();
                    l0 l0Var = profileActivity.V;
                    float[][] fArr = mh.w0.a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(l0Var.getX(), l0Var.getY(), (l0Var.getScaleX() * l0Var.getWidth()) + l0Var.getX(), (l0Var.getScaleY() * l0Var.getHeight()) + l0Var.getY());
                    mh.w0.c(canvas2, j5Var, measuredWidth, x10, y32, rectF, 1.0f);
                    canvas2.restore();
                    obj = profileActivity.d5;
                    if (obj != null && (zVar = (actionBar = ((org.telegram.ui.ActionBar.p2) obj).getActionBar()).B) != null) {
                        int save = canvas2.save();
                        canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f10 - profileActivity.P1) * 255.0f), 31);
                        zVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            obj = profileActivity.d5;
            if (obj != null) {
                int save2 = canvas2.save();
                canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f10 - profileActivity.P1) * 255.0f), 31);
                zVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i10 == f11 || profileActivity.D1) {
            return;
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, profileActivity.w0));
        this.J.set(0, i10, getMeasuredWidth(), (int) f11);
        profileActivity.j5.J(canvas2, getY(), this.J, paint, true);
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
            this.K.Z0 = this.a;
        }
    }
}
