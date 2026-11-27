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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class qb1 extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public pkb D0;
    public final Paint E;
    public pkb E0;
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
    public final wma L;
    public int L0;
    public final rx5 M;
    public final mm M0;
    public mb1 N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final tl0 P;
    public Paint P0;
    public final xl0 Q;
    public RadialGradient Q0;
    public final xl0 R;
    public Matrix R0;
    public final xl0 S;
    public final xl0 T;
    public xl0 U;
    public int V;
    public boolean W;
    public vnb a;
    public boolean a0;
    public final FrameLayout b;
    public int b0;
    public final sdb c;
    public int c0;
    public final sdb d;
    public final hb1 d0;
    public final Paint e;
    public boolean e0;
    public final kb1 f;
    public final v41 f0;
    public ObjectAnimator g0;
    public final Drawable h;
    public ll0 h0;
    public jl0 i0;
    public pcc j0;
    public pcc k0;
    public ObjectAnimator l0;
    public boolean m0;
    public final zm2 n;
    public final hb1 n0;
    public float o0;
    public boolean p0;
    public ValueAnimator q0;
    public final nb1 r;
    public Bitmap r0;
    public final FrameLayout s;
    public BitmapShader s0;
    public Matrix t0;
    public Paint u0;
    public final mm v0;
    public final in w;
    public int w0;
    public int x;
    public float x0;
    public long y;
    public boolean y0;
    public final RectF z0;

    public qb1(Context context, FrameLayout frameLayout, wma wmaVar, FrameLayout frameLayout2, vnb vnbVar, tl0 tl0Var) {
        super(context);
        sdb sdbVar = new sdb();
        this.c = sdbVar;
        sdb sdbVar2 = new sdb();
        this.d = sdbVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        byte b = 0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = yac.t0;
        this.d0 = new hb1(this, b);
        this.f0 = new v41(this, 1.0f, 3.0f);
        this.n0 = new hb1(this, (byte) 1);
        k43 k43Var = k43.h;
        this.v0 = new mm(this, 0L, 300L, k43Var);
        this.y0 = false;
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new mm(500L, this, k43Var);
        this.a = vnbVar;
        this.K = frameLayout;
        this.L = wmaVar;
        this.b = frameLayout2;
        this.P = tl0Var;
        this.S = new xl0(tl0Var, this, 0, !g());
        this.T = new xl0(tl0Var, this, 8, false);
        this.R = new xl0(tl0Var, this, 9, false);
        sdbVar.l = true;
        int i = aob.d6;
        float f = 0.0f;
        sdbVar.a = new ib1(vnbVar, i, f, b);
        sdbVar.a();
        sdbVar.g.setColor(0);
        sdbVar.invalidateSelf();
        sdbVar2.l = true;
        sdbVar2.a = new ib1(vnbVar, i, f, (byte) 1);
        sdbVar2.a();
        sdbVar2.g.setColor(0);
        sdbVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        this.M = new rx5(frameLayout, false, new te2(this, (byte) 11));
        kb1 kb1Var = new kb1(this, context, wmaVar, getEditTextStyle(), new x53(), vnbVar, tl0Var);
        this.f = kb1Var;
        kb1Var.T = true;
        kb1Var.getEditText().addTextChangedListener(new gi());
        kb1Var.setFocusable(true);
        kb1Var.setFocusableInTouchMode(true);
        kb1Var.getEditText().r0 = true;
        kb1Var.getEditText().t0 = new c(this, (byte) 22);
        kb1Var.getEditText().setSupportRtlHint(true);
        this.Q = new xl0(tl0Var, kb1Var.getEditText(), g() ? 1 : 2, false);
        kb1Var.getEditText().setHintColor(-1);
        kb1Var.getEditText().r(ob6.M0(2131754447, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        kb1Var.getEditText().setTranslationX(hl.L(-26.0f));
        boolean z = this instanceof qb8;
        if (z) {
            kb1Var.getEditText().setGravity(48);
        }
        kb1Var.getEmojiButton().setAlpha(0.0f);
        kb1Var.getEmojiButton().setTranslationY(hl.L(z ? 1.0f : -1.0f));
        kb1Var.setTranslationY(hl.L(z ? 1.0f : -1.0f));
        kb1Var.getEditText().addTextChangedListener(new lb1(this));
        kb1Var.getEditText().setLinkTextColor(-1);
        addView(kb1Var, tre.d(-1, -2.0f, (z ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        nb1 nb1Var = new nb1(context);
        this.r = nb1Var;
        iye.b(nb1Var, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        yob.x(this, mutate, aob.U5, null, PorterDuff.Mode.SRC_IN);
        zm2 zm2Var = new zm2(aob.K(hl.L(18.0f), aob.v0(aob.qg, vnbVar)), mutate, 0, hl.L(1.0f));
        this.n = zm2Var;
        int L = hl.L(36.0f);
        int L2 = hl.L(36.0f);
        zm2Var.h = L;
        zm2Var.n = L2;
        nb1Var.setImageDrawable(zm2Var);
        nb1Var.setScaleType(ImageView.ScaleType.CENTER);
        nb1Var.setContentDescription(ob6.M0(2131751319, null));
        nb1Var.setAlpha(0.0f);
        nb1Var.setVisibility(8);
        nb1Var.setOnClickListener(new r81(this, (byte) 3));
        addView(nb1Var, tre.d(44, 44.0f, (z ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        in inVar = new in(context, false, true, true);
        this.w = inVar;
        inVar.setGravity(17);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTextColor(-1);
        inVar.b(0.4f, 320L, k43Var);
        inVar.setTypeface(hl.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(hl.L(2.0f));
        frameLayout3.addView(inVar, tre.e(52, 16, (z ? 48 : 80) | 5));
        addView(frameLayout3, tre.d(52, 16.0f, (z ? 48 : 80) | 5, 0.0f, z ? 50 : 0, 0.0f, z ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return hl.n;
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
        qb1 qb1Var;
        RectF rectF;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int i3;
        RectF rectF2;
        xl0 xl0Var;
        xl0 xl0Var2;
        float f5;
        float f6;
        Paint paint;
        RectF rectF3;
        Canvas canvas2 = canvas;
        if (this.y0) {
            return;
        }
        kb1 kb1Var = this.f;
        int height = kb1Var.getHeight();
        int L = this.K0 ? hl.L(44.0f) : this.p0 ? Math.max(hl.L(44.0f), height) : Math.min(hl.L(82.0f), height);
        if (!this.K0 && this.C0) {
            L += hl.L(50.0f);
        }
        float f7 = L;
        int e = (int) this.v0.e(false, f7);
        if (e != this.w0) {
            r(e);
            pcc pccVar = this.j0;
            if (pccVar != null) {
                pccVar.a(Integer.valueOf(e));
            }
            this.w0 = L;
        }
        y();
        int L2 = hl.L(7.0f);
        int L3 = hl.L(8.0f);
        boolean z = this instanceof qb8;
        RectF rectF4 = this.B0;
        RectF rectF5 = this.A0;
        if (z) {
            if (!this.K0) {
                float R1 = hl.R1(hl.N(-1.0f), hl.N(1.0f), this.o0);
                xt3 editText = kb1Var.getEditText();
                this.x0 = R1;
                editText.setTranslationY(R1);
            }
            float f8 = L2;
            float f9 = L3;
            rectF5.set(f8, f9, getWidth() - L2, L3 + e);
            rectF4.set(f8, f9, getWidth() - L2, hl.L(24.0f) + r4);
            f = 82.0f;
        } else {
            f = 82.0f;
            float R12 = (hl.R1(hl.N(1.0f), hl.N(-1.0f), this.o0) + f7) - e;
            if (Math.abs(this.x0 - R12) >= 1.0f && !this.K0) {
                xt3 editText2 = kb1Var.getEditText();
                this.x0 = R12;
                editText2.setTranslationY(R12);
            }
            rectF5.set(L2, (getHeight() - L3) - e, getWidth() - L2, getHeight() - L3);
            rectF4.set(0.0f, (getHeight() - e) - hl.L(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float a = this.f0.a(0.018f);
        canvas2.scale(a, a, rectF5.centerX(), rectF5.centerY());
        float U1 = hl.U1(this.o0 * 0.0f, hl.L(21.0f), 0);
        ll0 ll0Var = this.h0;
        if (ll0Var != null) {
            if (this.i0 == null) {
                jl0 c = ll0Var.c(this, null, false);
                c.p(dtd.i(this.a));
                c.q(hl.L(5.0f));
                c.r(hl.L(22.0f));
                this.i0 = c;
            }
            Rect rect = hl.Q;
            rectF5.round(rect);
            rect.inset(-hl.U1(this.o0, hl.L(1.0f), hl.L(5.0f)), -hl.L(5.0f));
            this.i0.setBounds(rect);
            this.i0.draw(canvas2);
            qb1Var = this;
            rectF = rectF5;
            f2 = U1;
            f3 = 21.0f;
            f4 = 50.0f;
            i = 1;
        } else {
            boolean g = g();
            Paint paint2 = this.e;
            xl0 xl0Var3 = this.S;
            if (g) {
                f4 = 50.0f;
                f3 = 21.0f;
                i = 1;
                h(xl0Var3, canvas, rectF5, U1, false, 0.0f, 0.0f, true);
                qb1Var = this;
                canvas2 = canvas;
                rectF = rectF5;
                f2 = U1;
                paint2.setAlpha(hl.U1(qb1Var.o0, 38, 64));
                canvas2.drawRoundRect(rectF, f2, f2, paint2);
            } else {
                qb1Var = this;
                rectF = rectF5;
                f2 = U1;
                f3 = 21.0f;
                f4 = 50.0f;
                i = 1;
                Paint[] d = xl0Var3.d();
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
        mm mmVar = qb1Var.M0;
        float f10 = mmVar.c;
        float d2 = mmVar.d(qb1Var.K0);
        if (Math.abs(f10 - d2) <= 0.001f) {
        }
        qb1Var.n();
        if (d2 > 0.0f) {
            canvas2.saveLayerAlpha(rectF, jn7.d4, 31);
        }
        if (!qb1Var.C0 || (xl0Var = qb1Var.T) == null || (xl0Var2 = qb1Var.R) == null) {
            i2 = i;
            i3 = 3;
            rectF2 = rectF;
        } else {
            if (qb1Var.K0) {
                float max = rectF.bottom - (qb1Var.p0 ? Math.max(hl.L(46.0f), kb1Var.getHeight()) : Math.min(hl.L(f), kb1Var.getHeight()));
                f5 = max - hl.L(f4);
                f6 = 1.0f - mmVar.c;
            } else {
                f5 = rectF.top;
                f6 = 1.0f;
            }
            float f11 = f5;
            Paint c2 = xl0Var.c(f6);
            Paint c3 = xl0Var2.c(f6);
            RectF rectF6 = hl.P;
            rectF6.set(rectF.left + hl.L(10.0f), f11 + hl.L(10.0f), rectF.right - hl.L(10.0f), f11 + hl.L(52.0f));
            if (c2 != null) {
                canvas2.drawRoundRect(rectF6, hl.L(5.0f), hl.L(5.0f), c2);
            }
            if (c3 != null) {
                paint = c3;
                rectF3 = rectF6;
                i2 = i;
                i3 = 3;
                rectF2 = rectF;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, jn7.d4, 31);
                canvas2 = canvas;
            } else {
                paint = c3;
                rectF3 = rectF6;
                i2 = i;
                i3 = 3;
                rectF2 = rectF;
            }
            Path path = qb1Var.F0;
            if (path == null) {
                qb1Var.F0 = new Path();
            } else {
                path.rewind();
            }
            float U12 = hl.U1(qb1Var.o0, hl.L(f3), 0);
            Path path2 = qb1Var.F0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, U12, U12, direction);
            canvas2.clipPath(qb1Var.F0);
            pkb pkbVar = qb1Var.D0;
            if (pkbVar != null) {
                pkbVar.p = (int) (rectF2.width() - hl.L(40.0f));
                pkbVar.c(rectF2.left + hl.L(20.0f), f11 + hl.L(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = qb1Var.H0;
            if (path3 == null) {
                qb1Var.H0 = new Path();
                float[] fArr = new float[8];
                qb1Var.I0 = fArr;
                float L4 = hl.L(5.0f);
                fArr[i2] = L4;
                fArr[0] = L4;
                float[] fArr2 = qb1Var.I0;
                fArr2[i3] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                float L5 = hl.L(5.0f);
                fArr2[7] = L5;
                fArr2[6] = L5;
            } else {
                path3.rewind();
            }
            float f12 = rectF3.left;
            rectF3.set(f12, rectF3.top, hl.L(3.0f) + f12, rectF3.bottom);
            qb1Var.H0.addRoundRect(rectF3, qb1Var.I0, direction);
            if (qb1Var.G0 == null) {
                Paint paint5 = new Paint();
                qb1Var.G0 = paint5;
                paint5.setColor(-1);
            }
            qb1Var.G0.setAlpha((int) (f6 * 255.0f));
            canvas2.drawPath(qb1Var.H0, qb1Var.G0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            pkb pkbVar2 = qb1Var.E0;
            if (pkbVar2 != null) {
                pkbVar2.p = (int) (rectF2.width() - hl.L(40.0f));
                pkbVar2.c(rectF2.left + hl.L(20.0f), f11 + hl.L(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (d2 > 0.0f) {
            int i4 = qb1Var.L0;
            float L6 = i4 == Integer.MAX_VALUE ? rectF2.right - hl.L(20.0f) : i4 == Integer.MIN_VALUE ? rectF2.left + hl.L(20.0f) : i4;
            float L7 = rectF2.bottom - hl.L(20.0f);
            float max2 = Math.max(Math.max(dte.a(rectF2.left, rectF2.top, L6, L7), dte.a(rectF2.left, rectF2.bottom, L6, L7)), Math.max(dte.a(rectF2.right, rectF2.top, L6, L7), dte.a(rectF2.right, rectF2.bottom, L6, L7))) * d2;
            if (qb1Var.N0 == null) {
                Paint paint6 = new Paint(i2);
                qb1Var.N0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                float[] fArr3 = new float[i3];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 0.6f;
                fArr3[2] = 1.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, fArr3, tileMode);
                qb1Var.O0 = radialGradient;
                qb1Var.N0.setShader(radialGradient);
                qb1Var.R0 = new Matrix();
                Paint paint7 = new Paint(1);
                qb1Var.P0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                qb1Var.Q0 = radialGradient2;
                qb1Var.P0.setShader(radialGradient2);
            }
            qb1Var.R0.reset();
            qb1Var.R0.postTranslate(L6, L7);
            qb1Var.R0.preScale(Math.max(1.0f, max2) / 16.0f, Math.max(1.0f, max2) / 16.0f);
            qb1Var.O0.setLocalMatrix(qb1Var.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f2, f2, qb1Var.N0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, jn7.d4, 31);
            qb1Var.j(canvas2, rectF2);
            qb1Var.R0.reset();
            qb1Var.R0.postTranslate(L6, L7);
            qb1Var.R0.preScale(Math.max(1.0f, max2) / 16.0f, Math.max(1.0f, max2) / 16.0f);
            qb1Var.Q0.setLocalMatrix(qb1Var.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f2, f2, qb1Var.P0);
            canvas2.restore();
            canvas2.restore();
            if (!(qb1Var instanceof hbb)) {
                qb1Var.k(canvas2, rectF2, d2);
            }
        }
        canvas2.restore();
        if (qb1Var.h0 == null) {
            Path path4 = qb1Var.J0;
            path4.rewind();
            path4.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            sdb sdbVar = qb1Var.c;
            sdbVar.m = f2;
            sdbVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            sdbVar.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.p0) {
                int action = motionEvent.getAction();
                v41 v41Var = this.f0;
                if (action != 0 || this.p0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        v41Var.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof zb1) && ((zb1) this).O1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i = 0;
                while (true) {
                    int childCount = getChildCount();
                    kb1 kb1Var = this.f;
                    if (i >= childCount) {
                        this.M.b(false);
                        kb1Var.getEditText().setForceCursorEnd(true);
                        kb1Var.getEditText().requestFocus();
                        du3 du3Var = kb1Var.a;
                        du3Var.requestFocus();
                        hl.E3(du3Var);
                        kb1Var.getEditText().setScrollY(0);
                        v41Var.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && kb1Var != childAt) {
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
        if (this instanceof qb8) {
            max = 0.0f;
        } else {
            max = (1.0f - this.o0) * Math.max(0, (r1.getHeight() - hl.L(82.0f)) - r1.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
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
        canvas.drawRect(f, f2, rectF.right, hl.L(10.0f) + f2, paint);
        matrix.reset();
        matrix.postRotate(180.0f);
        matrix.postTranslate(0.0f, rectF.bottom);
        linearGradient.setLocalMatrix(matrix);
        canvas.drawRect(rectF.left, rectF.bottom - hl.L(10.0f), rectF.right, rectF.bottom, paint);
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
        return yac.h(this.V).p() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
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
        return Math.min(hl.L(82.0f), this.f.getHeight());
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
        kb1 kb1Var = this.f;
        if (kb1Var != null && kb1Var.getEditText() != null) {
            try {
                return kb1Var.getEditText().getSelectionEnd() - kb1Var.getEditText().getSelectionStart();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(xl0 xl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, 12);
    }

    public abstract boolean l(float f, float f2);

    public final void m() {
        invalidate();
        kb1 kb1Var = this.f;
        kb1Var.getEditText().invalidate();
        kb1Var.getEmojiButton().invalidate();
        mb1 mb1Var = this.N;
        if (mb1Var != null) {
            mb1Var.invalidate();
        }
        if (kb1Var.getEmojiView() == null || !g()) {
            return;
        }
        kb1Var.getEmojiView().invalidate();
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
            textPaint.setTextSize(hl.L(16.0f));
            String M0 = ob6.M0(2131754447, null);
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
        kb1 kb1Var = this.f;
        boolean z = kb1Var.y;
        rx5 rx5Var = this.M;
        if (z && kb1Var.getEmojiView() != null) {
            if (rx5Var.c()) {
                kb1Var.getEmojiView().z();
                return true;
            }
            eu3 eu3Var = kb1Var.d;
            if (eu3Var != null) {
                eu3Var.z();
                kb1Var.d.r(false);
            }
            return true;
        }
        if (kb1Var.e) {
            kb1Var.k(true);
            return true;
        }
        if ((!kb1Var.w && !rx5Var.c()) || rx5Var.d) {
            return false;
        }
        kb1Var.d();
        kb1Var.k(true);
        return true;
    }

    public void setAccount(int i) {
        this.V = i;
    }

    public void setBlurredBackgroundDrawableForMentions(ll0 ll0Var) {
        this.h0 = ll0Var;
    }

    public void setDialogId(long j) {
        this.y = j;
        mb1 mb1Var = this.N;
        if (mb1Var != null) {
            mb1Var.setDialogId(j);
        }
    }

    public void setOnHeightUpdate(pcc pccVar) {
        this.j0 = pccVar;
    }

    public void setOnKeyboardOpen(pcc pccVar) {
        this.k0 = pccVar;
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
        this.D0 = new pkb(charSequence2, 14.0f, hl.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new pkb(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        this.N.getAdapter().n0 = this instanceof zb1;
    }

    public void x(int i) {
        wma wmaVar = this.L;
        if (wmaVar != null) {
            wmaVar.R();
        }
        kb1 kb1Var = this.f;
        if (kb1Var.e) {
            i = Math.max(0, kb1Var.getEmojiPadding() + a());
        } else if (kb1Var.O) {
            i = Math.max(0, kb1Var.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i - (wmaVar == null ? 0 : wmaVar.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof qb8)) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.l0.cancel();
                this.l0 = null;
            }
            this.l0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            int L = hl.L(20.0f);
            ObjectAnimator objectAnimator2 = this.l0;
            if (max > L) {
                objectAnimator2.setInterpolator(hb.w);
                this.l0.setDuration(250L);
            } else {
                objectAnimator2.setInterpolator(k43.h);
                this.l0.setDuration(640L);
            }
            this.l0.start();
        }
        this.m0 = max > hl.L(20.0f);
        hb1 hb1Var = this.n0;
        hl.r(hb1Var);
        hl.c3(hb1Var);
        if (max < hl.L(20.0f)) {
            kb1Var.getEditText().clearFocus();
            kb1Var.k(true);
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

    public void t() {
    }

    public void q(boolean z) {
    }

    public void r(int i) {
    }

    public void setUiBlurBitmap(rcc rccVar) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i, int i2) {
    }

    public void k(Canvas canvas, RectF rectF, float f) {
    }
}
