// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class vnc extends View {
    public static int Y1;
    public static int Z1;
    public static float a2;
    public static long c2;
    public float A0;
    public boolean A1;
    public boolean B0;
    public boolean B1;
    public float C0;
    public long C1;
    public float D0;
    public long D1;
    public final LinearGradient E;
    public float E0;
    public StaticLayout E1;
    public final Matrix F;
    public float F0;
    public final ArrayList F1;
    public final Drawable G;
    public float G0;
    public final Paint G1;
    public final Drawable H;
    public float H0;
    public final Paint H1;
    public final String I;
    public float I0;
    public final Path I1;
    public final String J;
    public float J0;
    public final Paint J1;
    public Drawable K;
    public float K0;
    public final RectF K1;
    public final String L;
    public boolean L0;
    public final Paint L1;
    public String M;
    public boolean M0;
    public final Path M1;
    public final String N;
    public boolean N0;
    public final Paint N1;
    public String O;
    public float O0;
    public final Paint O1;
    public float P;
    public float P0;
    public float P1;
    public float Q;
    public boolean Q0;
    public boolean Q1;
    public final RectF R;
    public float R0;
    public float R1;
    public final RectF S;
    public long S0;
    public Paint S1;
    public final RectF T;
    public long T0;
    public Paint T1;
    public Drawable U;
    public float U0;
    public float U1;
    public Drawable V;
    public boolean V0;
    public boolean W;
    public float W0;
    public float X0;
    public float Y0;
    public float Z0;
    public final snc a;
    public String[] a0;
    public boolean a1;
    public final vnb b;
    public boolean b0;
    public float b1;
    public final TextPaint c;
    public Paint c0;
    public float c1;
    public final TextPaint d;
    public Object d0;
    public int d1;
    public final TextPaint e;
    public Object e0;
    public final RectF e1;
    public final Paint f;
    public float f0;
    public final RectF f1;
    public long g0;
    public final RectF g1;
    public final Paint h;
    public boolean h0;
    public final RectF h1;
    public int i0;
    public final RectF i1;
    public int j0;
    public final RectF j1;
    public boolean k0;
    public float k1;
    public String l0;
    public float l1;
    public StaticLayout m0;
    public int m1;
    public final Paint n;
    public StaticLayout n0;
    public final float[] n1;
    public int o0;
    public final RectF o1;
    public final ArrayList p0;
    public float p1;
    public boolean q0;
    public Drawable q1;
    public int r;
    public boolean r0;
    public float r1;
    public final Paint s;
    public long s0;
    public float s1;
    public long t0;
    public float t1;
    public long u0;
    public boolean u1;
    public float v0;
    public boolean v1;
    public final Paint w;
    public float w0;
    public VelocityTracker w1;
    public final Paint x;
    public float x0;
    public final int x1;
    public final Paint y;
    public float y0;
    public String y1;
    public float z0;
    public int z1;
    public static final k43 V1 = new k43(0.4d, 0.0d, 0.2d, 1.0d);
    public static final k43 W1 = k43.h;
    public static final k43 X1 = new k43(0.4d, 0.0d, 1.0d, 1.0d);
    public static final OvershootInterpolator b2 = new OvershootInterpolator(1.3f);

    static {
        new k43(0.3d, 0.0d, 0.1d, 1.0d);
    }

    public vnc(Context context, vnb vnbVar, snc sncVar) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f = new Paint();
        this.h = new Paint(1);
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        this.w = new Paint(1);
        this.x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-603979776, -1073741824, TLObject.FLAG_31, 939524096, 201326592, 0}, new float[]{0.0f, 0.18f, 0.42f, 0.66f, 0.86f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        String M0 = ob6.M0(2131744967, null);
        this.L = M0;
        this.M = M0;
        this.N = ob6.M0(2131744986, null);
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.f0 = -1.0f;
        this.j0 = -12939291;
        this.l0 = "";
        this.p0 = new ArrayList();
        this.B0 = true;
        this.H0 = -1.0f;
        this.I0 = -1.0f;
        this.K0 = -1.0f;
        this.R0 = -1.0f;
        this.V0 = true;
        this.a1 = true;
        this.b1 = 1.0f;
        this.d1 = -1;
        this.e1 = new RectF();
        this.f1 = new RectF();
        this.g1 = new RectF();
        this.h1 = new RectF();
        this.i1 = new RectF();
        this.j1 = new RectF();
        this.l1 = 1.0f;
        this.m1 = -1;
        this.n1 = new float[6];
        this.o1 = new RectF();
        this.z1 = -1;
        this.F1 = new ArrayList();
        this.G1 = new Paint(1);
        this.H1 = new Paint();
        this.I1 = new Path();
        this.J1 = new Paint(1);
        this.K1 = new RectF();
        this.L1 = new Paint(1);
        new Paint(1);
        this.M1 = new Path();
        this.N1 = new Paint(1);
        this.O1 = new Paint(1);
        this.U1 = 1.0f;
        this.b = vnbVar;
        this.a = sncVar;
        this.x1 = ViewConfiguration.get(context).getScaledTouchSlop();
        textPaint.setTextSize(hl.L(21.0f));
        textPaint2.setTextSize(hl.L(21.0f));
        uh9.p(textPaint3, hl.L(14.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(0.66f));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.G = context.getResources().getDrawable(R.drawable.msg_edit).mutate();
        this.H = c00.e(context, R.drawable.send_plane_24);
        this.I = ob6.M0(2131751300, null);
        this.J = ob6.M0(2131744941, null);
        setVisibility(8);
    }

    public static float b(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static float c(int i) {
        return Math.max(hl.L(28.0f), (i - hl.L(560.0f)) / 2.0f);
    }

    public static float k(float f, float f2, float f3, float f4) {
        return qd4.A(1.0f, (float) Math.exp((-f2) / f4), f3 - f, f);
    }

    public static String p(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isLetterOrDigit(charAt)) {
                sb.append(Character.toLowerCase(charAt));
            }
        }
        return sb.toString();
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, this.o0).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(hl.L(4.0f), 1.0f).setIncludePad(false).build();
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int indexOfChild = viewGroup.indexOfChild(this);
            canvas.save();
            canvas.translate(-getLeft(), -getTop());
            int i = 0;
            while (i < indexOfChild) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null || childAt.getVisibility() != 0 || childAt.getAlpha() <= 0.01f || childAt.getWidth() <= 0 || childAt.getHeight() <= 0 || (childAt instanceof SurfaceView)) {
                    canvas2 = canvas;
                } else {
                    int save = canvas.save();
                    canvas.translate(childAt.getLeft(), childAt.getTop());
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        canvas.concat(matrix);
                    }
                    if (childAt.getAlpha() < 0.99f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getWidth(), childAt.getHeight(), (int) (childAt.getAlpha() * 255.0f));
                    } else {
                        canvas2 = canvas;
                    }
                    try {
                        childAt.draw(canvas2);
                    } catch (Throwable th) {
                        cc4.g(th, true);
                    }
                    canvas2.restoreToCount(save);
                }
                i++;
                canvas = canvas2;
            }
            canvas.restore();
        }
    }

    public final void e(Canvas canvas, RectF rectF, int i, float f) {
        i(canvas, this.I, rectF.left + hl.L(14.0f), rectF.centerY(), i, f);
        float centerY = rectF.centerY();
        float L = rectF.right - (hl.L(10.0f) + (hl.L(14.0f) + (hl.L(8.0f) + hl.L(1.0f))));
        Paint paint = this.w;
        paint.setColor(i);
        paint.setAlpha((int) (35.7f * f));
        canvas.drawRect(L, centerY - hl.L(9.0f), hl.N(1.0f) + L, centerY + hl.L(9.0f), paint);
        Path path = this.I1;
        if (path.isEmpty()) {
            path.moveTo(-hl.N(3.8f), hl.N(3.8f));
            path.lineTo(0.0f, 0.0f);
            path.lineTo(hl.N(3.8f), hl.N(3.8f));
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.J1;
        paint2.setStyle(style);
        paint2.setStrokeWidth(hl.N(1.75f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setColor(i);
        float f2 = f * 255.0f;
        int i2 = (int) f2;
        paint2.setAlpha(i2);
        float L2 = L + hl.L(1.0f) + hl.L(8.0f) + hl.L(7.0f);
        if (this.A1) {
            float L3 = hl.L(6.5f);
            Paint paint3 = this.O1;
            paint3.setStyle(style);
            paint3.setStrokeWidth(hl.N(1.75f));
            paint3.setStrokeCap(cap);
            paint3.setColor(i);
            paint3.setAlpha((int) (f2 * 0.9f));
            RectF rectF2 = hl.P;
            rectF2.set(L2 - L3, centerY - L3, L2 + L3, centerY + L3);
            canvas.drawArc(rectF2, ((SystemClock.uptimeMillis() % 900) / 900.0f) * 360.0f, 270.0f, false, paint3);
            return;
        }
        if (this.K == null) {
            canvas.save();
            canvas.translate(L2, (centerY - hl.N(1.9f)) - hl.N(0.4f));
            canvas.drawPath(path, paint2);
            canvas.restore();
            return;
        }
        int L4 = hl.L(20.0f);
        Drawable drawable = this.K;
        float f3 = L4 / 2.0f;
        drawable.setBounds((int) (L2 - f3), (int) (centerY - f3), (int) (L2 + f3), (int) (centerY + f3));
        this.K.setAlpha(i2);
        this.K.draw(canvas);
    }

    public final void f(Canvas canvas, float f, float f2, float f3, float f4, boolean z, float f5) {
        Matrix matrix = this.F;
        matrix.reset();
        if (z) {
            matrix.setScale(1.0f, -(f4 - f2));
            matrix.postTranslate(0.0f, f4);
        } else {
            matrix.setScale(1.0f, f4 - f2);
            matrix.postTranslate(0.0f, f2);
        }
        this.E.setLocalMatrix(matrix);
        Paint paint = this.y;
        paint.setAlpha((int) (f5 * 255.0f));
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    public final void g(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        canvas.save();
        float height = rectF.height() / 2.0f;
        boolean z = this.h0;
        RectF rectF2 = this.f1;
        Path path = this.M1;
        Paint paint = this.L1;
        Paint paint2 = this.n;
        if (z) {
            paint2.clearShadowLayer();
            if (this.e0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.S1 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.7f);
                    colorMatrix.postConcat(new ColorMatrix(new float[]{0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint3 = new Paint();
                    this.S1 = paint3;
                    paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
                this.S1.setAlpha((int) (f2 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f4 = 1.0f / f3;
                canvas.scale(f4, f4, rectF.centerX(), rectF.centerY());
                float f5 = 1.0f / this.U1;
                canvas.scale(f5, f5, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.k1);
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.S1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(rm0.g(this.e0));
                canvas.restoreToCount(saveLayer);
                canvas.restore();
            }
            paint2.setColor(aob.p1(f2 * 0.55f, -14276047));
            canvas.drawRoundRect(rectF, height, height, paint2);
            paint.setShader(null);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setStrokeWidth(hl.N(0.66f));
            paint.setColor(aob.p1(0.12f * f2, -1));
            RectF rectF3 = hl.P;
            rectF3.set(rectF);
            rectF3.inset(hl.N(0.33f), hl.N(0.33f));
            canvas.drawRoundRect(rectF3, height, height, paint);
            Paint paint4 = this.N1;
            paint4.setStyle(style);
            paint4.setStrokeWidth(hl.N(1.0f));
            int p1 = aob.p1(0.19f * f2, -16777216);
            int i = 16777215 & p1;
            paint4.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, new int[]{p1, i, i, p1}, new float[]{0.0f, Math.min(0.45f, (height / rectF.width()) * 1.1f), Math.max(0.55f, 1.0f - ((height / rectF.width()) * 1.1f)), 1.0f}, Shader.TileMode.CLAMP));
            rectF3.set(rectF);
            rectF3.inset(-hl.N(0.5f), -hl.N(0.5f));
            canvas.drawRoundRect(rectF3, hl.N(0.5f) + height, hl.N(0.5f) + height, paint4);
        } else {
            paint2.clearShadowLayer();
            if (this.e0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.T1 == null) {
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    colorMatrix2.setSaturation(1.3f);
                    colorMatrix2.postConcat(new ColorMatrix(new float[]{1.04f, 0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 1.04f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, 1.04f, 0.0f, 14.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint5 = new Paint();
                    this.T1 = paint5;
                    paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                }
                this.T1.setAlpha((int) (f2 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f6 = 1.0f / f3;
                canvas.scale(f6, f6, rectF.centerX(), rectF.centerY());
                float f7 = 1.0f / this.U1;
                canvas.scale(f7, f7, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.k1);
                int saveLayer2 = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.T1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(rm0.g(this.e0));
                canvas.restoreToCount(saveLayer2);
                canvas.restore();
            }
            paint2.setColor(aob.p1(0.62f * f2, -1));
            canvas.drawRoundRect(rectF, height, height, paint2);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.N(1.0f));
            paint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, new int[]{aob.p1(0.95f * f2, -1), aob.p1(0.25f * f2, -1), aob.p1(f2 * 0.55f, -1)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            RectF rectF4 = hl.P;
            rectF4.set(rectF);
            rectF4.inset(hl.N(0.5f), hl.N(0.5f));
            canvas.drawRoundRect(rectF4, height, height, paint);
            paint.setShader(null);
            paint.setStrokeWidth(hl.N(0.66f));
            paint.setColor(aob.p1(0.07f * f2, -16777216));
            rectF4.set(rectF);
            rectF4.inset(-hl.N(0.33f), -hl.N(0.33f));
            canvas.drawRoundRect(rectF4, hl.N(0.33f) + height, hl.N(0.33f) + height, paint);
        }
        if (f > 0.01f) {
            int i2 = this.h0 ? -1 : -16777216;
            Paint paint6 = this.w;
            paint6.setColor(i2);
            paint6.setAlpha((int) (20.4f * f * f2));
            canvas.drawRoundRect(rectF, height, height, paint6);
        }
        canvas.restore();
    }

    public final void h(float f, float f2, float f3, int i, Canvas canvas, boolean z) {
        float[] fArr;
        char c;
        float f4;
        float b;
        float f5;
        Canvas canvas2;
        float f6;
        float f7;
        int i2 = 0;
        while (true) {
            fArr = this.n1;
            float f8 = 1.0f;
            if (i2 >= fArr.length) {
                break;
            }
            float f9 = fArr[i2];
            if (this.m1 == i2) {
                f7 = 40.0f;
            } else {
                f8 = 0.0f;
                f7 = 70.0f;
            }
            fArr[i2] = k(f9, f3, f8, f7);
            i2++;
        }
        this.p1 = k(this.p1, f3, (this.K == null || this.A1) ? 0.0f : 1.0f, 90.0f);
        String str = this.I;
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText(str);
        float measureText2 = textPaint.measureText(this.J);
        float c3 = c(i) - hl.L(2.0f);
        float L = hl.L(10.0f) + hl.L(14.0f) + hl.L(8.0f) + hl.L(1.0f) + (this.K != null ? hl.L(4.0f) : 0);
        float L2 = hl.L(14.0f) + measureText + hl.L(12.0f);
        float f10 = this.P1;
        if (f10 > 0.0f) {
            L2 = k(f10, f3, L2, 110.0f);
        }
        this.P1 = L2;
        float f11 = f + f2;
        RectF rectF = this.i1;
        rectF.set(c3, f, L2 + c3, f11);
        float f12 = rectF.right;
        RectF rectF2 = this.j1;
        rectF2.set(f12, f, L + f12, f11);
        float f13 = rectF.left;
        float f14 = rectF2.right;
        RectF rectF3 = this.g1;
        rectF3.set(f13, f, f14, f11);
        float f15 = this.p1 * f2;
        float L3 = rectF3.right + hl.L(8.0f);
        float L4 = rectF3.right + hl.L(8.0f) + f2;
        RectF rectF4 = this.o1;
        rectF4.set(L3, f, L4, f11);
        float L5 = ((f15 + hl.L(8.0f)) * this.p1) + rectF3.right + hl.L(8.0f);
        RectF rectF5 = this.h1;
        rectF5.set(L5, f, measureText2 + L5 + hl.L(32.0f), f11);
        float f16 = rectF3.left;
        float f17 = rectF5.right;
        RectF rectF6 = this.f1;
        rectF6.set(f16, f, f17, f11);
        if (this.A0 > 0.001f) {
            if (z && this.T0 == 0) {
                this.T0 = SystemClock.uptimeMillis();
            }
            if (this.T0 == 0) {
                c = 0;
                f4 = 0.001f;
                b = 0.0f;
            } else {
                c = 0;
                f4 = 0.001f;
                b = b((SystemClock.uptimeMillis() - this.T0) / 460.0f);
            }
            float interpolation = !this.q0 ? this.U0 : b2.getInterpolation(b);
            this.U0 = interpolation;
            if (interpolation <= f4) {
                return;
            }
            boolean z2 = this.q0;
            float f18 = this.A0;
            if (z2) {
                f18 = b(f18 * 1.6f);
            }
            float b3 = b(this.U0 * 1.8f) * f18;
            float R1 = hl.R1(0.6f, 1.0f, this.c1) * b3;
            canvas.save();
            canvas.translate(0.0f, this.k1);
            float R12 = hl.R1(0.6f, 1.0f, this.U0) * this.l1;
            canvas.scale(R12, R12, rectF6.left, rectF6.centerY());
            this.U1 = R12;
            int i3 = this.h0 ? -1 : this.i0;
            float max = Math.max(fArr[c], fArr[2]);
            if (this.Q1) {
                float b4 = b(1.0f - (this.R1 / 0.35f));
                if (b4 > 0.01f) {
                    e(canvas, rectF3, i3, b4 * R1);
                }
                canvas2 = canvas;
                f5 = 2.0f;
                f6 = b3;
            } else {
                canvas.save();
                float f19 = 1.0f - (max * 0.05f);
                f5 = 2.0f;
                canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
                canvas2 = canvas;
                g(canvas2, rectF3, max, b3, f19);
                f6 = b3;
                e(canvas2, rectF3, i3, R1);
                canvas2.restore();
            }
            if (this.p1 > 0.01f) {
                canvas2.save();
                float R13 = hl.R1(0.6f, 1.0f, this.p1) * (1.0f - (fArr[3] * 0.05f));
                canvas2.scale(R13, R13, rectF4.centerX(), rectF4.centerY());
                g(canvas2, rectF4, fArr[3], f6 * this.p1, R13);
                Drawable drawable = this.q1;
                if (drawable == null) {
                    drawable = getContext().getResources().getDrawable(R.drawable.chats_undo).mutate();
                    this.q1 = drawable;
                }
                drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                this.q1.setAlpha((int) (255.0f * R1 * this.p1));
                float L6 = hl.L(22.0f) / f5;
                this.q1.setBounds((int) (rectF4.centerX() - L6), (int) (rectF4.centerY() - L6), (int) (rectF4.centerX() + L6), (int) (rectF4.centerY() + L6));
                this.q1.draw(canvas2);
                canvas2.restore();
            }
            canvas2.save();
            float f20 = 1.0f - (fArr[1] * 0.05f);
            canvas2.scale(f20, f20, rectF5.centerX(), rectF5.centerY());
            g(canvas2, rectF5, fArr[1], f6 * 1.0f, f20);
            i(canvas, this.J, hl.L(16.0f) + rectF5.left, rectF5.centerY(), i3, R1 * 1.0f);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void i(Canvas canvas, String str, float f, float f2, int i, float f3) {
        TextPaint textPaint = this.e;
        textPaint.setColor(i);
        textPaint.setAlpha((int) (f3 * 255.0f));
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(str, f, f2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
    }

    public final void j(Canvas canvas, RectF rectF, int i, float f) {
        if (this.U == null) {
            this.U = getContext().getResources().getDrawable(R.drawable.msg_language).mutate();
            this.V = getContext().getResources().getDrawable(R.drawable.msg_settings).mutate();
        }
        float centerY = rectF.centerY();
        Drawable drawable = this.U;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
        int i2 = (int) (255.0f * f);
        this.U.setAlpha(i2);
        int L = (int) (rectF.left + hl.L(10.0f));
        int L2 = (int) (centerY - hl.L(10.0f));
        this.U.setBounds(L, L2, hl.L(20.0f) + L, hl.L(20.0f) + L2);
        this.U.draw(canvas);
        float L3 = (((rectF.right - hl.L(9.0f)) - hl.L(20.0f)) - hl.L(8.0f)) - hl.L(1.0f);
        canvas.save();
        canvas.clipRect(rectF.left, rectF.top, L3 - hl.L(4.0f), rectF.bottom);
        String str = this.O;
        if (str == null) {
            str = this.N;
        }
        i(canvas, str, rectF.left + hl.L(10.0f) + hl.L(20.0f) + hl.L(6.0f), centerY, i, hl.R1(0.5f, 1.0f, this.P) * f);
        canvas.restore();
        Paint paint = this.w;
        paint.setColor(i);
        paint.setAlpha((int) (35.7f * f));
        canvas.drawRect(L3, centerY - hl.L(9.0f), hl.N(1.0f) + L3, centerY + hl.L(9.0f), paint);
        this.V.setColorFilter(new PorterDuffColorFilter(i, mode));
        this.V.setAlpha(i2);
        int L4 = (int) ((rectF.right - hl.L(9.0f)) - hl.L(10.0f));
        int i3 = (int) centerY;
        this.V.setBounds(L4 - hl.L(10.0f), i3 - hl.L(10.0f), hl.L(10.0f) + L4, hl.L(10.0f) + i3);
        this.V.draw(canvas);
    }

    public final void l(RectF rectF) {
        float f = this.U1;
        RectF rectF2 = this.f1;
        float centerY = rectF2.centerY();
        float f2 = rectF2.left;
        RectF rectF3 = this.g1;
        float A = qd4.A(rectF3.left, f2, f, f2);
        float A2 = qd4.A(rectF3.top, centerY, f, centerY);
        float f3 = this.k1;
        rectF.set(A, A2 + f3, qd4.A(rectF3.right, f2, f, f2), ((rectF3.bottom - centerY) * f) + centerY + f3);
    }

    public final void m() {
        vnc vncVar;
        if (!this.q0) {
            if (getVisibility() == 0 || (vncVar = this.a.h) == null) {
                return;
            }
            hl.B2(vncVar);
            Log.d("VoiceLive", "overlay removed");
            return;
        }
        this.q0 = false;
        this.r0 = false;
        this.t0 = SystemClock.uptimeMillis();
        this.v0 = this.y0;
        this.w0 = this.z0;
        this.x0 = this.A0;
        this.m1 = -1;
        invalidate();
    }

    public final int n(float f, float f2) {
        float f3 = 0.7f;
        if (this.A0 >= 0.7f && this.U0 >= 0.7f) {
            float L = hl.L(4.0f);
            float f4 = f2 - this.k1;
            int i = 0;
            RectF[] rectFArr = {this.i1, this.h1, this.j1, this.o1};
            while (i < 4) {
                if (i != 3 || this.p1 >= f3) {
                    RectF rectF = rectFArr[i];
                    RectF rectF2 = this.f1;
                    float f5 = rectF2.left;
                    float f6 = rectF.left - f5;
                    float f7 = this.l1;
                    float f8 = (f6 * f7) + f5;
                    float A = qd4.A(rectF.right, f5, f7, f5);
                    float centerY = ((rectF.top - rectF2.centerY()) * this.l1) + rectF2.centerY();
                    float centerY2 = ((rectF.bottom - rectF2.centerY()) * this.l1) + rectF2.centerY();
                    if (f < f8 - (i == 2 ? 0.0f : L)) {
                        continue;
                    } else {
                        if (f <= A + (i != 0 ? L : 0.0f) && f4 >= centerY - L && f4 <= centerY2 + L) {
                            return i;
                        }
                    }
                }
                i++;
                f3 = 0.7f;
            }
        }
        return -1;
    }

    public final int o(float f, float f2) {
        if (this.z0 >= 0.7f) {
            RectF rectF = this.R;
            if (!rectF.isEmpty() && !this.W) {
                float L = hl.L(4.0f);
                if (f2 >= rectF.top - L && f2 <= rectF.bottom + L && f >= rectF.left - L && f <= rectF.right + L) {
                    return f >= this.T.left - ((float) hl.L(4.0f)) ? 5 : 4;
                }
            }
        }
        return -1;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
        VelocityTracker velocityTracker = this.w1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.w1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0510 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0bb5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0c16  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0c74  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0c78  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x045c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        float f3;
        float f4;
        int i;
        float f5;
        float f6;
        float f7;
        float f8;
        StaticLayout staticLayout;
        float height;
        float L;
        l lVar;
        float f9;
        StaticLayout staticLayout2;
        float f10;
        float top;
        float f11;
        float f12;
        float min;
        float f13;
        TextPaint textPaint;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float max;
        float f19;
        float textSize;
        float max2;
        float f20;
        float f21;
        long j;
        int i2;
        float f22;
        float f23;
        float f24;
        int i3;
        char c;
        float f25;
        float min2;
        float f26;
        float f27;
        String str;
        float f28;
        float f29;
        vnc vncVar;
        float f30;
        int i4;
        float f31;
        int size;
        int i5;
        float x;
        ArrayList arrayList;
        int i6;
        float f32;
        float f33;
        float f34;
        float f35;
        boolean z2;
        int i7;
        float f36;
        float f37;
        RecordingCanvas beginRecording;
        float f38;
        float z3;
        Canvas canvas2 = canvas;
        long uptimeMillis = SystemClock.uptimeMillis();
        float max3 = this.u0 == 0 ? 16.0f : Math.max(1L, Math.min(48L, uptimeMillis - r2));
        this.u0 = uptimeMillis;
        c2 = uptimeMillis;
        int width = getWidth();
        int height2 = getHeight();
        if (width <= 0 || height2 <= 0) {
            return;
        }
        boolean z4 = this.q0;
        k43 k43Var = V1;
        if (z4) {
            f = 16.0f;
            long j2 = uptimeMillis - this.s0;
            this.y0 = k43Var.getInterpolation(b(j2 / 360.0f));
            float b = b((j2 - 60) / 460.0f);
            k43 k43Var2 = W1;
            this.z0 = k43Var2.getInterpolation(b);
            this.A0 = k43Var2.getInterpolation(b((j2 - 120) / 520.0f));
            f2 = (1.0f - this.z0) * hl.L(14.0f);
            this.k1 = (1.0f - this.A0) * hl.L(18.0f);
            if (j2 >= 700) {
                z = false;
                f3 = f2;
                this.l1 = hl.R1(0.92f, 1.0f, this.A0);
                f4 = this.y0;
                float f39 = 1.0f;
                if (f4 <= 0.001f) {
                    int width2 = getWidth();
                    int height3 = getHeight();
                    boolean z5 = this.k0 && canvas2.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 31;
                    if (z5) {
                        i = 31;
                        int width3 = getWidth();
                        int height4 = getHeight();
                        RenderNode g = rm0.g(this.e0);
                        if (g == null) {
                            z2 = z5;
                            g = new RenderNode("VoiceLiveBackdrop");
                            this.e0 = g;
                            this.f0 = -1.0f;
                            i7 = width2;
                            this.g0 = 0L;
                        } else {
                            z2 = z5;
                            i7 = width2;
                        }
                        int max4 = Math.max(1, (int) Math.ceil(width3 * 0.25f));
                        int max5 = Math.max(1, (int) Math.ceil(height4 * 0.25f));
                        try {
                            if (!z) {
                                long j3 = this.g0;
                                if (j3 != 0 && uptimeMillis - j3 < 100 && g.getWidth() == max4 && g.getHeight() == max5) {
                                    f38 = 0.25f;
                                    z3 = xnb.z(f4, 0.65f, 0.35f, hl.L(30.0f) * f38);
                                    if (Math.abs(z3 - this.f0) > f38) {
                                        this.f0 = z3;
                                        g.setRenderEffect(RenderEffect.createBlurEffect(z3, z3, Shader.TileMode.CLAMP));
                                    }
                                    g.setAlpha(f4);
                                    canvas2.save();
                                    f36 = 4.0f;
                                    canvas2.scale(4.0f, 4.0f);
                                    canvas2.drawRenderNode(g);
                                    canvas2.restore();
                                }
                            }
                            beginRecording.scale(0.25f, 0.25f);
                            d(beginRecording);
                            z3 = xnb.z(f4, 0.65f, 0.35f, hl.L(30.0f) * f38);
                            if (Math.abs(z3 - this.f0) > f38) {
                            }
                            g.setAlpha(f4);
                            canvas2.save();
                            f36 = 4.0f;
                            canvas2.scale(4.0f, 4.0f);
                            canvas2.drawRenderNode(g);
                            canvas2.restore();
                        } finally {
                        }
                        this.g0 = uptimeMillis;
                        g.setPosition(0, 0, max4, max5);
                        beginRecording = g.beginRecording(max4, max5);
                        f38 = 0.25f;
                    } else {
                        z2 = z5;
                        i7 = width2;
                        i = 31;
                        f36 = 4.0f;
                    }
                    int i8 = this.h0 ? z2 ? -1978658282 : -300936682 : z2 ? 1811413242 : -285738758;
                    Paint paint = this.f;
                    paint.setColor(i8);
                    paint.setAlpha((int) (Color.alpha(i8) * f4));
                    int i9 = i7;
                    float f40 = i9;
                    float f41 = height3;
                    f7 = f36;
                    f5 = 2.0f;
                    f6 = 80.0f;
                    f8 = -1.0f;
                    canvas2.drawRect(0.0f, 0.0f, f40, f41, paint);
                    float f42 = f40 / 2.0f;
                    float L2 = hl.L(80.0f) + hl.m;
                    float max6 = Math.max(i9, hl.L(200.0f)) * 0.95f;
                    int i10 = (((((int) (f4 * 64.0f)) * 31) + i9) * 31) + this.j0 + (this.h0 ? 1 : 0);
                    int i11 = this.r;
                    Paint paint2 = this.h;
                    if (i10 != i11) {
                        this.r = i10;
                        f37 = L2;
                        paint2.setShader(new RadialGradient(f42, f37, max6, aob.p1((this.h0 ? 0.16f : 0.1f) * f4, this.j0), 0, Shader.TileMode.CLAMP));
                    } else {
                        f37 = L2;
                    }
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, f40, Math.min(f41, f37 + max6), paint2);
                } else {
                    i = 31;
                    f5 = 2.0f;
                    f6 = 80.0f;
                    f7 = 4.0f;
                    f8 = -1.0f;
                }
                if (this.d1 < 0) {
                    int[] iArr = new int[2];
                    getLocationInWindow(iArr);
                    this.d1 = iArr[1];
                }
                float c3 = c(width);
                float L3 = hl.L(36.0f);
                float L4 = hl.L(f);
                float f43 = height2;
                snc sncVar = this.a;
                float f44 = f5;
                ChatActivityEnterView chatActivityEnterView = sncVar.b.a;
                chatActivityEnterView.getLocationInWindow(new int[2]);
                chatActivityEnterView.b2.getLocationInWindow(new int[2]);
                float min3 = Math.min(f43, (r12[1] - r15[1]) - getTop()) - hl.L(18.0f);
                boolean z6 = this.m0 == null && !this.l0.trim().isEmpty();
                this.c1 = k(this.c1, max3, !z6 ? 1.0f : 0.0f, 60.0f);
                staticLayout = !z6 ? this.m0 : this.n0;
                height = staticLayout == null ? staticLayout.getHeight() : hl.L(30.0f);
                float L5 = hl.L(8.0f) + Math.max(0, hl.m - this.d1);
                L = hl.L(36.0f) + L5 + hl.L(12.0f);
                float f45 = (min3 - L3) - L4;
                boolean z7 = z6;
                float max7 = Math.max(L, ((Math.max(0.0f, f45 - L) * 0.3f) + L) - hl.L(36.0f));
                ChatActivityEnterView chatActivityEnterView2 = sncVar.b.a;
                lVar = chatActivityEnterView2.D2;
                RectF rectF = chatActivityEnterView2.G4;
                if (lVar == null && !rectF.isEmpty() && chatActivityEnterView2.D2.getVisibility() == 0) {
                    staticLayout2 = staticLayout;
                    f9 = f3;
                    chatActivityEnterView2.D2.getLocationInWindow(new int[2]);
                    chatActivityEnterView2.b2.getLocationInWindow(new int[2]);
                    f10 = (r13[1] - r7[1]) + rectF.centerY();
                } else {
                    f9 = f3;
                    staticLayout2 = staticLayout;
                    f10 = f8;
                }
                top = f10 - getTop();
                if (this.N0 || top <= 0.0f) {
                    ChatActivityEnterView chatActivityEnterView3 = sncVar.b.a;
                    chatActivityEnterView3.getLocationInWindow(new int[2]);
                    chatActivityEnterView3.b2.getLocationInWindow(new int[2]);
                    top = Math.min(f43, (r7[1] - r12[1]) - getTop()) - hl.L(42.0f);
                }
                float f46 = top - (L3 / f44);
                if (this.Q0 || this.N0) {
                    f11 = 0.0f;
                } else {
                    float f47 = this.R0;
                    f11 = 0.0f;
                    if (f47 > 0.0f) {
                        f12 = f47;
                        this.R0 = f12;
                        min = Math.min(f45, f12 - L4);
                        f13 = this.O0;
                        textPaint = this.c;
                        if (f13 <= f11 && this.o0 > 0) {
                            StaticLayout a = a("A\nA", textPaint);
                            StaticLayout a3 = a("A", textPaint);
                            this.O0 = a.getLineTop(1) - a.getLineTop(0);
                            this.P0 = a3.getHeight();
                        }
                        f14 = this.O0;
                        if (f14 <= 0.0f) {
                            f14 = textPaint.getFontMetrics(null) + hl.L(f7);
                        }
                        f15 = this.P0;
                        if (f15 <= 0.0f) {
                            f15 = textPaint.getFontMetrics(null);
                        }
                        if (f14 > 0.0f) {
                            float f48 = min - f15;
                            if (f48 > max7) {
                                f16 = c3;
                                f17 = f48 - (((int) Math.floor((f48 - max7) / f14)) * f14);
                                float max8 = !this.M0 ? Math.max(L, min - height) : Math.max(L, Math.min(f17, min - height));
                                f18 = this.H0;
                                if (f18 >= 0.0f) {
                                    max8 = Math.min(f18, max8);
                                }
                                this.H0 = max8;
                                if (!this.B0 && !this.L0) {
                                    f35 = this.I0;
                                    if (f35 >= 0.0f) {
                                        max8 = k(f35, max3, max8, 160.0f);
                                    }
                                }
                                float f49 = max8;
                                this.I0 = f49;
                                max = Math.max(this.F0, Math.min(height, Math.max(hl.L(64.0f), min - this.H0)));
                                this.F0 = max;
                                if (!this.B0 || this.L0) {
                                    this.C0 = max;
                                    f19 = max;
                                } else {
                                    f19 = k(this.C0, max3, max, 140.0f);
                                    this.C0 = f19;
                                }
                                float max9 = Math.max(0.0f, height - f19);
                                textSize = textPaint.getTextSize() * 1.35f;
                                max2 = Math.max(0.0f, height - max);
                                boolean z8 = uptimeMillis - this.S0 >= 900;
                                if (this.V0 && z8) {
                                    max2 = xnb.f(max2, textSize, this.G0, max2);
                                }
                                this.G0 = max2;
                                float max10 = Math.max(max9, max2);
                                if (!this.V0) {
                                    this.D0 = (this.B0 || this.L0) ? this.G0 : k(this.D0, max3, this.G0, 160.0f);
                                } else if (!this.v1) {
                                    if (Math.abs(this.E0) > 0.01f) {
                                        float f50 = this.D0;
                                        float f51 = this.E0;
                                        this.D0 = (f51 * max3) + f50;
                                        f20 = 0.01f;
                                        float exp = f51 * ((float) Math.exp((-max3) / 325.0f));
                                        this.E0 = exp;
                                        if (Math.abs(exp) <= 0.01f) {
                                            f21 = 0.0f;
                                            this.E0 = 0.0f;
                                            if (this.D0 >= max9 - hl.L(6.0f) && this.E0 >= f21) {
                                                this.V0 = true;
                                                this.E0 = f21;
                                            }
                                            this.D0 = Math.max(f21, Math.min(max10, this.D0));
                                            float c4 = (width - (c(width) * f44)) + f16 + hl.L(12.0f);
                                            float L6 = this.C0 + f49 + hl.L(8.0f);
                                            RectF rectF2 = this.e1;
                                            rectF2.set(f16 - hl.L(12.0f), f49 - hl.L(8.0f), c4, L6);
                                            if (this.z0 > 0.001f || staticLayout2 == null) {
                                                j = uptimeMillis;
                                                i2 = width;
                                                f22 = f49;
                                                f23 = f16;
                                                f24 = L5;
                                                i3 = -1;
                                                c = 5;
                                                f25 = 90.0f;
                                            } else {
                                                StaticLayout staticLayout3 = this.E1;
                                                c = 5;
                                                ArrayList arrayList2 = this.F1;
                                                if (staticLayout3 == null && arrayList2.isEmpty()) {
                                                    f30 = max9;
                                                    i2 = width;
                                                    f22 = f49;
                                                    f31 = f16;
                                                    f24 = L5;
                                                    i4 = 3;
                                                    f25 = 90.0f;
                                                } else {
                                                    canvas2.save();
                                                    float f52 = f16;
                                                    canvas2.translate(f52, this.J0);
                                                    if (this.E1 != null) {
                                                        float b3 = b((uptimeMillis - this.D1) / 520.0f);
                                                        if (b3 >= 1.0f) {
                                                            this.E1 = null;
                                                        } else {
                                                            float L7 = hl.L(60.0f);
                                                            f30 = max9;
                                                            float g2 = bp1.g(L7, f44, this.o0, b3, -L7);
                                                            i2 = width;
                                                            f22 = f49;
                                                            f24 = L5;
                                                            f31 = f52;
                                                            f25 = 90.0f;
                                                            canvas2 = canvas;
                                                            int saveLayer = canvas2.saveLayer(-hl.L(10.0f), -hl.L(10.0f), hl.L(30.0f) + this.o0, hl.L(10.0f) + this.E1.getHeight(), null);
                                                            this.E1.draw(canvas2);
                                                            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                                                            Paint paint3 = this.H1;
                                                            paint3.setXfermode(porterDuffXfermode);
                                                            paint3.setShader(new LinearGradient(g2 - L7, 0.0f, g2 + L7, 0.0f, -16777216, 0, Shader.TileMode.CLAMP));
                                                            i4 = 3;
                                                            canvas2.drawRect(-hl.L(10.0f), -hl.L(10.0f), hl.L(30.0f) + this.o0, hl.L(10.0f) + this.E1.getHeight(), paint3);
                                                            canvas2.restoreToCount(saveLayer);
                                                            size = arrayList2.size() - 1;
                                                            while (size >= 0) {
                                                                float[] fArr = (float[]) arrayList2.get(size);
                                                                float f53 = uptimeMillis - fArr[4];
                                                                if (f53 >= 0.0f) {
                                                                    float f54 = fArr[5];
                                                                    if (f53 > f54) {
                                                                        arrayList2.remove(size);
                                                                    } else {
                                                                        float f55 = f53 / f54;
                                                                        if (f55 < 0.15f) {
                                                                            x = f55 / 0.15f;
                                                                            i5 = size;
                                                                        } else {
                                                                            i5 = size;
                                                                            x = qd4.x(f55, 0.15f, 0.85f, f39);
                                                                        }
                                                                        int i12 = (int) fArr[6];
                                                                        Paint paint4 = this.G1;
                                                                        paint4.setColor(i12);
                                                                        paint4.setAlpha((int) (b(x) * 255.0f));
                                                                        arrayList = arrayList2;
                                                                        canvas2.drawCircle((fArr[2] * f53) + fArr[0], (fArr[i4] * f53) + fArr[1], xnb.B(f55, 0.4f, 1.0f, fArr[7]), paint4);
                                                                        size = i5 - 1;
                                                                        arrayList2 = arrayList;
                                                                        f39 = 1.0f;
                                                                    }
                                                                }
                                                                i5 = size;
                                                                arrayList = arrayList2;
                                                                size = i5 - 1;
                                                                arrayList2 = arrayList;
                                                                f39 = 1.0f;
                                                            }
                                                            canvas2.restore();
                                                        }
                                                    }
                                                    f30 = max9;
                                                    i2 = width;
                                                    f22 = f49;
                                                    f24 = L5;
                                                    i4 = 3;
                                                    f25 = 90.0f;
                                                    f31 = f52;
                                                    size = arrayList2.size() - 1;
                                                    while (size >= 0) {
                                                    }
                                                    canvas2.restore();
                                                }
                                                float L8 = this.D0 > 0.5f ? -getTop() : f22 - hl.L(f7);
                                                int saveLayerAlpha = canvas2.saveLayerAlpha(rectF2.left, Math.min(rectF2.top, L8) + f9, rectF2.right, rectF2.bottom + f9, (int) (this.z0 * 255.0f));
                                                float f56 = f9;
                                                canvas2.translate(0.0f, f56);
                                                canvas2.save();
                                                canvas2.clipRect(rectF2.left, L8, rectF2.right, Math.max(this.C0, this.F0) + f22 + hl.L(6.0f));
                                                canvas2.translate(f31, f22 - this.D0);
                                                float f57 = this.c1;
                                                if (f57 >= 0.999f || this.n0 == null) {
                                                    i6 = saveLayerAlpha;
                                                    f23 = f31;
                                                    f32 = L8;
                                                    i3 = -1;
                                                } else {
                                                    float f58 = (1.0f - f57) * (this.h0 ? 0.9f : 0.85f);
                                                    Object obj = this.e0;
                                                    TextPaint textPaint2 = this.d;
                                                    if (obj == null || Build.VERSION.SDK_INT < i || !canvas2.isHardwareAccelerated()) {
                                                        i6 = saveLayerAlpha;
                                                        f23 = f31;
                                                        f32 = L8;
                                                        i3 = -1;
                                                        textPaint2.setShader(null);
                                                        textPaint2.setColor(aob.p1((1.0f - this.c1) * (this.h0 ? 0.42f : 0.36f), this.i0));
                                                        this.n0.draw(canvas2);
                                                    } else {
                                                        float f59 = -f31;
                                                        i6 = saveLayerAlpha;
                                                        f23 = f31;
                                                        int saveLayer2 = canvas.saveLayer(f59, (this.D0 - f22) - f56, getWidth() - f31, ((this.D0 - f22) - f56) + getHeight(), null);
                                                        textPaint2.setShader(null);
                                                        textPaint2.setColor(-1);
                                                        textPaint2.setAlpha((int) (f58 * 255.0f));
                                                        this.n0.draw(canvas);
                                                        if (this.c0 == null || this.b0 != this.h0) {
                                                            this.b0 = this.h0;
                                                            ColorMatrix colorMatrix = new ColorMatrix();
                                                            colorMatrix.setSaturation(2.2f);
                                                            if (this.h0) {
                                                                f34 = 1.45f;
                                                                f33 = 72.0f;
                                                            } else {
                                                                f33 = -4.0f;
                                                                f34 = 0.5f;
                                                            }
                                                            float[] fArr2 = new float[20];
                                                            fArr2[0] = f34;
                                                            fArr2[1] = 0.0f;
                                                            fArr2[2] = 0.0f;
                                                            fArr2[i4] = 0.0f;
                                                            fArr2[4] = f33;
                                                            fArr2[5] = 0.0f;
                                                            fArr2[6] = f34;
                                                            fArr2[7] = 0.0f;
                                                            fArr2[8] = 0.0f;
                                                            fArr2[9] = f33;
                                                            fArr2[10] = 0.0f;
                                                            fArr2[11] = 0.0f;
                                                            fArr2[12] = f34;
                                                            fArr2[13] = 0.0f;
                                                            fArr2[14] = f33;
                                                            fArr2[15] = 0.0f;
                                                            fArr2[16] = 0.0f;
                                                            fArr2[17] = 0.0f;
                                                            fArr2[18] = 1.0f;
                                                            fArr2[19] = 0.0f;
                                                            colorMatrix.postConcat(new ColorMatrix(fArr2));
                                                            Paint paint5 = new Paint();
                                                            this.c0 = paint5;
                                                            paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                                            this.c0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                                                        }
                                                        i3 = -1;
                                                        canvas2 = canvas;
                                                        int saveLayer3 = canvas2.saveLayer(f59, (this.D0 - f22) - f56, getWidth() - f23, ((this.D0 - f22) - f56) + getHeight(), this.c0);
                                                        canvas2.save();
                                                        canvas2.translate(f59, (this.D0 - f22) - f56);
                                                        float f60 = f7;
                                                        canvas2.scale(f60, f60);
                                                        RenderNode g3 = rm0.g(this.e0);
                                                        RenderNode g4 = rm0.g(this.d0);
                                                        if (g4 == null) {
                                                            g4 = new RenderNode("VoiceLiveListen");
                                                            this.d0 = g4;
                                                            f32 = L8;
                                                            g4.setRenderEffect(RenderEffect.createBlurEffect(hl.L(f25) * 0.25f, hl.L(24.0f) * 0.25f, Shader.TileMode.CLAMP));
                                                        } else {
                                                            f32 = L8;
                                                        }
                                                        g4.setPosition(0, 0, g3.getWidth(), g3.getHeight());
                                                        try {
                                                            g4.beginRecording(g3.getWidth(), g3.getHeight()).drawRenderNode(g3);
                                                            g4.endRecording();
                                                            canvas2.drawRenderNode(g4);
                                                            canvas2.restore();
                                                            canvas2.restoreToCount(saveLayer3);
                                                            canvas2.restoreToCount(saveLayer2);
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (this.A1) {
                                                    float max11 = Math.max(hl.L(140.0f), this.o0 * 0.45f);
                                                    float g5 = bp1.g(max11, 2.0f, this.o0, ((uptimeMillis - this.C1) % 1300) / 1300.0f, -max11);
                                                    float[] fArr3 = new float[i4];
                                                    // fill-array-data instruction
                                                    fArr3[0] = 0.0f;
                                                    fArr3[1] = 0.5f;
                                                    fArr3[2] = 1.0f;
                                                    textPaint.setShader(new LinearGradient(g5, 0.0f, g5 + max11, 0.0f, new int[]{this.i0, aob.p1(1.0f, Y1), this.i0}, fArr3, Shader.TileMode.CLAMP));
                                                }
                                                StaticLayout staticLayout4 = this.m0;
                                                if (staticLayout4 != null) {
                                                    staticLayout4.draw(canvas2);
                                                }
                                                if (this.A1) {
                                                    textPaint.setShader(null);
                                                }
                                                if (z7) {
                                                    StaticLayout staticLayout5 = this.m0;
                                                    int i13 = Y1;
                                                    float k = k(this.b1, max3, this.a1 ? 1.0f : 0.0f, f6);
                                                    this.b1 = k;
                                                    if (staticLayout5 != null && k >= f20) {
                                                        float lineRight = staticLayout5.getLineRight(staticLayout5.getLineCount() - 1) + hl.L(10.0f);
                                                        float lineBaseline = staticLayout5.getLineBaseline(r4) - (textPaint.getTextSize() * 0.34f);
                                                        this.W0 = lineRight;
                                                        this.X0 = lineBaseline;
                                                        float f61 = this.Z0;
                                                        float f62 = this.Y0;
                                                        this.Z0 = k(f61, max3, f62, f62 > f61 ? 60.0f : 220.0f);
                                                        float N = hl.N(2.2f);
                                                        float N2 = hl.N(2.0f);
                                                        float f63 = uptimeMillis / 1000.0f;
                                                        Paint paint6 = this.x;
                                                        paint6.setColor(i13);
                                                        paint6.setAlpha((int) (Color.alpha(i13) * this.b1 * 1.0f));
                                                        int i14 = 0;
                                                        while (i14 < 3) {
                                                            long j4 = uptimeMillis;
                                                            double d = 1.6d * f63 * 2.0f * 3.141592653589793d;
                                                            double d2 = i14;
                                                            float R1 = hl.R1(0.4f, 1.0f, this.b1) * hl.U1(b((((((((float) Math.sin((1.9d * d2) + d)) * 0.5f) + 0.5f) * 0.55f) + 0.45f) * this.Z0) + (((float) Math.sin((d2 * 1.3d) + (0.7d * r7))) * 0.1f) + 0.16f), hl.L(2.5f), hl.L(10.5f));
                                                            float v = uh9.v(N, N2, i14, this.W0);
                                                            RectF rectF3 = hl.P;
                                                            float f64 = this.X0;
                                                            float f65 = R1 / 2.0f;
                                                            float f66 = N;
                                                            rectF3.set(v, f64 - f65, v + f66, f64 + f65);
                                                            float f67 = f66 / 2.0f;
                                                            canvas2.drawRoundRect(rectF3, f67, f67, paint6);
                                                            i14++;
                                                            N = f66;
                                                            uptimeMillis = j4;
                                                        }
                                                    }
                                                }
                                                j = uptimeMillis;
                                                canvas2.restore();
                                                float f68 = this.D0;
                                                if (f68 > 0.5f) {
                                                    f(canvas2, rectF2.left, f32, rectF2.right, f22 + hl.L(30.0f), false, Math.min(1.0f, f68 / hl.L(40.0f)));
                                                }
                                                if (!this.V0) {
                                                    float f69 = f30 - this.D0;
                                                    if (f69 > 0.5f) {
                                                        canvas2 = canvas;
                                                        f(canvas2, rectF2.left, (f22 + this.C0) - hl.L(28.0f), rectF2.right, hl.L(6.0f) + f22 + this.C0, true, Math.min(1.0f, f69 / hl.L(28.0f)));
                                                        canvas2.restoreToCount(i6);
                                                    }
                                                }
                                                canvas2 = canvas;
                                                canvas2.restoreToCount(i6);
                                            }
                                            min2 = Math.min(f22 + this.C0 + L4, f12);
                                            if (min2 >= f12 - hl.L(1.0f)) {
                                                this.M0 = true;
                                            }
                                            if (!this.M0) {
                                                f12 = min2;
                                            }
                                            boolean z9 = this.E1 == null || j - this.D1 < 600;
                                            f26 = this.K0;
                                            if (f26 >= 0.0f || this.B0 || !z9) {
                                                f27 = f25;
                                            } else {
                                                f27 = f25;
                                                f12 = k(f26, max3, f12, f27);
                                            }
                                            this.K0 = f12;
                                            this.L0 = false;
                                            float f70 = max3;
                                            h(f12, L3, f70, i2, canvas2, z7);
                                            float L9 = f23 - hl.L(2.0f);
                                            float max12 = Math.max(f24, (f22 - hl.L(12.0f)) - hl.L(36.0f));
                                            this.P = k(this.P, f70, this.O == null ? 1.0f : 0.0f, f27);
                                            str = this.O;
                                            if (str == null) {
                                                str = this.N;
                                            }
                                            float measureText = this.e.measureText(str);
                                            f28 = this.Q;
                                            if (f28 > 0.0f) {
                                                measureText = k(f28, f70, measureText, 110.0f);
                                            }
                                            this.Q = measureText;
                                            float L10 = hl.L(36.0f);
                                            float L11 = hl.L(10.0f) + L9 + hl.L(20.0f) + hl.L(6.0f) + this.Q + hl.L(12.0f);
                                            float f71 = L10 + max12;
                                            RectF rectF4 = this.R;
                                            rectF4.set(L9, max12, hl.L(1.0f) + L11 + hl.L(8.0f) + hl.L(20.0f) + hl.L(9.0f), f71);
                                            this.S.set(L9, max12, L11, f71);
                                            this.T.set(L11, max12, rectF4.right, f71);
                                            f29 = this.z0;
                                            if (f29 > 0.001f) {
                                                vncVar = this;
                                            } else {
                                                int i15 = this.h0 ? i3 : this.i0;
                                                rn3.b(canvas, this.a0, L9, max12 - hl.L(8.0f), i15, this.h0, f29);
                                                float[] fArr4 = this.n1;
                                                float max13 = Math.max(fArr4[4], fArr4[c]);
                                                canvas.save();
                                                canvas.translate(0.0f, (1.0f - this.z0) * (-hl.L(6.0f)));
                                                if (this.W) {
                                                    j(canvas, rectF4, i15, f29);
                                                    vncVar = this;
                                                } else {
                                                    float f72 = 1.0f - (0.04f * max13);
                                                    canvas.scale(f72, f72, rectF4.centerX(), rectF4.centerY());
                                                    float f73 = this.U1;
                                                    float f74 = this.k1;
                                                    RectF rectF5 = this.K1;
                                                    RectF rectF6 = this.f1;
                                                    rectF5.set(rectF6);
                                                    this.U1 = 1.0f;
                                                    this.k1 = 0.0f;
                                                    rectF6.set(rectF4);
                                                    vncVar = this;
                                                    vncVar.g(canvas, rectF4, max13, f29, f72);
                                                    vncVar.U1 = f73;
                                                    vncVar.k1 = f74;
                                                    rectF6.set(rectF5);
                                                    vncVar.j(canvas, rectF4, i15, f29);
                                                }
                                                canvas.restore();
                                            }
                                            vncVar.B0 = false;
                                            vncVar.invalidate();
                                        }
                                    } else {
                                        f20 = 0.01f;
                                    }
                                    f21 = 0.0f;
                                    if (this.D0 >= max9 - hl.L(6.0f)) {
                                        this.V0 = true;
                                        this.E0 = f21;
                                    }
                                    this.D0 = Math.max(f21, Math.min(max10, this.D0));
                                    float c42 = (width - (c(width) * f44)) + f16 + hl.L(12.0f);
                                    float L62 = this.C0 + f49 + hl.L(8.0f);
                                    RectF rectF22 = this.e1;
                                    rectF22.set(f16 - hl.L(12.0f), f49 - hl.L(8.0f), c42, L62);
                                    if (this.z0 > 0.001f) {
                                    }
                                    j = uptimeMillis;
                                    i2 = width;
                                    f22 = f49;
                                    f23 = f16;
                                    f24 = L5;
                                    i3 = -1;
                                    c = 5;
                                    f25 = 90.0f;
                                    min2 = Math.min(f22 + this.C0 + L4, f12);
                                    if (min2 >= f12 - hl.L(1.0f)) {
                                    }
                                    if (!this.M0) {
                                    }
                                    if (this.E1 == null) {
                                    }
                                    f26 = this.K0;
                                    if (f26 >= 0.0f) {
                                    }
                                    f27 = f25;
                                    this.K0 = f12;
                                    this.L0 = false;
                                    float f702 = max3;
                                    h(f12, L3, f702, i2, canvas2, z7);
                                    float L92 = f23 - hl.L(2.0f);
                                    float max122 = Math.max(f24, (f22 - hl.L(12.0f)) - hl.L(36.0f));
                                    this.P = k(this.P, f702, this.O == null ? 1.0f : 0.0f, f27);
                                    str = this.O;
                                    if (str == null) {
                                    }
                                    float measureText2 = this.e.measureText(str);
                                    f28 = this.Q;
                                    if (f28 > 0.0f) {
                                    }
                                    this.Q = measureText2;
                                    float L102 = hl.L(36.0f);
                                    float L112 = hl.L(10.0f) + L92 + hl.L(20.0f) + hl.L(6.0f) + this.Q + hl.L(12.0f);
                                    float f712 = L102 + max122;
                                    RectF rectF42 = this.R;
                                    rectF42.set(L92, max122, hl.L(1.0f) + L112 + hl.L(8.0f) + hl.L(20.0f) + hl.L(9.0f), f712);
                                    this.S.set(L92, max122, L112, f712);
                                    this.T.set(L112, max122, rectF42.right, f712);
                                    f29 = this.z0;
                                    if (f29 > 0.001f) {
                                    }
                                    vncVar.B0 = false;
                                    vncVar.invalidate();
                                }
                                f20 = 0.01f;
                                f21 = 0.0f;
                                this.D0 = Math.max(f21, Math.min(max10, this.D0));
                                float c422 = (width - (c(width) * f44)) + f16 + hl.L(12.0f);
                                float L622 = this.C0 + f49 + hl.L(8.0f);
                                RectF rectF222 = this.e1;
                                rectF222.set(f16 - hl.L(12.0f), f49 - hl.L(8.0f), c422, L622);
                                if (this.z0 > 0.001f) {
                                }
                                j = uptimeMillis;
                                i2 = width;
                                f22 = f49;
                                f23 = f16;
                                f24 = L5;
                                i3 = -1;
                                c = 5;
                                f25 = 90.0f;
                                min2 = Math.min(f22 + this.C0 + L4, f12);
                                if (min2 >= f12 - hl.L(1.0f)) {
                                }
                                if (!this.M0) {
                                }
                                if (this.E1 == null) {
                                }
                                f26 = this.K0;
                                if (f26 >= 0.0f) {
                                }
                                f27 = f25;
                                this.K0 = f12;
                                this.L0 = false;
                                float f7022 = max3;
                                h(f12, L3, f7022, i2, canvas2, z7);
                                float L922 = f23 - hl.L(2.0f);
                                float max1222 = Math.max(f24, (f22 - hl.L(12.0f)) - hl.L(36.0f));
                                this.P = k(this.P, f7022, this.O == null ? 1.0f : 0.0f, f27);
                                str = this.O;
                                if (str == null) {
                                }
                                float measureText22 = this.e.measureText(str);
                                f28 = this.Q;
                                if (f28 > 0.0f) {
                                }
                                this.Q = measureText22;
                                float L1022 = hl.L(36.0f);
                                float L1122 = hl.L(10.0f) + L922 + hl.L(20.0f) + hl.L(6.0f) + this.Q + hl.L(12.0f);
                                float f7122 = L1022 + max1222;
                                RectF rectF422 = this.R;
                                rectF422.set(L922, max1222, hl.L(1.0f) + L1122 + hl.L(8.0f) + hl.L(20.0f) + hl.L(9.0f), f7122);
                                this.S.set(L922, max1222, L1122, f7122);
                                this.T.set(L1122, max1222, rectF422.right, f7122);
                                f29 = this.z0;
                                if (f29 > 0.001f) {
                                }
                                vncVar.B0 = false;
                                vncVar.invalidate();
                            }
                        }
                        f16 = c3;
                        f17 = max7;
                        if (!this.M0) {
                        }
                        f18 = this.H0;
                        if (f18 >= 0.0f) {
                        }
                        this.H0 = max8;
                        if (!this.B0) {
                            f35 = this.I0;
                            if (f35 >= 0.0f) {
                            }
                        }
                        float f492 = max8;
                        this.I0 = f492;
                        max = Math.max(this.F0, Math.min(height, Math.max(hl.L(64.0f), min - this.H0)));
                        this.F0 = max;
                        if (this.B0) {
                        }
                        this.C0 = max;
                        f19 = max;
                        float max92 = Math.max(0.0f, height - f19);
                        textSize = textPaint.getTextSize() * 1.35f;
                        max2 = Math.max(0.0f, height - max);
                        if (uptimeMillis - this.S0 >= 900) {
                        }
                        if (this.V0) {
                            max2 = xnb.f(max2, textSize, this.G0, max2);
                        }
                        this.G0 = max2;
                        float max102 = Math.max(max92, max2);
                        if (!this.V0) {
                        }
                        f20 = 0.01f;
                        f21 = 0.0f;
                        this.D0 = Math.max(f21, Math.min(max102, this.D0));
                        float c4222 = (width - (c(width) * f44)) + f16 + hl.L(12.0f);
                        float L6222 = this.C0 + f492 + hl.L(8.0f);
                        RectF rectF2222 = this.e1;
                        rectF2222.set(f16 - hl.L(12.0f), f492 - hl.L(8.0f), c4222, L6222);
                        if (this.z0 > 0.001f) {
                        }
                        j = uptimeMillis;
                        i2 = width;
                        f22 = f492;
                        f23 = f16;
                        f24 = L5;
                        i3 = -1;
                        c = 5;
                        f25 = 90.0f;
                        min2 = Math.min(f22 + this.C0 + L4, f12);
                        if (min2 >= f12 - hl.L(1.0f)) {
                        }
                        if (!this.M0) {
                        }
                        if (this.E1 == null) {
                        }
                        f26 = this.K0;
                        if (f26 >= 0.0f) {
                        }
                        f27 = f25;
                        this.K0 = f12;
                        this.L0 = false;
                        float f70222 = max3;
                        h(f12, L3, f70222, i2, canvas2, z7);
                        float L9222 = f23 - hl.L(2.0f);
                        float max12222 = Math.max(f24, (f22 - hl.L(12.0f)) - hl.L(36.0f));
                        this.P = k(this.P, f70222, this.O == null ? 1.0f : 0.0f, f27);
                        str = this.O;
                        if (str == null) {
                        }
                        float measureText222 = this.e.measureText(str);
                        f28 = this.Q;
                        if (f28 > 0.0f) {
                        }
                        this.Q = measureText222;
                        float L10222 = hl.L(36.0f);
                        float L11222 = hl.L(10.0f) + L9222 + hl.L(20.0f) + hl.L(6.0f) + this.Q + hl.L(12.0f);
                        float f71222 = L10222 + max12222;
                        RectF rectF4222 = this.R;
                        rectF4222.set(L9222, max12222, hl.L(1.0f) + L11222 + hl.L(8.0f) + hl.L(20.0f) + hl.L(9.0f), f71222);
                        this.S.set(L9222, max12222, L11222, f71222);
                        this.T.set(L11222, max12222, rectF4222.right, f71222);
                        f29 = this.z0;
                        if (f29 > 0.001f) {
                        }
                        vncVar.B0 = false;
                        vncVar.invalidate();
                    }
                }
                f12 = f46;
                this.R0 = f12;
                min = Math.min(f45, f12 - L4);
                f13 = this.O0;
                textPaint = this.c;
                if (f13 <= f11) {
                    StaticLayout a4 = a("A\nA", textPaint);
                    StaticLayout a32 = a("A", textPaint);
                    this.O0 = a4.getLineTop(1) - a4.getLineTop(0);
                    this.P0 = a32.getHeight();
                }
                f14 = this.O0;
                if (f14 <= 0.0f) {
                }
                f15 = this.P0;
                if (f15 <= 0.0f) {
                }
                if (f14 > 0.0f) {
                }
                f16 = c3;
                f17 = max7;
                if (!this.M0) {
                }
                f18 = this.H0;
                if (f18 >= 0.0f) {
                }
                this.H0 = max8;
                if (!this.B0) {
                }
                float f4922 = max8;
                this.I0 = f4922;
                max = Math.max(this.F0, Math.min(height, Math.max(hl.L(64.0f), min - this.H0)));
                this.F0 = max;
                if (this.B0) {
                }
                this.C0 = max;
                f19 = max;
                float max922 = Math.max(0.0f, height - f19);
                textSize = textPaint.getTextSize() * 1.35f;
                max2 = Math.max(0.0f, height - max);
                if (uptimeMillis - this.S0 >= 900) {
                }
                if (this.V0) {
                }
                this.G0 = max2;
                float max1022 = Math.max(max922, max2);
                if (!this.V0) {
                }
                f20 = 0.01f;
                f21 = 0.0f;
                this.D0 = Math.max(f21, Math.min(max1022, this.D0));
                float c42222 = (width - (c(width) * f44)) + f16 + hl.L(12.0f);
                float L62222 = this.C0 + f4922 + hl.L(8.0f);
                RectF rectF22222 = this.e1;
                rectF22222.set(f16 - hl.L(12.0f), f4922 - hl.L(8.0f), c42222, L62222);
                if (this.z0 > 0.001f) {
                }
                j = uptimeMillis;
                i2 = width;
                f22 = f4922;
                f23 = f16;
                f24 = L5;
                i3 = -1;
                c = 5;
                f25 = 90.0f;
                min2 = Math.min(f22 + this.C0 + L4, f12);
                if (min2 >= f12 - hl.L(1.0f)) {
                }
                if (!this.M0) {
                }
                if (this.E1 == null) {
                }
                f26 = this.K0;
                if (f26 >= 0.0f) {
                }
                f27 = f25;
                this.K0 = f12;
                this.L0 = false;
                float f702222 = max3;
                h(f12, L3, f702222, i2, canvas2, z7);
                float L92222 = f23 - hl.L(2.0f);
                float max122222 = Math.max(f24, (f22 - hl.L(12.0f)) - hl.L(36.0f));
                this.P = k(this.P, f702222, this.O == null ? 1.0f : 0.0f, f27);
                str = this.O;
                if (str == null) {
                }
                float measureText2222 = this.e.measureText(str);
                f28 = this.Q;
                if (f28 > 0.0f) {
                }
                this.Q = measureText2222;
                float L102222 = hl.L(36.0f);
                float L112222 = hl.L(10.0f) + L92222 + hl.L(20.0f) + hl.L(6.0f) + this.Q + hl.L(12.0f);
                float f712222 = L102222 + max122222;
                RectF rectF42222 = this.R;
                rectF42222.set(L92222, max122222, hl.L(1.0f) + L112222 + hl.L(8.0f) + hl.L(20.0f) + hl.L(9.0f), f712222);
                this.S.set(L92222, max122222, L112222, f712222);
                this.T.set(L112222, max122222, rectF42222.right, f712222);
                f29 = this.z0;
                if (f29 > 0.001f) {
                }
                vncVar.B0 = false;
                vncVar.invalidate();
            }
        } else {
            f = 16.0f;
            long j5 = uptimeMillis - this.t0;
            float interpolation = X1.getInterpolation(b(j5 / 200.0f));
            this.y0 = (1.0f - k43Var.getInterpolation(b((j5 - 40) / 300.0f))) * this.v0;
            float f75 = 1.0f - interpolation;
            this.z0 = this.w0 * f75;
            this.A0 = this.x0 * f75;
            f2 = (-hl.L(6.0f)) * interpolation;
            this.k1 = hl.L(6.0f) * interpolation;
            if (j5 >= 340) {
                this.A0 = 0.0f;
                this.z0 = 0.0f;
                this.y0 = 0.0f;
                if (this.r0) {
                    return;
                }
                this.r0 = true;
                hl.c3(new olc(this, (byte) 6));
                return;
            }
        }
        z = true;
        f3 = f2;
        this.l1 = hl.R1(0.92f, 1.0f, this.A0);
        f4 = this.y0;
        float f392 = 1.0f;
        if (f4 <= 0.001f) {
        }
        if (this.d1 < 0) {
        }
        float c32 = c(width);
        float L32 = hl.L(36.0f);
        float L42 = hl.L(f);
        float f432 = height2;
        snc sncVar2 = this.a;
        float f442 = f5;
        ChatActivityEnterView chatActivityEnterView4 = sncVar2.b.a;
        chatActivityEnterView4.getLocationInWindow(new int[2]);
        chatActivityEnterView4.b2.getLocationInWindow(new int[2]);
        float min32 = Math.min(f432, (r12[1] - r15[1]) - getTop()) - hl.L(18.0f);
        if (this.m0 == null) {
        }
        this.c1 = k(this.c1, max3, !z6 ? 1.0f : 0.0f, 60.0f);
        if (!z6) {
        }
        height = staticLayout == null ? staticLayout.getHeight() : hl.L(30.0f);
        float L52 = hl.L(8.0f) + Math.max(0, hl.m - this.d1);
        L = hl.L(36.0f) + L52 + hl.L(12.0f);
        float f452 = (min32 - L32) - L42;
        boolean z72 = z6;
        float max72 = Math.max(L, ((Math.max(0.0f, f452 - L) * 0.3f) + L) - hl.L(36.0f));
        ChatActivityEnterView chatActivityEnterView22 = sncVar2.b.a;
        lVar = chatActivityEnterView22.D2;
        RectF rectF7 = chatActivityEnterView22.G4;
        if (lVar == null) {
        }
        f9 = f3;
        staticLayout2 = staticLayout;
        f10 = f8;
        top = f10 - getTop();
        if (this.N0) {
        }
        ChatActivityEnterView chatActivityEnterView32 = sncVar2.b.a;
        chatActivityEnterView32.getLocationInWindow(new int[2]);
        chatActivityEnterView32.b2.getLocationInWindow(new int[2]);
        top = Math.min(f432, (r7[1] - r12[1]) - getTop()) - hl.L(42.0f);
        float f462 = top - (L32 / f442);
        if (this.Q0) {
        }
        f11 = 0.0f;
        f12 = f462;
        this.R0 = f12;
        min = Math.min(f452, f12 - L42);
        f13 = this.O0;
        textPaint = this.c;
        if (f13 <= f11) {
        }
        f14 = this.O0;
        if (f14 <= 0.0f) {
        }
        f15 = this.P0;
        if (f15 <= 0.0f) {
        }
        if (f14 > 0.0f) {
        }
        f16 = c32;
        f17 = max72;
        if (!this.M0) {
        }
        f18 = this.H0;
        if (f18 >= 0.0f) {
        }
        this.H0 = max8;
        if (!this.B0) {
        }
        float f49222 = max8;
        this.I0 = f49222;
        max = Math.max(this.F0, Math.min(height, Math.max(hl.L(64.0f), min - this.H0)));
        this.F0 = max;
        if (this.B0) {
        }
        this.C0 = max;
        f19 = max;
        float max9222 = Math.max(0.0f, height - f19);
        textSize = textPaint.getTextSize() * 1.35f;
        max2 = Math.max(0.0f, height - max);
        if (uptimeMillis - this.S0 >= 900) {
        }
        if (this.V0) {
        }
        this.G0 = max2;
        float max10222 = Math.max(max9222, max2);
        if (!this.V0) {
        }
        f20 = 0.01f;
        f21 = 0.0f;
        this.D0 = Math.max(f21, Math.min(max10222, this.D0));
        float c422222 = (width - (c(width) * f442)) + f16 + hl.L(12.0f);
        float L622222 = this.C0 + f49222 + hl.L(8.0f);
        RectF rectF222222 = this.e1;
        rectF222222.set(f16 - hl.L(12.0f), f49222 - hl.L(8.0f), c422222, L622222);
        if (this.z0 > 0.001f) {
        }
        j = uptimeMillis;
        i2 = width;
        f22 = f49222;
        f23 = f16;
        f24 = L52;
        i3 = -1;
        c = 5;
        f25 = 90.0f;
        min2 = Math.min(f22 + this.C0 + L42, f12);
        if (min2 >= f12 - hl.L(1.0f)) {
        }
        if (!this.M0) {
        }
        if (this.E1 == null) {
        }
        f26 = this.K0;
        if (f26 >= 0.0f) {
        }
        f27 = f25;
        this.K0 = f12;
        this.L0 = false;
        float f7022222 = max3;
        h(f12, L32, f7022222, i2, canvas2, z72);
        float L922222 = f23 - hl.L(2.0f);
        float max1222222 = Math.max(f24, (f22 - hl.L(12.0f)) - hl.L(36.0f));
        this.P = k(this.P, f7022222, this.O == null ? 1.0f : 0.0f, f27);
        str = this.O;
        if (str == null) {
        }
        float measureText22222 = this.e.measureText(str);
        f28 = this.Q;
        if (f28 > 0.0f) {
        }
        this.Q = measureText22222;
        float L1022222 = hl.L(36.0f);
        float L1122222 = hl.L(10.0f) + L922222 + hl.L(20.0f) + hl.L(6.0f) + this.Q + hl.L(12.0f);
        float f7122222 = L1022222 + max1222222;
        RectF rectF422222 = this.R;
        rectF422222.set(L922222, max1222222, hl.L(1.0f) + L1122222 + hl.L(8.0f) + hl.L(20.0f) + hl.L(9.0f), f7122222);
        this.S.set(L922222, max1222222, L1122222, f7122222);
        this.T.set(L1122222, max1222222, rectF422222.right, f7122222);
        f29 = this.z0;
        if (f29 > 0.001f) {
        }
        vncVar.B0 = false;
        vncVar.invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int c = (int) ((i - (c(i) * 2.0f)) - hl.L(28.0f));
        if (c != this.o0 && c > 0) {
            this.o0 = c;
            this.P0 = 0.0f;
            this.O0 = 0.0f;
            this.n0 = a(this.M, this.d);
            q();
        }
        this.d1 = -1;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            StringBuilder sb = new StringBuilder("overlay bounds top=");
            sb.append(getTop());
            sb.append(" h=");
            sb.append(i2);
            sb.append(" parent h=");
            sb.append(view.getHeight());
            bs2.x(sb, (getTop() == 0 && i2 == view.getHeight()) ? " (full-screen ok)" : "  ← NOT full-screen: a strip stays unblurred", "VoiceLive");
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z = false;
        if (!this.q0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.r1 = x;
            this.t1 = y;
            this.s1 = y;
            this.v1 = false;
            boolean isEmpty = this.l0.trim().isEmpty();
            int o = o(x, y);
            this.m1 = o;
            if (o < 0) {
                int n = isEmpty ? -1 : n(x, y);
                this.m1 = n;
                o = n;
            }
            if (o < 0 && this.e1.contains(x, y)) {
                z = true;
            }
            this.u1 = z;
            if (z) {
                VelocityTracker velocityTracker2 = this.w1;
                if (velocityTracker2 == null) {
                    velocityTracker2 = VelocityTracker.obtain();
                    this.w1 = velocityTracker2;
                }
                velocityTracker2.clear();
                this.w1.addMovement(motionEvent);
                this.E0 = 0.0f;
            }
            invalidate();
            return true;
        }
        if (actionMasked == 1) {
            int i = this.m1;
            this.m1 = -1;
            if (i >= 0) {
                int o2 = o(x, y);
                if (o2 < 0) {
                    o2 = n(x, y);
                }
                if (o2 == i) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    post(new me7((Object) this, i, (byte) 27));
                }
            }
            if (this.u1 && this.v1 && (velocityTracker = this.w1) != null) {
                velocityTracker.addMovement(motionEvent);
                this.w1.computeCurrentVelocity(1);
                this.E0 = -this.w1.getYVelocity();
            }
            this.v1 = false;
            this.u1 = false;
            invalidate();
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return true;
            }
            this.m1 = -1;
            this.v1 = false;
            this.u1 = false;
            invalidate();
            return true;
        }
        int i2 = this.m1;
        int i3 = this.x1;
        if (i2 >= 0) {
            int o3 = o(x, y);
            if (o3 < 0) {
                o3 = n(x, y);
            }
            if (o3 != this.m1 && Math.hypot(x - this.r1, y - this.s1) > i3) {
                this.m1 = -1;
            }
        }
        if (this.u1) {
            this.w1.addMovement(motionEvent);
            if (!this.v1 && Math.abs(y - this.s1) > i3) {
                this.v1 = true;
                this.V0 = false;
                this.t1 = y;
            }
            if (this.v1) {
                this.D0 -= y - this.t1;
                this.t1 = y;
            }
        }
        invalidate();
        return true;
    }

    public final void q() {
        if (this.o0 <= 0) {
            return;
        }
        if (this.l0.isEmpty()) {
            this.m0 = null;
            return;
        }
        SpannableString spannableString = new SpannableString(this.l0);
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            unc uncVar = (unc) obj;
            int i2 = uncVar.b;
            if (i2 > uncVar.a && i2 <= spannableString.length()) {
                spannableString.setSpan(new go3(uncVar, (byte) 2), uncVar.a, uncVar.b, 65569);
            }
        }
        int i3 = this.z1;
        if (i3 >= 0 && i3 < spannableString.length()) {
            spannableString.setSpan(new hnc((byte) 1), this.z1, spannableString.length(), 33);
        }
        this.m0 = a(spannableString, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(String str) {
        if (str == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StaticLayout staticLayout = this.m0;
        this.E1 = staticLayout;
        this.D1 = uptimeMillis;
        int i = 1;
        if (this.Q0) {
            this.N0 = true;
        }
        float f = this.I0;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.J0 = f - this.D0;
        this.I0 = -1.0f;
        this.H0 = -1.0f;
        this.F0 = 0.0f;
        this.G0 = 0.0f;
        this.V0 = true;
        this.E0 = 0.0f;
        this.L0 = true;
        if (staticLayout != null) {
            Random random = new Random();
            int i2 = Y1;
            float f2 = 0.45f;
            float f3 = 0.5f;
            int[] iArr = {i2, vm2.f(0.45f, i2, -1), vm2.f(0.5f, Y1, -10493697), -1};
            int i3 = 0;
            while (i3 < this.E1.getLineCount()) {
                float lineLeft = this.E1.getLineLeft(i3);
                float lineRight = this.E1.getLineRight(i3);
                float lineTop = this.E1.getLineTop(i3);
                float lineBottom = this.E1.getLineBottom(i3);
                float f4 = lineRight - lineLeft;
                float f5 = f2;
                float f6 = f3;
                int min = (int) Math.min(140.0f, f4 / hl.L(2.6f));
                int i4 = 0;
                while (i4 < min) {
                    float e = ik8.e(random, f4, lineLeft);
                    float nextFloat = (random.nextFloat() * 0.6f) + 0.2f;
                    int i5 = i;
                    float B = c00.B(e, Math.max(i, this.o0), 520.0f, uptimeMillis);
                    float nextFloat2 = ((random.nextFloat() - f6) * hl.L(36.0f)) / 1000.0f;
                    long j = uptimeMillis;
                    float f7 = (-((random.nextFloat() * hl.L(34.0f)) + hl.L(10.0f))) / 1000.0f;
                    float e2 = ik8.e(random, 380.0f, 480.0f);
                    float f8 = iArr[random.nextInt(4)];
                    float e3 = bp1.e(0.75f, random.nextFloat(), hl.N(f5));
                    float[] fArr = new float[8];
                    fArr[0] = e;
                    fArr[i5] = (nextFloat * (lineBottom - lineTop)) + lineTop;
                    fArr[2] = nextFloat2;
                    fArr[3] = f7;
                    fArr[4] = B;
                    fArr[5] = e2;
                    fArr[6] = f8;
                    fArr[7] = e3;
                    this.F1.add(fArr);
                    i4++;
                    i = i5;
                    uptimeMillis = j;
                    random = random;
                }
                i3++;
                f3 = f6;
                f2 = f5;
            }
        }
        long j2 = uptimeMillis;
        this.l0 = "";
        ArrayList arrayList = this.p0;
        arrayList.clear();
        this.B1 = i;
        setText(str);
        this.B1 = false;
        if (this.m0 != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                unc uncVar = (unc) obj;
                if (uncVar.a < this.l0.length()) {
                    uncVar.c = j2 + ((long) (b((this.m0.getPrimaryHorizontal(Math.max(uncVar.a, Math.min(uncVar.b, this.l0.length()) - 1)) + hl.L(60.0f)) / qu6.e(120.0f, this.o0, 1)) * 520.0f)) + 60;
                    uncVar.d = 0.0f;
                }
            }
        }
        invalidate();
    }

    public final void s() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29 && (obj = this.e0) != null) {
            rm0.g(obj).discardDisplayList();
        }
        this.e0 = null;
        this.f0 = -1.0f;
    }

    public void setAccent(int i) {
        this.j0 = i | (-16777216);
    }

    public void setBusy(boolean z) {
        if (this.A1 == z) {
            return;
        }
        this.A1 = z;
        this.C1 = SystemClock.uptimeMillis();
        if (!z) {
            this.c.setShader(null);
        }
        invalidate();
    }

    public void setDetected(String[] strArr) {
        this.a0 = strArr;
        invalidate();
    }

    public void setEditMenuProgress(float f) {
        this.R1 = f;
        invalidate();
    }

    public void setEditPillHidden(boolean z) {
        this.Q1 = z;
        if (!z) {
            this.R1 = 0.0f;
            if (this.Q0) {
                this.y1 = null;
            }
            String str = this.y1;
            if (str != null) {
                this.y1 = null;
                setText(str);
            }
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? null : charSequence.toString();
        this.O = charSequence2;
        if (this.z0 < 0.01f) {
            this.P = charSequence2 != null ? 1.0f : 0.0f;
            this.Q = 0.0f;
        }
        invalidate();
    }

    public void setLanguagePillHidden(boolean z) {
        this.W = z;
        invalidate();
    }

    public void setLevel(float f) {
        this.Y0 = Math.max(0.0f, Math.min(1.0f, f));
    }

    public void setListening(boolean z) {
        this.a1 = z;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (str == null) {
            str = this.L;
        }
        if (str.equals(this.M)) {
            return;
        }
        this.M = str;
        if (this.o0 > 0) {
            this.n0 = a(str, this.d);
        }
        invalidate();
    }

    public void setReview(boolean z) {
        this.Q0 = z;
        invalidate();
    }

    public void setStyleIcon(Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 instanceof wl) {
            ((wl) drawable2).o(this);
        }
        this.K = drawable;
        if (drawable instanceof wl) {
            ((wl) drawable).b(this);
        }
        invalidate();
    }

    public void setStyleLabel(String str) {
        invalidate();
    }

    public void setText(String str) {
        t(-1, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i, String str) {
        boolean z;
        long min;
        String str2;
        ArrayList arrayList;
        int i2;
        int i3 = i;
        String str3 = str == null ? "" : str;
        if (i3 < 0 || i3 >= str3.length()) {
            i3 = -1;
        }
        if (i3 != this.z1) {
            this.z1 = i3;
            if (str3.equals(this.l0) && !this.Q1) {
                q();
                invalidate();
            }
        }
        if (this.Q1) {
            this.y1 = str3;
            return;
        }
        if (str3.equals(this.l0)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String str4 = this.l0;
        int min2 = Math.min(str4.length(), str3.length());
        int i4 = 0;
        while (i4 < min2 && str4.charAt(i4) == str3.charAt(i4)) {
            i4++;
        }
        ArrayList arrayList2 = this.p0;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            unc uncVar = (unc) arrayList2.get(size);
            if (uncVar.a >= i4 || uptimeMillis - uncVar.c > 1950) {
                arrayList2.remove(size);
            } else if (uncVar.b > i4) {
                uncVar.b = i4;
            }
        }
        int i5 = 0;
        boolean z2 = false;
        while (i4 < str3.length()) {
            int i6 = i4;
            while (i6 < str3.length() && Character.isWhitespace(str3.charAt(i6))) {
                i6++;
            }
            while (i6 < str3.length() && !Character.isWhitespace(str3.charAt(i6))) {
                i6++;
            }
            unc uncVar2 = new unc();
            uncVar2.a = i4;
            uncVar2.b = i6;
            if (this.B1) {
                z = z2;
                min = (i5 * 28) + 200 + uptimeMillis;
            } else {
                z = z2;
                min = (Math.min(i5, 5) * 45) + uptimeMillis;
            }
            uncVar2.c = min;
            uncVar2.d = 0.0f;
            if (this.B1 || i4 >= str4.length()) {
                str2 = str4;
                arrayList = arrayList3;
                z2 = z;
            } else {
                uncVar2.d = 1.0f;
                if (!z) {
                    int i7 = i4;
                    while (i7 < str4.length() && Character.isWhitespace(str4.charAt(i7))) {
                        i7++;
                    }
                    while (i7 < str4.length() && !Character.isWhitespace(str4.charAt(i7))) {
                        i7++;
                    }
                    if (!p(str4.substring(i4, i7)).equals(p(str3.substring(i4, i6)))) {
                        z2 = true;
                        if (z2) {
                            long j = uptimeMillis - 2000;
                            int size2 = arrayList3.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size2) {
                                    str2 = str4;
                                    arrayList = arrayList3;
                                    break;
                                }
                                Object obj = arrayList3.get(i8);
                                int i9 = i8 + 1;
                                str2 = str4;
                                unc uncVar3 = (unc) obj;
                                arrayList = arrayList3;
                                int i10 = uncVar3.a;
                                if (i10 <= i4) {
                                    i2 = i9;
                                    if (i4 < Math.max(uncVar3.b, i10 + 1)) {
                                        j = uncVar3.c;
                                        break;
                                    }
                                } else {
                                    i2 = i9;
                                }
                                arrayList3 = arrayList;
                                str4 = str2;
                                i8 = i2;
                            }
                            uncVar2.c = j;
                        } else {
                            str2 = str4;
                            arrayList = arrayList3;
                            uncVar2.c = uptimeMillis;
                        }
                    }
                }
                z2 = z;
                if (z2) {
                }
            }
            arrayList2.add(uncVar2);
            i5++;
            i4 = i6;
            arrayList3 = arrayList;
            str4 = str2;
        }
        this.l0 = str3;
        this.S0 = uptimeMillis;
        q();
        invalidate();
    }
}
