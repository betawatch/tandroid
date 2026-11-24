// default package

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wz8 extends Drawable implements Animator.AnimatorListener {
    public static final RectF c0 = new RectF();
    public static final Rect d0 = new Rect();
    public static final int[] e0 = new int[2];
    public static final pn f0 = new pn("openFactor", (byte) 11);
    public static final pn g0 = new pn("openFactor", (byte) 12);
    public final rc2 E;
    public final k47 F;
    public float G;
    public Bitmap J;
    public BitmapShader K;
    public Paint M;
    public zl0 Q;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public b31 X;
    public float Y;
    public float Z;
    public final xz8 a;
    public final ey8 b;
    public final LinearGradient f;
    public final tz8[] x;
    public final Drawable y;
    public final Paint c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF n = new RectF();
    public final RectF r = new RectF();
    public final RectF s = new RectF();
    public final RectF w = new RectF();
    public float H = 0.0f;
    public float I = 0.0f;
    public final Matrix L = new Matrix();
    public boolean N = false;
    public boolean O = false;
    public boolean P = false;
    public boolean R = true;
    public int S = -1;
    public final ObjectAnimator a0 = ObjectAnimator.ofFloat(this, f0, 1.0f).setDuration(560L);
    public final ObjectAnimator b0 = ObjectAnimator.ofFloat(this, g0, 1.0f).setDuration(240L);

    public wz8(xz8 xz8Var, rc2 rc2Var, ArrayList arrayList, ey8 ey8Var) {
        this.b = ey8Var;
        this.a = xz8Var;
        this.E = rc2Var;
        this.F = rc2Var.getMessageObject();
        this.x = new tz8[Math.min(5, arrayList.size())];
        int i = 0;
        while (true) {
            tz8[] tz8VarArr = this.x;
            if (i >= tz8VarArr.length) {
                this.c.setStyle(Paint.Style.FILL);
                Drawable mutate = xz8Var.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.y = mutate;
                rc2Var.setHideSideButtonByQuickShare(true);
                xz8Var.performHapticFeedback(3, 1);
                int v0 = cmb.v0(cmb.F8, this.E.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.Je, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(100.0f), new int[]{v0, 16777215 & v0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.a0;
                LinearInterpolator linearInterpolator = vz8.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.a0.addListener(this);
                this.b0.setInterpolator(linearInterpolator);
                this.b0.addListener(this);
                gm.j2(new ci7(this, (byte) 26), 15.0f);
                return;
            }
            tz8VarArr[i] = new tz8(this, ((Long) arrayList.get(i)).longValue());
            i++;
        }
    }

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.toDegrees((float) Math.atan2(f4 - f2, f3 - f));
    }

    public static PointF f(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float sqrt = (float) Math.sqrt(Math.pow(f8, 2.0d) + Math.pow(f7, 2.0d));
        if (sqrt > f3 + f6 || sqrt < Math.abs(f3 - f6)) {
            return null;
        }
        float f9 = ((sqrt * sqrt) + ((f3 * f3) - (f6 * f6))) / (2.0f * sqrt);
        float sqrt2 = (float) Math.sqrt(r8 - (f9 * f9));
        float d = kt6.d(f9, f7, sqrt, f);
        float d2 = kt6.d(f9, f8, sqrt, f2);
        float f10 = (f8 * sqrt2) / sqrt;
        float f11 = d + f10;
        float f12 = (sqrt2 * f7) / sqrt;
        float f13 = d2 - f12;
        float f14 = d - f10;
        float f15 = d2 + f12;
        return (f11 == f14 || f11 >= f14) ? f13 > f15 ? new PointF(f11, f13) : new PointF(f14, f15) : z ? new PointF(f11, f13) : new PointF(f14, f15);
    }

    public static float g(float f, float f2, float f3) {
        return td4.A(f2, f, f3, f);
    }

    public static uz8 i(Interpolator interpolator, int i, int i2, int i3, boolean z) {
        float f = i3;
        return new uz8(z, i / f, i2 / f, interpolator);
    }

    public static float j(float f) {
        return f <= 0.0f ? f + 180.0f : f - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f, float f2, boolean z, boolean z2) {
        float f3 = f2 - f;
        if (z) {
            if (f3 > 0.0f) {
                f3 -= 360.0f;
            }
        } else if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        if (Math.abs(f3) > 270.0f && z2) {
            this.R = false;
        }
        path.arcTo(rectF, f, f3);
    }

    public final void c() {
        this.b0.start();
        this.P = true;
        if (this.N && !this.U) {
            zl0 zl0Var = new zl0(new h68((Object) this, (byte) 21));
            this.Q = zl0Var;
            RectF rectF = this.r;
            zl0Var.b((int) rectF.width(), (int) (rectF.height() + gm.L(30.0f)), 4.0f, gm.L(10.0f));
        }
        invalidateSelf();
    }

    public final void d() {
        this.E.setHideSideButtonByQuickShare(false);
        if (this.U) {
            return;
        }
        this.U = true;
        Bitmap bitmap = this.J;
        if (bitmap != null) {
            bitmap.recycle();
        }
        zl0 zl0Var = this.Q;
        if (zl0Var != null) {
            zl0Var.a();
        }
        for (tz8 tz8Var : this.x) {
            zl0 zl0Var2 = tz8Var.f;
            if (zl0Var2 != null) {
                zl0Var2.a();
            }
            zl0 zl0Var3 = tz8Var.e;
            if (zl0Var3 != null) {
                zl0Var3.a();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        e(canvas, false, nm7.d4);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0439  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, boolean z, int i) {
        float f;
        float f2;
        xz8 xz8Var;
        float f3;
        float f4;
        int i2;
        final tz8 tz8Var;
        float f5;
        int i3;
        RectF rectF;
        float f6;
        int i4;
        final byte b;
        zl0 zl0Var;
        wz8 wz8Var = this;
        boolean z2 = wz8Var.T;
        xz8 xz8Var2 = wz8Var.a;
        byte b2 = 0;
        rc2 rc2Var = wz8Var.E;
        if (!z2) {
            int[] iArr = e0;
            rc2Var.getLocationInWindow(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            xz8Var2.getLocationInWindow(iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            wz8Var.V = i5 - i7;
            wz8Var.W = i6 - i8;
            float L = gm.L(16.0f);
            float sideButtonStartX = rc2Var.getSideButtonStartX() + wz8Var.V + L;
            float sideButtonStartY = rc2Var.getSideButtonStartY() + wz8Var.W + L;
            float f7 = sideButtonStartX - L;
            float f8 = sideButtonStartY - L;
            float f9 = sideButtonStartX + L;
            float f10 = sideButtonStartY + L;
            RectF rectF2 = wz8Var.h;
            rectF2.set(f7, f8, f9, f10);
            float L2 = gm.L(16.0f);
            if (rectF2.right + gm.L(48.0f) + L2 > xz8Var2.getMeasuredWidth()) {
                wz8Var.G = Math.max(0.0f, (xz8Var2.getMeasuredWidth() - L2) - rectF2.right);
            } else if (((rectF2.right + gm.L(48.0f)) - wz8Var.h()) - L2 < 0.0f) {
                wz8Var.G = Math.max(0.0f, (L2 + wz8Var.h()) - rectF2.right);
            } else {
                wz8Var.G = gm.L(48.0f);
            }
            wz8Var.a0.start();
            wz8Var.T = true;
        }
        zl0 zl0Var2 = wz8Var.Q;
        float f11 = 53.0f;
        tz8[] tz8VarArr = wz8Var.x;
        int i9 = 2;
        RectF rectF3 = wz8Var.r;
        if (zl0Var2 != null && !z) {
            zl0Var2.setBounds((int) rectF3.left, (int) (rectF3.top - gm.L(30.0f)), (int) rectF3.right, (int) rectF3.bottom);
            wz8Var.Q.i = (int) ((1.0f - vz8.c.getInterpolation(wz8Var.I)) * 255.0f);
            wz8Var.Q.draw(canvas);
            if (wz8Var.S != -1) {
                float interpolation = 1.0f - vz8.e.getInterpolation(wz8Var.I);
                float interpolation2 = vz8.d.getInterpolation(wz8Var.I);
                float centerX = rectF3.centerX() + (gm.L(53.0f) * (wz8Var.S - 2));
                float centerY = rectF3.centerY();
                float f12 = wz8Var.Y;
                float f13 = wz8Var.Z;
                float f14 = (centerX + f12) / 2.0f;
                b31 b31Var = wz8Var.X;
                float min = (b31Var == null || !b31Var.top) ? Math.min(centerY, f13) - gm.L(15.0f) : Math.max(centerY, f13) + gm.L(15.0f);
                float g = g(centerX, f12, interpolation2);
                double d = centerX;
                double d2 = centerY;
                double d3 = f12;
                double d4 = f13;
                double d5 = f14;
                double d6 = d3 - d;
                double d7 = ((d3 * d) + ((d5 * d5) - (d3 * d5))) - (d5 * d);
                double d8 = d7 == 0.0d ? 0.0d : ((min - (((d4 - d2) * (d5 - d)) / d6)) - d2) / d7;
                double d9 = d * d;
                double d10 = d6 != 0.0d ? ((d4 - (((d3 * d3) - d9) * d8)) - d2) / d6 : 0.0d;
                double g2 = g(centerX, f12, interpolation2);
                float f15 = (float) ((d10 * g2) + (d8 * g2 * g2) + ((d2 - (d9 * d8)) - (d10 * d)));
                float g3 = g((gm.L(42.0f) / 2.0f) + gm.L(2.0f), gm.L(12.0f), interpolation2);
                final tz8 tz8Var2 = tz8VarArr[wz8Var.S];
                if (tz8Var2.e == null) {
                    final byte b3 = 1;
                    zl0 zl0Var3 = new zl0(new yl0() { // from class: sz8
                        @Override // yl0
                        public final void n(Canvas canvas2, int i10) {
                            switch (b3) {
                                case 0:
                                    tz8 tz8Var3 = tz8Var2;
                                    tz8Var3.getClass();
                                    canvas2.save();
                                    canvas2.translate(-tz8Var3.i, -tz8Var3.j);
                                    float f16 = tz8Var3.i;
                                    float f17 = tz8Var3.j;
                                    float f18 = i10 / 255.0f;
                                    RectF rectF4 = gm.P;
                                    float L3 = gm.L(21.0f) / 2.0f;
                                    rectF4.set(f16, f17, tz8Var3.h.getWidth() + f16 + (gm.L(8.0f) << 1), gm.L(21.0f) + f17);
                                    rc2 rc2Var2 = tz8Var3.b;
                                    boolean i22 = rc2Var2.i2();
                                    Paint paint = tz8Var3.g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f18));
                                        canvas2.drawRoundRect(rectF4, L3, L3, paint);
                                        paint.setAlpha(alpha);
                                    } else {
                                        Point point = gm.q;
                                        rc2Var2.y(0.0f, 0.0f, point.x, point.y);
                                        Paint c2 = rc2Var2.c2("paintChatActionBackground");
                                        int alpha2 = c2.getAlpha();
                                        c2.setAlpha((int) ((i22 ? alpha2 : 229.5f) * f18));
                                        canvas2.drawRoundRect(rectF4, L3, L3, c2);
                                        c2.setAlpha(alpha2);
                                    }
                                    if (i22 || paint != null) {
                                        int alpha3 = cmb.g2.getAlpha();
                                        cmb.g2.setAlpha((int) (alpha3 * f18));
                                        canvas2.drawRoundRect(rectF4, L3, L3, cmb.g2);
                                        cmb.g2.setAlpha(alpha3);
                                    }
                                    canvas2.save();
                                    canvas2.translate(f16 + gm.L(8.0f), ((gm.L(21.0f) - tz8Var3.h.getHeight()) / 2.0f) + f17);
                                    int alpha4 = tz8Var3.h.getPaint().getAlpha();
                                    tz8Var3.h.getPaint().setAlpha((int) (alpha4 * f18));
                                    tz8Var3.h.draw(canvas2);
                                    tz8Var3.h.getPaint().setAlpha(alpha4);
                                    canvas2.restore();
                                    canvas2.restore();
                                    break;
                                default:
                                    float L4 = gm.L(21.0f);
                                    tz8Var2.a(L4, L4, L4, i10 / 255.0f, canvas2);
                                    break;
                            }
                        }
                    });
                    tz8Var2.e = zl0Var3;
                    zl0Var3.b(gm.L(42.0f), gm.L(42.0f), 4.0f, gm.L(10.0f));
                }
                canvas.save();
                canvas.translate(g - g3, f15 - g3);
                canvas.scale(g3 / gm.L(21.0f), g3 / gm.L(21.0f));
                zl0 zl0Var4 = tz8Var2.e;
                zl0Var4.i = (int) (interpolation * 255.0f);
                zl0Var4.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f16 = !z ? 1.0f - wz8Var.I : i / 255.0f;
        float g4 = g(0.3f, 0.075f, vz8.k.getInterpolation(wz8Var.H));
        Matrix matrix = wz8Var.d;
        matrix.reset();
        matrix.setScale(g4, g4);
        matrix.postTranslate(0.0f, rectF3.bottom);
        wz8Var.f.setLocalMatrix(matrix);
        int interpolation3 = (int) (vz8.j.getInterpolation(wz8Var.H) * 255.0f * f16);
        Paint paint = wz8Var.c;
        paint.setAlpha(interpolation3);
        RectF rectF4 = c0;
        rectF4.set(rectF3);
        float f17 = 8.0f;
        rectF4.inset(-gm.L(8.0f), -gm.L(8.0f));
        Rect rect = d0;
        rectF4.round(rect);
        Drawable drawable = wz8Var.y;
        drawable.setAlpha((int) (f16 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z3 = wz8Var.N;
        RectF rectF5 = wz8Var.n;
        if (z3) {
            f = 16.0f;
        } else {
            f = 16.0f;
            float interpolation4 = (vz8.f.getInterpolation(wz8Var.H) - vz8.g.getInterpolation(wz8Var.H)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF5.left, rectF5.top);
            canvas.rotate(interpolation4, gm.L(16.0f), gm.L(16.0f));
            canvas.translate(-rc2Var.getSideButtonStartX(), -rc2Var.getSideButtonStartY());
            rc2Var.x1(canvas, true);
            canvas.restore();
        }
        if (!wz8Var.R || wz8Var.N) {
            float min2 = Math.min(rectF3.width(), rectF3.height()) / 2.0f;
            float min3 = Math.min(rectF5.width(), rectF5.height()) / 2.0f;
            canvas.drawRoundRect(rectF3, min2, min2, paint);
            if (!wz8Var.N) {
                canvas.drawRoundRect(rectF5, min3, min3, paint);
            }
        } else {
            canvas.drawPath(wz8Var.e, paint);
        }
        float interpolation5 = vz8.t.getInterpolation(wz8Var.H) * gm.L(2.0f);
        float interpolation6 = ((vz8.q.getInterpolation(wz8Var.H) * gm.L(44.0f)) / 2.0f) - interpolation5;
        float interpolation7 = ((vz8.r.getInterpolation(wz8Var.H) * gm.L(44.0f)) / 2.0f) - interpolation5;
        float interpolation8 = ((vz8.s.getInterpolation(wz8Var.H) * gm.L(44.0f)) / 2.0f) - interpolation5;
        int i10 = 0;
        while (i10 < i9) {
            int i11 = b2;
            while (i11 < tz8VarArr.length) {
                if (!(i10 == 0 && i11 == wz8Var.S) && (i10 != 1 || i11 == wz8Var.S)) {
                    f2 = f17;
                    float length = i11 - ((tz8VarArr.length / 2.0f) - 0.5f);
                    float f18 = i11 == i9 ? interpolation6 : (i11 == 1 || i11 == 3) ? interpolation7 : interpolation8;
                    float L3 = (gm.L(f11) * length) + rectF3.centerX();
                    float centerY2 = rectF3.centerY();
                    tz8 tz8Var3 = tz8VarArr[i11];
                    float L4 = gm.L(f);
                    float measuredWidth = xz8Var2.getMeasuredWidth() - gm.L(f);
                    xz8Var = xz8Var2;
                    float f19 = rectF3.left;
                    f3 = interpolation8;
                    float f20 = rectF3.right;
                    if (i11 == wz8Var.S && wz8Var.P) {
                        f4 = L3;
                        i2 = i11;
                        tz8Var = tz8Var3;
                        f5 = measuredWidth;
                        i3 = 2;
                        rectF = rectF3;
                        f6 = f16;
                    } else {
                        tz8Var3.getClass();
                        float L5 = (gm.L(2.0f) * tz8Var3.o) + f18;
                        i2 = i11;
                        tz8Var = tz8Var3;
                        f5 = measuredWidth;
                        i3 = 2;
                        rectF = rectF3;
                        f6 = f16;
                        f4 = L3;
                        tz8Var.a(f4, centerY2, L5, f6, canvas);
                    }
                    float f21 = tz8Var.o;
                    i4 = i2;
                    if (f21 <= 0.0f || tz8Var.h == null) {
                        b = 0;
                    } else {
                        float f22 = (f21 * 0.15f) + 0.85f;
                        canvas.save();
                        canvas.scale(f22, f22, f4, centerY2);
                        float f23 = tz8Var.o * f6;
                        float width = tz8Var.h.getWidth() + (gm.L(f2) << 1);
                        tz8Var.i = tz8.b(tz8.b(f4, width, f19, f20), width, L4, f5) - (width / 2.0f);
                        tz8Var.j = centerY2 - gm.L(58.0f);
                        if (tz8Var.f == null) {
                            wz8 wz8Var2 = tz8Var.a;
                            if (!wz8Var2.U) {
                                tz8Var.g = wz8Var2.M;
                                b = 0;
                                zl0 zl0Var5 = new zl0(new yl0() { // from class: sz8
                                    @Override // yl0
                                    public final void n(Canvas canvas2, int i102) {
                                        switch (b) {
                                            case 0:
                                                tz8 tz8Var32 = tz8Var;
                                                tz8Var32.getClass();
                                                canvas2.save();
                                                canvas2.translate(-tz8Var32.i, -tz8Var32.j);
                                                float f162 = tz8Var32.i;
                                                float f172 = tz8Var32.j;
                                                float f182 = i102 / 255.0f;
                                                RectF rectF42 = gm.P;
                                                float L32 = gm.L(21.0f) / 2.0f;
                                                rectF42.set(f162, f172, tz8Var32.h.getWidth() + f162 + (gm.L(8.0f) << 1), gm.L(21.0f) + f172);
                                                rc2 rc2Var2 = tz8Var32.b;
                                                boolean i22 = rc2Var2.i2();
                                                Paint paint2 = tz8Var32.g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f182));
                                                    canvas2.drawRoundRect(rectF42, L32, L32, paint2);
                                                    paint2.setAlpha(alpha);
                                                } else {
                                                    Point point = gm.q;
                                                    rc2Var2.y(0.0f, 0.0f, point.x, point.y);
                                                    Paint c2 = rc2Var2.c2("paintChatActionBackground");
                                                    int alpha2 = c2.getAlpha();
                                                    c2.setAlpha((int) ((i22 ? alpha2 : 229.5f) * f182));
                                                    canvas2.drawRoundRect(rectF42, L32, L32, c2);
                                                    c2.setAlpha(alpha2);
                                                }
                                                if (i22 || paint2 != null) {
                                                    int alpha3 = cmb.g2.getAlpha();
                                                    cmb.g2.setAlpha((int) (alpha3 * f182));
                                                    canvas2.drawRoundRect(rectF42, L32, L32, cmb.g2);
                                                    cmb.g2.setAlpha(alpha3);
                                                }
                                                canvas2.save();
                                                canvas2.translate(f162 + gm.L(8.0f), ((gm.L(21.0f) - tz8Var32.h.getHeight()) / 2.0f) + f172);
                                                int alpha4 = tz8Var32.h.getPaint().getAlpha();
                                                tz8Var32.h.getPaint().setAlpha((int) (alpha4 * f182));
                                                tz8Var32.h.draw(canvas2);
                                                tz8Var32.h.getPaint().setAlpha(alpha4);
                                                canvas2.restore();
                                                canvas2.restore();
                                                break;
                                            default:
                                                float L42 = gm.L(21.0f);
                                                tz8Var.a(L42, L42, L42, i102 / 255.0f, canvas2);
                                                break;
                                        }
                                    }
                                });
                                tz8Var.f = zl0Var5;
                                zl0Var5.b((int) width, gm.L(21.0f), 3.0f, gm.L(4.0f));
                                zl0Var = tz8Var.f;
                                if (zl0Var != null) {
                                    float f24 = tz8Var.i;
                                    float f25 = tz8Var.j;
                                    zl0Var.setBounds((int) f24, (int) f25, (int) (f24 + width), (int) (f25 + gm.L(21.0f)));
                                    zl0 zl0Var6 = tz8Var.f;
                                    zl0Var6.i = (int) (f23 * 255.0f);
                                    zl0Var6.draw(canvas);
                                }
                                canvas.restore();
                            }
                        }
                        b = 0;
                        zl0Var = tz8Var.f;
                        if (zl0Var != null) {
                        }
                        canvas.restore();
                    }
                } else {
                    i4 = i11;
                    i3 = i9;
                    rectF = rectF3;
                    xz8Var = xz8Var2;
                    f3 = interpolation8;
                    b = b2;
                    f2 = f17;
                    f6 = f16;
                }
                i11 = i4 + 1;
                wz8Var = this;
                f17 = f2;
                f16 = f6;
                b2 = b;
                rectF3 = rectF;
                i9 = i3;
                xz8Var2 = xz8Var;
                interpolation8 = f3;
                f11 = 53.0f;
            }
            i10++;
            wz8Var = this;
            rectF3 = rectF3;
            xz8Var2 = xz8Var2;
            f11 = 53.0f;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return gm.L((53 * this.x.length) + 7);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.a0;
        ey8 ey8Var = this.b;
        if (animator == objectAnimator) {
            this.E.setHideSideButtonByQuickShare(false);
            this.N = true;
            invalidateSelf();
            if (this.O) {
                ey8Var.run();
                return;
            }
            return;
        }
        if (animator == this.b0) {
            this.O = true;
            invalidateSelf();
            b31 b31Var = this.X;
            if (b31Var != null) {
                b31Var.a.setVisibility(0);
            }
            if (this.N) {
                ey8Var.run();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
