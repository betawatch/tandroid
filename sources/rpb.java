// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rpb implements vnb {
    public vnb a;
    public final SparseIntArray b = new SparseIntArray();
    public final Paint c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f;
    public final TextPaint g;
    public final TextPaint h;
    public Bitmap i;
    public BitmapShader j;
    public Matrix k;
    public final /* synthetic */ pqb l;
    public final /* synthetic */ pqb m;

    public rpb(pqb pqbVar) {
        this.m = pqbVar;
        this.l = pqbVar;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
        textPaint2.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
        textPaint3.setTextSize(hl.L(15.0f));
        textPaint3.setTypeface(hl.o());
        paint.setColor(352321536);
    }

    @Override // vnb
    public final boolean a() {
        hqb hqbVar = this.m.r1;
        if (hqbVar != null) {
            return hqbVar.a();
        }
        hqb hqbVar2 = this.l.r1;
        if (hqbVar2 != null) {
            return hqbVar2.a();
        }
        vnb vnbVar = this.a;
        return vnbVar != null ? vnbVar.a() : aob.I.o();
    }

    @Override // vnb
    public final void b(float f, float f2, int i, int i2) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.i;
        if (bitmap == null || (bitmapShader = this.j) == null) {
            aob.q(f, f2, i, i2);
        } else {
            aob.r(bitmap, bitmapShader, this.k, i, i2, f, f2);
        }
    }

    @Override // vnb
    public final ColorFilter c() {
        return aob.v3;
    }

    @Override // vnb
    public final Paint d(String str) {
        str.getClass();
        switch (str) {
            case "paintChatActionText2":
                return this.g;
            case "paintChatActionBackground":
                return this.c;
            case "paintChatBotButton":
                return this.h;
            case "paintChatActionBackgroundDarken":
                return this.e;
            case "paintChatActionBackgroundSelected":
                return this.d;
            case "paintChatActionText":
                return this.f;
            default:
                vnb vnbVar = this.a;
                return vnbVar != null ? vnbVar.d(str) : aob.T0(str);
        }
    }

    @Override // vnb
    public final boolean e() {
        return xea.D0;
    }

    @Override // vnb
    public final int f(int i) {
        return h(i);
    }

    @Override // vnb
    public final boolean g() {
        vnb vnbVar = this.a;
        return vnbVar != null ? vnbVar.g() : aob.b1();
    }

    @Override // vnb
    public final Drawable getDrawable(String str) {
        vnb vnbVar = this.a;
        return vnbVar != null ? vnbVar.getDrawable(str) : aob.P0(str);
    }

    @Override // vnb
    public final int h(int i) {
        vnb vnbVar = this.a;
        return vnbVar != null ? vnbVar.h(i) : aob.w0(null, i, false);
    }

    @Override // vnb
    public final int j(int i) {
        vnb vnbVar = this.a;
        return vnbVar != null ? vnbVar.j(i) : h(i);
    }

    public final void k(Drawable drawable, Drawable drawable2, Float f) {
        int i = aob.cd;
        int h = h(i);
        int h2 = h(aob.dd);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z = drawable instanceof hh7;
        TextPaint textPaint = this.g;
        TextPaint textPaint2 = this.f;
        if ((z || (drawable instanceof BitmapDrawable)) && xea.o() != 0 && i86.e(32)) {
            Bitmap bitmap = z ? ((hh7) drawable).k : drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            if (this.i != bitmap) {
                this.i = bitmap;
                Bitmap bitmap2 = this.i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.k == null) {
                    this.k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.i = null;
            this.j = null;
            int i2 = aob.Zc;
            textPaint2.setColor(h(i2));
            textPaint.setColor(h(i2));
            textPaint2.linkColor = h(aob.ad);
        }
        Paint paint = this.c;
        paint.setColor(h);
        Paint paint2 = this.d;
        paint2.setColor(h2);
        if (this.j == null || !(this.b.indexOfKey(i) < 0 || z || (drawable instanceof BitmapDrawable))) {
            paint.setColorFilter(null);
            paint.setShader(null);
            paint2.setColorFilter(null);
            paint2.setShader(null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z) {
            if (((hh7) drawable).q >= 0.0f) {
                colorMatrix.setSaturation(1.6f);
                hl.l2(colorMatrix, a() ? 0.97f : 0.92f);
                hl.h(colorMatrix, a() ? 0.12f : -0.06f);
            } else {
                colorMatrix.setSaturation(1.1f);
                hl.l2(colorMatrix, a() ? 0.4f : 0.8f);
                hl.h(colorMatrix, a() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            hl.l2(colorMatrix, a() ? 0.9f : 0.84f);
            hl.h(colorMatrix, a() ? -0.04f : 0.06f);
        }
        if (z) {
            float f2 = ((hh7) drawable).q;
            if (f != null) {
                f2 = f.floatValue();
            }
            if (f2 >= 0.0f) {
                colorMatrix.setSaturation(1.8f);
                hl.l2(colorMatrix, 0.97f);
                hl.h(colorMatrix, 0.03f);
            } else {
                colorMatrix.setSaturation(0.5f);
                hl.l2(colorMatrix, 0.35f);
                hl.h(colorMatrix, 0.03f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            hl.l2(colorMatrix, 0.97f);
            hl.h(colorMatrix, 0.06f);
        }
        paint.setShader(this.j);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setAlpha(jn7.d4);
        paint2.setShader(this.j);
        ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
        hl.l2(colorMatrix2, 0.85f);
        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        paint2.setAlpha(jn7.d4);
    }

    @Override // vnb
    public final void i(int i, int i2) {
    }
}
