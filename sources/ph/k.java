package ph;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.zh;
import org.telegram.ui.Components.zt;
import org.telegram.ui.gs0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class k extends FrameLayout {
    public k01 A0;
    public final LinearGradient B;
    public k01 B0;
    public final Matrix C;
    public Path C0;
    public Bitmap D;
    public Paint D0;
    public final TextPaint E;
    public Path E0;
    public final Paint F;
    public float[] F0;
    public final FrameLayout G;
    public final Path G0;
    public final qv0 H;
    public boolean H0;
    public final i3 I;
    public int I0;
    public zh J;
    public final org.telegram.ui.Components.z5 J0;
    public int K;
    public Paint K0;
    public final org.telegram.ui.Components.ba L;
    public RadialGradient L0;
    public final org.telegram.ui.Components.fa M;
    public Paint M0;
    public final org.telegram.ui.Components.fa N;
    public RadialGradient N0;
    public final org.telegram.ui.Components.fa O;
    public Matrix O0;
    public final org.telegram.ui.Components.fa P;
    public org.telegram.ui.Components.fa Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public final e W;
    public org.telegram.ui.ActionBar.f6 a;
    public Utilities.CallbackVoidReturn a0;
    public final FrameLayout b;
    public boolean b0;
    public final ng.i c;
    public final rc c0;
    public final ng.i d;
    public ObjectAnimator d0;
    public final Paint e;
    public ng.a e0;
    public final f f;
    public pg.b f0;
    public Utilities.Callback g0;
    public final Drawable h;
    public Utilities.Callback h0;
    public ObjectAnimator i0;
    public boolean j0;
    public final e k0;
    public float l0;
    public boolean m0;
    public final nq n;
    public ValueAnimator n0;
    public Bitmap o0;
    public BitmapShader p0;
    public Matrix q0;
    public final h r;
    public Paint r0;
    public final FrameLayout s;
    public final org.telegram.ui.Components.z5 s0;
    public int t0;
    public float u0;
    public final org.telegram.ui.Components.k6 v;
    public boolean v0;
    public int w;
    public final RectF w0;
    public long x;
    public final RectF x0;
    public final Paint y;
    public final RectF y0;
    public boolean z0;

    public k(Context context, FrameLayout frameLayout, qv0 qv0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        ng.i iVar = new ng.i();
        this.c = iVar;
        ng.i iVar2 = new ng.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.B = linearGradient;
        this.C = new Matrix();
        this.E = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.F = paint3;
        this.K = -4;
        this.R = UserConfig.selectedAccount;
        this.W = new e(this, 0);
        this.c0 = new rc(this, 1.0f, 3.0f);
        this.k0 = new e(this, 1);
        nr nrVar = nr.h;
        this.s0 = new org.telegram.ui.Components.z5(this, 0L, 300L, nrVar);
        this.v0 = false;
        this.w0 = new RectF();
        this.x0 = new RectF();
        this.y0 = new RectF();
        this.G0 = new Path();
        this.J0 = new org.telegram.ui.Components.z5(this, 500L, nrVar);
        this.a = f6Var;
        this.G = frameLayout;
        this.H = qv0Var;
        this.b = frameLayout2;
        this.L = baVar;
        this.O = new org.telegram.ui.Components.fa(baVar, this, 0, !g());
        this.P = new org.telegram.ui.Components.fa(baVar, this, 8, false);
        this.N = new org.telegram.ui.Components.fa(baVar, this, 9, false);
        iVar.j = true;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        iVar.a(new y10(f6Var, i10, 0.0f, 1));
        iVar.g.setColor(0);
        iVar.invalidateSelf();
        iVar2.j = true;
        iVar2.a(new y10(f6Var, i10, 0.0f, 2));
        iVar2.g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        this.I = new i3(frameLayout, false, new org.telegram.ui.web.y0(this, 3));
        f fVar = new f(this, context, qv0Var, getEditTextStyle(), new nh.b(), f6Var, baVar);
        this.f = fVar;
        fVar.P = true;
        fVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.h3());
        fVar.setFocusable(true);
        fVar.setFocusableInTouchMode(true);
        fVar.getEditText().hintLayoutYFix = true;
        fVar.getEditText().drawHint = new dg.r1(this, 26);
        fVar.getEditText().setSupportRtlHint(true);
        this.M = new org.telegram.ui.Components.fa(baVar, fVar.getEditText(), g() ? 1 : 2, false);
        fVar.getEditText().setHintColor(-1);
        fVar.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        fVar.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z4 = this instanceof gs0;
        if (z4) {
            fVar.getEditText().setGravity(48);
        }
        fVar.getEmojiButton().setAlpha(0.0f);
        fVar.getEmojiButton().setTranslationY(AndroidUtilities.dp(z4 ? 1.0f : -1.0f));
        fVar.setTranslationY(AndroidUtilities.dp(z4 ? 1.0f : -1.0f));
        fVar.getEditText().addTextChangedListener(new g(this));
        fVar.getEditText().setLinkTextColor(-1);
        addView(fVar, k7.b6.d(-1, -2.0f, (z4 ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        h hVar = new h(context);
        this.r = hVar;
        k7.d6.b(hVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.SRC_IN));
        nq nqVar = new nq(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, f6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.n = nqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        nqVar.h = dp;
        nqVar.n = dp2;
        hVar.setImageDrawable(nqVar);
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.Done));
        hVar.setAlpha(0.0f);
        hVar.setVisibility(8);
        hVar.setOnClickListener(new oh.n(this, 6));
        addView(hVar, k7.b6.d(44, 44.0f, (z4 ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.v = k6Var;
        k6Var.setGravity(17);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTextColor(-1);
        k6Var.b(0.4f, 320L, nrVar);
        k6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        frameLayout3.addView(k6Var, k7.b6.e(52, 16, (z4 ? 48 : 80) | 5));
        addView(frameLayout3, k7.b6.d(52, 16.0f, (z4 ? 48 : 80) | 5, 0.0f, z4 ? 50 : 0, 0.0f, z4 ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return AndroidUtilities.navigationBarHeight;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z4);

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f.clearFocus();
    }

    public abstract void d(boolean z4);

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0220, code lost:
    
        if ((r2 <= 0.0f) != (r11 <= 0.0f)) goto L65;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f10;
        k kVar;
        RectF rectF;
        float f11;
        float f12;
        float f13;
        RectF rectF2;
        org.telegram.ui.Components.fa faVar;
        org.telegram.ui.Components.fa faVar2;
        float f14;
        float f15;
        Paint paint;
        RectF rectF3;
        char c3;
        char c10;
        float f16;
        int min;
        Canvas canvas2 = canvas;
        if (this.v0) {
            return;
        }
        f fVar = this.f;
        int height = fVar.getHeight();
        int dp = this.H0 ? AndroidUtilities.dp(44.0f) : this.m0 ? Math.max(AndroidUtilities.dp(44.0f), height) : Math.min(AndroidUtilities.dp(82.0f), height);
        if (!this.H0 && this.z0) {
            dp += AndroidUtilities.dp(50.0f);
        }
        float f17 = dp;
        int d = (int) this.s0.d(f17, false);
        if (d != this.t0) {
            r(d);
            Utilities.Callback callback = this.g0;
            if (callback != null) {
                callback.run(Integer.valueOf(d));
            }
            this.t0 = dp;
        }
        y();
        int dp2 = AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        boolean z4 = this instanceof gs0;
        RectF rectF4 = this.y0;
        RectF rectF5 = this.x0;
        if (z4) {
            if (!this.H0) {
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(-1.0f), AndroidUtilities.dpf2(1.0f), this.l0);
                vt editText = fVar.getEditText();
                this.u0 = lerp;
                editText.setTranslationY(lerp);
            }
            float f18 = dp2;
            float f19 = dp3;
            rectF5.set(f18, f19, getWidth() - dp2, dp3 + d);
            rectF4.set(f18, f19, getWidth() - dp2, AndroidUtilities.dp(24.0f) + r4);
            f10 = 82.0f;
        } else {
            f10 = 82.0f;
            float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(-1.0f), this.l0) + f17) - d;
            if (Math.abs(this.u0 - lerp2) >= 1.0f && !this.H0) {
                vt editText2 = fVar.getEditText();
                this.u0 = lerp2;
                editText2.setTranslationY(lerp2);
            }
            rectF5.set(dp2, (getHeight() - dp3) - d, getWidth() - dp2, getHeight() - dp3);
            rectF4.set(0.0f, (getHeight() - d) - AndroidUtilities.dp(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float a2 = this.c0.a(0.018f);
        canvas2.scale(a2, a2, rectF5.centerX(), rectF5.centerY());
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(21.0f), 0, this.l0 * 0.0f);
        ng.a aVar = this.e0;
        if (aVar != null) {
            if (this.f0 == null) {
                pg.b c11 = aVar.c(this, null, false);
                c11.n(rg.b.i(this.a));
                c11.o(AndroidUtilities.dp(5.0f));
                c11.p(AndroidUtilities.dp(22.0f));
                this.f0 = c11;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF5.round(rect);
            rect.inset(-AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), this.l0), -AndroidUtilities.dp(5.0f));
            this.f0.setBounds(rect);
            this.f0.draw(canvas2);
            kVar = this;
            rectF = rectF5;
            f11 = lerp3;
            f12 = 50.0f;
            f13 = 21.0f;
        } else {
            boolean g10 = g();
            Paint paint2 = this.e;
            if (g10) {
                f12 = 50.0f;
                f13 = 21.0f;
                h(this.O, canvas, rectF5, lerp3, false, 0.0f, 0.0f, true);
                kVar = this;
                canvas2 = canvas;
                rectF = rectF5;
                f11 = lerp3;
                paint2.setAlpha(AndroidUtilities.lerp(38, 64, kVar.l0));
                canvas2.drawRoundRect(rectF, f11, f11, paint2);
            } else {
                kVar = this;
                rectF = rectF5;
                f11 = lerp3;
                f12 = 50.0f;
                f13 = 21.0f;
                Paint[] d10 = kVar.O.d();
                if (d10[1] == null) {
                    paint2.setAlpha(128);
                    canvas2.drawRoundRect(rectF, f11, f11, paint2);
                } else {
                    Paint paint3 = d10[0];
                    if (paint3 != null) {
                        canvas2.drawRoundRect(rectF, f11, f11, paint3);
                    }
                    Paint paint4 = d10[1];
                    if (paint4 != null) {
                        canvas2.drawRoundRect(rectF, f11, f11, paint4);
                    }
                    paint2.setAlpha(51);
                    canvas2.drawRoundRect(rectF, f11, f11, paint2);
                }
            }
        }
        org.telegram.ui.Components.z5 z5Var = kVar.J0;
        float f20 = z5Var.c;
        float e = z5Var.e(kVar.H0);
        if (Math.abs(f20 - e) <= 0.001f) {
        }
        kVar.n();
        if (e > 0.0f) {
            canvas2.saveLayerAlpha(rectF, 255, 31);
        }
        if (!kVar.z0 || (faVar = kVar.P) == null || (faVar2 = kVar.N) == null) {
            rectF2 = rectF;
        } else {
            if (kVar.H0) {
                if (kVar.m0) {
                    f16 = rectF.bottom;
                    min = Math.max(AndroidUtilities.dp(46.0f), fVar.getHeight());
                } else {
                    f16 = rectF.bottom;
                    min = Math.min(AndroidUtilities.dp(f10), fVar.getHeight());
                }
                float f21 = f16 - min;
                f14 = f21 - AndroidUtilities.dp(f12);
                f15 = 1.0f - z5Var.c;
            } else {
                f14 = rectF.top;
                f15 = 1.0f;
            }
            float f22 = f14;
            Paint c12 = faVar.c(f15);
            Paint c13 = faVar2.c(f15);
            RectF rectF6 = AndroidUtilities.rectTmp;
            rectF6.set(rectF.left + AndroidUtilities.dp(10.0f), f22 + AndroidUtilities.dp(10.0f), rectF.right - AndroidUtilities.dp(10.0f), f22 + AndroidUtilities.dp(52.0f));
            if (c12 != null) {
                canvas2.drawRoundRect(rectF6, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), c12);
            }
            if (c13 != null) {
                paint = c13;
                rectF3 = rectF6;
                rectF2 = rectF;
                c3 = 1;
                c10 = 3;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas2 = canvas;
            } else {
                rectF2 = rectF;
                paint = c13;
                rectF3 = rectF6;
                c3 = 1;
                c10 = 3;
            }
            Path path = kVar.C0;
            if (path == null) {
                kVar.C0 = new Path();
            } else {
                path.rewind();
            }
            float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(f13), 0, kVar.l0);
            Path path2 = kVar.C0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, lerp4, lerp4, direction);
            canvas2.clipPath(kVar.C0);
            k01 k01Var = kVar.A0;
            if (k01Var != null) {
                k01Var.p = (int) (rectF2.width() - AndroidUtilities.dp(40.0f));
                k01Var.c(rectF2.left + AndroidUtilities.dp(20.0f), f22 + AndroidUtilities.dp(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = kVar.E0;
            if (path3 == null) {
                kVar.E0 = new Path();
                float[] fArr = new float[8];
                kVar.F0 = fArr;
                float dp4 = AndroidUtilities.dp(5.0f);
                fArr[c3] = dp4;
                fArr[0] = dp4;
                float[] fArr2 = kVar.F0;
                fArr2[c10] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                float dp5 = AndroidUtilities.dp(5.0f);
                fArr2[7] = dp5;
                fArr2[6] = dp5;
            } else {
                path3.rewind();
            }
            float f23 = rectF3.left;
            rectF3.set(f23, rectF3.top, AndroidUtilities.dp(3.0f) + f23, rectF3.bottom);
            kVar.E0.addRoundRect(rectF3, kVar.F0, direction);
            if (kVar.D0 == null) {
                Paint paint5 = new Paint();
                kVar.D0 = paint5;
                paint5.setColor(-1);
            }
            kVar.D0.setAlpha((int) (f15 * 255.0f));
            canvas2.drawPath(kVar.E0, kVar.D0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            k01 k01Var2 = kVar.B0;
            if (k01Var2 != null) {
                k01Var2.p = (int) (rectF2.width() - AndroidUtilities.dp(40.0f));
                k01Var2.c(rectF2.left + AndroidUtilities.dp(20.0f), f22 + AndroidUtilities.dp(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (e > 0.0f) {
            int i10 = kVar.I0;
            float dp6 = i10 == Integer.MAX_VALUE ? rectF2.right - AndroidUtilities.dp(20.0f) : i10 == Integer.MIN_VALUE ? rectF2.left + AndroidUtilities.dp(20.0f) : i10;
            float dp7 = rectF2.bottom - AndroidUtilities.dp(20.0f);
            float max = Math.max(Math.max(k7.n6.a(rectF2.left, rectF2.top, dp6, dp7), k7.n6.a(rectF2.left, rectF2.bottom, dp6, dp7)), Math.max(k7.n6.a(rectF2.right, rectF2.top, dp6, dp7), k7.n6.a(rectF2.right, rectF2.bottom, dp6, dp7))) * e;
            if (kVar.K0 == null) {
                Paint paint6 = new Paint(1);
                kVar.K0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                kVar.L0 = radialGradient;
                kVar.K0.setShader(radialGradient);
                kVar.O0 = new Matrix();
                Paint paint7 = new Paint(1);
                kVar.M0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                kVar.N0 = radialGradient2;
                kVar.M0.setShader(radialGradient2);
            }
            kVar.O0.reset();
            kVar.O0.postTranslate(dp6, dp7);
            kVar.O0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            kVar.L0.setLocalMatrix(kVar.O0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, kVar.K0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, 255, 31);
            kVar.j(canvas2, rectF2);
            kVar.O0.reset();
            kVar.O0.postTranslate(dp6, dp7);
            kVar.O0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            kVar.N0.setLocalMatrix(kVar.O0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, kVar.M0);
            canvas2.restore();
            canvas2.restore();
            if (!(kVar instanceof t9)) {
                kVar.k(canvas2, rectF2, e);
            }
        }
        canvas2.restore();
        if (kVar.e0 == null) {
            Path path4 = kVar.G0;
            path4.rewind();
            path4.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            ng.i iVar = kVar.c;
            iVar.k = f11;
            iVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            iVar.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.b0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.y0.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) {
                int action = motionEvent.getAction();
                rc rcVar = this.c0;
                if (action != 0 || this.m0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        rcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof p) && ((p) this).L1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i10 = 0;
                while (true) {
                    int childCount = getChildCount();
                    f fVar = this.f;
                    if (i10 >= childCount) {
                        this.I.b(false);
                        fVar.getEditText().setForceCursorEnd(true);
                        fVar.getEditText().requestFocus();
                        yt ytVar = fVar.a;
                        ytVar.requestFocus();
                        AndroidUtilities.showKeyboard(ytVar);
                        fVar.getEditText().setScrollY(0);
                        rcVar.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && fVar != childAt) {
                        float x10 = childAt.getX();
                        float y10 = childAt.getY();
                        float x11 = childAt.getX() + childAt.getWidth();
                        float y11 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.w0;
                        rectF.set(x10, y10, x11, y11);
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    i10++;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float max;
        RectF rectF = this.x0;
        if (view != this.f) {
            if (!f(view)) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        if (this instanceof gs0) {
            max = 0.0f;
        } else {
            max = (1.0f - this.l0) * Math.max(0, (r0.getHeight() - AndroidUtilities.dp(82.0f)) - r0.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, max);
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        canvas.save();
        Matrix matrix = this.C;
        matrix.reset();
        matrix.postTranslate(0.0f, rectF.top - 1.0f);
        LinearGradient linearGradient = this.B;
        linearGradient.setLocalMatrix(matrix);
        float f10 = rectF.left;
        float f11 = rectF.top;
        Paint paint = this.y;
        canvas.drawRect(f10, f11, rectF.right, AndroidUtilities.dp(10.0f) + f11, paint);
        matrix.reset();
        matrix.postRotate(180.0f);
        matrix.postTranslate(0.0f, rectF.bottom);
        linearGradient.setLocalMatrix(matrix);
        canvas.drawRect(rectF.left, rectF.bottom - AndroidUtilities.dp(10.0f), rectF.right, rectF.bottom, paint);
        canvas.restore();
        canvas.restore();
        return drawChild2;
    }

    public abstract boolean e();

    public boolean f(View view) {
        return true;
    }

    public abstract boolean g();

    public RectF getBounds() {
        return this.x0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return UserConfig.getInstance(this.R).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.w;
    }

    public int getEditTextHeight() {
        return (int) this.s0.c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.J0.c;
    }

    public int getSelectionLength() {
        f fVar = this.f;
        if (fVar != null && fVar.getEditText() != null) {
            try {
                return fVar.getEditText().getSelectionEnd() - fVar.getEditText().getSelectionStart();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z4, float f11, float f12, boolean z10);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        f fVar = this.f;
        fVar.getEditText().invalidate();
        fVar.getEmojiButton().invalidate();
        zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.invalidate();
        }
        if (fVar.getEmojiView() == null || !g()) {
            return;
        }
        fVar.getEmojiView().invalidate();
    }

    public final boolean o() {
        return getCodePointCount() > getCaptionLimit();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            Bitmap bitmap = this.D;
            if (bitmap != null) {
                bitmap.recycle();
                this.D = null;
            }
            TextPaint textPaint = this.E;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            String string = LocaleController.getString(R.string.AddCaption);
            this.D = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(string)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.D).drawText(string, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.o0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.p0 = null;
        this.r0 = null;
        Bitmap bitmap2 = this.D;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.D = null;
        }
    }

    public final boolean p() {
        f fVar = this.f;
        boolean z4 = fVar.x;
        i3 i3Var = this.I;
        if (z4 && fVar.getEmojiView() != null) {
            if (i3Var.c()) {
                fVar.getEmojiView().B();
                return true;
            }
            zt ztVar = fVar.d;
            if (ztVar != null) {
                ztVar.B();
                fVar.d.t(false);
            }
            return true;
        }
        if (fVar.e) {
            fVar.k(true);
            return true;
        }
        if ((!fVar.v && !i3Var.c()) || i3Var.d) {
            return false;
        }
        fVar.d();
        fVar.k(true);
        return true;
    }

    public void setAccount(int i10) {
        this.R = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(ng.a aVar) {
        this.e0 = aVar;
    }

    public void setDialogId(long j10) {
        this.x = j10;
        zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.g0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.h0 = callback;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        this.c0.c(z4 && !this.m0);
    }

    public void setText(CharSequence charSequence) {
        this.S = true;
        this.f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.a0 = callbackVoidReturn;
    }

    public abstract void u(float f10);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.z0 = false;
            invalidate();
            return;
        }
        this.z0 = true;
        CharSequence charSequence2 = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            charSequence2 = "";
        }
        this.A0 = new k01(charSequence2, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.B0 = new k01(charSequence, 14.0f, null);
    }

    public void w() {
        this.J.getAdapter().c = false;
        this.J.getAdapter().d = false;
        this.J.getAdapter().e = false;
        this.J.getAdapter().j0 = this instanceof p;
    }

    public void x(int i10) {
        qv0 qv0Var = this.H;
        if (qv0Var != null) {
            qv0Var.S();
        }
        f fVar = this.f;
        if (fVar.e) {
            i10 = Math.max(0, fVar.getEmojiPadding() + a());
        } else if (fVar.K) {
            i10 = Math.max(0, fVar.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i10 - (qv0Var == null ? 0 : qv0Var.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof gs0)) {
            ObjectAnimator objectAnimator = this.i0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.i0.cancel();
                this.i0 = null;
            }
            this.i0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.i0.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                this.i0.setDuration(250L);
            } else {
                this.i0.setInterpolator(nr.h);
                this.i0.setDuration(640L);
            }
            this.i0.start();
        }
        this.j0 = max > AndroidUtilities.dp(20.0f);
        e eVar = this.k0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            fVar.getEditText().clearFocus();
            fVar.k(true);
        }
    }

    public void y() {
        if (this.J != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.s0.c;
            if (this.J.getY() != translationY) {
                this.J.setTranslationY(translationY);
                this.J.invalidate();
            }
        }
    }

    public void n() {
    }

    public void t() {
    }

    public void q(boolean z4) {
    }

    public void r(int i10) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i10, int i11) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}
