package yh;

import ai.n6;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.r5;
import v7.v7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class d1 extends Drawable {
    public static k1 E = new k1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup a;
    public final g6 b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final boolean g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int i;
    public RadialGradient j;
    public final Matrix k;
    public final c1 l;
    public int[] m;
    public LinearGradient n;
    public final Matrix o;
    public boolean p;
    public final Paint q;
    public final f6 r;
    public float s;
    public boolean t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public Integer z;

    public d1(ViewGroup viewGroup, g6 g6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f = new Path();
        this.k = new Matrix();
        new Path();
        this.o = new Matrix();
        Paint paint3 = new Paint(1);
        this.q = paint3;
        this.r = new f6(new tg.p(this, 16), 320L, bs.h);
        this.s = AndroidUtilities.dp(11.0f);
        this.v = true;
        this.w = 0;
        int i10 = k6.d6;
        this.y = i10;
        this.a = viewGroup;
        this.b = g6Var;
        c1 c1Var = new c1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.l = c1Var;
        viewGroup.addOnAttachStateChangeListener(new n6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            c1Var.a();
        }
        this.g = z10;
        int w02 = k6.w0(i10, g6Var);
        this.x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int w02 = z10 ? k6.w0(k6.a6, this.b) : 0;
        if (this.t != z10 || (z10 && this.u != w02)) {
            this.t = z10;
            Paint paint = this.c;
            if (!z10) {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                return;
            }
            float dp = AndroidUtilities.dp(1.66f);
            float dp2 = AndroidUtilities.dp(0.33f);
            this.u = w02;
            paint.setShadowLayer(dp, 0.0f, dp2, w02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x02de, code lost:
    
        if (r6 != null) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, float f7) {
        boolean z10;
        char c10;
        float f10;
        Bitmap bitmap;
        BlendMode blendMode;
        Bitmap bitmap2;
        NinePatchDrawable ninePatchDrawable;
        int w02;
        Canvas canvas2 = canvas;
        Paint paint = this.c;
        int color = paint.getColor();
        int i10 = this.x;
        g6 g6Var = this.b;
        if (color == i10 && (w02 = k6.w0(k6.d6, g6Var)) != this.x) {
            this.x = w02;
            paint.setColor(w02);
        }
        Rect bounds = getBounds();
        float e = this.r.e(this.p);
        RectF rectF = this.e;
        rectF.set(bounds);
        if (this.v) {
            rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        }
        if (this.h != null) {
            int lerp = AndroidUtilities.lerp(Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height()), 0.35f) / 2;
            if (this.j == null || this.i != lerp) {
                this.i = lerp;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.h;
                int i11 = stargiftattributebackdrop.center_color | (-16777216);
                this.j = new RadialGradient(0.0f, 0.0f, lerp, new int[]{i11, i11, stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
            Matrix matrix = this.k;
            matrix.reset();
            matrix.postTranslate(bounds.centerX(), Math.min(AndroidUtilities.dp(50.0f), bounds.centerY()));
            this.j.setLocalMatrix(matrix);
            paint.setShader(this.j);
        } else {
            paint.setShader(null);
        }
        int i12 = k6.a6;
        final int w03 = k6.w0(i12, g6Var);
        int i13 = k6.d6;
        final int w04 = k6.w0(i13, g6Var);
        final int i14 = 0;
        boolean z11 = this.s == ((float) AndroidUtilities.dp(11.0f)) && w03 == k6.x0(null, i12, false) && w04 == k6.x0(null, i13, false);
        boolean z12 = this.g;
        a(z12 && !z11);
        if (z11) {
            if (E == null) {
                E = new k1();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            if (this.h != null) {
                if (z12) {
                    k1 k1Var = E;
                    if (k1Var.b == null || k1Var.h != w03) {
                        k1Var.h = w03;
                        Bitmap[] bitmapArr = k1Var.a;
                        float[] fArr = k1Var.g;
                        final float dp = AndroidUtilities.dp(1.66f);
                        final float dp2 = AndroidUtilities.dp(0.33f);
                        k1Var.b = v7.b(bitmapArr, fArr, dp, dp2, 0, new hh.f() { // from class: hh.e
                            @Override // hh.f
                            public final void a(Canvas canvas3, RectF rectF2, float[] fArr2) {
                                Path path = new Path();
                                path.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                Paint paint2 = new Paint(1);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(i14);
                                float f11 = dp;
                                if (f11 > 0.0f) {
                                    paint2.setShadowLayer(f11, 0.0f, dp2, w03);
                                }
                                canvas3.drawPath(path, paint2);
                                if (f11 > 0.0f) {
                                    paint2.clearShadowLayer();
                                    canvas3.drawPath(path, paint2);
                                }
                            }
                        });
                    }
                    NinePatchDrawable ninePatchDrawable2 = k1Var.b;
                    zf.p.h(ninePatchDrawable2, rect);
                    ninePatchDrawable2.draw(canvas2);
                }
                float f11 = this.s;
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                z10 = true;
            } else {
                if (z12) {
                    k1 k1Var2 = E;
                    if (k1Var2.f == null || !(k1Var2.j == w04 || k1Var2.k == w03)) {
                        k1Var2.j = w04;
                        k1Var2.k = w03;
                        Bitmap[] bitmapArr2 = k1Var2.e;
                        float[] fArr2 = k1Var2.g;
                        final float dp3 = AndroidUtilities.dp(1.66f);
                        final float dp4 = AndroidUtilities.dp(0.33f);
                        z10 = true;
                        k1Var2.f = v7.b(bitmapArr2, fArr2, dp3, dp4, w04, new hh.f() { // from class: hh.e
                            @Override // hh.f
                            public final void a(Canvas canvas3, RectF rectF2, float[] fArr22) {
                                Path path = new Path();
                                path.addRoundRect(rectF2, fArr22, Path.Direction.CW);
                                Paint paint2 = new Paint(1);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(w04);
                                float f112 = dp3;
                                if (f112 > 0.0f) {
                                    paint2.setShadowLayer(f112, 0.0f, dp4, w03);
                                }
                                canvas3.drawPath(path, paint2);
                                if (f112 > 0.0f) {
                                    paint2.clearShadowLayer();
                                    canvas3.drawPath(path, paint2);
                                }
                            }
                        });
                    } else {
                        z10 = true;
                    }
                    ninePatchDrawable = k1Var2.f;
                } else {
                    z10 = true;
                    k1 k1Var3 = E;
                    if (k1Var3.d == null || k1Var3.i != w04) {
                        k1Var3.i = w04;
                        final float f12 = 0.0f;
                        final float f13 = 0.0f;
                        k1Var3.d = v7.b(k1Var3.c, k1Var3.g, 0.0f, 0.0f, w04, new hh.f() { // from class: hh.e
                            @Override // hh.f
                            public final void a(Canvas canvas3, RectF rectF2, float[] fArr22) {
                                Path path = new Path();
                                path.addRoundRect(rectF2, fArr22, Path.Direction.CW);
                                Paint paint2 = new Paint(1);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(w04);
                                float f112 = f12;
                                if (f112 > 0.0f) {
                                    paint2.setShadowLayer(f112, 0.0f, f13, i14);
                                }
                                canvas3.drawPath(path, paint2);
                                if (f112 > 0.0f) {
                                    paint2.clearShadowLayer();
                                    canvas3.drawPath(path, paint2);
                                }
                            }
                        });
                    }
                    ninePatchDrawable = k1Var3.d;
                }
                zf.p.h(ninePatchDrawable, rect);
                ninePatchDrawable.draw(canvas2);
            }
        } else {
            z10 = true;
            float f14 = this.s;
            canvas2.drawRoundRect(rectF, f14, f14, paint);
        }
        int[] iArr = this.m;
        c1 c1Var = this.l;
        boolean z13 = (iArr == null && (this.h == null || c1Var.d())) ? false : z10;
        if (z13) {
            canvas2.save();
            Path path = this.f;
            path.rewind();
            float f15 = this.s;
            path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        if (this.m != null) {
            if (this.n == null) {
                this.n = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, this.m, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
            Matrix matrix2 = this.o;
            matrix2.reset();
            matrix2.postTranslate(bounds.left, bounds.top);
            matrix2.postRotate((float) ((Math.atan2(bounds.height(), bounds.width()) / 3.141592653589793d) * 180.0d));
            c10 = 0;
            float sqrt = ((float) Math.sqrt(Math.pow(bounds.height(), 2.0d) + Math.pow(bounds.width(), 2.0d))) / 100.0f;
            matrix2.postScale(sqrt, sqrt);
            this.n.setLocalMatrix(matrix2);
            LinearGradient linearGradient = this.n;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient);
            paint2.setStrokeWidth(AndroidUtilities.dp(4.66f));
            float f16 = this.s;
            canvas2.drawRoundRect(rectF, f16, f16, paint2);
        } else {
            c10 = 0;
        }
        if (this.h != null && !c1Var.d()) {
            int i15 = this.h.pattern_color | (-16777216);
            canvas2.save();
            canvas2.translate(bounds.centerX(), bounds.centerY());
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 29) {
                Drawable drawable = c1Var.f[c10];
                if (drawable != null && c1Var.d.c == 1.0f && (drawable instanceof r5)) {
                    r5 r5Var = (r5) drawable;
                    ci.f3 f3Var = r5Var.k;
                    long i17 = r5Var.i();
                    if (f3Var != null) {
                        f10 = 1.0f;
                        if (i17 == this.A) {
                            bitmap = f3Var.getBitmap();
                        }
                        bitmap = null;
                        if (bitmap != null) {
                            if (this.B != bitmap || this.C == null) {
                                this.B = bitmap;
                                this.C = g0.a.a(bitmap);
                                c10 = 1;
                            }
                            if (this.D != i15 || c10 != 0) {
                                this.D = i15;
                                if (i16 >= 29) {
                                    Paint paint3 = this.C;
                                    blendMode = BlendMode.SRC_IN;
                                    paint3.setColorFilter(new BlendModeColorFilter(i15, blendMode));
                                } else {
                                    this.C.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
                                }
                            }
                            if (f7 < f10) {
                                bitmap2 = bitmap;
                                ai.m1.b(canvas2, 2, this.C, bitmap2, bounds.width(), bounds.height(), f10 - f7);
                            } else {
                                bitmap2 = bitmap;
                            }
                            if (f7 > 0.0f) {
                                canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                                ai.m1.b(canvas2, 0, this.C, bitmap2, bounds.width(), bounds.height(), f7);
                            }
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                }
                f10 = 1.0f;
                bitmap = null;
                if (bitmap != null) {
                }
            } else {
                f10 = 1.0f;
            }
            c1Var.k(Integer.valueOf(i15));
            if (f7 < f10) {
                canvas2 = canvas;
                ai.m1.a(canvas2, 2, c1Var, bounds.width(), bounds.height(), f10 - f7, 1.0f);
            } else {
                canvas2 = canvas;
            }
            if (f7 > 0.0f) {
                canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                ai.m1.a(canvas2, 0, c1Var, bounds.width(), bounds.height(), f7, 1.0f);
            }
            canvas2.restore();
        }
        if (z13) {
            canvas2.restore();
        }
        if (e > 0.0f) {
            int i18 = this.w;
            Paint paint4 = this.q;
            if (i18 == 0) {
                Integer num = this.z;
                paint4.setColor(num != null ? num.intValue() : k6.w0(this.y, g6Var));
                paint4.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(1.667f), e));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                float lerp2 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(3.33f), e);
                rectF2.inset(lerp2, lerp2);
                float lerp3 = AndroidUtilities.lerp(this.s, AndroidUtilities.dpf2(7.33f), e);
                canvas2.drawRoundRect(rectF2, lerp3, lerp3, paint4);
                return;
            }
            if (i18 == 1) {
                Integer num2 = this.z;
                paint4.setColor(num2 != null ? num2.intValue() : k6.w0(this.y, g6Var));
                paint4.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f), e));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rectF);
                float lerp4 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f) / 2.0f, e);
                rectF3.inset(lerp4, lerp4);
                float lerp5 = AndroidUtilities.lerp(this.s, AndroidUtilities.dpf2(10.0f), e);
                canvas2.drawRoundRect(rectF3, lerp5, lerp5, paint4);
            }
        }
    }

    public final void c() {
        this.a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.A = 0L;
        c1 c1Var = this.l;
        if (stargiftattributepattern == null) {
            c1Var.g(null, false);
            return;
        }
        c1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.p == z10) {
            return;
        }
        this.p = z10;
        if (!z11) {
            this.r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.m == iArr) {
            return;
        }
        this.m = iArr;
        this.n = null;
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.set(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
