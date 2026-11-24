// default package

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class y61 extends View implements vlb {
    public static final int[] a0;
    public static final int[] b0;
    public static long c0;
    public static Long d0;
    public static Long e0;
    public final Paint E;
    public RectF F;
    public final Path G;
    public final Paint H;
    public final Paint I;
    public final LinearGradient J;
    public final LinearGradient K;
    public final Matrix L;
    public final Matrix M;
    public final ho N;
    public final ho O;
    public final ho P;
    public final ho Q;
    public cta R;
    public boolean S;
    public boolean T;
    public int U;
    public int[] V;
    public float[] W;
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final boolean d;
    public final boolean e;
    public final int[] f;
    public boolean h;
    public final ln n;
    public boolean r;
    public final ln s;
    public final w61[] w;
    public final float[] x;
    public final RectF y;

    static {
        int i = cmb.bk;
        int i2 = cmb.Xj;
        int i3 = cmb.Yj;
        int i4 = cmb.fk;
        int i5 = cmb.ck;
        int i6 = cmb.Zj;
        int i7 = cmb.dk;
        int i8 = cmb.gk;
        int i9 = cmb.ak;
        a0 = new int[]{i, i2, i3, i4, i5, i6, i7, i8, i4, i9, i9};
        b0 = new int[]{R.raw.cache_photos, R.raw.cache_videos, R.raw.cache_documents, R.raw.cache_music, R.raw.cache_videos, R.raw.cache_music, R.raw.cache_stickers, R.raw.cache_profile_photos, R.raw.cache_other, R.raw.cache_other, R.raw.cache_documents};
        c0 = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y61(Context context, int i, int[] iArr, int i2, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        d53 d53Var = d53.h;
        this.n = new ln(750L, this, d53Var);
        this.r = false;
        this.s = new ln(650L, this, d53Var);
        this.x = new float[2];
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        this.G = new Path();
        Paint paint2 = new Paint(1);
        this.H = paint2;
        Paint paint3 = new Paint(1);
        this.I = paint3;
        ho hoVar = new ho(false, true, true);
        this.N = hoVar;
        ho hoVar2 = new ho(false, true, true);
        this.O = hoVar2;
        ho hoVar3 = new ho(false, true, true);
        this.P = hoVar3;
        ho hoVar4 = new ho(false, true, true);
        this.Q = hoVar4;
        this.S = true;
        this.U = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i2;
        this.e = i2 == 0;
        this.w = new w61[i];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(cmb.w0(null, cmb.h6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.K = linearGradient2;
        this.L = new Matrix();
        this.M = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        hoVar.n(0.2f, 450L, d53Var);
        hoVar.B = 0.6f;
        hoVar.u(cmb.w0(null, cmb.F6, false));
        hoVar.x(gm.o());
        hoVar.w(gm.L(32.0f));
        hoVar.b = 17;
        hoVar2.n(0.6f, 450L, d53Var);
        hoVar2.B = 0.6f;
        hoVar2.u(cmb.w0(null, cmb.x6, false));
        hoVar2.w(gm.L(12.0f));
        hoVar2.b = 17;
        hoVar3.n(0.2f, 450L, d53Var);
        hoVar3.B = 0.6f;
        hoVar3.a.setShader(linearGradient2);
        hoVar3.x(gm.o());
        hoVar3.w(gm.L(32.0f));
        hoVar3.b = 17;
        hoVar4.n(0.6f, 450L, d53Var);
        hoVar4.B = 0.6f;
        hoVar4.a.setShader(linearGradient2);
        hoVar4.x(gm.o());
        hoVar4.w(gm.L(12.0f));
        hoVar4.b = 17;
        int i3 = 0;
        while (true) {
            w61[] w61VarArr = this.w;
            if (i3 >= w61VarArr.length) {
                return;
            }
            w61 w61Var = new w61(this);
            w61VarArr[i3] = w61Var;
            int v = cmb.v(cmb.w0(null, iArr[i3], false), ConnectionsManager.FileTypeAudio);
            int v2 = cmb.v(cmb.w0(null, iArr[i3], false), 822083583);
            Typeface typeface = gm.a;
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gm.L(86.0f), new int[]{v2, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            w61Var.v = radialGradient;
            Matrix matrix = new Matrix();
            w61Var.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            w61Var.q.setShader(w61Var.v);
            i3++;
        }
    }

    public static void a(Canvas canvas, ho hoVar, float f, float f2, float f3, float f4) {
        if (f4 <= 0.0f) {
            return;
        }
        hoVar.C = (int) (f4 * 255.0f);
        hoVar.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        hoVar.draw(canvas);
        canvas.restore();
        hoVar.h();
    }

    public static float f(float f) {
        return (float) ((f / 180.0f) * 3.141592653589793d);
    }

    public int b() {
        return nm7.d3;
    }

    public abstract void c(int i, boolean z);

    public int d() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0704, code lost:
    
        if (r1.equals(r8) != false) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05f2 A[EDGE_INSN: B:99:0x05f2->B:100:0x05f2 BREAK  A[LOOP:0: B:22:0x00fa->B:30:0x05d4], SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        char c;
        float f2;
        int i;
        float f3;
        char c2;
        int i2;
        w61[] w61VarArr;
        float f4;
        boolean z;
        boolean z2;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        float f5;
        float f6;
        float f7;
        float f8;
        float[] fArr;
        RectF rectF4;
        RectF rectF5;
        float f9;
        float f10;
        float f11;
        float f12;
        int i3;
        float f13;
        RectF rectF6;
        float f14;
        char c3;
        float f15;
        ho hoVar;
        float f16;
        float f17;
        float f18;
        RectF rectF7;
        w61 w61Var;
        Canvas canvas2 = canvas;
        float e = this.n.e(false, this.h ? 1.0f : 0.0f);
        float e2 = this.s.e(false, this.r ? 1.0f : 0.0f);
        RectF rectF8 = this.b;
        RectF rectF9 = this.a;
        rectF8.set(rectF9);
        float R1 = gm.R1(0.0f, gm.N(d()), e2);
        rectF8.inset(R1, R1);
        RectF rectF10 = this.c;
        rectF10.set(rectF8);
        float R12 = gm.R1(gm.N(38.0f), gm.N(10.0f), Math.max(e, e2));
        rectF10.inset(R12, R12);
        float U1 = gm.U1(e, 0, gm.L(60.0f));
        if (d0 == null) {
            d0 = Long.valueOf(System.currentTimeMillis());
        }
        boolean z3 = this.h;
        Long l = e0;
        if (z3) {
            if (l != null) {
                e0 = null;
            }
        } else if (l == null) {
            e0 = Long.valueOf(System.currentTimeMillis());
        }
        float currentTimeMillis = ((e0 == null ? System.currentTimeMillis() : r9.longValue()) - d0.longValue()) * 0.6f;
        float[] fArr2 = this.x;
        wi2.a(currentTimeMillis % 5400.0f, fArr2);
        float f19 = fArr2[0];
        float f20 = fArr2[1];
        if (e > 0.0f) {
            c = 1;
            Paint paint = this.E;
            paint.setStrokeWidth(R12);
            f3 = 1.0f;
            int alpha = paint.getAlpha();
            f2 = 0.0f;
            paint.setAlpha((int) (alpha * e));
            i = 0;
            f = e2;
            canvas2.drawCircle(rectF8.centerX(), rectF8.centerY(), (rectF8.width() - R12) / 2.0f, paint);
            paint.setAlpha(alpha);
        } else {
            f = e2;
            c = 1;
            f2 = 0.0f;
            i = 0;
            f3 = 1.0f;
            if (f <= 0.0f) {
                c2 = 0;
                i2 = i;
                while (true) {
                    w61VarArr = this.w;
                    if (i2 < w61VarArr.length) {
                        break;
                    }
                    w61 w61Var2 = w61VarArr[i2];
                    wi2.a((currentTimeMillis + (i2 * 80)) % 5400.0f, fArr2);
                    float min = Math.min(Math.max(fArr2[i], f19), f20);
                    float min2 = Math.min(Math.max(fArr2[c], f19), f20);
                    if (e < f3 || min < min2) {
                        char c4 = c2;
                        float f21 = (min + min2) / 2.0f;
                        float abs = Math.abs(min2 - min) / 2.0f;
                        if (e <= f2) {
                            boolean z4 = i;
                            float e3 = w61Var2.e.e(z4, w61Var2.c);
                            abs = w61Var2.f.e(z4, w61Var2.d);
                            rectF2 = rectF9;
                            rectF3 = rectF10;
                            f21 = e3;
                        } else {
                            boolean z5 = i;
                            rectF2 = rectF9;
                            if (e < f3) {
                                rectF3 = rectF10;
                                f21 = gm.R1((((float) Math.floor(f20 / 360.0f)) * 360.0f) + w61Var2.e.e(z5, w61Var2.c), f21, e);
                                abs = gm.R1(w61Var2.f.e(z5, w61Var2.d), abs, e);
                            } else {
                                rectF3 = rectF10;
                            }
                        }
                        char c5 = (w61Var2.e.i || w61Var2.f.i || c4 != 0) ? c : (char) 0;
                        float f22 = f3 - f;
                        float f23 = f3 - e;
                        f5 = R12;
                        ho hoVar2 = w61Var2.k;
                        f6 = e;
                        Path path = w61Var2.p;
                        Paint paint2 = w61Var2.s;
                        Paint paint3 = w61Var2.q;
                        RectF rectF11 = w61Var2.E.y;
                        RectF rectF12 = w61Var2.u;
                        f7 = U1;
                        f8 = f19;
                        fArr = fArr2;
                        float e4 = w61Var2.o.e(false, w61Var2.n ? f3 : f2);
                        rectF12.set(rectF8);
                        rectF12.inset((-gm.L(9.0f)) * e4, e4 * (-gm.L(9.0f)));
                        float width = (float) ((((rectF3.width() + rectF12.width()) * Math.cos(f(f21))) / 4.0d) + rectF12.centerX());
                        rectF4 = rectF8;
                        float width2 = (float) ((((rectF3.width() + rectF12.width()) * Math.sin(f(f21))) / 4.0d) + rectF12.centerY());
                        float e5 = w61Var2.h.e(false, w61Var2.g) * f22 * f23;
                        float e6 = w61Var2.m.e(false, w61Var2.l);
                        paint3.setAlpha((int) (f22 * 255.0f));
                        if (abs * 2.0f >= 359.0f) {
                            canvas2.saveLayerAlpha(rectF12, nm7.d4, 31);
                            canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            f18 = e5;
                            RectF rectF13 = rectF2;
                            f9 = f20;
                            w61Var2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF3.width() / 2.0f, rectF12.width() / 2.0f, f18, Math.max(f2, (f23 / 0.75f) - 0.75f) * e6);
                            w61Var = w61Var2;
                            canvas2 = canvas;
                            canvas2.drawCircle(rectF3.centerX(), rectF3.centerY(), rectF3.width() / 2.0f, w61Var.t);
                            canvas2.restore();
                            i3 = i2;
                            rectF5 = rectF13;
                            c3 = c5;
                            f15 = f;
                            hoVar = hoVar2;
                            rectF7 = rectF11;
                            f16 = width;
                            f17 = width2;
                            f14 = 0.0f;
                        } else {
                            rectF5 = rectF2;
                            f9 = f20;
                            float min3 = Math.min(Math.min(f7, (rectF12.width() - rectF3.width()) / 4.0f), (float) ((rectF3.width() / 2.0f) * (abs / 180.0f) * 3.141592653589793d));
                            float width3 = (rectF12.width() - rectF3.width()) / 2.0f;
                            if (w61Var2.x == f21 && w61Var2.y == abs && w61Var2.z == min3 && w61Var2.A == width3 && w61Var2.B == rectF12.width() && w61Var2.C == rectF12.centerX() && w61Var2.D == rectF12.centerY()) {
                                f10 = f21;
                            } else {
                                w61Var2.x = f21;
                                w61Var2.y = abs;
                                w61Var2.z = min3;
                                w61Var2.A = width3;
                                w61Var2.B = rectF12.width();
                                w61Var2.C = rectF12.centerX();
                                w61Var2.D = rectF12.centerY();
                                float f24 = f21 - abs;
                                float f25 = f21 + abs;
                                boolean z6 = min3 > 0.0f;
                                float f26 = min3 * 2.0f;
                                f10 = f21;
                                float width4 = (min3 / ((float) ((rectF12.width() - f26) * 3.141592653589793d))) * 360.0f;
                                float width5 = ((abs > 175.0f ? 0 : 1) * 0.5f) + ((min3 / ((float) ((rectF3.width() + f26) * 3.141592653589793d))) * 360.0f);
                                float width6 = (rectF12.width() / 2.0f) - min3;
                                float width7 = (rectF3.width() / 2.0f) + min3;
                                path.rewind();
                                float f27 = f25 - f24;
                                if (f27 >= 0.5f) {
                                    if (z6) {
                                        f11 = f25;
                                        f12 = e5;
                                        double d = width6;
                                        double d2 = wi8.d(f(r3), d, rectF12.centerX());
                                        i3 = i2;
                                        f13 = abs;
                                        double sin = (Math.sin(f(r3)) * d) + rectF12.centerY();
                                        float f28 = (float) d2;
                                        float f29 = (float) sin;
                                        rectF11.set(f28 - min3, f29 - min3, f28 + min3, f29 + min3);
                                        path.arcTo(rectF11, (f24 + width4) - 90.0f, 90.0f);
                                    } else {
                                        f11 = f25;
                                        f12 = e5;
                                        i3 = i2;
                                        f13 = abs;
                                    }
                                    path.arcTo(rectF12, f24 + width4, f27 - (width4 * 2.0f));
                                    if (z6) {
                                        double d3 = width6;
                                        float f30 = f11 - width4;
                                        float d4 = (float) wi8.d(f(f30), d3, rectF12.centerX());
                                        float sin2 = (float) ((Math.sin(f(f30)) * d3) + rectF12.centerY());
                                        rectF11.set(d4 - min3, sin2 - min3, d4 + min3, sin2 + min3);
                                        path.arcTo(rectF11, f30, 90.0f);
                                        double d5 = width7;
                                        float d6 = (float) wi8.d(f(r3), d5, rectF3.centerX());
                                        float sin3 = (float) ((Math.sin(f(r3)) * d5) + rectF3.centerY());
                                        rectF11.set(d6 - min3, sin3 - min3, d6 + min3, sin3 + min3);
                                        path.arcTo(rectF11, (f11 - width5) + 90.0f, 90.0f);
                                    }
                                    rectF6 = rectF3;
                                    path.arcTo(rectF6, f11 - width5, -(f27 - (width5 * 2.0f)));
                                    if (z6) {
                                        double d7 = width7;
                                        float f31 = f24 + width5;
                                        double d8 = wi8.d(f(f31), d7, rectF6.centerX());
                                        double sin4 = (Math.sin(f(f31)) * d7) + rectF6.centerY();
                                        float f32 = (float) d8;
                                        float f33 = (float) sin4;
                                        rectF11.set(f32 - min3, f33 - min3, f32 + min3, f33 + min3);
                                        path.arcTo(rectF11, f31 + 180.0f, 90.0f);
                                    }
                                    path.close();
                                    path.computeBounds(w61Var2.r, false);
                                    float centerX = rectF12.centerX();
                                    float centerY = rectF4.centerY();
                                    rectF12.width();
                                    w61Var2.w.reset();
                                    w61Var2.w.setTranslate(centerX, centerY);
                                    w61Var2.v.setLocalMatrix(w61Var2.w);
                                    canvas2.saveLayerAlpha(rectF12, nm7.d4, 31);
                                    canvas2.drawPath(path, paint2);
                                    canvas2.drawRect(rectF12, paint3);
                                    float width8 = rectF6.width() / 2.0f;
                                    float width9 = rectF12.width() / 2.0f;
                                    float max = Math.max(0.0f, (f23 / 0.75f) - 0.75f) * e6;
                                    rectF3 = rectF6;
                                    f14 = 0.0f;
                                    c3 = c5;
                                    f15 = f;
                                    hoVar = hoVar2;
                                    f16 = width;
                                    f17 = width2;
                                    f18 = f12;
                                    rectF7 = rectF11;
                                    w61Var2.a(canvas, rectF12.centerX(), rectF12.centerY(), f16, f17, f10 - f13, f10 + f13, width8, width9, f18, max);
                                    w61Var = w61Var2;
                                    canvas2 = canvas;
                                    canvas2.restore();
                                }
                            }
                            f12 = e5;
                            i3 = i2;
                            f13 = abs;
                            rectF6 = rectF3;
                            float centerX2 = rectF12.centerX();
                            float centerY2 = rectF4.centerY();
                            rectF12.width();
                            w61Var2.w.reset();
                            w61Var2.w.setTranslate(centerX2, centerY2);
                            w61Var2.v.setLocalMatrix(w61Var2.w);
                            canvas2.saveLayerAlpha(rectF12, nm7.d4, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            float width82 = rectF6.width() / 2.0f;
                            float width92 = rectF12.width() / 2.0f;
                            float max2 = Math.max(0.0f, (f23 / 0.75f) - 0.75f) * e6;
                            rectF3 = rectF6;
                            f14 = 0.0f;
                            c3 = c5;
                            f15 = f;
                            hoVar = hoVar2;
                            f16 = width;
                            f17 = width2;
                            f18 = f12;
                            rectF7 = rectF11;
                            w61Var2.a(canvas, rectF12.centerX(), rectF12.centerY(), f16, f17, f10 - f13, f10 + f13, width82, width92, f18, max2);
                            w61Var = w61Var2;
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                        float e7 = w61Var.j.e(false, w61Var.i);
                        rectF7.set(f16 - f14, f17 - f14, f16 + f14, f17 + f14);
                        if (e7 != f3) {
                            canvas2.save();
                            canvas2.scale(e7, e7, rectF7.centerX(), rectF7.centerY());
                        }
                        hoVar.C = (int) (f18 * 255.0f);
                        hoVar.setBounds((int) rectF7.left, (int) rectF7.top, (int) rectF7.right, (int) rectF7.bottom);
                        hoVar.draw(canvas2);
                        if (e7 != f3) {
                            canvas2.restore();
                        }
                        c2 = c3;
                    } else {
                        f6 = e;
                        rectF4 = rectF8;
                        rectF5 = rectF9;
                        rectF3 = rectF10;
                        f5 = R12;
                        f7 = U1;
                        f8 = f19;
                        fArr = fArr2;
                        f9 = f20;
                        i3 = i2;
                        f15 = f;
                    }
                    i2 = i3 + 1;
                    f = f15;
                    R12 = f5;
                    f20 = f9;
                    rectF10 = rectF3;
                    e = f6;
                    U1 = f7;
                    f19 = f8;
                    fArr2 = fArr;
                    rectF8 = rectF4;
                    rectF9 = rectF5;
                    c = 1;
                    f2 = 0.0f;
                    i = 0;
                }
                float f34 = e;
                RectF rectF14 = rectF8;
                RectF rectF15 = rectF9;
                float f35 = R12;
                f4 = f;
                ho hoVar3 = this.O;
                ho hoVar4 = this.N;
                z = this.d;
                if (z) {
                    float f36 = (f3 - f4) * (f3 - f34);
                    a(canvas2, hoVar4, rectF14.centerX(), rectF14.centerY() - gm.N(5.0f), 1.0f, f36);
                    a(canvas, hoVar3, rectF14.centerX(), gm.N(22.0f) + rectF14.centerY(), 1.0f, f36);
                    z2 = true;
                } else {
                    z2 = true;
                    if (z) {
                        float f37 = f3 - f34;
                        float centerX3 = rectF14.centerX() - gm.R1(0.0f, gm.N(4.0f), f4);
                        float centerY3 = rectF14.centerY() - gm.R1(gm.N(5.0f), 0.0f, f4);
                        float f38 = f3;
                        float R13 = gm.R1(f38, 2.25f, f4);
                        float f39 = f37 * f4;
                        a(canvas, this.P, centerX3, centerY3, R13, f39);
                        float f40 = (f38 - f4) * f37;
                        a(canvas, hoVar4, centerX3, centerY3, R13, f40);
                        float R14 = gm.R1(0.0f, gm.N(26.0f), f4) + rectF14.centerX();
                        float R15 = gm.R1(gm.N(22.0f), -gm.N(18.0f), f4) + rectF14.centerY();
                        float R16 = gm.R1(1.0f, 1.4f, f4);
                        a(canvas, this.Q, R14, R15, R16, f39);
                        a(canvas, hoVar3, R14, R15, R16, f40);
                    }
                }
                if (f4 > 0.0f) {
                    if (this.R == null) {
                        cta ctaVar = new cta(25);
                        this.R = ctaVar;
                        ctaVar.N = 100;
                        ctaVar.L = z2;
                        ctaVar.G = z2;
                        ctaVar.J = false;
                        ctaVar.H = z2;
                        ctaVar.r = (byte) 18;
                        ctaVar.B = false;
                        ctaVar.j = gm.L(80.0f);
                        cta ctaVar2 = this.R;
                        ctaVar2.w = 0.85f;
                        ctaVar2.v = 0.85f;
                        ctaVar2.u = 0.85f;
                        ctaVar2.c();
                        rectF = rectF15;
                    } else {
                        RectF rectF16 = this.F;
                        rectF = rectF15;
                        if (rectF16 != null) {
                        }
                    }
                    float min4 = Math.min(getMeasuredHeight(), Math.min(getMeasuredWidth(), gm.L(150.0f)));
                    this.R.a.set(0.0f, 0.0f, min4, min4);
                    this.R.a.offset((getMeasuredWidth() - this.R.a.width()) / 2.0f, (getMeasuredHeight() - this.R.a.height()) / 2.0f);
                    this.R.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    this.R.f();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), nm7.d4, 31);
                    this.R.e(canvas, f4);
                    int i4 = (int) (f4 * 255.0f);
                    Paint paint4 = this.I;
                    paint4.setAlpha(i4);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
                    canvas.restore();
                    Paint paint5 = this.H;
                    paint5.setStrokeWidth(f35);
                    paint5.setAlpha(i4);
                    canvas.drawCircle(rectF14.centerX(), rectF14.centerY(), (rectF14.width() - f35) / 2.0f, paint5);
                    RectF rectF17 = this.F;
                    Path path2 = this.G;
                    if (rectF17 == null || !rectF17.equals(rectF)) {
                        RectF rectF18 = this.F;
                        if (rectF18 == null) {
                            rectF18 = new RectF();
                            this.F = rectF18;
                        }
                        rectF18.set(rectF);
                        path2.rewind();
                        if (!z) {
                            path2.moveTo(rectF14.width() * 0.348f, rectF14.height() * 0.538f);
                            path2.lineTo(rectF14.width() * 0.447f, rectF14.height() * 0.636f);
                            path2.lineTo(rectF14.width() * 0.678f, rectF14.height() * 0.402f);
                        } else if (z == z2) {
                            path2.moveTo(rectF14.width() * 0.2929f, rectF14.height() * 0.4369f);
                            path2.lineTo(rectF14.width() * 0.381f, rectF14.height() * 0.35f);
                            path2.lineTo(rectF14.width() * 0.4691f, rectF14.height() * 0.4369f);
                            path2.moveTo(rectF14.width() * 0.381f, rectF14.height() * 0.35f);
                            path2.lineTo(rectF14.width() * 0.381f, rectF14.height() * 0.6548f);
                            path2.moveTo(rectF14.width() * 0.5214f, rectF14.height() * 0.5821f);
                            path2.lineTo(rectF14.width() * 0.6095f, rectF14.height() * 0.669f);
                            path2.lineTo(rectF14.width() * 0.6976f, rectF14.height() * 0.5821f);
                            path2.moveTo(rectF14.width() * 0.6095f, rectF14.height() * 0.669f);
                            path2.lineTo(rectF14.width() * 0.6095f, rectF14.height() * 0.3643f);
                        }
                        path2.offset(rectF14.left, rectF14.top);
                    }
                    if (!z) {
                        paint5.setStrokeWidth(gm.N(10.0f));
                        canvas.drawPath(path2, paint5);
                    }
                }
                if (this.T) {
                    return;
                }
                invalidate();
                return;
            }
        }
        c2 = c;
        i2 = i;
        while (true) {
            w61VarArr = this.w;
            if (i2 < w61VarArr.length) {
            }
            i2 = i3 + 1;
            f = f15;
            R12 = f5;
            f20 = f9;
            rectF10 = rectF3;
            e = f6;
            U1 = f7;
            f19 = f8;
            fArr2 = fArr;
            rectF8 = rectF4;
            rectF9 = rectF5;
            c = 1;
            f2 = 0.0f;
            i = 0;
        }
        float f342 = e;
        RectF rectF142 = rectF8;
        RectF rectF152 = rectF9;
        float f352 = R12;
        f4 = f;
        ho hoVar32 = this.O;
        ho hoVar42 = this.N;
        z = this.d;
        if (z) {
        }
        if (f4 > 0.0f) {
        }
        if (this.T) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r1 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        if (r0 != false) goto L44;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.b;
        float a = oqe.a(rectF.centerX(), rectF.centerY(), x, y);
        float atan2 = (float) ((Math.atan2(y - rectF.centerY(), x - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        if (a > this.c.width() / 2.0f && a < (rectF.width() / 2.0f) + gm.L(14.0f)) {
            i = 0;
            while (true) {
                w61[] w61VarArr = this.w;
                if (i >= w61VarArr.length) {
                    break;
                }
                w61 w61Var = w61VarArr[i];
                float f = w61Var.c;
                float f2 = w61Var.d;
                if (atan2 >= f - f2 && atan2 <= f + f2) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        if (motionEvent.getAction() == 0) {
            setSelected(i);
            if (i >= 0) {
                c(i, i != -1);
                if (getParent() != null && this.S) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
        } else {
            if (motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1) {
                    boolean z = i != -1;
                    setSelected(-1);
                    c(i, false);
                } else if (motionEvent.getAction() == 3) {
                    setSelected(-1);
                    c(i, false);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
            c(i, i != -1);
            setSelected(i);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j, boolean z, x61... x61VarArr) {
        boolean z2;
        float f;
        float[] fArr;
        float f2;
        float f3;
        boolean z3;
        w61 w61Var;
        float f4;
        w61[] w61VarArr;
        float f5;
        int i;
        long j2;
        float f6;
        float f7;
        boolean z4;
        long j3;
        x61[] x61VarArr2 = x61VarArr;
        ln lnVar = this.n;
        ln lnVar2 = this.s;
        ho hoVar = this.Q;
        ho hoVar2 = this.P;
        ho hoVar3 = this.O;
        ho hoVar4 = this.N;
        w61[] w61VarArr2 = this.w;
        float f8 = 1.0f;
        if (x61VarArr2 == null || x61VarArr2.length == 0) {
            this.h = false;
            this.r = j == 0;
            if (z) {
                z2 = true;
            } else {
                z2 = true;
                lnVar.e(true, 0.0f);
                lnVar2.e(true, this.r ? 1.0f : 0.0f);
            }
            hoVar2.t(hoVar4.i, false, z2);
            hoVar4.t("0", z, z2);
            hoVar2.t("0", z, z2);
            hoVar.t(hoVar3.i, false, z2);
            hoVar3.t("KB", z, z2);
            hoVar.t("KB", z, z2);
            for (w61 w61Var2 : w61VarArr2) {
                w61Var2.g = 0.0f;
                if (!z) {
                    w61Var2.h.e(z2, 0.0f);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z) {
            lnVar.e(true, 0.0f);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = x61VarArr2.length;
        SpannableString spannableString2 = spannableString;
        int i2 = 0;
        long j4 = 0;
        while (i2 < x61VarArr2.length) {
            if (x61VarArr2[i2] == null) {
                x61 x61Var = new x61();
                x61VarArr2[i2] = x61Var;
                j3 = j4;
                x61Var.c = 0L;
            } else {
                j3 = j4;
            }
            x61 x61Var2 = x61VarArr2[i2];
            x61Var2.a = i2;
            boolean z5 = x61Var2.b;
            if (z5) {
                j3 += x61Var2.c;
            }
            if (x61Var2.c <= 0 || !z5) {
                length--;
            }
            i2++;
            j4 = j3;
        }
        long j5 = j4;
        if (j5 <= 0) {
            this.h = false;
            this.r = j <= 0;
            if (z) {
                z4 = true;
            } else {
                z4 = true;
                lnVar.e(true, 0.0f);
                lnVar2.e(true, this.r ? 1.0f : 0.0f);
            }
            hoVar2.t(hoVar4.i, false, z4);
            hoVar4.t("0", z, z4);
            hoVar2.t("0", z, z4);
            hoVar.t(hoVar3.i, false, z4);
            hoVar3.t("KB", z, z4);
            hoVar.t("KB", z, z4);
            int i3 = 0;
            while (i3 < w61VarArr2.length) {
                w61 w61Var3 = w61VarArr2[i3];
                w61Var3.g = 0.0f;
                if (!z) {
                    w61Var3.h.e(z4, 0.0f);
                }
                i3++;
                z4 = true;
            }
            invalidate();
            return;
        }
        w61[] w61VarArr3 = w61VarArr2;
        int i4 = 0;
        int i5 = 0;
        float f9 = 0.0f;
        while (i4 < x61VarArr2.length) {
            x61 x61Var3 = x61VarArr2[i4];
            if (x61Var3 == null || !x61Var3.b) {
                i = i4;
                j2 = j5;
                f6 = 0.02f;
                f7 = 0.0f;
            } else {
                f6 = 0.02f;
                i = i4;
                j2 = j5;
                f7 = x61Var3.c / j2;
            }
            if (f7 > 0.0f && f7 < f6) {
                i5++;
                f9 += f7;
            }
            i4 = i + 1;
            j5 = j2;
        }
        long j6 = j5;
        int length2 = w61VarArr3.length;
        int[] iArr = this.V;
        if (iArr == null || iArr.length != x61VarArr2.length) {
            this.V = new int[x61VarArr2.length];
        }
        float[] fArr2 = this.W;
        if (fArr2 == null || fArr2.length != x61VarArr2.length) {
            this.W = new float[x61VarArr2.length];
        }
        int i6 = 0;
        while (true) {
            int length3 = x61VarArr2.length;
            f = f9;
            fArr = this.W;
            if (i6 >= length3) {
                break;
            }
            x61 x61Var4 = x61VarArr2[i6];
            int i7 = i6;
            if (x61Var4 != null) {
                w61VarArr = w61VarArr3;
                if (x61Var4.b) {
                    f5 = x61Var4.c / j6;
                    fArr[i7] = f5;
                    i6 = i7 + 1;
                    f9 = f;
                    w61VarArr3 = w61VarArr;
                }
            } else {
                w61VarArr = w61VarArr3;
            }
            f5 = 0.0f;
            fArr[i7] = f5;
            i6 = i7 + 1;
            f9 = f;
            w61VarArr3 = w61VarArr;
        }
        w61[] w61VarArr4 = w61VarArr3;
        gm.a3(fArr, this.V);
        if (!this.d) {
            Arrays.sort(x61VarArr2, new sa((byte) 11));
            int i8 = 0;
            while (true) {
                if (i8 > x61VarArr2.length) {
                    break;
                }
                x61 x61Var5 = x61VarArr2[i8];
                if (x61Var5.a == x61VarArr2.length - 1) {
                    x61 x61Var6 = x61VarArr2[0];
                    x61VarArr2[0] = x61Var5;
                    x61VarArr2[i8] = x61Var6;
                    break;
                }
                i8++;
            }
        }
        if (length < 2) {
            length = 0;
        }
        float f10 = 360.0f - (length * 2.0f);
        int i9 = 0;
        int i10 = 0;
        float f11 = 0.0f;
        while (i9 < x61VarArr2.length) {
            x61 x61Var7 = x61VarArr2[i9];
            int i11 = x61Var7.a;
            int i12 = i9;
            float f12 = !x61Var7.b ? 0.0f : x61Var7.c / j6;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f13 = f10;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.V[i11])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            w61 w61Var4 = w61VarArr4[i11];
            ho hoVar5 = hoVar;
            ho hoVar6 = hoVar2;
            float f14 = (((double) f12) <= 0.05d || f12 >= f8) ? 0.0f : f8;
            w61Var4.g = f14;
            if (f12 >= 0.08f) {
                f2 = f12;
                if (this.V[i11] < 100) {
                    f3 = f8;
                    w61Var4.i = f3;
                    w61Var4.l = f8;
                    if (z) {
                        ln lnVar3 = w61Var4.h;
                        z3 = true;
                        lnVar3.e(true, f14);
                        w61 w61Var5 = w61VarArr4[i11];
                        w61Var5.j.e(true, w61Var5.i);
                        w61 w61Var6 = w61VarArr4[i11];
                        w61Var6.m.e(true, w61Var6.l);
                    } else {
                        z3 = true;
                    }
                    w61Var = w61VarArr4[i11];
                    if (w61Var.g > 0.0f) {
                        w61Var.k.t(spannableStringBuilder, z, z3);
                    }
                    if (f2 < 0.02f || f2 <= 0.0f) {
                        f8 = 1.0f;
                        f4 = (1.0f - ((i5 * 0.02f) - f)) * f2;
                    } else {
                        f4 = 0.02f;
                        f8 = 1.0f;
                    }
                    float f15 = (i10 * 2.0f) + (f11 * f13);
                    float f16 = (f4 * f13) + f15;
                    if (f4 > 0.0f) {
                        w61 w61Var7 = w61VarArr4[i11];
                        w61Var7.c = (f15 + f16) / 2.0f;
                        w61Var7.d = Math.abs(f16 - f15) / 2.0f;
                        w61 w61Var8 = w61VarArr4[i11];
                        w61Var8.g = 0.0f;
                        if (!z) {
                            w61Var8.e.e(true, w61Var8.c);
                            w61 w61Var9 = w61VarArr4[i11];
                            w61Var9.f.e(true, w61Var9.d);
                            w61 w61Var10 = w61VarArr4[i11];
                            w61Var10.h.e(true, w61Var10.g);
                        }
                    } else {
                        w61 w61Var11 = w61VarArr4[i11];
                        w61Var11.c = (f15 + f16) / 2.0f;
                        w61Var11.d = Math.abs(f16 - f15) / 2.0f;
                        if (!z) {
                            w61 w61Var12 = w61VarArr4[i11];
                            w61Var12.e.e(true, w61Var12.c);
                            w61 w61Var13 = w61VarArr4[i11];
                            w61Var13.f.e(true, w61Var13.d);
                        }
                        f11 += f4;
                        i10++;
                    }
                    i9 = i12 + 1;
                    x61VarArr2 = x61VarArr;
                    hoVar2 = hoVar6;
                    hoVar = hoVar5;
                    f10 = f13;
                    spannableString2 = spannableString3;
                }
            } else {
                f2 = f12;
            }
            f3 = 0.85f;
            w61Var4.i = f3;
            w61Var4.l = f8;
            if (z) {
            }
            w61Var = w61VarArr4[i11];
            if (w61Var.g > 0.0f) {
            }
            if (f2 < 0.02f) {
            }
            f8 = 1.0f;
            f4 = (1.0f - ((i5 * 0.02f) - f)) * f2;
            float f152 = (i10 * 2.0f) + (f11 * f13);
            float f162 = (f4 * f13) + f152;
            if (f4 > 0.0f) {
            }
            i9 = i12 + 1;
            x61VarArr2 = x61VarArr;
            hoVar2 = hoVar6;
            hoVar = hoVar5;
            f10 = f13;
            spannableString2 = spannableString3;
        }
        ho hoVar7 = hoVar;
        ho hoVar8 = hoVar2;
        String[] split = gm.i0(j6, true, true).split(" ");
        String str = split.length > 0 ? split[0] : "";
        if (str.length() >= 4 && j6 < 1073741824) {
            str = str.split("\\.")[0];
        }
        hoVar4.t(str, z, true);
        hoVar3.t(split.length > 1 ? split[1] : "", z, true);
        if (lnVar2.c > 0.0f) {
            hoVar8.t(hoVar4.i, z, true);
            hoVar7.t(hoVar3.i, z, true);
        }
        this.r = false;
        if (!z) {
            lnVar2.e(true, 0.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        int i = 0;
        while (true) {
            w61[] w61VarArr = this.w;
            if (i >= w61VarArr.length) {
                return;
            }
            w61 w61Var = w61VarArr[i];
            if (w61Var.b == null) {
                boolean z = this.e;
                int[] iArr = this.f;
                if (z) {
                    w61Var.b = neb.d(iArr[i], gm.L(16.0f), gm.L(16.0f), -1);
                } else {
                    w61Var.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i]);
                }
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.T = false;
        while (true) {
            w61[] w61VarArr = this.w;
            if (i >= w61VarArr.length) {
                return;
            }
            Bitmap bitmap = w61VarArr[i].b;
            if (bitmap != null) {
                bitmap.recycle();
                w61VarArr[i].b = null;
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(b());
        int L2 = gm.L(172.0f);
        RectF rectF = this.a;
        rectF.set((size - L2) / 2.0f, (L - L2) / 2.0f, (size + L2) / 2.0f, (L2 + L) / 2.0f);
        Matrix matrix = this.L;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.J.setLocalMatrix(matrix);
        Matrix matrix2 = this.M;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.K.setLocalMatrix(matrix2);
        cta ctaVar = this.R;
        if (ctaVar != null) {
            ctaVar.a.set(0.0f, 0.0f, gm.L(140.0f), gm.L(140.0f));
            this.R.a.offset((getMeasuredWidth() - this.R.a.width()) / 2.0f, (getMeasuredHeight() - this.R.a.height()) / 2.0f);
            this.R.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.R.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    public void setInterceptTouch(boolean z) {
        this.S = z;
    }

    public void setSelected(int i) {
        if (i == this.U) {
            return;
        }
        int i2 = 0;
        while (true) {
            w61[] w61VarArr = this.w;
            if (i2 >= w61VarArr.length) {
                this.U = i;
                invalidate();
                return;
            }
            if (i == i2 && w61VarArr[i2].d <= 0.0f) {
                i = -1;
            }
            w61VarArr[i2].n = i == i2;
            i2++;
        }
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.E.setColor(cmb.w0(null, cmb.h6, false));
            try {
                ho hoVar = this.N;
                if (hoVar != null) {
                    hoVar.u(cmb.w0(null, cmb.F6, false));
                }
                ho hoVar2 = this.O;
                if (hoVar2 != null) {
                    hoVar2.u(cmb.w0(null, cmb.x6, false));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            invalidate();
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
