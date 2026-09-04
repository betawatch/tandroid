package vh;

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
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.w1;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.yb;
import org.telegram.ui.web.b1;
import rg.p2;
import ug.r;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class h extends Drawable implements Animator.AnimatorListener {
    public static final RectF b0 = new RectF();
    public static final Rect c0 = new Rect();
    public static final int[] d0 = new int[2];
    public static final t8 e0 = new t8("openFactor", 11);
    public static final t8 f0 = new t8("openFactor", 12);
    public final MessageObject E;
    public float F;
    public Bitmap I;
    public BitmapShader J;
    public Paint L;
    public b P;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public yb W;
    public float X;
    public float Y;
    public final i a;
    public final r b;
    public final LinearGradient f;
    public final d[] w;
    public final Drawable x;
    public final t1 y;
    public final Paint c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF n = new RectF();
    public final RectF r = new RectF();
    public final RectF s = new RectF();
    public final RectF v = new RectF();
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

    public h(i iVar, t1 t1Var, ArrayList arrayList, r rVar) {
        this.b = rVar;
        this.a = iVar;
        this.y = t1Var;
        this.E = t1Var.getMessageObject();
        this.w = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.w;
            if (i10 >= dVarArr.length) {
                this.c.setStyle(Paint.Style.FILL);
                Drawable mutate = iVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.x = mutate;
                t1Var.setHideSideButtonByQuickShare(true);
                iVar.performHapticFeedback(3, 1);
                int v02 = j6.v0(j6.G8, this.y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{v02, 16777215 & v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.Z;
                LinearInterpolator linearInterpolator = f.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.Z.addListener(this);
                this.a0.setInterpolator(linearInterpolator);
                this.a0.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new b1(this, 16), 15.0f);
                return;
            }
            dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
            i10++;
        }
    }

    public static float b(float f7, float f10, float f11, float f12) {
        return (float) Math.toDegrees((float) Math.atan2(f12 - f10, f11 - f7));
    }

    public static PointF f(float f7, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        float f15 = f12 - f7;
        float f16 = f13 - f10;
        float sqrt = (float) Math.sqrt(Math.pow(f16, 2.0d) + Math.pow(f15, 2.0d));
        if (sqrt > f11 + f14 || sqrt < Math.abs(f11 - f14)) {
            return null;
        }
        float f17 = ((sqrt * sqrt) + ((f11 * f11) - (f14 * f14))) / (2.0f * sqrt);
        float sqrt2 = (float) Math.sqrt(r8 - (f17 * f17));
        float A = a4.a.A(f17, f15, sqrt, f7);
        float A2 = a4.a.A(f17, f16, sqrt, f10);
        float f18 = (f16 * sqrt2) / sqrt;
        float f19 = A + f18;
        float f20 = (sqrt2 * f15) / sqrt;
        float f21 = A2 - f20;
        float f22 = A - f18;
        float f23 = A2 + f20;
        return (f19 == f22 || f19 >= f22) ? f21 > f23 ? new PointF(f19, f21) : new PointF(f22, f23) : z10 ? new PointF(f19, f21) : new PointF(f22, f23);
    }

    public static float g(float f7, float f10, float f11) {
        return e2.z(f10, f7, f11, f7);
    }

    public static e i(Interpolator interpolator, int i10, int i11, int i12, boolean z10) {
        float f7 = i12;
        return new e(z10, i10 / f7, i11 / f7, interpolator);
    }

    public static float j(float f7) {
        return f7 <= 0.0f ? f7 + 180.0f : f7 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f7, float f10, boolean z10, boolean z11) {
        float f11 = f10 - f7;
        if (z10) {
            if (f11 > 0.0f) {
                f11 -= 360.0f;
            }
        } else if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        if (Math.abs(f11) > 270.0f && z11) {
            this.Q = false;
        }
        path.arcTo(rectF, f7, f11);
    }

    public final void c() {
        this.a0.start();
        this.O = true;
        if (this.M && !this.T) {
            b bVar = new b(new p2(this, 10));
            this.P = bVar;
            RectF rectF = this.r;
            int width = (int) rectF.width();
            int height = (int) (rectF.height() + AndroidUtilities.dp(30.0f));
            int i10 = g.a;
            bVar.a(width, height, 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void d() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.y.setHideSideButtonByQuickShare(false);
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
        for (d dVar : this.w) {
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
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z10, int i10) {
        int i11;
        i iVar;
        Canvas canvas2;
        int i12;
        float f7;
        int i13;
        h hVar = this;
        boolean z11 = hVar.S;
        i iVar2 = hVar.a;
        t1 t1Var = hVar.y;
        int i14 = 1;
        if (!z11) {
            int[] iArr = d0;
            t1Var.getLocationInWindow(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            iVar2.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            hVar.U = i15 - i17;
            hVar.V = i16 - i18;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = t1Var.getSideButtonStartX() + hVar.U + dp;
            float sideButtonStartY = t1Var.getSideButtonStartY() + hVar.V + dp;
            float f10 = sideButtonStartX - dp;
            float f11 = sideButtonStartY - dp;
            float f12 = sideButtonStartX + dp;
            float f13 = sideButtonStartY + dp;
            RectF rectF = hVar.h;
            rectF.set(f10, f11, f12, f13);
            float dp2 = AndroidUtilities.dp(16.0f);
            if (rectF.right + AndroidUtilities.dp(48.0f) + dp2 > iVar2.getMeasuredWidth()) {
                hVar.F = Math.max(0.0f, (iVar2.getMeasuredWidth() - dp2) - rectF.right);
            } else if (((rectF.right + AndroidUtilities.dp(48.0f)) - hVar.h()) - dp2 < 0.0f) {
                hVar.F = Math.max(0.0f, (dp2 + hVar.h()) - rectF.right);
            } else {
                hVar.F = AndroidUtilities.dp(48.0f);
            }
            hVar.Z.start();
            hVar.S = true;
        }
        b bVar = hVar.P;
        d[] dVarArr = hVar.w;
        int i19 = 2;
        RectF rectF2 = hVar.r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            hVar.P.i = (int) ((1.0f - f.c.getInterpolation(hVar.H)) * 255.0f);
            hVar.P.draw(canvas);
            if (hVar.R != -1) {
                float interpolation = 1.0f - f.e.getInterpolation(hVar.H);
                float interpolation2 = f.d.getInterpolation(hVar.H);
                int i20 = hVar.R - 2;
                float centerX = rectF2.centerX();
                int i21 = g.a;
                float dp3 = centerX + (AndroidUtilities.dp(i21 + 11) * i20);
                float centerY = rectF2.centerY();
                float f14 = hVar.X;
                float f15 = hVar.Y;
                float f16 = (dp3 + f14) / 2.0f;
                yb ybVar = hVar.W;
                float min = (ybVar == null || !ybVar.top) ? Math.min(centerY, f15) - AndroidUtilities.dp(15) : Math.max(centerY, f15) + AndroidUtilities.dp(15);
                float g10 = g(dp3, f14, interpolation2);
                double d = dp3;
                double d10 = centerY;
                double d11 = f14;
                double d12 = f15;
                double d13 = f16;
                double d14 = d11 - d;
                double d15 = ((d11 * d) + ((d13 * d13) - (d11 * d13))) - (d13 * d);
                double d16 = d15 == 0.0d ? 0.0d : ((min - (((d12 - d10) * (d13 - d)) / d14)) - d10) / d15;
                double d17 = d * d;
                double d18 = d14 != 0.0d ? ((d12 - (((d11 * d11) - d17) * d16)) - d10) / d14 : 0.0d;
                double g11 = g(dp3, f14, interpolation2);
                float f17 = (float) ((d18 * g11) + (d16 * g11 * g11) + ((d10 - (d17 * d16)) - (d18 * d)));
                float f18 = i21;
                float g12 = g((AndroidUtilities.dp(f18) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[hVar.R];
                if (dVar.e == null) {
                    final int i22 = 1;
                    b bVar2 = new b(new a() { // from class: vh.c
                        @Override // vh.a
                        public final void r(Canvas canvas3, int i23) {
                            float f19;
                            switch (i22) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.i, -dVar2.j);
                                    float f20 = dVar2.i;
                                    float f21 = dVar2.j;
                                    float f22 = i23 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i24 = g.a;
                                    float f23 = 8;
                                    rectF3.set(f20, f21, dVar2.h.getWidth() + f20 + (AndroidUtilities.dp(f23) * 2), AndroidUtilities.dp(21.0f) + f21);
                                    t1 t1Var2 = dVar2.b;
                                    boolean R2 = t1Var2.R2();
                                    Paint paint = dVar2.g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f22));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, paint);
                                        paint.setAlpha(alpha);
                                        f19 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f19 = 21.0f;
                                        t1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                        Paint M2 = t1Var2.M2("paintChatActionBackground");
                                        int alpha2 = M2.getAlpha();
                                        M2.setAlpha((int) ((R2 ? alpha2 : 229.5f) * f22));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, M2);
                                        M2.setAlpha(alpha2);
                                    }
                                    if (R2 || paint != null) {
                                        int alpha3 = j6.h2.getAlpha();
                                        j6.h2.setAlpha((int) (alpha3 * f22));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, j6.h2);
                                        j6.h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f20 + AndroidUtilities.dp(f23), ((AndroidUtilities.dp(f19) - dVar2.h.getHeight()) / 2.0f) + f21);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f22));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    break;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i25 = g.a;
                                    float dp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, dp5, dp5, dp5, i23 / 255.0f);
                                    break;
                            }
                        }
                    });
                    dVar.e = bVar2;
                    bVar2.a(AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f17 - g12);
                float f19 = 21;
                canvas.scale(g12 / AndroidUtilities.dp(f19), g12 / AndroidUtilities.dp(f19));
                b bVar3 = dVar.e;
                bVar3.i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f20 = !z10 ? 1.0f - hVar.H : i10 / 255.0f;
        float g13 = g(0.3f, 0.075f, f.k.getInterpolation(hVar.G));
        Matrix matrix = hVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        hVar.f.setLocalMatrix(matrix);
        int interpolation3 = (int) (f.j.getInterpolation(hVar.G) * 255.0f * f20);
        Paint paint = hVar.c;
        paint.setAlpha(interpolation3);
        RectF rectF3 = b0;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = c0;
        rectF3.round(rect);
        Drawable drawable = hVar.x;
        drawable.setAlpha((int) (f20 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z12 = hVar.M;
        RectF rectF4 = hVar.n;
        if (!z12) {
            float interpolation4 = (f.f.getInterpolation(hVar.G) - f.g.getInterpolation(hVar.G)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate(interpolation4, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-t1Var.getSideButtonStartX(), -t1Var.getSideButtonStartY());
            t1Var.k2(canvas, true);
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
        float interpolation5 = f.t.getInterpolation(hVar.G) * AndroidUtilities.dp(2.0f);
        float f21 = g.a + 2;
        float interpolation6 = ((f.q.getInterpolation(hVar.G) * AndroidUtilities.dp(f21)) / 2.0f) - interpolation5;
        float interpolation7 = ((f.r.getInterpolation(hVar.G) * AndroidUtilities.dp(f21)) / 2.0f) - interpolation5;
        float interpolation8 = ((f.s.getInterpolation(hVar.G) * AndroidUtilities.dp(f21)) / 2.0f) - interpolation5;
        int i23 = 0;
        while (i23 < i19) {
            int i24 = 0;
            while (i24 < dVarArr.length) {
                if (!(i23 == 0 && i24 == hVar.R) && (i23 != i14 || i24 == hVar.R)) {
                    float length = i24 - ((dVarArr.length / 2.0f) - 0.5f);
                    float f22 = i24 == i19 ? interpolation6 : (i24 == i14 || i24 == 3) ? interpolation7 : interpolation8;
                    float dp4 = (AndroidUtilities.dp(g.a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i23;
                    final d dVar2 = dVarArr[i24];
                    float f23 = 16;
                    float dp5 = AndroidUtilities.dp(f23);
                    float measuredWidth = iVar2.getMeasuredWidth() - AndroidUtilities.dp(f23);
                    float f24 = rectF2.left;
                    iVar = iVar2;
                    float f25 = rectF2.right;
                    if (i24 == hVar.R && hVar.O) {
                        canvas2 = canvas;
                        i12 = i24;
                        f7 = dp4;
                    } else {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i24;
                        f7 = dp4;
                        dVar2.a(canvas2, f7, centerY2, f22 + (AndroidUtilities.dp(2.0f) * dVar2.o), f20);
                    }
                    float f26 = dVar2.o;
                    if (f26 <= 0.0f || dVar2.h == null) {
                        i13 = i12;
                    } else {
                        float f27 = (f26 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f27, f27, f7, centerY2);
                        float f28 = dVar2.o * f20;
                        i13 = i12;
                        float D = w1.D(8, 2, dVar2.h.getWidth());
                        dVar2.i = d.b(d.b(f7, D, f24, f25), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f == null) {
                            h hVar2 = dVar2.a;
                            if (!hVar2.T) {
                                dVar2.g = hVar2.L;
                                final int i25 = 0;
                                b bVar4 = new b(new a() { // from class: vh.c
                                    @Override // vh.a
                                    public final void r(Canvas canvas3, int i232) {
                                        float f192;
                                        switch (i25) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.i, -dVar22.j);
                                                float f202 = dVar22.i;
                                                float f212 = dVar22.j;
                                                float f222 = i232 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i242 = g.a;
                                                float f232 = 8;
                                                rectF32.set(f202, f212, dVar22.h.getWidth() + f202 + (AndroidUtilities.dp(f232) * 2), AndroidUtilities.dp(21.0f) + f212);
                                                t1 t1Var2 = dVar22.b;
                                                boolean R2 = t1Var2.R2();
                                                Paint paint2 = dVar22.g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f222));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f192 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f192 = 21.0f;
                                                    t1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                                    Paint M2 = t1Var2.M2("paintChatActionBackground");
                                                    int alpha2 = M2.getAlpha();
                                                    M2.setAlpha((int) ((R2 ? alpha2 : 229.5f) * f222));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, M2);
                                                    M2.setAlpha(alpha2);
                                                }
                                                if (R2 || paint2 != null) {
                                                    int alpha3 = j6.h2.getAlpha();
                                                    j6.h2.setAlpha((int) (alpha3 * f222));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, j6.h2);
                                                    j6.h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f202 + AndroidUtilities.dp(f232), ((AndroidUtilities.dp(f192) - dVar22.h.getHeight()) / 2.0f) + f212);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f222));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                break;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i252 = g.a;
                                                float dp52 = AndroidUtilities.dp(21);
                                                dVar3.a(canvas3, dp52, dp52, dp52, i232 / 255.0f);
                                                break;
                                        }
                                    }
                                });
                                dVar2.f = bVar4;
                                bVar4.a((int) D, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        b bVar5 = dVar2.f;
                        if (bVar5 != null) {
                            float f29 = dVar2.i;
                            float f30 = dVar2.j;
                            bVar5.setBounds((int) f29, (int) f30, (int) (f29 + D), (int) (f30 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f;
                            bVar6.i = (int) (f28 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    }
                } else {
                    i11 = i23;
                    i13 = i24;
                    iVar = iVar2;
                }
                i24 = i13 + 1;
                hVar = this;
                i23 = i11;
                iVar2 = iVar;
                i14 = 1;
                i19 = 2;
            }
            i23++;
            hVar = this;
            i14 = 1;
            i19 = 2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return AndroidUtilities.dp(((g.a + 11) * this.w.length) + 7);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.Z;
        r rVar = this.b;
        if (animator == objectAnimator) {
            this.y.setHideSideButtonByQuickShare(false);
            this.M = true;
            invalidateSelf();
            if (this.N) {
                rVar.run();
                return;
            }
            return;
        }
        if (animator == this.a0) {
            this.N = true;
            invalidateSelf();
            yb ybVar = this.W;
            if (ybVar != null) {
                ybVar.a.setVisibility(0);
            }
            if (this.M) {
                rVar.run();
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
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
