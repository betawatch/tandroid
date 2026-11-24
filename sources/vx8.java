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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vx8 extends Drawable implements Animator.AnimatorListener {
    public static final RectF c0 = new RectF();
    public static final Rect d0 = new Rect();
    public static final int[] e0 = new int[2];
    public static final pm f0 = new pm("openFactor", (byte) 11);
    public static final pm g0 = new pm("openFactor", (byte) 12);
    public final gb2 E;
    public final k27 F;
    public float G;
    public Bitmap J;
    public BitmapShader K;
    public Paint M;
    public zk0 Q;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public t11 X;
    public float Y;
    public float Z;
    public final wx8 a;
    public final lw8 b;
    public final LinearGradient f;
    public final sx8[] x;
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

    public vx8(wx8 wx8Var, gb2 gb2Var, ArrayList arrayList, lw8 lw8Var) {
        this.b = lw8Var;
        this.a = wx8Var;
        this.E = gb2Var;
        this.F = gb2Var.getMessageObject();
        this.x = new sx8[Math.min(5, arrayList.size())];
        int i = 0;
        while (true) {
            sx8[] sx8VarArr = this.x;
            if (i >= sx8VarArr.length) {
                this.c.setStyle(Paint.Style.FILL);
                Drawable mutate = wx8Var.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.y = mutate;
                gb2Var.setHideSideButtonByQuickShare(true);
                wx8Var.performHapticFeedback(3, 1);
                int v0 = bkb.v0(bkb.F8, this.E.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.Je, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(100.0f), new int[]{v0, 16777215 & v0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.a0;
                LinearInterpolator linearInterpolator = ux8.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.a0.addListener(this);
                this.b0.setInterpolator(linearInterpolator);
                this.b0.addListener(this);
                gl.j2(new zf7(this, (byte) 26), 15.0f);
                return;
            }
            sx8VarArr[i] = new sx8(this, ((Long) arrayList.get(i)).longValue());
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
        float d = ls6.d(f9, f7, sqrt, f);
        float d2 = ls6.d(f9, f8, sqrt, f2);
        float f10 = (f8 * sqrt2) / sqrt;
        float f11 = d + f10;
        float f12 = (sqrt2 * f7) / sqrt;
        float f13 = d2 - f12;
        float f14 = d - f10;
        float f15 = d2 + f12;
        return (f11 == f14 || f11 >= f14) ? f13 > f15 ? new PointF(f11, f13) : new PointF(f14, f15) : z ? new PointF(f11, f13) : new PointF(f14, f15);
    }

    public static float g(float f, float f2, float f3) {
        return tb4.A(f2, f, f3, f);
    }

    public static tx8 i(Interpolator interpolator, int i, int i2, int i3, boolean z) {
        float f = i3;
        return new tx8(z, i / f, i2 / f, interpolator);
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
            zk0 zk0Var = new zk0(new k88((Object) this, (byte) 17));
            this.Q = zk0Var;
            RectF rectF = this.r;
            zk0Var.a((int) rectF.width(), (int) (rectF.height() + gl.L(30.0f)), 4.0f, gl.L(10.0f));
        }
        invalidateSelf();
    }

    public final void d() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.E.setHideSideButtonByQuickShare(false);
        if (this.U) {
            return;
        }
        this.U = true;
        Bitmap bitmap4 = this.J;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        zk0 zk0Var = this.Q;
        if (zk0Var != null && (bitmap3 = zk0Var.c) != null) {
            bitmap3.recycle();
            zk0Var.c = null;
        }
        for (sx8 sx8Var : this.x) {
            zk0 zk0Var2 = sx8Var.f;
            if (zk0Var2 != null && (bitmap2 = zk0Var2.c) != null) {
                bitmap2.recycle();
                zk0Var2.c = null;
            }
            zk0 zk0Var3 = sx8Var.e;
            if (zk0Var3 != null && (bitmap = zk0Var3.c) != null) {
                bitmap.recycle();
                zk0Var3.c = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        e(canvas, false, kk7.d4);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0439  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, boolean z, int i) {
        float f;
        float f2;
        wx8 wx8Var;
        float f3;
        float f4;
        int i2;
        final sx8 sx8Var;
        float f5;
        int i3;
        RectF rectF;
        float f6;
        int i4;
        final byte b;
        zk0 zk0Var;
        vx8 vx8Var = this;
        boolean z2 = vx8Var.T;
        wx8 wx8Var2 = vx8Var.a;
        byte b2 = 0;
        gb2 gb2Var = vx8Var.E;
        if (!z2) {
            int[] iArr = e0;
            gb2Var.getLocationInWindow(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            wx8Var2.getLocationInWindow(iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            vx8Var.V = i5 - i7;
            vx8Var.W = i6 - i8;
            float L = gl.L(16.0f);
            float sideButtonStartX = gb2Var.getSideButtonStartX() + vx8Var.V + L;
            float sideButtonStartY = gb2Var.getSideButtonStartY() + vx8Var.W + L;
            float f7 = sideButtonStartX - L;
            float f8 = sideButtonStartY - L;
            float f9 = sideButtonStartX + L;
            float f10 = sideButtonStartY + L;
            RectF rectF2 = vx8Var.h;
            rectF2.set(f7, f8, f9, f10);
            float L2 = gl.L(16.0f);
            if (rectF2.right + gl.L(48.0f) + L2 > wx8Var2.getMeasuredWidth()) {
                vx8Var.G = Math.max(0.0f, (wx8Var2.getMeasuredWidth() - L2) - rectF2.right);
            } else if (((rectF2.right + gl.L(48.0f)) - vx8Var.h()) - L2 < 0.0f) {
                vx8Var.G = Math.max(0.0f, (L2 + vx8Var.h()) - rectF2.right);
            } else {
                vx8Var.G = gl.L(48.0f);
            }
            vx8Var.a0.start();
            vx8Var.T = true;
        }
        zk0 zk0Var2 = vx8Var.Q;
        float f11 = 53.0f;
        sx8[] sx8VarArr = vx8Var.x;
        int i9 = 2;
        RectF rectF3 = vx8Var.r;
        if (zk0Var2 != null && !z) {
            zk0Var2.setBounds((int) rectF3.left, (int) (rectF3.top - gl.L(30.0f)), (int) rectF3.right, (int) rectF3.bottom);
            vx8Var.Q.i = (int) ((1.0f - ux8.c.getInterpolation(vx8Var.I)) * 255.0f);
            vx8Var.Q.draw(canvas);
            if (vx8Var.S != -1) {
                float interpolation = 1.0f - ux8.e.getInterpolation(vx8Var.I);
                float interpolation2 = ux8.d.getInterpolation(vx8Var.I);
                float centerX = rectF3.centerX() + (gl.L(53.0f) * (vx8Var.S - 2));
                float centerY = rectF3.centerY();
                float f12 = vx8Var.Y;
                float f13 = vx8Var.Z;
                float f14 = (centerX + f12) / 2.0f;
                t11 t11Var = vx8Var.X;
                float min = (t11Var == null || !t11Var.top) ? Math.min(centerY, f13) - gl.L(15.0f) : Math.max(centerY, f13) + gl.L(15.0f);
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
                float g3 = g((gl.L(42.0f) / 2.0f) + gl.L(2.0f), gl.L(12.0f), interpolation2);
                final sx8 sx8Var2 = sx8VarArr[vx8Var.S];
                if (sx8Var2.e == null) {
                    final byte b3 = 1;
                    zk0 zk0Var3 = new zk0(new yk0() { // from class: rx8
                        @Override // yk0
                        public final void s(Canvas canvas2, int i10) {
                            switch (b3) {
                                case 0:
                                    sx8 sx8Var3 = sx8Var2;
                                    sx8Var3.getClass();
                                    canvas2.save();
                                    canvas2.translate(-sx8Var3.i, -sx8Var3.j);
                                    float f16 = sx8Var3.i;
                                    float f17 = sx8Var3.j;
                                    float f18 = i10 / 255.0f;
                                    RectF rectF4 = gl.P;
                                    float L3 = gl.L(21.0f) / 2.0f;
                                    rectF4.set(f16, f17, sx8Var3.h.getWidth() + f16 + (gl.L(8.0f) << 1), gl.L(21.0f) + f17);
                                    gb2 gb2Var2 = sx8Var3.b;
                                    boolean i22 = gb2Var2.i2();
                                    Paint paint = sx8Var3.g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f18));
                                        canvas2.drawRoundRect(rectF4, L3, L3, paint);
                                        paint.setAlpha(alpha);
                                    } else {
                                        Point point = gl.q;
                                        gb2Var2.A(0.0f, 0.0f, point.x, point.y);
                                        Paint c2 = gb2Var2.c2("paintChatActionBackground");
                                        int alpha2 = c2.getAlpha();
                                        c2.setAlpha((int) ((i22 ? alpha2 : 229.5f) * f18));
                                        canvas2.drawRoundRect(rectF4, L3, L3, c2);
                                        c2.setAlpha(alpha2);
                                    }
                                    if (i22 || paint != null) {
                                        int alpha3 = bkb.g2.getAlpha();
                                        bkb.g2.setAlpha((int) (alpha3 * f18));
                                        canvas2.drawRoundRect(rectF4, L3, L3, bkb.g2);
                                        bkb.g2.setAlpha(alpha3);
                                    }
                                    canvas2.save();
                                    canvas2.translate(f16 + gl.L(8.0f), ((gl.L(21.0f) - sx8Var3.h.getHeight()) / 2.0f) + f17);
                                    int alpha4 = sx8Var3.h.getPaint().getAlpha();
                                    sx8Var3.h.getPaint().setAlpha((int) (alpha4 * f18));
                                    sx8Var3.h.draw(canvas2);
                                    sx8Var3.h.getPaint().setAlpha(alpha4);
                                    canvas2.restore();
                                    canvas2.restore();
                                    break;
                                default:
                                    float L4 = gl.L(21.0f);
                                    sx8Var2.a(L4, L4, L4, i10 / 255.0f, canvas2);
                                    break;
                            }
                        }
                    });
                    sx8Var2.e = zk0Var3;
                    zk0Var3.a(gl.L(42.0f), gl.L(42.0f), 4.0f, gl.L(10.0f));
                }
                canvas.save();
                canvas.translate(g - g3, f15 - g3);
                canvas.scale(g3 / gl.L(21.0f), g3 / gl.L(21.0f));
                zk0 zk0Var4 = sx8Var2.e;
                zk0Var4.i = (int) (interpolation * 255.0f);
                zk0Var4.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f16 = !z ? 1.0f - vx8Var.I : i / 255.0f;
        float g4 = g(0.3f, 0.075f, ux8.k.getInterpolation(vx8Var.H));
        Matrix matrix = vx8Var.d;
        matrix.reset();
        matrix.setScale(g4, g4);
        matrix.postTranslate(0.0f, rectF3.bottom);
        vx8Var.f.setLocalMatrix(matrix);
        int interpolation3 = (int) (ux8.j.getInterpolation(vx8Var.H) * 255.0f * f16);
        Paint paint = vx8Var.c;
        paint.setAlpha(interpolation3);
        RectF rectF4 = c0;
        rectF4.set(rectF3);
        float f17 = 8.0f;
        rectF4.inset(-gl.L(8.0f), -gl.L(8.0f));
        Rect rect = d0;
        rectF4.round(rect);
        Drawable drawable = vx8Var.y;
        drawable.setAlpha((int) (f16 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z3 = vx8Var.N;
        RectF rectF5 = vx8Var.n;
        if (z3) {
            f = 16.0f;
        } else {
            f = 16.0f;
            float interpolation4 = (ux8.f.getInterpolation(vx8Var.H) - ux8.g.getInterpolation(vx8Var.H)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF5.left, rectF5.top);
            canvas.rotate(interpolation4, gl.L(16.0f), gl.L(16.0f));
            canvas.translate(-gb2Var.getSideButtonStartX(), -gb2Var.getSideButtonStartY());
            gb2Var.x1(canvas, true);
            canvas.restore();
        }
        if (!vx8Var.R || vx8Var.N) {
            float min2 = Math.min(rectF3.width(), rectF3.height()) / 2.0f;
            float min3 = Math.min(rectF5.width(), rectF5.height()) / 2.0f;
            canvas.drawRoundRect(rectF3, min2, min2, paint);
            if (!vx8Var.N) {
                canvas.drawRoundRect(rectF5, min3, min3, paint);
            }
        } else {
            canvas.drawPath(vx8Var.e, paint);
        }
        float interpolation5 = ux8.t.getInterpolation(vx8Var.H) * gl.L(2.0f);
        float interpolation6 = ((ux8.q.getInterpolation(vx8Var.H) * gl.L(44.0f)) / 2.0f) - interpolation5;
        float interpolation7 = ((ux8.r.getInterpolation(vx8Var.H) * gl.L(44.0f)) / 2.0f) - interpolation5;
        float interpolation8 = ((ux8.s.getInterpolation(vx8Var.H) * gl.L(44.0f)) / 2.0f) - interpolation5;
        int i10 = 0;
        while (i10 < i9) {
            int i11 = b2;
            while (i11 < sx8VarArr.length) {
                if (!(i10 == 0 && i11 == vx8Var.S) && (i10 != 1 || i11 == vx8Var.S)) {
                    f2 = f17;
                    float length = i11 - ((sx8VarArr.length / 2.0f) - 0.5f);
                    float f18 = i11 == i9 ? interpolation6 : (i11 == 1 || i11 == 3) ? interpolation7 : interpolation8;
                    float L3 = (gl.L(f11) * length) + rectF3.centerX();
                    float centerY2 = rectF3.centerY();
                    sx8 sx8Var3 = sx8VarArr[i11];
                    float L4 = gl.L(f);
                    float measuredWidth = wx8Var2.getMeasuredWidth() - gl.L(f);
                    wx8Var = wx8Var2;
                    float f19 = rectF3.left;
                    f3 = interpolation8;
                    float f20 = rectF3.right;
                    if (i11 == vx8Var.S && vx8Var.P) {
                        f4 = L3;
                        i2 = i11;
                        sx8Var = sx8Var3;
                        f5 = measuredWidth;
                        i3 = 2;
                        rectF = rectF3;
                        f6 = f16;
                    } else {
                        sx8Var3.getClass();
                        float L5 = (gl.L(2.0f) * sx8Var3.o) + f18;
                        i2 = i11;
                        sx8Var = sx8Var3;
                        f5 = measuredWidth;
                        i3 = 2;
                        rectF = rectF3;
                        f6 = f16;
                        f4 = L3;
                        sx8Var.a(f4, centerY2, L5, f6, canvas);
                    }
                    float f21 = sx8Var.o;
                    i4 = i2;
                    if (f21 <= 0.0f || sx8Var.h == null) {
                        b = 0;
                    } else {
                        float f22 = (f21 * 0.15f) + 0.85f;
                        canvas.save();
                        canvas.scale(f22, f22, f4, centerY2);
                        float f23 = sx8Var.o * f6;
                        float width = sx8Var.h.getWidth() + (gl.L(f2) << 1);
                        sx8Var.i = sx8.b(sx8.b(f4, width, f19, f20), width, L4, f5) - (width / 2.0f);
                        sx8Var.j = centerY2 - gl.L(58.0f);
                        if (sx8Var.f == null) {
                            vx8 vx8Var2 = sx8Var.a;
                            if (!vx8Var2.U) {
                                sx8Var.g = vx8Var2.M;
                                b = 0;
                                zk0 zk0Var5 = new zk0(new yk0() { // from class: rx8
                                    @Override // yk0
                                    public final void s(Canvas canvas2, int i102) {
                                        switch (b) {
                                            case 0:
                                                sx8 sx8Var32 = sx8Var;
                                                sx8Var32.getClass();
                                                canvas2.save();
                                                canvas2.translate(-sx8Var32.i, -sx8Var32.j);
                                                float f162 = sx8Var32.i;
                                                float f172 = sx8Var32.j;
                                                float f182 = i102 / 255.0f;
                                                RectF rectF42 = gl.P;
                                                float L32 = gl.L(21.0f) / 2.0f;
                                                rectF42.set(f162, f172, sx8Var32.h.getWidth() + f162 + (gl.L(8.0f) << 1), gl.L(21.0f) + f172);
                                                gb2 gb2Var2 = sx8Var32.b;
                                                boolean i22 = gb2Var2.i2();
                                                Paint paint2 = sx8Var32.g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f182));
                                                    canvas2.drawRoundRect(rectF42, L32, L32, paint2);
                                                    paint2.setAlpha(alpha);
                                                } else {
                                                    Point point = gl.q;
                                                    gb2Var2.A(0.0f, 0.0f, point.x, point.y);
                                                    Paint c2 = gb2Var2.c2("paintChatActionBackground");
                                                    int alpha2 = c2.getAlpha();
                                                    c2.setAlpha((int) ((i22 ? alpha2 : 229.5f) * f182));
                                                    canvas2.drawRoundRect(rectF42, L32, L32, c2);
                                                    c2.setAlpha(alpha2);
                                                }
                                                if (i22 || paint2 != null) {
                                                    int alpha3 = bkb.g2.getAlpha();
                                                    bkb.g2.setAlpha((int) (alpha3 * f182));
                                                    canvas2.drawRoundRect(rectF42, L32, L32, bkb.g2);
                                                    bkb.g2.setAlpha(alpha3);
                                                }
                                                canvas2.save();
                                                canvas2.translate(f162 + gl.L(8.0f), ((gl.L(21.0f) - sx8Var32.h.getHeight()) / 2.0f) + f172);
                                                int alpha4 = sx8Var32.h.getPaint().getAlpha();
                                                sx8Var32.h.getPaint().setAlpha((int) (alpha4 * f182));
                                                sx8Var32.h.draw(canvas2);
                                                sx8Var32.h.getPaint().setAlpha(alpha4);
                                                canvas2.restore();
                                                canvas2.restore();
                                                break;
                                            default:
                                                float L42 = gl.L(21.0f);
                                                sx8Var.a(L42, L42, L42, i102 / 255.0f, canvas2);
                                                break;
                                        }
                                    }
                                });
                                sx8Var.f = zk0Var5;
                                zk0Var5.a((int) width, gl.L(21.0f), 3.0f, gl.L(4.0f));
                                zk0Var = sx8Var.f;
                                if (zk0Var != null) {
                                    float f24 = sx8Var.i;
                                    float f25 = sx8Var.j;
                                    zk0Var.setBounds((int) f24, (int) f25, (int) (f24 + width), (int) (f25 + gl.L(21.0f)));
                                    zk0 zk0Var6 = sx8Var.f;
                                    zk0Var6.i = (int) (f23 * 255.0f);
                                    zk0Var6.draw(canvas);
                                }
                                canvas.restore();
                            }
                        }
                        b = 0;
                        zk0Var = sx8Var.f;
                        if (zk0Var != null) {
                        }
                        canvas.restore();
                    }
                } else {
                    i4 = i11;
                    i3 = i9;
                    rectF = rectF3;
                    wx8Var = wx8Var2;
                    f3 = interpolation8;
                    b = b2;
                    f2 = f17;
                    f6 = f16;
                }
                i11 = i4 + 1;
                vx8Var = this;
                f17 = f2;
                f16 = f6;
                b2 = b;
                rectF3 = rectF;
                i9 = i3;
                wx8Var2 = wx8Var;
                interpolation8 = f3;
                f11 = 53.0f;
            }
            i10++;
            vx8Var = this;
            rectF3 = rectF3;
            wx8Var2 = wx8Var2;
            f11 = 53.0f;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return gl.L((53 * this.x.length) + 7);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.a0;
        lw8 lw8Var = this.b;
        if (animator == objectAnimator) {
            this.E.setHideSideButtonByQuickShare(false);
            this.N = true;
            invalidateSelf();
            if (this.O) {
                lw8Var.run();
                return;
            }
            return;
        }
        if (animator == this.b0) {
            this.O = true;
            invalidateSelf();
            t11 t11Var = this.X;
            if (t11Var != null) {
                t11Var.a.setVisibility(0);
            }
            if (this.N) {
                lw8Var.run();
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
