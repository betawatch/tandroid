package vh;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.s20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.kq0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class k extends FrameLayout {
    public final RectF A0;
    public boolean B0;
    public qz0 C0;
    public final Paint D;
    public qz0 D0;
    public final LinearGradient E;
    public Path E0;
    public final Matrix F;
    public Paint F0;
    public Bitmap G;
    public Path G0;
    public final TextPaint H;
    public float[] H0;
    public final Paint I;
    public final Path I0;
    public final FrameLayout J;
    public boolean J0;
    public final uu0 K;
    public int K0;
    public final r2 L;
    public final org.telegram.ui.Components.t5 L0;
    public oh M;
    public Paint M0;
    public int N;
    public RadialGradient N0;
    public final s9 O;
    public Paint O0;
    public final w9 P;
    public RadialGradient P0;
    public final w9 Q;
    public Matrix Q0;
    public final w9 R;
    public final w9 S;
    public w9 T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.p6 a;
    public int a0;
    public final FrameLayout b;
    public int b0;
    public final tg.i c;
    public final e c0;
    public final tg.i d;
    public boolean d0;
    public final Paint e;
    public final dc e0;
    public final f f;
    public ObjectAnimator f0;
    public tg.b g0;
    public final Drawable h;
    public vg.f h0;
    public q20 i0;
    public q20 j0;
    public ObjectAnimator k0;
    public boolean l0;
    public final e m0;
    public final eq n;
    public float n0;
    public boolean o0;
    public ValueAnimator p0;
    public Bitmap q0;
    public final h r;
    public BitmapShader r0;
    public final FrameLayout s;
    public Matrix s0;
    public Paint t0;
    public final org.telegram.ui.Components.t5 u0;
    public int v0;
    public final org.telegram.ui.Components.f6 w;
    public float w0;
    public int x;
    public boolean x0;
    public long y;
    public final RectF y0;
    public final RectF z0;

    public k(Context context, FrameLayout frameLayout, uu0 uu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var) {
        super(context);
        tg.i iVar = new tg.i();
        this.c = iVar;
        tg.i iVar2 = new tg.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.D = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = d20.s0;
        this.c0 = new e(this, 0);
        this.e0 = new dc(this, 1.0f, 3.0f);
        this.m0 = new e(this, 1);
        gr grVar = gr.h;
        this.u0 = new org.telegram.ui.Components.t5(this, 0L, 300L, grVar);
        this.x0 = false;
        this.y0 = new RectF();
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.I0 = new Path();
        this.L0 = new org.telegram.ui.Components.t5(this, 500L, grVar);
        this.a = p6Var;
        this.J = frameLayout;
        this.K = uu0Var;
        this.b = frameLayout2;
        this.O = s9Var;
        this.R = new w9(s9Var, this, 0, !g());
        this.S = new w9(s9Var, this, 8, false);
        this.Q = new w9(s9Var, this, 9, false);
        iVar.l = true;
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        iVar.a = new e10(p6Var, i10, 0.0f, 1);
        iVar.a();
        iVar.g.setColor(0);
        iVar.invalidateSelf();
        iVar2.l = true;
        iVar2.a = new e10(p6Var, i10, 0.0f, 2);
        iVar2.a();
        iVar2.g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        this.L = new r2(frameLayout, false, new ph.h1(this, 19));
        f fVar = new f(this, context, uu0Var, getEditTextStyle(), new th.b(), p6Var, s9Var);
        this.f = fVar;
        fVar.S = true;
        fVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.l3());
        fVar.setFocusable(true);
        fVar.setFocusableInTouchMode(true);
        fVar.getEditText().q0 = true;
        fVar.getEditText().s0 = new qh.d(this, 15);
        fVar.getEditText().setSupportRtlHint(true);
        this.P = new w9(s9Var, fVar.getEditText(), g() ? 1 : 2, false);
        fVar.getEditText().setHintColor(-1);
        fVar.getEditText().r(cd.L0(2131754454, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        fVar.getEditText().setTranslationX(org.telegram.messenger.i0.L(-26.0f));
        boolean z10 = this instanceof kq0;
        if (z10) {
            fVar.getEditText().setGravity(48);
        }
        fVar.getEmojiButton().setAlpha(0.0f);
        fVar.getEmojiButton().setTranslationY(org.telegram.messenger.i0.L(z10 ? 1.0f : -1.0f));
        fVar.setTranslationY(org.telegram.messenger.i0.L(z10 ? 1.0f : -1.0f));
        fVar.getEditText().addTextChangedListener(new g(this));
        fVar.getEditText().setLinkTextColor(-1);
        addView(fVar, w7.b6.d(-1, -2.0f, (z10 ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        h hVar = new h(context);
        this.r = hVar;
        w7.e6.b(hVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.U5, null, PorterDuff.Mode.SRC_IN);
        eq eqVar = new eq(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(18.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ng, p6Var)), mutate, 0, org.telegram.messenger.i0.L(1.0f));
        this.n = eqVar;
        int L = org.telegram.messenger.i0.L(36.0f);
        int L2 = org.telegram.messenger.i0.L(36.0f);
        eqVar.h = L;
        eqVar.n = L2;
        hVar.setImageDrawable(eqVar);
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(cd.L0(2131751355, null));
        hVar.setAlpha(0.0f);
        hVar.setVisibility(8);
        hVar.setOnClickListener(new rh.s(this, 17));
        addView(hVar, w7.b6.d(44, 44.0f, (z10 ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
        this.w = f6Var;
        f6Var.setGravity(17);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setTextColor(-1);
        f6Var.b(0.4f, 320L, grVar);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.i0.L(2.0f));
        frameLayout3.addView(f6Var, w7.b6.e(52, 16, (z10 ? 48 : 80) | 5));
        addView(frameLayout3, w7.b6.d(52, 16.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 50 : 0, 0.0f, z10 ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return org.telegram.messenger.i0.n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z10);

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f.clearFocus();
    }

    public abstract void d(boolean z10);

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0221, code lost:
    
        if ((r2 <= 0.0f ? r10 : 0) != (r11 <= 0.0f ? r10 : 0)) goto L65;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f7;
        k kVar;
        RectF rectF;
        float f10;
        float f11;
        float f12;
        int i10;
        int i11;
        int i12;
        RectF rectF2;
        w9 w9Var;
        w9 w9Var2;
        float f13;
        float f14;
        Paint paint;
        RectF rectF3;
        float f15;
        int min;
        Canvas canvas2 = canvas;
        if (this.x0) {
            return;
        }
        f fVar = this.f;
        int height = fVar.getHeight();
        int L = this.J0 ? org.telegram.messenger.i0.L(44.0f) : this.o0 ? Math.max(org.telegram.messenger.i0.L(44.0f), height) : Math.min(org.telegram.messenger.i0.L(82.0f), height);
        if (!this.J0 && this.B0) {
            L += org.telegram.messenger.i0.L(50.0f);
        }
        float f16 = L;
        int e = (int) this.u0.e(false, f16);
        if (e != this.v0) {
            r(e);
            q20 q20Var = this.i0;
            if (q20Var != null) {
                q20Var.a(Integer.valueOf(e));
            }
            this.v0 = L;
        }
        y();
        int L2 = org.telegram.messenger.i0.L(7.0f);
        int L3 = org.telegram.messenger.i0.L(8.0f);
        boolean z10 = this instanceof kq0;
        RectF rectF4 = this.A0;
        RectF rectF5 = this.z0;
        if (z10) {
            if (!this.J0) {
                float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(-1.0f), org.telegram.messenger.i0.N(1.0f), this.n0);
                mt editText = fVar.getEditText();
                this.w0 = T1;
                editText.setTranslationY(T1);
            }
            float f17 = L2;
            float f18 = L3;
            rectF5.set(f17, f18, getWidth() - L2, L3 + e);
            rectF4.set(f17, f18, getWidth() - L2, org.telegram.messenger.i0.L(24.0f) + r4);
            f7 = 82.0f;
        } else {
            f7 = 82.0f;
            float T12 = (org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(1.0f), org.telegram.messenger.i0.N(-1.0f), this.n0) + f16) - e;
            if (Math.abs(this.w0 - T12) >= 1.0f && !this.J0) {
                mt editText2 = fVar.getEditText();
                this.w0 = T12;
                editText2.setTranslationY(T12);
            }
            rectF5.set(L2, (getHeight() - L3) - e, getWidth() - L2, getHeight() - L3);
            rectF4.set(0.0f, (getHeight() - e) - org.telegram.messenger.i0.L(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float a2 = this.e0.a(0.018f);
        canvas2.scale(a2, a2, rectF5.centerX(), rectF5.centerY());
        float W1 = org.telegram.messenger.i0.W1(this.n0 * 0.0f, org.telegram.messenger.i0.L(21.0f), 0);
        tg.b bVar = this.g0;
        if (bVar != null) {
            if (this.h0 == null) {
                vg.f c10 = bVar.c(this, null, false);
                c10.o(w7.b9.i(this.a));
                c10.p(org.telegram.messenger.i0.L(5.0f));
                c10.q(org.telegram.messenger.i0.L(22.0f));
                this.h0 = c10;
            }
            Rect rect = org.telegram.messenger.i0.Q;
            rectF5.round(rect);
            rect.inset(-org.telegram.messenger.i0.W1(this.n0, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(5.0f)), -org.telegram.messenger.i0.L(5.0f));
            this.h0.setBounds(rect);
            this.h0.draw(canvas2);
            kVar = this;
            rectF = rectF5;
            f10 = W1;
            f11 = 21.0f;
            f12 = 50.0f;
            i10 = 1;
        } else {
            boolean g10 = g();
            Paint paint2 = this.e;
            if (g10) {
                f12 = 50.0f;
                f11 = 21.0f;
                i10 = 1;
                h(this.R, canvas, rectF5, W1, false, 0.0f, 0.0f, true);
                kVar = this;
                canvas2 = canvas;
                rectF = rectF5;
                f10 = W1;
                paint2.setAlpha(org.telegram.messenger.i0.W1(kVar.n0, 38, 64));
                canvas2.drawRoundRect(rectF, f10, f10, paint2);
            } else {
                kVar = this;
                rectF = rectF5;
                f10 = W1;
                f11 = 21.0f;
                f12 = 50.0f;
                i10 = 1;
                Paint[] d = kVar.R.d();
                if (d[1] == null) {
                    paint2.setAlpha(128);
                    canvas2.drawRoundRect(rectF, f10, f10, paint2);
                } else {
                    Paint paint3 = d[0];
                    if (paint3 != null) {
                        canvas2.drawRoundRect(rectF, f10, f10, paint3);
                    }
                    Paint paint4 = d[1];
                    if (paint4 != null) {
                        canvas2.drawRoundRect(rectF, f10, f10, paint4);
                    }
                    paint2.setAlpha(51);
                    canvas2.drawRoundRect(rectF, f10, f10, paint2);
                }
            }
        }
        org.telegram.ui.Components.t5 t5Var = kVar.L0;
        float f19 = t5Var.c;
        float d10 = t5Var.d(kVar.J0);
        if (Math.abs(f19 - d10) <= 0.001f) {
        }
        kVar.n();
        if (d10 > 0.0f) {
            canvas2.saveLayerAlpha(rectF, zs.e4, 31);
        }
        if (!kVar.B0 || (w9Var = kVar.S) == null || (w9Var2 = kVar.Q) == null) {
            i11 = i10;
            i12 = 3;
            rectF2 = rectF;
        } else {
            if (kVar.J0) {
                if (kVar.o0) {
                    f15 = rectF.bottom;
                    min = Math.max(org.telegram.messenger.i0.L(46.0f), fVar.getHeight());
                } else {
                    f15 = rectF.bottom;
                    min = Math.min(org.telegram.messenger.i0.L(f7), fVar.getHeight());
                }
                float f20 = f15 - min;
                f13 = f20 - org.telegram.messenger.i0.L(f12);
                f14 = 1.0f - t5Var.c;
            } else {
                f13 = rectF.top;
                f14 = 1.0f;
            }
            float f21 = f13;
            Paint c11 = w9Var.c(f14);
            Paint c12 = w9Var2.c(f14);
            RectF rectF6 = org.telegram.messenger.i0.P;
            rectF6.set(rectF.left + org.telegram.messenger.i0.L(10.0f), f21 + org.telegram.messenger.i0.L(10.0f), rectF.right - org.telegram.messenger.i0.L(10.0f), f21 + org.telegram.messenger.i0.L(52.0f));
            if (c11 != null) {
                canvas2.drawRoundRect(rectF6, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), c11);
            }
            if (c12 != null) {
                paint = c12;
                rectF3 = rectF6;
                i11 = i10;
                i12 = 3;
                rectF2 = rectF;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, zs.e4, 31);
                canvas2 = canvas;
            } else {
                paint = c12;
                rectF3 = rectF6;
                i11 = i10;
                i12 = 3;
                rectF2 = rectF;
            }
            Path path = kVar.E0;
            if (path == null) {
                kVar.E0 = new Path();
            } else {
                path.rewind();
            }
            float W12 = org.telegram.messenger.i0.W1(kVar.n0, org.telegram.messenger.i0.L(f11), 0);
            Path path2 = kVar.E0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, W12, W12, direction);
            canvas2.clipPath(kVar.E0);
            qz0 qz0Var = kVar.C0;
            if (qz0Var != null) {
                qz0Var.p = (int) (rectF2.width() - org.telegram.messenger.i0.L(40.0f));
                qz0Var.c(rectF2.left + org.telegram.messenger.i0.L(20.0f), f21 + org.telegram.messenger.i0.L(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = kVar.G0;
            if (path3 == null) {
                kVar.G0 = new Path();
                float[] fArr = new float[8];
                kVar.H0 = fArr;
                float L4 = org.telegram.messenger.i0.L(5.0f);
                fArr[i11] = L4;
                fArr[0] = L4;
                float[] fArr2 = kVar.H0;
                fArr2[i12] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                float L5 = org.telegram.messenger.i0.L(5.0f);
                fArr2[7] = L5;
                fArr2[6] = L5;
            } else {
                path3.rewind();
            }
            float f22 = rectF3.left;
            rectF3.set(f22, rectF3.top, org.telegram.messenger.i0.L(3.0f) + f22, rectF3.bottom);
            kVar.G0.addRoundRect(rectF3, kVar.H0, direction);
            if (kVar.F0 == null) {
                Paint paint5 = new Paint();
                kVar.F0 = paint5;
                paint5.setColor(-1);
            }
            kVar.F0.setAlpha((int) (f14 * 255.0f));
            canvas2.drawPath(kVar.G0, kVar.F0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            qz0 qz0Var2 = kVar.D0;
            if (qz0Var2 != null) {
                qz0Var2.p = (int) (rectF2.width() - org.telegram.messenger.i0.L(40.0f));
                qz0Var2.c(rectF2.left + org.telegram.messenger.i0.L(20.0f), f21 + org.telegram.messenger.i0.L(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (d10 > 0.0f) {
            int i13 = kVar.K0;
            float L6 = i13 == Integer.MAX_VALUE ? rectF2.right - org.telegram.messenger.i0.L(20.0f) : i13 == Integer.MIN_VALUE ? rectF2.left + org.telegram.messenger.i0.L(20.0f) : i13;
            float L7 = rectF2.bottom - org.telegram.messenger.i0.L(20.0f);
            float max = Math.max(Math.max(w7.z8.a(rectF2.left, rectF2.top, L6, L7), w7.z8.a(rectF2.left, rectF2.bottom, L6, L7)), Math.max(w7.z8.a(rectF2.right, rectF2.top, L6, L7), w7.z8.a(rectF2.right, rectF2.bottom, L6, L7))) * d10;
            if (kVar.M0 == null) {
                Paint paint6 = new Paint(i11);
                kVar.M0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                float[] fArr3 = new float[i12];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 0.6f;
                fArr3[2] = 1.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, fArr3, tileMode);
                kVar.N0 = radialGradient;
                kVar.M0.setShader(radialGradient);
                kVar.Q0 = new Matrix();
                Paint paint7 = new Paint(1);
                kVar.O0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                kVar.P0 = radialGradient2;
                kVar.O0.setShader(radialGradient2);
            }
            kVar.Q0.reset();
            kVar.Q0.postTranslate(L6, L7);
            kVar.Q0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            kVar.N0.setLocalMatrix(kVar.Q0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f10, f10, kVar.M0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, zs.e4, 31);
            kVar.j(canvas2, rectF2);
            kVar.Q0.reset();
            kVar.Q0.postTranslate(L6, L7);
            kVar.Q0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            kVar.P0.setLocalMatrix(kVar.Q0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f10, f10, kVar.O0);
            canvas2.restore();
            canvas2.restore();
            if (!(kVar instanceof e8)) {
                kVar.k(canvas2, rectF2, d10);
            }
        }
        canvas2.restore();
        if (kVar.g0 == null) {
            Path path4 = kVar.I0;
            path4.rewind();
            path4.addRoundRect(rectF2, f10, f10, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            tg.i iVar = kVar.c;
            iVar.m = f10;
            iVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            iVar.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.d0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.A0.contains(motionEvent.getX(), motionEvent.getY()) || this.o0) {
                int action = motionEvent.getAction();
                dc dcVar = this.e0;
                if (action != 0 || this.o0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        dcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof p) && ((p) this).N1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i10 = 0;
                while (true) {
                    int childCount = getChildCount();
                    f fVar = this.f;
                    if (i10 >= childCount) {
                        this.L.b(false);
                        fVar.getEditText().setForceCursorEnd(true);
                        fVar.getEditText().requestFocus();
                        rt rtVar = fVar.a;
                        rtVar.requestFocus();
                        org.telegram.messenger.i0.J3(rtVar);
                        fVar.getEditText().setScrollY(0);
                        dcVar.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && fVar != childAt) {
                        float x10 = childAt.getX();
                        float y3 = childAt.getY();
                        float x11 = childAt.getX() + childAt.getWidth();
                        float y10 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.y0;
                        rectF.set(x10, y3, x11, y10);
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
        RectF rectF = this.z0;
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
        if (this instanceof kq0) {
            max = 0.0f;
        } else {
            max = (1.0f - this.n0) * Math.max(0, (r0.getHeight() - org.telegram.messenger.i0.L(82.0f)) - r0.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), zs.e4, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, max);
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        canvas.save();
        Matrix matrix = this.F;
        matrix.reset();
        matrix.postTranslate(0.0f, rectF.top - 1.0f);
        LinearGradient linearGradient = this.E;
        linearGradient.setLocalMatrix(matrix);
        float f7 = rectF.left;
        float f10 = rectF.top;
        Paint paint = this.D;
        canvas.drawRect(f7, f10, rectF.right, org.telegram.messenger.i0.L(10.0f) + f10, paint);
        matrix.reset();
        matrix.postRotate(180.0f);
        matrix.postTranslate(0.0f, rectF.bottom);
        linearGradient.setLocalMatrix(matrix);
        canvas.drawRect(rectF.left, rectF.bottom - org.telegram.messenger.i0.L(10.0f), rectF.right, rectF.bottom, paint);
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
        return this.z0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return d20.i(this.U).q() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.x;
    }

    public int getEditTextHeight() {
        return (int) this.u0.c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(org.telegram.messenger.i0.L(82.0f), this.f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.L0.c;
    }

    public int getSelectionLength() {
        f fVar = this.f;
        if (fVar != null && fVar.getEditText() != null) {
            try {
                return fVar.getEditText().getSelectionEnd() - fVar.getEditText().getSelectionStart();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(w9 w9Var, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f7, float f10);

    public final void m() {
        invalidate();
        f fVar = this.f;
        fVar.getEditText().invalidate();
        fVar.getEmojiButton().invalidate();
        oh ohVar = this.M;
        if (ohVar != null) {
            ohVar.invalidate();
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
            Bitmap bitmap = this.G;
            if (bitmap != null) {
                bitmap.recycle();
                this.G = null;
            }
            TextPaint textPaint = this.H;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            String L0 = cd.L0(2131754454, null);
            this.G = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(L0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.G).drawText(L0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.q0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.r0 = null;
        this.t0 = null;
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        f fVar = this.f;
        boolean z10 = fVar.y;
        r2 r2Var = this.L;
        if (z10 && fVar.getEmojiView() != null) {
            if (r2Var.c()) {
                fVar.getEmojiView().B();
                return true;
            }
            st stVar = fVar.d;
            if (stVar != null) {
                stVar.B();
                fVar.d.t(false);
            }
            return true;
        }
        if (fVar.e) {
            fVar.k(true);
            return true;
        }
        if ((!fVar.w && !r2Var.c()) || r2Var.d) {
            return false;
        }
        fVar.d();
        fVar.k(true);
        return true;
    }

    public void setAccount(int i10) {
        this.U = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(tg.b bVar) {
        this.g0 = bVar;
    }

    public void setDialogId(long j10) {
        this.y = j10;
        oh ohVar = this.M;
        if (ohVar != null) {
            ohVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(q20 q20Var) {
        this.i0 = q20Var;
    }

    public void setOnKeyboardOpen(q20 q20Var) {
        this.j0 = q20Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.e0.c(z10 && !this.o0);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f.setText(charSequence);
    }

    public abstract void u(float f7);

    public final void v(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.B0 = false;
            invalidate();
            return;
        }
        this.B0 = true;
        CharSequence charSequence2 = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            charSequence2 = "";
        }
        this.C0 = new qz0(charSequence2, 14.0f, org.telegram.messenger.i0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.D0 = new qz0(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        this.M.getAdapter().m0 = this instanceof p;
    }

    public void x(int i10) {
        uu0 uu0Var = this.K;
        if (uu0Var != null) {
            uu0Var.R();
        }
        f fVar = this.f;
        if (fVar.e) {
            i10 = Math.max(0, fVar.getEmojiPadding() + a());
        } else if (fVar.N) {
            i10 = Math.max(0, fVar.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i10 - (uu0Var == null ? 0 : uu0Var.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof kq0)) {
            ObjectAnimator objectAnimator = this.k0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.k0.cancel();
                this.k0 = null;
            }
            this.k0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.i0.L(20.0f)) {
                this.k0.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                this.k0.setDuration(250L);
            } else {
                this.k0.setInterpolator(gr.h);
                this.k0.setDuration(640L);
            }
            this.k0.start();
        }
        this.l0 = max > org.telegram.messenger.i0.L(20.0f);
        e eVar = this.m0;
        org.telegram.messenger.i0.r(eVar);
        org.telegram.messenger.i0.g3(eVar);
        if (max < org.telegram.messenger.i0.L(20.0f)) {
            fVar.getEditText().clearFocus();
            fVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.u0.c;
            if (this.M.getY() != translationY) {
                this.M.setTranslationY(translationY);
                this.M.invalidate();
            }
        }
    }

    public void q(boolean z10) {
    }

    public void r(int i10) {
    }

    public void setUiBlurBitmap(s20 s20Var) {
    }

    public void n() {
    }

    public void t() {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i10, int i11) {
    }

    public void k(Canvas canvas, RectF rectF, float f7) {
    }
}
