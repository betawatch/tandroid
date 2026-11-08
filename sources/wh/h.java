package wh;

import a8.p0;
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
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.kb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h extends Drawable implements Animator.AnimatorListener {
    public static final RectF b0 = new RectF();
    public static final Rect c0 = new Rect();
    public static final int[] d0 = new int[2];
    public static final o8 e0 = new o8("openFactor", 11);
    public static final o8 f0 = new o8("openFactor", 12);
    public final q1 D;
    public final ij E;
    public float F;
    public Bitmap I;
    public BitmapShader J;
    public Paint L;
    public b P;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public kb W;
    public float X;
    public float Y;
    public final i a;
    public final u9.f b;
    public final LinearGradient f;
    public final d[] x;
    public final Drawable y;
    public final Paint c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF n = new RectF();
    public final RectF r = new RectF();
    public final RectF s = new RectF();
    public final RectF w = new RectF();
    public float G = 0.0f;
    public float H = 0.0f;
    public final Matrix K = new Matrix();
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public boolean Q = true;
    public int R = -1;
    public final ObjectAnimator Z = ObjectAnimator.ofFloat(this, e0, 1.0f).setDuration(560L);
    public final ObjectAnimator a0 = ObjectAnimator.ofFloat(this, f0, 1.0f).setDuration(240L);

    public h(i iVar, q1 q1Var, ArrayList arrayList, u9.f fVar) {
        this.b = fVar;
        this.a = iVar;
        this.D = q1Var;
        this.E = q1Var.getMessageObject();
        this.x = new d[Math.min(5, arrayList.size())];
        int i7 = 0;
        while (true) {
            d[] dVarArr = this.x;
            if (i7 >= dVarArr.length) {
                this.c.setStyle(Paint.Style.FILL);
                Drawable mutate = iVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.y = mutate;
                q1Var.setHideSideButtonByQuickShare(true);
                iVar.performHapticFeedback(3, 1);
                int w02 = k6.w0(k6.G8, this.D.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.He, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(100.0f), new int[]{w02, 16777215 & w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.Z;
                LinearInterpolator linearInterpolator = f.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.Z.addListener(this);
                this.a0.setInterpolator(linearInterpolator);
                this.a0.addListener(this);
                g0.l2(new ii.c(this, 29), 15.0f);
                return;
            }
            dVarArr[i7] = new d(this, ((Long) arrayList.get(i7)).longValue());
            i7++;
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees((float) Math.atan2(f13 - f11, f12 - f10));
    }

    public static PointF f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z9) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float sqrt = (float) Math.sqrt(Math.pow(f17, 2.0d) + Math.pow(f16, 2.0d));
        if (sqrt > f12 + f15 || sqrt < Math.abs(f12 - f15)) {
            return null;
        }
        float f18 = ((sqrt * sqrt) + ((f12 * f12) - (f15 * f15))) / (2.0f * sqrt);
        float sqrt2 = (float) Math.sqrt(r8 - (f18 * f18));
        float f19 = p0.f(f18, f16, sqrt, f10);
        float f20 = p0.f(f18, f17, sqrt, f11);
        float f21 = (f17 * sqrt2) / sqrt;
        float f22 = f19 + f21;
        float f23 = (sqrt2 * f16) / sqrt;
        float f24 = f20 - f23;
        float f25 = f19 - f21;
        float f26 = f20 + f23;
        return (f22 == f25 || f22 >= f25) ? f24 > f26 ? new PointF(f22, f24) : new PointF(f25, f26) : z9 ? new PointF(f22, f24) : new PointF(f25, f26);
    }

    public static float g(float f10, float f11, float f12) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, f12, f10);
    }

    public static e i(Interpolator interpolator, int i7, int i10, int i11, boolean z9) {
        float f10 = i11;
        return new e(z9, i7 / f10, i10 / f10, interpolator);
    }

    public static float j(float f10) {
        return f10 <= 0.0f ? f10 + 180.0f : f10 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f10, float f11, boolean z9, boolean z10) {
        float f12 = f11 - f10;
        if (z9) {
            if (f12 > 0.0f) {
                f12 -= 360.0f;
            }
        } else if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        if (Math.abs(f12) > 270.0f && z10) {
            this.Q = false;
        }
        path.arcTo(rectF, f10, f12);
    }

    public final void c() {
        this.a0.start();
        this.O = true;
        if (this.M && !this.T) {
            b bVar = new b(new u5.e(this, 9));
            this.P = bVar;
            RectF rectF = this.r;
            int width = (int) rectF.width();
            int height = (int) (rectF.height() + g0.L(30.0f));
            int i7 = g.a;
            bVar.a(width, height, 4.0f, g0.L(10));
        }
        invalidateSelf();
    }

    public final void d() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.D.setHideSideButtonByQuickShare(false);
        if (this.T) {
            return;
        }
        this.T = true;
        Bitmap bitmap4 = this.I;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        b bVar = this.P;
        if (bVar != null && (bitmap3 = bVar.c) != null) {
            bitmap3.recycle();
            bVar.c = null;
        }
        for (d dVar : this.x) {
            b bVar2 = dVar.f;
            if (bVar2 != null && (bitmap2 = bVar2.c) != null) {
                bitmap2.recycle();
                bVar2.c = null;
            }
            b bVar3 = dVar.e;
            if (bVar3 != null && (bitmap = bVar3.c) != null) {
                bitmap.recycle();
                bVar3.c = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        e(canvas, false, qs.e4);
    }

    public final void e(Canvas canvas, boolean z9, int i7) {
        float f10;
        int i10;
        i iVar;
        Canvas canvas2;
        int i11;
        float f11;
        int i12;
        int i13;
        h hVar = this;
        boolean z10 = hVar.S;
        i iVar2 = hVar.a;
        float f12 = 0.0f;
        int i14 = 0;
        q1 q1Var = hVar.D;
        int i15 = 1;
        if (!z10) {
            int[] iArr = d0;
            q1Var.getLocationInWindow(iArr);
            int i16 = iArr[0];
            int i17 = iArr[1];
            iVar2.getLocationInWindow(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            hVar.U = i16 - i18;
            hVar.V = i17 - i19;
            float L = g0.L(16.0f);
            float sideButtonStartX = q1Var.getSideButtonStartX() + hVar.U + L;
            float sideButtonStartY = q1Var.getSideButtonStartY() + hVar.V + L;
            float f13 = sideButtonStartX - L;
            float f14 = sideButtonStartY - L;
            float f15 = sideButtonStartX + L;
            float f16 = sideButtonStartY + L;
            RectF rectF = hVar.h;
            rectF.set(f13, f14, f15, f16);
            float L2 = g0.L(16.0f);
            if (rectF.right + g0.L(48.0f) + L2 > iVar2.getMeasuredWidth()) {
                hVar.F = Math.max(0.0f, (iVar2.getMeasuredWidth() - L2) - rectF.right);
            } else if (((rectF.right + g0.L(48.0f)) - hVar.h()) - L2 < 0.0f) {
                hVar.F = Math.max(0.0f, (L2 + hVar.h()) - rectF.right);
            } else {
                hVar.F = g0.L(48.0f);
            }
            hVar.Z.start();
            hVar.S = true;
        }
        b bVar = hVar.P;
        d[] dVarArr = hVar.x;
        int i20 = 2;
        RectF rectF2 = hVar.r;
        if (bVar != null && !z9) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - g0.L(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            hVar.P.i = (int) ((1.0f - f.c.getInterpolation(hVar.H)) * 255.0f);
            hVar.P.draw(canvas);
            if (hVar.R != -1) {
                float interpolation = 1.0f - f.e.getInterpolation(hVar.H);
                float interpolation2 = f.d.getInterpolation(hVar.H);
                int i21 = hVar.R - 2;
                float centerX = rectF2.centerX();
                int i22 = g.a;
                float L3 = centerX + (g0.L(i22 + 11) * i21);
                float centerY = rectF2.centerY();
                float f17 = hVar.X;
                float f18 = hVar.Y;
                float f19 = (L3 + f17) / 2.0f;
                kb kbVar = hVar.W;
                float min = (kbVar == null || !kbVar.top) ? Math.min(centerY, f18) - g0.L(15) : Math.max(centerY, f18) + g0.L(15);
                float g10 = g(L3, f17, interpolation2);
                double d = L3;
                double d2 = centerY;
                double d10 = f17;
                double d11 = f18;
                double d12 = f19;
                double d13 = d10 - d;
                double d14 = ((d10 * d) + ((d12 * d12) - (d10 * d12))) - (d12 * d);
                double d15 = d14 == 0.0d ? 0.0d : ((min - (((d11 - d2) * (d12 - d)) / d13)) - d2) / d14;
                double d16 = d * d;
                double d17 = d13 != 0.0d ? ((d11 - (((d10 * d10) - d16) * d15)) - d2) / d13 : 0.0d;
                double g11 = g(L3, f17, interpolation2);
                float f20 = (float) ((d17 * g11) + (d15 * g11 * g11) + ((d2 - (d16 * d15)) - (d17 * d)));
                float f21 = i22;
                float g12 = g((g0.L(f21) / 2.0f) + g0.L(2.0f), g0.L(12.0f), interpolation2);
                final d dVar = dVarArr[hVar.R];
                if (dVar.e == null) {
                    final int i23 = 1;
                    b bVar2 = new b(new a() { // from class: wh.c
                        @Override // wh.a
                        public final void m(Canvas canvas3, int i24) {
                            float f22;
                            switch (i23) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.i, -dVar2.j);
                                    float f23 = dVar2.i;
                                    float f24 = dVar2.j;
                                    float f25 = i24 / 255.0f;
                                    RectF rectF3 = g0.P;
                                    float L4 = g0.L(21.0f) / 2.0f;
                                    int i25 = g.a;
                                    float f26 = 8;
                                    rectF3.set(f23, f24, dVar2.h.getWidth() + f23 + (g0.L(f26) * 2), g0.L(21.0f) + f24);
                                    q1 q1Var2 = dVar2.b;
                                    boolean g22 = q1Var2.g2();
                                    Paint paint = dVar2.g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f25));
                                        canvas3.drawRoundRect(rectF3, L4, L4, paint);
                                        paint.setAlpha(alpha);
                                        f22 = 21.0f;
                                    } else {
                                        Point point = g0.q;
                                        f22 = 21.0f;
                                        q1Var2.y(0.0f, 0.0f, point.x, point.y);
                                        Paint Z1 = q1Var2.Z1("paintChatActionBackground");
                                        int alpha2 = Z1.getAlpha();
                                        Z1.setAlpha((int) ((g22 ? alpha2 : 229.5f) * f25));
                                        canvas3.drawRoundRect(rectF3, L4, L4, Z1);
                                        Z1.setAlpha(alpha2);
                                    }
                                    if (g22 || paint != null) {
                                        int alpha3 = k6.h2.getAlpha();
                                        k6.h2.setAlpha((int) (alpha3 * f25));
                                        canvas3.drawRoundRect(rectF3, L4, L4, k6.h2);
                                        k6.h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f23 + g0.L(f26), ((g0.L(f22) - dVar2.h.getHeight()) / 2.0f) + f24);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f25));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    break;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i26 = g.a;
                                    float L5 = g0.L(21);
                                    dVar3.a(canvas3, L5, L5, L5, i24 / 255.0f);
                                    break;
                            }
                        }
                    });
                    dVar.e = bVar2;
                    bVar2.a(g0.L(f21), g0.L(f21), 4.0f, g0.L(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f20 - g12);
                float f22 = 21;
                canvas.scale(g12 / g0.L(f22), g12 / g0.L(f22));
                b bVar3 = dVar.e;
                bVar3.i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f23 = !z9 ? 1.0f - hVar.H : i7 / 255.0f;
        float g13 = g(0.3f, 0.075f, f.k.getInterpolation(hVar.G));
        Matrix matrix = hVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        hVar.f.setLocalMatrix(matrix);
        int interpolation3 = (int) (f.j.getInterpolation(hVar.G) * 255.0f * f23);
        Paint paint = hVar.c;
        paint.setAlpha(interpolation3);
        RectF rectF3 = b0;
        rectF3.set(rectF2);
        rectF3.inset(-g0.L(8.0f), -g0.L(8.0f));
        Rect rect = c0;
        rectF3.round(rect);
        Drawable drawable = hVar.y;
        drawable.setAlpha((int) (f23 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z11 = hVar.M;
        RectF rectF4 = hVar.n;
        if (!z11) {
            float interpolation4 = (f.f.getInterpolation(hVar.G) - f.g.getInterpolation(hVar.G)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate(interpolation4, g0.L(16.0f), g0.L(16.0f));
            canvas.translate(-q1Var.getSideButtonStartX(), -q1Var.getSideButtonStartY());
            q1Var.v1(canvas, true);
            canvas.restore();
        }
        if (!hVar.Q || hVar.M) {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!hVar.M) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        } else {
            canvas.drawPath(hVar.e, paint);
        }
        float interpolation5 = f.t.getInterpolation(hVar.G) * g0.L(2.0f);
        float f24 = g.a + 2;
        float interpolation6 = ((f.q.getInterpolation(hVar.G) * g0.L(f24)) / 2.0f) - interpolation5;
        float interpolation7 = ((f.r.getInterpolation(hVar.G) * g0.L(f24)) / 2.0f) - interpolation5;
        float interpolation8 = ((f.s.getInterpolation(hVar.G) * g0.L(f24)) / 2.0f) - interpolation5;
        int i24 = 0;
        while (i24 < i20) {
            int i25 = i14;
            while (i25 < dVarArr.length) {
                if (!(i24 == 0 && i25 == hVar.R) && (i24 != i15 || i25 == hVar.R)) {
                    float length = i25 - ((dVarArr.length / 2.0f) - 0.5f);
                    float f25 = i25 == i20 ? interpolation6 : (i25 == i15 || i25 == 3) ? interpolation7 : interpolation8;
                    f10 = f12;
                    float L4 = (g0.L(g.a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i10 = i24;
                    final d dVar2 = dVarArr[i25];
                    float f26 = 16;
                    float L5 = g0.L(f26);
                    float measuredWidth = iVar2.getMeasuredWidth() - g0.L(f26);
                    float f27 = rectF2.left;
                    iVar = iVar2;
                    float f28 = rectF2.right;
                    if (i25 == hVar.R && hVar.O) {
                        canvas2 = canvas;
                        i11 = i25;
                        f11 = L4;
                    } else {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i11 = i25;
                        f11 = L4;
                        dVar2.a(canvas2, f11, centerY2, f25 + (g0.L(2.0f) * dVar2.o), f23);
                    }
                    float f29 = dVar2.o;
                    if (f29 <= f10 || dVar2.h == null) {
                        i12 = i11;
                        i13 = 2;
                    } else {
                        float f30 = (f29 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f30, f30, f11, centerY2);
                        float f31 = dVar2.o * f23;
                        i12 = i11;
                        i13 = 2;
                        float D = k5.D(8, 2, dVar2.h.getWidth());
                        dVar2.i = d.b(d.b(f11, D, f27, f28), D, L5, measuredWidth) - (D / 2.0f);
                        dVar2.j = centerY2 - g0.L(58.0f);
                        if (dVar2.f == null) {
                            h hVar2 = dVar2.a;
                            if (!hVar2.T) {
                                dVar2.g = hVar2.L;
                                final int i26 = 0;
                                b bVar4 = new b(new a() { // from class: wh.c
                                    @Override // wh.a
                                    public final void m(Canvas canvas3, int i242) {
                                        float f222;
                                        switch (i26) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.i, -dVar22.j);
                                                float f232 = dVar22.i;
                                                float f242 = dVar22.j;
                                                float f252 = i242 / 255.0f;
                                                RectF rectF32 = g0.P;
                                                float L42 = g0.L(21.0f) / 2.0f;
                                                int i252 = g.a;
                                                float f262 = 8;
                                                rectF32.set(f232, f242, dVar22.h.getWidth() + f232 + (g0.L(f262) * 2), g0.L(21.0f) + f242);
                                                q1 q1Var2 = dVar22.b;
                                                boolean g22 = q1Var2.g2();
                                                Paint paint2 = dVar22.g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f252));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f222 = 21.0f;
                                                } else {
                                                    Point point = g0.q;
                                                    f222 = 21.0f;
                                                    q1Var2.y(0.0f, 0.0f, point.x, point.y);
                                                    Paint Z1 = q1Var2.Z1("paintChatActionBackground");
                                                    int alpha2 = Z1.getAlpha();
                                                    Z1.setAlpha((int) ((g22 ? alpha2 : 229.5f) * f252));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, Z1);
                                                    Z1.setAlpha(alpha2);
                                                }
                                                if (g22 || paint2 != null) {
                                                    int alpha3 = k6.h2.getAlpha();
                                                    k6.h2.setAlpha((int) (alpha3 * f252));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, k6.h2);
                                                    k6.h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f232 + g0.L(f262), ((g0.L(f222) - dVar22.h.getHeight()) / 2.0f) + f242);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f252));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                break;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i262 = g.a;
                                                float L52 = g0.L(21);
                                                dVar3.a(canvas3, L52, L52, L52, i242 / 255.0f);
                                                break;
                                        }
                                    }
                                });
                                dVar2.f = bVar4;
                                bVar4.a((int) D, g0.L(21.0f), 3.0f, g0.L(4));
                            }
                        }
                        b bVar5 = dVar2.f;
                        if (bVar5 != null) {
                            float f32 = dVar2.i;
                            float f33 = dVar2.j;
                            bVar5.setBounds((int) f32, (int) f33, (int) (f32 + D), (int) (f33 + g0.L(21.0f)));
                            b bVar6 = dVar2.f;
                            bVar6.i = (int) (f31 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    }
                } else {
                    i10 = i24;
                    i12 = i25;
                    iVar = iVar2;
                    f10 = f12;
                    i13 = i20;
                }
                i25 = i12 + 1;
                hVar = this;
                i20 = i13;
                i24 = i10;
                f12 = f10;
                iVar2 = iVar;
                i15 = 1;
            }
            i24++;
            hVar = this;
            i14 = 0;
            i15 = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return g0.L(((g.a + 11) * this.x.length) + 7);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.Z;
        u9.f fVar = this.b;
        if (animator == objectAnimator) {
            this.D.setHideSideButtonByQuickShare(false);
            this.M = true;
            invalidateSelf();
            if (this.N) {
                fVar.run();
                return;
            }
            return;
        }
        if (animator == this.a0) {
            this.N = true;
            invalidateSelf();
            kb kbVar = this.W;
            if (kbVar != null) {
                kbVar.a.setVisibility(0);
            }
            if (this.M) {
                fVar.run();
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
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
