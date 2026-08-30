package pg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import g.x;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k7.n;
import k7.t7;
import lf.l0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.sl;
import org.telegram.ui.xw0;
import sg.e;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class b extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float a;
    public float b;
    public qg.a c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final a h;
    public sl i;
    public int j;
    public boolean k;
    public float l;
    public float m;
    public float n;
    public final Paint o;
    public final Paint p;
    public final Paint q;
    public final Paint r;
    public final Paint s;
    public final Matrix t;
    public final WeakReference u;
    public BitmapShader v;
    public final RectF w;
    public final RectF x;
    public final x y;
    public final Rect z;

    public b() {
        a aVar = new a();
        this.h = aVar;
        this.j = 255;
        this.n = 1.0f;
        this.o = new Paint(1);
        this.p = new Paint(1);
        Paint paint = new Paint(1);
        this.q = paint;
        this.r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.t = new Matrix();
        this.u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.w = new RectF();
        this.x = new RectF();
        this.y = new x();
        this.z = new Rect();
        aVar.i = AndroidUtilities.dpf2(1.0f);
        aVar.j = AndroidUtilities.dpf2(0.6666667f);
        this.l = AndroidUtilities.dpf2(1.0f);
        this.m = AndroidUtilities.dpf2(0.33333334f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003a, code lost:
    
        if (r4 == r20[7]) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r4 == r20[3]) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Canvas canvas, float f10, float f11, float[] fArr, float f12, boolean z4, Paint paint) {
        boolean z10;
        float f13;
        if (z4) {
            float f14 = fArr[0];
            float f15 = fArr[1];
            if (f14 == f15) {
                float f16 = fArr[2];
                if (f15 == f16) {
                }
            }
            z10 = false;
        } else {
            float f17 = fArr[4];
            float f18 = fArr[5];
            if (f17 == f18) {
                float f19 = fArr[6];
                if (f18 == f19) {
                }
            }
            z10 = false;
        }
        float f20 = f12 / 2.0f;
        if (z4) {
            if (z10) {
                canvas.save();
                if (canvas.clipRect(0.0f, 0.0f, f10, n.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f11))) {
                    float f21 = fArr[0];
                    canvas.drawRoundRect(0.0f - f20, 0.0f + f20, f10 + f20, f11 + f20, f21, f21, paint);
                }
                canvas.restore();
                return;
            }
            float f22 = (0.0f + f10) / 2.0f;
            canvas.save();
            if (canvas.clipRect(0.0f, 0.0f, f22, n.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f11))) {
                f13 = 0.0f;
                canvas.drawRoundRect(0.0f - f20, 0.0f + f20, f10 + f20, f11 + f20, fArr[0], fArr[1], paint);
            } else {
                f13 = 0.0f;
            }
            canvas.restore();
            canvas.save();
            if (canvas.clipRect(f22, f13, f10, n.a((fArr[0] * 2.0f) + f13, f13, f11))) {
                canvas.drawRoundRect(f13 - f20, f13 + f20, f10 + f20, f11 + f20, fArr[2], fArr[3], paint);
            }
            canvas.restore();
            return;
        }
        if (z10) {
            canvas.save();
            if (canvas.clipRect(0.0f, n.a(f11 - (fArr[4] * 2.0f), 0.0f, f11), f10, f11)) {
                float f23 = 0.0f - f20;
                float f24 = fArr[4];
                canvas.drawRoundRect(f23, f23, f10 + f20, f11 - f20, f24, f24, paint);
            }
            canvas.restore();
            return;
        }
        float f25 = (0.0f + f10) / 2.0f;
        canvas.save();
        if (canvas.clipRect(0.0f, n.a(f11 - (fArr[4] * 2.0f), 0.0f, f11), f25, f11)) {
            float f26 = 0.0f - f20;
            canvas.drawRoundRect(f26, f26, f10 + f20, f11 - f20, fArr[6], fArr[7], paint);
        }
        canvas.restore();
        canvas.save();
        if (canvas.clipRect(f25, n.a(f11 - (fArr[4] * 2.0f), 0.0f, f11), f10, f11)) {
            float f27 = 0.0f - f20;
            canvas.drawRoundRect(f27, f27, f10 + f20, f11 - f20, fArr[4], fArr[5], paint);
        }
        canvas.restore();
    }

    public static void f(Canvas canvas, RectF rectF, float f10, float f11, boolean z4, Paint paint) {
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = rectF.right;
        float f15 = rectF.bottom;
        float f16 = f11 / 2.0f;
        canvas.save();
        if (z4) {
            float f17 = f12 - f16;
            float f18 = f14 + f16;
            if (canvas.clipRect(f17, f13, f18, n.a((2.0f * f10) + f13, f13, f15))) {
                canvas.drawRoundRect(f17, f13 + f16, f18, f15 + f16, f10, f10, paint);
            }
        } else {
            float f19 = f12 - f16;
            float f20 = f14 + f16;
            if (canvas.clipRect(f19, n.a(f15 - (2.0f * f10), f13, f15), f20, f15)) {
                canvas.drawRoundRect(f19, f13 - f16, f20, f15 - f16, f10, f10, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (l0.c(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = D;
        if (path == null) {
            D = new Path();
        } else {
            path.rewind();
        }
        D.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(D);
    }

    public final NinePatchDrawable a(int i10, boolean z4) {
        x xVar = this.y;
        xVar.a = 0L;
        xVar.b = false;
        xVar.a(i10);
        xVar.a(this.d);
        a aVar = this.h;
        for (float f10 : aVar.b) {
            xVar.c(f10);
        }
        xVar.c(this.l);
        xVar.c(0.0f);
        xVar.c(this.m);
        xVar.b(z4);
        if (z4) {
            xVar.a(this.f);
            xVar.a(this.g);
            xVar.c(aVar.i);
            xVar.c(aVar.j);
        }
        long j10 = xVar.b ? -1L : xVar.a;
        if (this.A == null || this.B != j10) {
            this.B = j10;
            NinePatchDrawable b10 = t7.b(null, aVar.b, this.l, this.m, Color.alpha(i10) == 255 ? i10 : 1, new xw0(i10, this, z4));
            this.A = b10;
            b10.getPadding(this.z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.m;
        RectF rectF = this.w;
        rectF.set(rect);
        rectF.offset(this.a, this.b);
        RectF rectF2 = this.x;
        if (rectF.equals(rectF2)) {
            return;
        }
        rectF2.set(rectF);
        l();
    }

    public final void c(Canvas canvas, sg.a aVar) {
        int i10;
        a aVar2 = this.h;
        Rect rect = aVar2.m;
        Rect rect2 = aVar2.m;
        if (rect.isEmpty()) {
            return;
        }
        if (Color.alpha(this.e) == 255) {
            d(canvas, 0);
            return;
        }
        if (aVar instanceof sg.c) {
            d(canvas, ((sg.c) aVar).a.getColor());
            return;
        }
        if (aVar instanceof sg.b) {
            sg.b bVar = (sg.b) aVar;
            Bitmap bitmap = bVar.d;
            Bitmap bitmap2 = (Bitmap) this.u.get();
            Paint paint = this.q;
            if (bitmap != bitmap2) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.v = null;
                    paint.setShader(null);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    this.v = bitmapShader;
                    paint.setShader(bitmapShader);
                }
            }
            if (Color.alpha(this.d) > 0) {
                NinePatchDrawable a2 = a(0, false);
                int i11 = rect2.left;
                Rect rect3 = this.z;
                a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                a2.setAlpha(this.j);
                a2.draw(canvas);
            }
            if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.j > 0) {
                Matrix matrix = bVar.b;
                Matrix matrix2 = this.t;
                matrix2.set(matrix);
                matrix2.postTranslate(-this.a, -this.b);
                this.v.setLocalMatrix(matrix2);
                paint.setAlpha(this.j);
                aVar2.b(canvas, paint);
            }
            int l1 = j6.l1(this.j / 255.0f, this.e);
            if (Color.alpha(l1) > 0) {
                Paint paint2 = this.r;
                paint2.setColor(l1);
                aVar2.b(canvas, paint2);
            }
            g(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof sg.d)) {
            sg.d dVar = (sg.d) aVar;
            if (canvas.isHardwareAccelerated()) {
                return;
            }
            c(canvas, dVar.a);
            return;
        }
        if (aVar instanceof e) {
            c(canvas, ((e) aVar).a);
            return;
        }
        if (aVar == null || (i10 = this.j) == 0) {
            return;
        }
        int l12 = j6.l1(i10 / 255.0f, this.e);
        if (Color.alpha(this.d) > 0 && this.j == 255) {
            float f10 = this.n;
            if (f10 > 0.0f) {
                float f11 = this.l;
                float f12 = this.m;
                int l13 = j6.l1(f10, this.d);
                Paint paint3 = this.s;
                paint3.setShadowLayer(f11, 0.0f, f12, l13);
                aVar2.c(canvas, paint3, this.k);
            }
        }
        float f13 = this.a;
        float f14 = this.b;
        float f15 = rect2.left;
        float f16 = f15 + f13;
        float f17 = rect2.top;
        float f18 = f17 + f14;
        float f19 = rect2.right;
        float f20 = f19 + f13;
        float f21 = rect2.bottom;
        float f22 = f21 + f14;
        int i12 = this.j;
        boolean z4 = i12 != 255;
        if (z4) {
            canvas.saveLayerAlpha(f15, f17, f19, f21, i12);
        }
        canvas.save();
        canvas.clipPath(aVar2.k);
        canvas.translate(rect2.left, rect2.top);
        canvas.translate(-f16, -f18);
        aVar.X(canvas, f16, f18, f20, f22);
        canvas.restore();
        if (Color.alpha(l12) > 0) {
            Paint paint4 = this.o;
            paint4.setColor(l12);
            aVar2.b(canvas, paint4);
        }
        g(canvas);
        if (z4) {
            canvas.restore();
        }
    }

    public final void d(Canvas canvas, int i10) {
        int h = i0.a.h(this.e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.h.m;
        int i11 = rect.left;
        Rect rect2 = this.z;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.j);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = j6.l1(this.j / 255.0f, this.f);
        int l12 = j6.l1(this.j / 255.0f, this.g);
        int alpha = Color.alpha(l1);
        a aVar = this.h;
        Paint paint = this.p;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(aVar.n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(aVar.o, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        a aVar = this.h;
        h(outline, aVar.m, aVar.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        a aVar = this.h;
        int i10 = aVar.d;
        rect.set(i10, i10, i10, i10);
        return aVar.e;
    }

    public abstract sg.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(qg.a aVar) {
        this.c = aVar;
        u();
        if (aVar instanceof qg.d) {
            qg.d dVar = (qg.d) aVar;
            float f10 = dVar.f;
            float f11 = dVar.h;
            a aVar2 = this.h;
            aVar2.i = f10;
            aVar2.j = f11;
            float f12 = dVar.n;
            float f13 = dVar.r;
            this.l = f12;
            this.m = f13;
        }
    }

    public final void o(int i10) {
        a aVar = this.h;
        if (aVar.d != i10) {
            aVar.d = i10;
            aVar.a();
            j();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a aVar = this.h;
        aVar.a.set(rect);
        aVar.a();
        j();
    }

    public final void p(float f10) {
        a aVar = this.h;
        Arrays.fill(aVar.b, f10);
        Arrays.fill(aVar.c, f10);
        aVar.a();
        j();
    }

    public final void q(float f10, float f11, float f12, float f13) {
        a aVar = this.h;
        float[] fArr = aVar.b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = f12;
        fArr[4] = f12;
        fArr[7] = f13;
        fArr[6] = f13;
        aVar.a();
        j();
    }

    public final void r(float f10, float f11, float f12, float f13) {
        a aVar = this.h;
        float[] fArr = aVar.b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = aVar.c;
        fArr2[1] = f10;
        fArr2[0] = f10;
        fArr2[3] = f11;
        fArr2[2] = f11;
        fArr2[5] = f12;
        fArr2[4] = f12;
        fArr2[7] = f13;
        fArr2[6] = f13;
        aVar.a();
        j();
    }

    public final void s(float f10, float f11) {
        if (this.a == f10 && this.b == f11) {
            return;
        }
        this.a = f10;
        this.b = f11;
        k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.j = i10;
    }

    public final void t(int i10) {
        this.h.f = i10;
        j();
    }

    public void u() {
        qg.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        this.e = aVar.D2();
        this.d = this.c.W1();
        this.f = this.c.x0();
        this.g = this.c.X0();
    }

    public void l() {
    }

    public b m() {
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
