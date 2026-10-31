package ph;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
import w7.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z0 extends Drawable {
    public static g1 E = new g1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup a;
    public final p6 b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final boolean g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int i;
    public RadialGradient j;
    public final Matrix k;
    public final y0 l;
    public int[] m;
    public LinearGradient n;
    public final Matrix o;
    public boolean p;
    public final Paint q;
    public final t5 r;
    public float s;
    public boolean t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public Integer z;

    public z0(ViewGroup viewGroup, p6 p6Var, boolean z10) {
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
        this.r = new t5(new w5(this, 27), 320L, gr.h);
        this.s = org.telegram.messenger.i0.L(11.0f);
        this.v = true;
        this.w = 0;
        int i10 = t6.d6;
        this.y = i10;
        this.a = viewGroup;
        this.b = p6Var;
        y0 y0Var = new y0(this, viewGroup, org.telegram.messenger.i0.L(28.0f));
        this.l = y0Var;
        viewGroup.addOnAttachStateChangeListener(new l.d(this, 11));
        if (viewGroup.isAttachedToWindow()) {
            y0Var.a();
        }
        this.g = z10;
        int w02 = t6.w0(i10, p6Var);
        this.x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int w02 = z10 ? t6.w0(t6.a6, this.b) : 0;
        if (this.t != z10 || (z10 && this.u != w02)) {
            this.t = z10;
            Paint paint = this.c;
            if (!z10) {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                return;
            }
            float L = org.telegram.messenger.i0.L(1.66f);
            float L2 = org.telegram.messenger.i0.L(0.33f);
            this.u = w02;
            paint.setShadowLayer(L, 0.0f, L2, w02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x02d7, code lost:
    
        if (r6 != null) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, float f7) {
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        Bitmap bitmap;
        int i13;
        BlendMode blendMode;
        Bitmap bitmap2;
        NinePatchDrawable ninePatchDrawable;
        int w02;
        Canvas canvas2 = canvas;
        Paint paint = this.c;
        int color = paint.getColor();
        int i14 = this.x;
        p6 p6Var = this.b;
        if (color == i14 && (w02 = t6.w0(t6.d6, p6Var)) != this.x) {
            this.x = w02;
            paint.setColor(w02);
        }
        Rect bounds = getBounds();
        float d = this.r.d(this.p);
        RectF rectF = this.e;
        rectF.set(bounds);
        if (this.v) {
            rectF.inset(org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(4.0f));
        }
        if (this.h != null) {
            int W1 = org.telegram.messenger.i0.W1(0.35f, Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height())) / 2;
            if (this.j == null || this.i != W1) {
                this.i = W1;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.h;
                int i15 = stargiftattributebackdrop.center_color | (-16777216);
                this.j = new RadialGradient(0.0f, 0.0f, W1, new int[]{i15, i15, stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
            Matrix matrix = this.k;
            matrix.reset();
            matrix.postTranslate(bounds.centerX(), Math.min(org.telegram.messenger.i0.L(50.0f), bounds.centerY()));
            this.j.setLocalMatrix(matrix);
            paint.setShader(this.j);
        } else {
            paint.setShader(null);
        }
        int i16 = t6.a6;
        int w03 = t6.w0(i16, p6Var);
        int i17 = t6.d6;
        int w04 = t6.w0(i17, p6Var);
        boolean z10 = this.s == ((float) org.telegram.messenger.i0.L(11.0f)) && w03 == t6.x0(null, i16, false) && w04 == t6.x0(null, i17, false);
        boolean z11 = this.g;
        a(z11 && !z10);
        if (z10) {
            if (E == null) {
                E = new g1();
            }
            Rect rect = org.telegram.messenger.i0.Q;
            rectF.round(rect);
            if (this.h != null) {
                if (z11) {
                    g1 g1Var = E;
                    if (g1Var.b == null || g1Var.h != w03) {
                        g1Var.h = w03;
                        i10 = 0;
                        i11 = 1;
                        g1Var.b = k9.b(g1Var.a, 0, g1Var.g, org.telegram.messenger.i0.L(1.66f), w03, org.telegram.messenger.i0.L(0.33f), 0);
                    } else {
                        i10 = 0;
                        i11 = 1;
                    }
                    NinePatchDrawable ninePatchDrawable2 = g1Var.b;
                    rf.o.h(ninePatchDrawable2, rect);
                    ninePatchDrawable2.draw(canvas2);
                } else {
                    i10 = 0;
                    i11 = 1;
                }
                float f12 = this.s;
                canvas2.drawRoundRect(rectF, f12, f12, paint);
            } else {
                i10 = 0;
                i11 = 1;
                if (z11) {
                    g1 g1Var2 = E;
                    if (g1Var2.f == null || (g1Var2.j != w04 && g1Var2.k != w03)) {
                        g1Var2.j = w04;
                        g1Var2.k = w03;
                        g1Var2.f = k9.b(g1Var2.e, w04, g1Var2.g, org.telegram.messenger.i0.L(1.66f), w03, org.telegram.messenger.i0.L(0.33f), w04);
                    }
                    ninePatchDrawable = g1Var2.f;
                } else {
                    g1 g1Var3 = E;
                    if (g1Var3.d == null || g1Var3.i != w04) {
                        g1Var3.i = w04;
                        g1Var3.d = k9.b(g1Var3.c, w04, g1Var3.g, 0.0f, 0, 0.0f, w04);
                    }
                    ninePatchDrawable = g1Var3.d;
                }
                rf.o.h(ninePatchDrawable, rect);
                ninePatchDrawable.draw(canvas2);
            }
        } else {
            i10 = 0;
            i11 = 1;
            float f13 = this.s;
            canvas2.drawRoundRect(rectF, f13, f13, paint);
        }
        int[] iArr = this.m;
        y0 y0Var = this.l;
        int i18 = (iArr == null && (this.h == null || y0Var.d())) ? i10 : i11;
        if (i18 != 0) {
            canvas2.save();
            Path path = this.f;
            path.rewind();
            float f14 = this.s;
            path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
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
            float sqrt = ((float) Math.sqrt(Math.pow(bounds.height(), 2.0d) + Math.pow(bounds.width(), 2.0d))) / 100.0f;
            matrix2.postScale(sqrt, sqrt);
            this.n.setLocalMatrix(matrix2);
            LinearGradient linearGradient = this.n;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient);
            paint2.setStrokeWidth(org.telegram.messenger.i0.L(4.66f));
            float f15 = this.s;
            canvas2.drawRoundRect(rectF, f15, f15, paint2);
        }
        if (this.h == null || y0Var.d()) {
            i12 = i18;
        } else {
            int i19 = this.h.pattern_color | (-16777216);
            canvas2.save();
            canvas2.translate(bounds.centerX(), bounds.centerY());
            int i20 = Build.VERSION.SDK_INT;
            if (i20 >= 29) {
                Drawable drawable = y0Var.f[i10];
                f10 = 1.0f;
                if (drawable != null && y0Var.d.c == 1.0f && (drawable instanceof f5)) {
                    f5 f5Var = (f5) drawable;
                    ag.c2 c2Var = f5Var.k;
                    long h = f5Var.h();
                    if (c2Var != null) {
                        i12 = i18;
                        f11 = -31.0f;
                        if (h == this.A) {
                            bitmap = c2Var.n();
                        }
                        bitmap = null;
                        if (bitmap != null) {
                            if (this.B != bitmap || this.C == null) {
                                this.B = bitmap;
                                this.C = g0.a.a(bitmap);
                                i13 = i11;
                            } else {
                                i13 = i10;
                            }
                            if (this.D != i19 || i13 != 0) {
                                this.D = i19;
                                if (i20 >= 29) {
                                    Paint paint3 = this.C;
                                    blendMode = BlendMode.SRC_IN;
                                    paint3.setColorFilter(new BlendModeColorFilter(i19, blendMode));
                                } else {
                                    this.C.setColorFilter(new PorterDuffColorFilter(i19, PorterDuff.Mode.SRC_IN));
                                }
                            }
                            if (f7 < 1.0f) {
                                bitmap2 = bitmap;
                                rh.j0.b(canvas2, 2, this.C, bitmap2, bounds.width(), bounds.height(), 1.0f - f7);
                            } else {
                                bitmap2 = bitmap;
                            }
                            if (f7 > 0.0f) {
                                canvas2.translate(0.0f, org.telegram.messenger.i0.L(f11));
                                rh.j0.b(canvas2, 0, this.C, bitmap2, bounds.width(), bounds.height(), f7);
                            }
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                }
                i12 = i18;
                f11 = -31.0f;
                bitmap = null;
                if (bitmap != null) {
                }
            } else {
                i12 = i18;
                f10 = 1.0f;
                f11 = -31.0f;
            }
            y0Var.k(Integer.valueOf(i19));
            if (f7 < f10) {
                canvas2 = canvas;
                rh.j0.a(canvas2, 2, y0Var, bounds.width(), bounds.height(), f10 - f7, 1.0f);
            } else {
                canvas2 = canvas;
            }
            if (f7 > 0.0f) {
                canvas2.translate(0.0f, org.telegram.messenger.i0.L(f11));
                rh.j0.a(canvas2, 0, y0Var, bounds.width(), bounds.height(), f7, 1.0f);
            }
            canvas2.restore();
        }
        if (i12 != 0) {
            canvas2.restore();
        }
        if (d > 0.0f) {
            int i21 = this.w;
            Paint paint4 = this.q;
            if (i21 == 0) {
                Integer num = this.z;
                paint4.setColor(num != null ? num.intValue() : t6.w0(this.y, p6Var));
                paint4.setStrokeWidth(org.telegram.messenger.i0.T1(0.0f, org.telegram.messenger.i0.N(1.667f), d));
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(rectF);
                float T1 = org.telegram.messenger.i0.T1(-org.telegram.messenger.i0.N(2.33f), org.telegram.messenger.i0.N(3.33f), d);
                rectF2.inset(T1, T1);
                float T12 = org.telegram.messenger.i0.T1(this.s, org.telegram.messenger.i0.N(7.33f), d);
                canvas2.drawRoundRect(rectF2, T12, T12, paint4);
                return;
            }
            if (i21 == i11) {
                Integer num2 = this.z;
                paint4.setColor(num2 != null ? num2.intValue() : t6.w0(this.y, p6Var));
                paint4.setStrokeWidth(org.telegram.messenger.i0.T1(0.0f, org.telegram.messenger.i0.N(3.0f), d));
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(rectF);
                float T13 = org.telegram.messenger.i0.T1(0.0f, org.telegram.messenger.i0.N(3.0f) / 2.0f, d);
                rectF3.inset(T13, T13);
                float T14 = org.telegram.messenger.i0.T1(this.s, org.telegram.messenger.i0.N(10.0f), d);
                canvas2.drawRoundRect(rectF3, T14, T14, paint4);
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
        y0 y0Var = this.l;
        if (stargiftattributepattern == null) {
            y0Var.g(null, false);
            return;
        }
        y0Var.i(stargiftattributepattern.document, false);
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
        rect.set(org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(4.0f));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
