// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class pc1 extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public uib D0;
    public final Paint E;
    public uib E0;
    public final LinearGradient F;
    public Path F0;
    public final Matrix G;
    public Paint G0;
    public Bitmap H;
    public Path H0;
    public final TextPaint I;
    public float[] I0;
    public final Paint J;
    public final Path J0;
    public final FrameLayout K;
    public boolean K0;
    public final ela L;
    public int L0;
    public final mx5 M;
    public final ln M0;
    public lc1 N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final sm0 P;
    public Paint P0;
    public final wm0 Q;
    public RadialGradient Q0;
    public final wm0 R;
    public Matrix R0;
    public final wm0 S;
    public final wm0 T;
    public wm0 U;
    public int V;
    public boolean W;
    public ylb a;
    public boolean a0;
    public final FrameLayout b;
    public int b0;
    public final wbb c;
    public int c0;
    public final wbb d;
    public final hc1 d0;
    public final Paint e;
    public boolean e0;
    public final jc1 f;
    public final u51 f0;
    public ObjectAnimator g0;
    public final Drawable h;
    public km0 h0;
    public im0 i0;
    public qac j0;
    public qac k0;
    public ObjectAnimator l0;
    public boolean m0;
    public final sn2 n;
    public final hc1 n0;
    public float o0;
    public boolean p0;
    public ValueAnimator q0;
    public final mc1 r;
    public Bitmap r0;
    public final FrameLayout s;
    public BitmapShader s0;
    public Matrix t0;
    public Paint u0;
    public final ln v0;
    public final io w;
    public int w0;
    public int x;
    public float x0;
    public long y;
    public boolean y0;
    public final RectF z0;

    public pc1(Context context, FrameLayout frameLayout, ela elaVar, FrameLayout frameLayout2, ylb ylbVar, sm0 sm0Var) {
        super(context);
        wbb wbbVar = new wbb();
        this.c = wbbVar;
        wbb wbbVar2 = new wbb();
        this.d = wbbVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        byte b = 0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = z8c.t0;
        this.d0 = new hc1(this, b);
        this.f0 = new u51(this, 1.0f, 3.0f);
        this.n0 = new hc1(this, (byte) 1);
        d53 d53Var = d53.h;
        this.v0 = new ln(this, 0L, 300L, d53Var);
        this.y0 = false;
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new ln(500L, this, d53Var);
        this.a = ylbVar;
        this.K = frameLayout;
        this.L = elaVar;
        this.b = frameLayout2;
        this.P = sm0Var;
        this.S = new wm0(sm0Var, this, 0, !g());
        this.T = new wm0(sm0Var, this, 8, false);
        this.R = new wm0(sm0Var, this, 9, false);
        wbbVar.l = true;
        int i = cmb.c6;
        float f = 0.0f;
        wbbVar.a = new ic1(ylbVar, i, f, b);
        wbbVar.a();
        wbbVar.g.setColor(0);
        wbbVar.invalidateSelf();
        wbbVar2.l = true;
        wbbVar2.a = new ic1(ylbVar, i, f, (byte) 1);
        wbbVar2.a();
        wbbVar2.g.setColor(0);
        wbbVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        this.M = new mx5(frameLayout, false, new mf2(this, (byte) 11));
        jc1 jc1Var = new jc1(this, context, elaVar, getEditTextStyle(), new r63(), ylbVar, sm0Var);
        this.f = jc1Var;
        jc1Var.T = true;
        jc1Var.getEditText().addTextChangedListener(new fj());
        jc1Var.setFocusable(true);
        jc1Var.setFocusableInTouchMode(true);
        jc1Var.getEditText().r0 = true;
        jc1Var.getEditText().t0 = new f(this, (byte) 22);
        jc1Var.getEditText().setSupportRtlHint(true);
        this.Q = new wm0(sm0Var, jc1Var.getEditText(), g() ? 1 : 2, false);
        jc1Var.getEditText().setHintColor(-1);
        jc1Var.getEditText().r(jb6.M0(2131754451, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        jc1Var.getEditText().setTranslationX(gm.L(-26.0f));
        boolean z = this instanceof ba8;
        if (z) {
            jc1Var.getEditText().setGravity(48);
        }
        jc1Var.getEmojiButton().setAlpha(0.0f);
        jc1Var.getEmojiButton().setTranslationY(gm.L(z ? 1.0f : -1.0f));
        jc1Var.setTranslationY(gm.L(z ? 1.0f : -1.0f));
        jc1Var.getEditText().addTextChangedListener(new kc1(this));
        jc1Var.getEditText().setLinkTextColor(-1);
        addView(jc1Var, qoe.d(-1, -2.0f, (z ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        mc1 mc1Var = new mc1(context);
        this.r = mc1Var;
        rve.b(mc1Var, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        anb.x(this, mutate, cmb.T5, null, PorterDuff.Mode.SRC_IN);
        sn2 sn2Var = new sn2(cmb.K(gm.L(18.0f), cmb.v0(cmb.pg, ylbVar)), mutate, 0, gm.L(1.0f));
        this.n = sn2Var;
        int L = gm.L(36.0f);
        int L2 = gm.L(36.0f);
        sn2Var.h = L;
        sn2Var.n = L2;
        mc1Var.setImageDrawable(sn2Var);
        mc1Var.setScaleType(ImageView.ScaleType.CENTER);
        mc1Var.setContentDescription(jb6.M0(2131751291, null));
        mc1Var.setAlpha(0.0f);
        mc1Var.setVisibility(8);
        mc1Var.setOnClickListener(new k81(this, (byte) 4));
        addView(mc1Var, qoe.d(44, 44.0f, (z ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        io ioVar = new io(context, false, true, true);
        this.w = ioVar;
        ioVar.setGravity(17);
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTextColor(-1);
        ioVar.b(0.4f, 320L, d53Var);
        ioVar.setTypeface(gm.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(gm.L(2.0f));
        frameLayout3.addView(ioVar, qoe.e(52, 16, (z ? 48 : 80) | 5));
        addView(frameLayout3, qoe.d(52, 16.0f, (z ? 48 : 80) | 5, 0.0f, z ? 50 : 0, 0.0f, z ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return gm.n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z);

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f.clearFocus();
    }

    public abstract void d(boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x021c, code lost:
    
        if ((r2 <= 0.0f ? r10 : 0) != (r11 <= 0.0f ? r10 : 0)) goto L64;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f;
        pc1 pc1Var;
        RectF rectF;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int i3;
        RectF rectF2;
        wm0 wm0Var;
        wm0 wm0Var2;
        float f5;
        float f6;
        Paint paint;
        RectF rectF3;
        Canvas canvas2 = canvas;
        if (this.y0) {
            return;
        }
        jc1 jc1Var = this.f;
        int height = jc1Var.getHeight();
        int L = this.K0 ? gm.L(44.0f) : this.p0 ? Math.max(gm.L(44.0f), height) : Math.min(gm.L(82.0f), height);
        if (!this.K0 && this.C0) {
            L += gm.L(50.0f);
        }
        float f7 = L;
        int e = (int) this.v0.e(false, f7);
        if (e != this.w0) {
            r(e);
            qac qacVar = this.j0;
            if (qacVar != null) {
                qacVar.a(Integer.valueOf(e));
            }
            this.w0 = L;
        }
        y();
        int L2 = gm.L(7.0f);
        int L3 = gm.L(8.0f);
        boolean z = this instanceof ba8;
        RectF rectF4 = this.B0;
        RectF rectF5 = this.A0;
        if (z) {
            if (!this.K0) {
                float R1 = gm.R1(gm.N(-1.0f), gm.N(1.0f), this.o0);
                qu3 editText = jc1Var.getEditText();
                this.x0 = R1;
                editText.setTranslationY(R1);
            }
            float f8 = L2;
            float f9 = L3;
            rectF5.set(f8, f9, getWidth() - L2, L3 + e);
            rectF4.set(f8, f9, getWidth() - L2, gm.L(24.0f) + r4);
            f = 82.0f;
        } else {
            f = 82.0f;
            float R12 = (gm.R1(gm.N(1.0f), gm.N(-1.0f), this.o0) + f7) - e;
            if (Math.abs(this.x0 - R12) >= 1.0f && !this.K0) {
                qu3 editText2 = jc1Var.getEditText();
                this.x0 = R12;
                editText2.setTranslationY(R12);
            }
            rectF5.set(L2, (getHeight() - L3) - e, getWidth() - L2, getHeight() - L3);
            rectF4.set(0.0f, (getHeight() - e) - gm.L(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float a = this.f0.a(0.018f);
        canvas2.scale(a, a, rectF5.centerX(), rectF5.centerY());
        float U1 = gm.U1(this.o0 * 0.0f, gm.L(21.0f), 0);
        km0 km0Var = this.h0;
        if (km0Var != null) {
            if (this.i0 == null) {
                im0 c = km0Var.c(this, null, false);
                c.p(qqd.i(this.a));
                c.q(gm.L(5.0f));
                c.r(gm.L(22.0f));
                this.i0 = c;
            }
            Rect rect = gm.Q;
            rectF5.round(rect);
            rect.inset(-gm.U1(this.o0, gm.L(1.0f), gm.L(5.0f)), -gm.L(5.0f));
            this.i0.setBounds(rect);
            this.i0.draw(canvas2);
            pc1Var = this;
            rectF = rectF5;
            f2 = U1;
            f3 = 21.0f;
            f4 = 50.0f;
            i = 1;
        } else {
            boolean g = g();
            Paint paint2 = this.e;
            wm0 wm0Var3 = this.S;
            if (g) {
                f4 = 50.0f;
                f3 = 21.0f;
                i = 1;
                h(wm0Var3, canvas, rectF5, U1, false, 0.0f, 0.0f, true);
                pc1Var = this;
                canvas2 = canvas;
                rectF = rectF5;
                f2 = U1;
                paint2.setAlpha(gm.U1(pc1Var.o0, 38, 64));
                canvas2.drawRoundRect(rectF, f2, f2, paint2);
            } else {
                pc1Var = this;
                rectF = rectF5;
                f2 = U1;
                f3 = 21.0f;
                f4 = 50.0f;
                i = 1;
                Paint[] d = wm0Var3.d();
                if (d[1] == null) {
                    paint2.setAlpha(128);
                    canvas2.drawRoundRect(rectF, f2, f2, paint2);
                } else {
                    Paint paint3 = d[0];
                    if (paint3 != null) {
                        canvas2.drawRoundRect(rectF, f2, f2, paint3);
                    }
                    Paint paint4 = d[1];
                    if (paint4 != null) {
                        canvas2.drawRoundRect(rectF, f2, f2, paint4);
                    }
                    paint2.setAlpha(51);
                    canvas2.drawRoundRect(rectF, f2, f2, paint2);
                }
            }
        }
        ln lnVar = pc1Var.M0;
        float f10 = lnVar.c;
        float d2 = lnVar.d(pc1Var.K0);
        if (Math.abs(f10 - d2) <= 0.001f) {
        }
        pc1Var.n();
        if (d2 > 0.0f) {
            canvas2.saveLayerAlpha(rectF, nm7.d4, 31);
        }
        if (!pc1Var.C0 || (wm0Var = pc1Var.T) == null || (wm0Var2 = pc1Var.R) == null) {
            i2 = i;
            i3 = 3;
            rectF2 = rectF;
        } else {
            if (pc1Var.K0) {
                float max = rectF.bottom - (pc1Var.p0 ? Math.max(gm.L(46.0f), jc1Var.getHeight()) : Math.min(gm.L(f), jc1Var.getHeight()));
                f5 = max - gm.L(f4);
                f6 = 1.0f - lnVar.c;
            } else {
                f5 = rectF.top;
                f6 = 1.0f;
            }
            float f11 = f5;
            Paint c2 = wm0Var.c(f6);
            Paint c3 = wm0Var2.c(f6);
            RectF rectF6 = gm.P;
            rectF6.set(rectF.left + gm.L(10.0f), f11 + gm.L(10.0f), rectF.right - gm.L(10.0f), f11 + gm.L(52.0f));
            if (c2 != null) {
                canvas2.drawRoundRect(rectF6, gm.L(5.0f), gm.L(5.0f), c2);
            }
            if (c3 != null) {
                paint = c3;
                rectF3 = rectF6;
                i2 = i;
                i3 = 3;
                rectF2 = rectF;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, nm7.d4, 31);
                canvas2 = canvas;
            } else {
                paint = c3;
                rectF3 = rectF6;
                i2 = i;
                i3 = 3;
                rectF2 = rectF;
            }
            Path path = pc1Var.F0;
            if (path == null) {
                pc1Var.F0 = new Path();
            } else {
                path.rewind();
            }
            float U12 = gm.U1(pc1Var.o0, gm.L(f3), 0);
            Path path2 = pc1Var.F0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, U12, U12, direction);
            canvas2.clipPath(pc1Var.F0);
            uib uibVar = pc1Var.D0;
            if (uibVar != null) {
                uibVar.p = (int) (rectF2.width() - gm.L(40.0f));
                uibVar.c(rectF2.left + gm.L(20.0f), f11 + gm.L(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = pc1Var.H0;
            if (path3 == null) {
                pc1Var.H0 = new Path();
                float[] fArr = new float[8];
                pc1Var.I0 = fArr;
                float L4 = gm.L(5.0f);
                fArr[i2] = L4;
                fArr[0] = L4;
                float[] fArr2 = pc1Var.I0;
                fArr2[i3] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                float L5 = gm.L(5.0f);
                fArr2[7] = L5;
                fArr2[6] = L5;
            } else {
                path3.rewind();
            }
            float f12 = rectF3.left;
            rectF3.set(f12, rectF3.top, gm.L(3.0f) + f12, rectF3.bottom);
            pc1Var.H0.addRoundRect(rectF3, pc1Var.I0, direction);
            if (pc1Var.G0 == null) {
                Paint paint5 = new Paint();
                pc1Var.G0 = paint5;
                paint5.setColor(-1);
            }
            pc1Var.G0.setAlpha((int) (f6 * 255.0f));
            canvas2.drawPath(pc1Var.H0, pc1Var.G0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            uib uibVar2 = pc1Var.E0;
            if (uibVar2 != null) {
                uibVar2.p = (int) (rectF2.width() - gm.L(40.0f));
                uibVar2.c(rectF2.left + gm.L(20.0f), f11 + gm.L(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (d2 > 0.0f) {
            int i4 = pc1Var.L0;
            float L6 = i4 == Integer.MAX_VALUE ? rectF2.right - gm.L(20.0f) : i4 == Integer.MIN_VALUE ? rectF2.left + gm.L(20.0f) : i4;
            float L7 = rectF2.bottom - gm.L(20.0f);
            float max2 = Math.max(Math.max(oqe.a(rectF2.left, rectF2.top, L6, L7), oqe.a(rectF2.left, rectF2.bottom, L6, L7)), Math.max(oqe.a(rectF2.right, rectF2.top, L6, L7), oqe.a(rectF2.right, rectF2.bottom, L6, L7))) * d2;
            if (pc1Var.N0 == null) {
                Paint paint6 = new Paint(i2);
                pc1Var.N0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                float[] fArr3 = new float[i3];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 0.6f;
                fArr3[2] = 1.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, fArr3, tileMode);
                pc1Var.O0 = radialGradient;
                pc1Var.N0.setShader(radialGradient);
                pc1Var.R0 = new Matrix();
                Paint paint7 = new Paint(1);
                pc1Var.P0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                pc1Var.Q0 = radialGradient2;
                pc1Var.P0.setShader(radialGradient2);
            }
            pc1Var.R0.reset();
            pc1Var.R0.postTranslate(L6, L7);
            pc1Var.R0.preScale(Math.max(1.0f, max2) / 16.0f, Math.max(1.0f, max2) / 16.0f);
            pc1Var.O0.setLocalMatrix(pc1Var.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f2, f2, pc1Var.N0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, nm7.d4, 31);
            pc1Var.j(canvas2, rectF2);
            pc1Var.R0.reset();
            pc1Var.R0.postTranslate(L6, L7);
            pc1Var.R0.preScale(Math.max(1.0f, max2) / 16.0f, Math.max(1.0f, max2) / 16.0f);
            pc1Var.Q0.setLocalMatrix(pc1Var.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f2, f2, pc1Var.P0);
            canvas2.restore();
            canvas2.restore();
            if (!(pc1Var instanceof l9b)) {
                pc1Var.k(canvas2, rectF2, d2);
            }
        }
        canvas2.restore();
        if (pc1Var.h0 == null) {
            Path path4 = pc1Var.J0;
            path4.rewind();
            path4.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            wbb wbbVar = pc1Var.c;
            wbbVar.m = f2;
            wbbVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            wbbVar.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.p0) {
                int action = motionEvent.getAction();
                u51 u51Var = this.f0;
                if (action != 0 || this.p0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        u51Var.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof yc1) && ((yc1) this).O1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i = 0;
                while (true) {
                    int childCount = getChildCount();
                    jc1 jc1Var = this.f;
                    if (i >= childCount) {
                        this.M.b(false);
                        jc1Var.getEditText().setForceCursorEnd(true);
                        jc1Var.getEditText().requestFocus();
                        wu3 wu3Var = jc1Var.a;
                        wu3Var.requestFocus();
                        gm.E3(wu3Var);
                        jc1Var.getEditText().setScrollY(0);
                        u51Var.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && jc1Var != childAt) {
                        float x = childAt.getX();
                        float y = childAt.getY();
                        float x2 = childAt.getX() + childAt.getWidth();
                        float y2 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.z0;
                        rectF.set(x, y, x2, y2);
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    i++;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float max;
        RectF rectF = this.A0;
        if (view != this.f) {
            if (!f(view)) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        if (this instanceof ba8) {
            max = 0.0f;
        } else {
            max = (1.0f - this.o0) * Math.max(0, (r1.getHeight() - gm.L(82.0f)) - r1.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), nm7.d4, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, max);
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        canvas.save();
        Matrix matrix = this.G;
        matrix.reset();
        matrix.postTranslate(0.0f, rectF.top - 1.0f);
        LinearGradient linearGradient = this.F;
        linearGradient.setLocalMatrix(matrix);
        float f = rectF.left;
        float f2 = rectF.top;
        Paint paint = this.E;
        canvas.drawRect(f, f2, rectF.right, gm.L(10.0f) + f2, paint);
        matrix.reset();
        matrix.postRotate(180.0f);
        matrix.postTranslate(0.0f, rectF.bottom);
        linearGradient.setLocalMatrix(matrix);
        canvas.drawRect(rectF.left, rectF.bottom - gm.L(10.0f), rectF.right, rectF.bottom, paint);
        canvas.restore();
        canvas.restore();
        return drawChild2;
    }

    public abstract boolean e();

    public boolean f(View view) {
        return true;
    }

    public boolean g() {
        return true;
    }

    public RectF getBounds() {
        return this.A0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return z8c.h(this.V).p() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.x;
    }

    public int getEditTextHeight() {
        return (int) this.v0.c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(gm.L(82.0f), this.f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.c;
    }

    public int getSelectionLength() {
        jc1 jc1Var = this.f;
        if (jc1Var != null && jc1Var.getEditText() != null) {
            try {
                return jc1Var.getEditText().getSelectionEnd() - jc1Var.getEditText().getSelectionStart();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(wm0 wm0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, 12);
    }

    public abstract boolean l(float f, float f2);

    public final void m() {
        invalidate();
        jc1 jc1Var = this.f;
        jc1Var.getEditText().invalidate();
        jc1Var.getEmojiButton().invalidate();
        lc1 lc1Var = this.N;
        if (lc1Var != null) {
            lc1Var.invalidate();
        }
        if (jc1Var.getEmojiView() == null || !g()) {
            return;
        }
        jc1Var.getEmojiView().invalidate();
    }

    public final boolean o() {
        return getCodePointCount() > getCaptionLimit();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            Bitmap bitmap = this.H;
            if (bitmap != null) {
                bitmap.recycle();
                this.H = null;
            }
            TextPaint textPaint = this.I;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(gm.L(16.0f));
            String M0 = jb6.M0(2131754451, null);
            this.H = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(M0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.H).drawText(M0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.s0 = null;
        this.u0 = null;
        Bitmap bitmap2 = this.H;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.H = null;
        }
    }

    public final boolean p() {
        jc1 jc1Var = this.f;
        boolean z = jc1Var.y;
        mx5 mx5Var = this.M;
        if (z && jc1Var.getEmojiView() != null) {
            if (mx5Var.c()) {
                jc1Var.getEmojiView().y();
                return true;
            }
            xu3 xu3Var = jc1Var.d;
            if (xu3Var != null) {
                xu3Var.y();
                jc1Var.d.r(false);
            }
            return true;
        }
        if (jc1Var.e) {
            jc1Var.k(true);
            return true;
        }
        if ((!jc1Var.w && !mx5Var.c()) || mx5Var.d) {
            return false;
        }
        jc1Var.d();
        jc1Var.k(true);
        return true;
    }

    public void setAccount(int i) {
        this.V = i;
    }

    public void setBlurredBackgroundDrawableForMentions(km0 km0Var) {
        this.h0 = km0Var;
    }

    public void setDialogId(long j) {
        this.y = j;
        lc1 lc1Var = this.N;
        if (lc1Var != null) {
            lc1Var.setDialogId(j);
        }
    }

    public void setOnHeightUpdate(qac qacVar) {
        this.j0 = qacVar;
    }

    public void setOnKeyboardOpen(qac qacVar) {
        this.k0 = qacVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f0.c(z && !this.p0);
    }

    public void setText(CharSequence charSequence) {
        this.W = true;
        this.f.setText(charSequence);
    }

    public abstract void u(float f);

    public final void v(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.C0 = false;
            invalidate();
            return;
        }
        this.C0 = true;
        CharSequence charSequence2 = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            charSequence2 = "";
        }
        this.D0 = new uib(charSequence2, 14.0f, gm.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new uib(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        this.N.getAdapter().n0 = this instanceof yc1;
    }

    public void x(int i) {
        ela elaVar = this.L;
        if (elaVar != null) {
            elaVar.R();
        }
        jc1 jc1Var = this.f;
        if (jc1Var.e) {
            i = Math.max(0, jc1Var.getEmojiPadding() + a());
        } else if (jc1Var.O) {
            i = Math.max(0, jc1Var.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i - (elaVar == null ? 0 : elaVar.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof ba8)) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.l0.cancel();
                this.l0 = null;
            }
            this.l0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            int L = gm.L(20.0f);
            ObjectAnimator objectAnimator2 = this.l0;
            if (max > L) {
                objectAnimator2.setInterpolator(gb.w);
                this.l0.setDuration(250L);
            } else {
                objectAnimator2.setInterpolator(d53.h);
                this.l0.setDuration(640L);
            }
            this.l0.start();
        }
        this.m0 = max > gm.L(20.0f);
        hc1 hc1Var = this.n0;
        gm.r(hc1Var);
        gm.c3(hc1Var);
        if (max < gm.L(20.0f)) {
            jc1Var.getEditText().clearFocus();
            jc1Var.k(true);
        }
    }

    public void y() {
        if (this.N != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.v0.c;
            if (this.N.getY() != translationY) {
                this.N.setTranslationY(translationY);
                this.N.invalidate();
            }
        }
    }

    public void n() {
    }

    public void q(boolean z) {
    }

    public void r(int i) {
    }

    public void setUiBlurBitmap(sac sacVar) {
    }

    public void t() {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i, int i2) {
    }

    public void k(Canvas canvas, RectF rectF, float f) {
    }
}
