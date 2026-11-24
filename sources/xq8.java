// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xq8 extends FrameLayout {
    public static final /* synthetic */ int R = 0;
    public RadialGradient E;
    public final Matrix F;
    public final Paint G;
    public int H;
    public int I;
    public final tm J;
    public final ln K;
    public boolean L;
    public boolean M;
    public final Paint N;
    public final RectF O;
    public boolean P;
    public final /* synthetic */ ProfileActivity Q;
    public int a;
    public final Paint b;
    public boolean c;
    public final ln d;
    public int e;
    public int f;
    public final km h;
    public final km n;
    public int r;
    public int s;
    public int w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.Q = profileActivity;
        this.b = new Paint();
        d53 d53Var = d53.h;
        this.d = new ln(350L, this, d53Var);
        this.h = new km(this, 350L, d53Var);
        this.n = new km(this, 350L, d53Var);
        this.F = new Matrix();
        this.G = new Paint(1);
        this.J = new tm(gm.L(20.0f), 13, this, false);
        this.K = new ln(this, 0L, 440L, d53Var);
        new ln(this, 0L, 440L, d53Var);
        this.N = new Paint();
        this.O = new RectF();
        setWillNotDraw(false);
    }

    public final void a(ec7 ec7Var, boolean z) {
        ProfileActivity profileActivity = this.Q;
        if (ec7Var != null) {
            this.c = true;
            this.e = ec7Var.c(cmb.I.o());
            int d = ec7Var.d(cmb.I.o());
            this.f = d;
            profileActivity.c1 = on2.f(0.25f, this.e, d);
            int i = ec7Var.a;
            if (i != 0) {
                this.H = i;
                this.I = cmb.p1(0.45f, i);
            } else {
                this.H = d38.z0(this.e);
                this.I = cmb.p1(0.15f, d38.z0(this.e));
            }
        } else {
            profileActivity.c1 = this.a;
            this.c = false;
            int i2 = cmb.r8;
            if (gm.B(cmb.v0(i2, profileActivity.A0)) > 0.8f) {
                this.H = -1;
                this.I = -1;
            } else {
                float B = gm.B(cmb.v0(i2, profileActivity.A0));
                ylb ylbVar = profileActivity.A0;
                if (B < 0.2f) {
                    this.H = cmb.p1(0.5f, cmb.a(0.02f, 0.25f, cmb.v0(i2, ylbVar)));
                    this.I = cmb.p1(0.35f, cmb.a(0.02f, 0.25f, cmb.v0(i2, profileActivity.A0)));
                } else {
                    this.H = d38.z0(cmb.v0(i2, ylbVar));
                    this.I = cmb.p1(0.15f, d38.z0(cmb.v0(i2, profileActivity.A0)));
                }
            }
        }
        if (!z) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j, boolean z) {
        tm tmVar = this.J;
        boolean z2 = true;
        tmVar.j(j, true);
        tmVar.k(Integer.valueOf(this.H));
        if (!this.L && (j == 0 || j == -1)) {
            z2 = false;
        }
        this.L = z2;
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
        a aVar;
        Canvas canvas2;
        float f;
        wp8 wp8Var;
        float f2;
        a aVar2;
        a aVar3;
        float f3;
        float f4;
        float f5;
        a aVar4;
        a aVar5;
        mm mmVar;
        sy4 sy4Var;
        boolean z = this.P;
        ProfileActivity profileActivity = this.Q;
        if (!z) {
            sy4Var = ((d) profileActivity).glassEngine;
            sy4Var.g();
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((d) profileActivity).actionBar;
        float f6 = currentActionBarHeight + (aVar.getOccupyStatusBar() ? gm.m : 0) + profileActivity.Q1 + profileActivity.U1;
        int i = (int) ((1.0f - profileActivity.b6) * f6);
        boolean z2 = true;
        boolean z3 = profileActivity.L5 > 0.0f && i != 0;
        if (z3) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i, (int) ((1.0f - profileActivity.L5) * 255.0f));
        }
        if (i != 0) {
            int i2 = this.a;
            Paint paint = this.b;
            paint.setColor(i2);
            int a = this.h.a(this.e, false);
            int a2 = this.n.a(this.f, false);
            qn8 qn8Var = profileActivity.a0;
            if (qn8Var != null) {
                int i3 = this.I;
                boolean z4 = this.c;
                f2 = 1.0f;
                if (qn8Var.Q == null || qn8Var.O != i3 || qn8Var.P != z4) {
                    qn8Var.O = i3;
                    qn8Var.P = z4;
                    qn8Var.g();
                }
            } else {
                f2 = 1.0f;
            }
            mt8 mt8Var = profileActivity.c0;
            if (mt8Var != null) {
                mt8Var.d(this.I, this.c);
            }
            fr8 fr8Var = profileActivity.T5;
            if (fr8Var != null) {
                int i4 = this.I;
                boolean z5 = this.c;
                if (fr8Var.i != i4 || fr8Var.j != z5) {
                    fr8Var.i = i4;
                    fr8Var.j = z5;
                    fr8Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.E;
            f = 0.0f;
            Paint paint2 = this.G;
            if (radialGradient != null && this.r == a && this.s == a2 && this.w == width) {
                f3 = 2.0f;
            } else {
                this.x = gm.L(96.0f) << 1;
                aVar2 = ((d) profileActivity).actionBar;
                float currentActionBarHeight2 = (a.getCurrentActionBarHeight() + (aVar2.getOccupyStatusBar() ? gm.m : 0)) - (gm.p * 21.0f);
                aVar3 = ((d) profileActivity).actionBar;
                this.y = aVar3.getTranslationY() + currentActionBarHeight2;
                this.w = width;
                float f7 = this.y;
                f3 = 2.0f;
                float f8 = this.x;
                this.s = a2;
                this.r = a;
                RadialGradient radialGradient2 = new RadialGradient(width, (f8 / 2.0f) + f7, f8, new int[]{a2, a}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.E = radialGradient2;
                radialGradient2.setLocalMatrix(this.F);
                paint2.setShader(this.E);
            }
            float d = this.d.d(this.c) * (profileActivity.J1 == 0 ? f2 : profileActivity.T1);
            if (d < f2) {
                f4 = 255.0f;
                f5 = f3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i, paint);
            } else {
                f4 = 255.0f;
                f5 = f3;
            }
            if (d > 0.0f) {
                paint2.setAlpha((int) (d * f4));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.L && !this.P) {
                boolean z6 = this.M;
                tm tmVar = this.J;
                if (!z6) {
                    if (tmVar != null) {
                        Drawable drawable = tmVar.f[0];
                        if ((drawable instanceof vm) && (mmVar = ((vm) drawable).k) != null && mmVar.C()) {
                            this.M = true;
                        }
                    }
                    z2 = false;
                }
                float d2 = this.K.d(z2);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && d2 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i);
                    aVar4 = ((d) profileActivity).actionBar;
                    float f9 = aVar4.getOccupyStatusBar() ? gm.m : 0.0f;
                    aVar5 = ((d) profileActivity).actionBar;
                    float z7 = aq1.z(aVar5.getHeight(), f9, f5, profileActivity.f2() + f9);
                    int measuredWidth = getMeasuredWidth();
                    float E1 = profileActivity.E1();
                    ne6 ne6Var = profileActivity.Y;
                    float[][] fArr = bpa.a;
                    RectF rectF = gm.P;
                    rectF.set(ne6Var.getX(), ne6Var.getY(), (ne6Var.getScaleX() * ne6Var.getWidth()) + ne6Var.getX(), (ne6Var.getScaleY() * ne6Var.getHeight()) + ne6Var.getY());
                    canvas2 = canvas;
                    bpa.c(canvas2, tmVar, measuredWidth, z7, E1, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            Object obj = profileActivity.r5;
            if (obj != null) {
                a actionBar = ((d) obj).getActionBar();
                r6 r6Var = actionBar.F;
                View view = (View) actionBar.getParent();
                if (r6Var != null && view != null) {
                    RectF rectF2 = this.O;
                    if (zgc.c(r6Var, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, r6Var.getMeasuredWidth(), r6Var.getMeasuredHeight(), (int) ((f2 - profileActivity.T1) * f4), 31);
                        r6Var.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f = 0.0f;
        }
        if (z3) {
            canvas2.restore();
        }
        if (profileActivity.b6 > f) {
            float f10 = i;
            if (f10 >= f6 || (wp8Var = profileActivity.O) == null || !wp8Var.isAttachedToWindow()) {
                return;
            }
            float y = (profileActivity.O.getY() + profileActivity.a.getY()) - profileActivity.f6;
            if (y > f10) {
                int v0 = cmb.v0(cmb.Z6, profileActivity.A0);
                Paint paint3 = this.N;
                paint3.setColor(v0);
                canvas.drawRect(0.0f, f10, getMeasuredWidth(), Math.min(f6, y), paint3);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (i != this.a) {
            this.a = i;
            this.b.setColor(i);
            invalidate();
            if (this.c) {
                return;
            }
            this.Q.c1 = this.a;
        }
    }
}
